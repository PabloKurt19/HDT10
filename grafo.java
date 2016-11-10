import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.algorithm.PageRank;
import org.graphstream.algorithm.generator.DorogovtsevMendesGenerator;
import org.graphstream.graph.Node;


/**
 * @author Pablo Ortiz
 * @author Pedro Garcia 
 * @author Dieter de Wit
 * @version 07.11.16
 */

public class grafo {
    String[][] adyacencia = new String [15][15];
    Graph grafoPrincipal = new SingleGraph("Correos Enviados");
    Graph graph6 = new MultiGraph("Mas de 6 enviados");
    int[][] matriz = new int[14][14];
    ArrayList<String> puestos = new ArrayList();
    ArrayList<Nodo> lospuestos = new ArrayList();
    
    /**
     * Método que crea un grafo luego de leer un archivo de datos .csv
     * @param nothgin
     * @return nothing
     */
    public void crearGrafo()
    {
    	//Cambiar la siguiente linea con la ubicación de su archivo .csv
        String archivo = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\datos.csv"; 
        BufferedReader br = null;
        String line ="";
        
        int n = 0;
        try {
            br = new BufferedReader(new FileReader(archivo));
            while ((line = br.readLine()) != null) {
                String[] peso = line.split(";");
                
                adyacencia[0][n]=peso[1];
                adyacencia[1][n]=peso[2];
                adyacencia[2][n]=peso[3];
                adyacencia[3][n]=peso[4];
                adyacencia[4][n]=peso[5];
                adyacencia[5][n]=peso[6];
                adyacencia[6][n]=peso[7];
                adyacencia[7][n]=peso[8];
                adyacencia[8][n]=peso[9];
                adyacencia[9][n]=peso[10];
                adyacencia[10][n]=peso[11];
                adyacencia[11][n]=peso[12];
                adyacencia[12][n]=peso[13];
                adyacencia[13][n]=peso[14];
                n++;
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            //Modificarse esta linea con la contraseña de neo4j
                    Connection conexion = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=0101,debug=true,noSsl,flatten=[-1,100,1000]"); 
                    try (Statement datos = conexion.createStatement()) {
                datos.executeQuery("match (n) detach \n delete n");
                
                for (int x = 0; x<14 ; x++){
                grafoPrincipal.addNode(adyacencia[x][0]);
                String query = String.format("\"%s\"", adyacencia[x][0]);
                datos.executeQuery("CREATE (n:Persona {name: "+query+"})");
                }
                
        for (int j = 0; j<14;j++){
            for (int i = 0; i<14; i++){
                matriz[i][j]=Integer.parseInt(adyacencia[i][j+1]);
            }
        }
        
        for (int j = 0; j<14;j++){
            for (int i = 0; i<14; i++){
                if (matriz[i][j]>0){
         
                    String persona1 = String.format("\"%s\"", adyacencia[j][0]);
                    String persona2 = String.format("\"%s\"", adyacencia[i][0]);
                  datos.executeQuery("match (n: Persona {name: "+persona1+"})" +
                                    "match (m: Persona {name: "+persona2+"})" +
                                      "create (n)-[:SEND_TO {quantity: "+matriz[i][j]+"}]->(m)");
                  grafoPrincipal.addEdge(""+adyacencia[j][0]+adyacencia[i][0], adyacencia[j][0], adyacencia[i][0], true);
                  
                if (matriz[i][j]>6)
                {
                    if (graph6.getNode(adyacencia[i][0])==null){
                    graph6.addNode(adyacencia[i][0]);
                    }
                    if (graph6.getNode(adyacencia[j][0])==null){
                    graph6.addNode(adyacencia[j][0]);
                    }
                    graph6.addEdge(""+adyacencia[j][0]+adyacencia[i][0], adyacencia[j][0], adyacencia[i][0], true);
                }
                  
                }
            }
        }
     }
                    conexion.close();

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            
            }
    
    
    /**
    * Método que devuelve las personas menos comunicadas
    * @param nothing
    * @return String cadena
    */
   public String menos (){
       String cadena = "";
       ArrayList<Nodo> comunicaciones = new ArrayList();
       for (Node node : grafoPrincipal){
           Nodo p = new Nodo(node.getDegree(), node.getId());
           comunicaciones.add(p);
       }
       comunicaciones.sort(null);
       cadena = comunicaciones.get(0).getName()+"\n "+comunicaciones.get(1).getName()+"\n "+comunicaciones.get(2).getName()+" ";
       return cadena;
   }
    
   /**
    * Método que devuelve las personas mas comunicadas
    * @param nothing
    * @return String cadena
    */
   public String mas (){
       String cadena = "";
       ArrayList<Nodo> comunicaciones = new ArrayList();
       for (Node node : grafoPrincipal){
           Nodo p = new Nodo(node.getDegree(), node.getId());
           comunicaciones.add(p);
       }
       comunicaciones.sort(null);
       cadena = comunicaciones.get(13).getName()+"\n "+comunicaciones.get(12).getName()+"\n "+comunicaciones.get(11).getName()+" ";
       return cadena;
   }
    
    /**
    * Método que muestra los nodos muy conectados conectados con otros nodos muy conectados
    * @param nothing
    * @return nothing
    */
   public void pagerank() {
    lospuestos.clear();
       PageRank pageRank = new PageRank();
       pageRank.setVerbose(true);
	pageRank.init(grafoPrincipal);
       
       for (Node nodito : grafoPrincipal){
           double rango = pageRank.getRank(nodito);
           rango = rango*100;
           puestos.add(""+rango+"% "+nodito.getId());
           int r = (int) rango;
           Nodo p = new Nodo(r, nodito.getId());
           lospuestos.add(p);
       }
       puestos.sort(null);
       lospuestos.sort(null);
       
   }
   
   /**
    * @param nothing
    * @return String puestos
    */
   public String obtenerPuestos()
   {
       String puestos = "";
       int i =0;
       for (Nodo p: lospuestos){
           puestos = puestos + lospuestos.get(i).getName()+": "+lospuestos.get(i).getNum()+"\n";
           i++;
       }
       return puestos;
   }
   
   /**
   * @param nothing
   * @return nothing
   */
  public void mostrar6(){
      graph6	.display();
  }
   
   /**
   * Método que muestra la cantidad de correos entre una persona y otra
   * @param String origen,destino
   * @return String cantidad
   */
  public String envios(String origen, String destino){
      String cantidad = ""; 
      try {
                  Connection conexion = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=0101,debug=true,noSsl,flatten=[-1,100,1000]");
                  try (Statement datos = conexion.createStatement()) {
      
      String nombreo = String.format("\"%s\"",origen);
      String nombred = String.format("\"%s\"",destino);
      ResultSet rs = datos.executeQuery("match (l {name: "+nombreo+"})\n"+
                                       "match (m {name: "+nombred+"})\n"+
                                       "match path = shortestPath( (l)-[:SEND_TO*..3]-(m) ) \n"+
                                       "UNWIND nodes(path) as n\n" +
                                       "RETURN reduce(quantity=0, r in relationships(path) | quantity+r.quantity) AS totalWeight"); 
      if (rs.next()){
          int minimomatriz = rs.getInt("totalWeight");
          cantidad ="Cantidad de matriz de "+origen+" a "+destino+" es: "+minimomatriz;
      
      } else {    cantidad = "No hay correos entre: "+origen + " y "+destino;
      } 
                  }
      } catch (Exception ex){
          ex.printStackTrace();
      }
      return cantidad;
  }
    
    

   
    
}

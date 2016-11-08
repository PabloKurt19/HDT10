import java.io.File;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class prueba {
	private static final String prueba_DBPath = "C:\\Users\\usuario\\Documents\\Neo4j\\Prueba";
	
	Node uvg;
	Node estudiante1;
	Relationship relation;
	GraphDatabaseService graphDataService;
	
	public enum NodeType implements Label{
		Estudiante,Universidad;
	}
	
	public enum RelTypes implements RelationshipType{
		STUDY;
	}
	
	public static void main(String[] args){
		prueba hello = new prueba();
		hello.createDatabase();
		//hello.removeData();
		hello.shutDown();
	}
	
	void createDatabase(){
		File archivo = new File(prueba_DBPath);
		graphDataService = new GraphDatabaseFactory().newEmbeddedDatabase(archivo);
		Transaction transaction = graphDataService.beginTx();
		try {
			uvg = graphDataService.createNode(NodeType.Universidad);
			uvg.setProperty("Nombre", "Universidad del Valle de Guatemala");
			estudiante1 = graphDataService.createNode(NodeType.Estudiante);
			estudiante1.setProperty("Nombre", "Pablo Ortiz");
			
			relation = estudiante1.createRelationshipTo(uvg, RelTypes.STUDY);
			relation.setProperty("relationship-type", "estuia en ");
			System.out.println(estudiante1.getProperty("Nombre")+" " + relation.getProperty("relationship-type")+" "+uvg.getProperty("Nombre"));
			
			//Transacción
			transaction.success();
		}
		finally{
			transaction.close();
		}
	}
	
	void removeData(){
		Transaction transaction = graphDataService.beginTx();
		
		try{
			
			//Eliminar
			estudiante1.getSingleRelationship(RelTypes.STUDY, Direction.OUTGOING).delete();
			System.out.println("Se remueven los nodos");
			
			//Eliminar Nodos
			uvg.delete();
			estudiante1.delete();
			transaction.success();
		}
		finally{
			//Elimanar transacción
			transaction.close();
		}
	}
	
	void shutDown(){
		//Apagar Base de Datos
		graphDataService.shutdown();
		System.out.println("Se ha cerreado la base de datos");
	}
	
}

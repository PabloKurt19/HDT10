import java.io.File;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

/**
 * 
 */

/**
 * @author Pablo Ortiz
 * @author Pedro Garcia 
 * @author Dieter de Wit
 * @version 07.11.16
 */
public class grafo {
	//Direccion de base de datos
	private static final String prueba_DBPath = "C:\\Users\\usuario\\Documents\\Neo4j\\HojaDeTrabajo10";
	
	/**
	 * atributos
	 */
	Node p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14;
	Relationship relation;
	GraphDatabaseService graphDataService;
	
	//Se crea el tipo de nodo
	public enum NodeType implements Label{
		Persona
	}
	
	//Se crea las relaciones
	public enum RelTypes implements RelationshipType{
		SEND_TO
	}
	
	
	/**
	 * Se crean los nodos de las personas 
	 * @param nothing
	 * @return nothing
	 */
	public void createDatabase(){
		File archivo = new File(prueba_DBPath);
		graphDataService = new GraphDatabaseFactory().newEmbeddedDatabase(archivo);
		Transaction transaction = graphDataService.beginTx();
		try {
			//Se crean los nodos de las personas
			p1 = graphDataService.createNode(NodeType.Persona);
			p1.setProperty("Nombre", "Persona1");
			p2 = graphDataService.createNode(NodeType.Persona);
			p2.setProperty("Nombre", "Persona2");
			
			p3 = graphDataService.createNode(NodeType.Persona);
			p3.setProperty("Nombre", "Persona3");
			p4 = graphDataService.createNode(NodeType.Persona);
			p4.setProperty("Nombre", "Persona4");
			
			p5 = graphDataService.createNode(NodeType.Persona);
			p5.setProperty("Nombre", "Persona5");
			p6 = graphDataService.createNode(NodeType.Persona);
			p6.setProperty("Nombre", "Persona6");
			
			p7 = graphDataService.createNode(NodeType.Persona);
			p7.setProperty("Nombre", "Persona7");
			p8 = graphDataService.createNode(NodeType.Persona);
			p8.setProperty("Nombre", "Persona8");
			
			p9 = graphDataService.createNode(NodeType.Persona);
			p9.setProperty("Nombre", "Persona9");
			p10 = graphDataService.createNode(NodeType.Persona);
			p10.setProperty("Nombre", "Persona10");
			
			p11 = graphDataService.createNode(NodeType.Persona);
			p11.setProperty("Nombre", "Persona11");
			p12 = graphDataService.createNode(NodeType.Persona);
			p12.setProperty("Nombre", "Persona12");
			
			p13 = graphDataService.createNode(NodeType.Persona);
			p13.setProperty("Nombre", "Persona13");
			p14 = graphDataService.createNode(NodeType.Persona);
			p14.setProperty("Nombre", "Persona14");
			
			
			//Se crean las relaciones de correos 
			//Persona1 a Persona2
			relation = p1.createRelationshipTo(p2, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p2, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p2, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			System.out.println(p1.getProperty("Nombre")+" " + relation.getProperty("relationship-type")+" "+p2.getProperty("Nombre"));
			
			//Persona1 a Persona3
			relation = p1.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona1 a Persona9
			relation = p1.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p1.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona1 a Persona14
			relation = p1.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona2 a Persona1
			relation = p2.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona2 a Persona3
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p3, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona2 a Persona4
			relation = p2.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p2.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona2 a Persona12
			relation = p2.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona3 a Persona1
			relation = p3.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p3.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p3.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p3.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p3.createRelationshipTo(p1, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona3 a Persona4
			relation = p3.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p3.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona4 a Persona5
			relation = p4.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona4 a Persona6
			relation = p4.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona4 a Persona11
			relation = p4.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona4 a Persona13
			relation = p4.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona4 a Persona14
			relation = p4.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p4.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona5 a Persona4
			relation = p5.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona5 a Persona6
			relation = p5.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona5 a Persona11
			relation = p5.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona5 a Persona12
			relation = p5.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona5 a Persona13
			relation = p5.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona5 a Persona14
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p5.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona6 a Persona4
			relation = p6.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona6 a Persona5
			relation = p6.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona6 a Persona12
			relation = p6.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona6 a Persona13
			relation = p6.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p6.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona7 a Persona8
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona7 a Persona9
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p7.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona7 a Persona11
			relation = p7.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona8 a Persona6
			relation = p8.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona8 a Persona7
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona8 a Persona9
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p9, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona8 a Persona10
			relation = p8.createRelationshipTo(p10, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p8.createRelationshipTo(p10, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona9 a Persona5
			relation = p9.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona9 a Persona7
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona9 a Persona8
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p9.createRelationshipTo(p8, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona4
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona5
			relation = p10.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona6
			relation = p10.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona7
			relation = p10.createRelationshipTo(p7, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona11
			relation = p10.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p11, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona12
			relation = p10.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p12, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona13
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona10 a Persona14
			relation = p10.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p10.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona11 a Persona4
			relation = p11.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona11 a Persona6
			relation = p11.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona11 a Persona10
			relation = p11.createRelationshipTo(p10, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona11 a Persona13
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p11.createRelationshipTo(p13, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona11 a Persona14
			relation = p11.createRelationshipTo(p14, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona12 a Persona4
			relation = p12.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p4, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona12 a Persona5
			relation = p12.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p5, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona12 a Persona6
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p6, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Persona12 a Persona10
			relation = p12.createRelationshipTo(p10, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			relation = p12.createRelationshipTo(p10, RelTypes.SEND_TO);
			relation.setProperty("relationship-type", "Le envió a ");
			
			//Transacción
			transaction.success();
		}
		finally{
			transaction.close();
		}
	}
	
	public void shutDown(){
		//Apagar Base de Datos
		graphDataService.shutdown();
		System.out.println("Se ha cerreado la base de datos");
	}

}

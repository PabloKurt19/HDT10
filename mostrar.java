import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 * @author Pablo Ortiz
 * @author Pedro Garcia 
 * @author Dieter de Wit
 * @version 07.11.16
 */

public class mostrar extends JFrame{

private JLabel lbl1;
	
	public mostrar() {
		getContentPane().setLayout(null);
		
		setVisible(false);
		setSize(1432,611);
		
		JLabel lbl1 = new JLabel(new ImageIcon("playera.png"));
		lbl1.setBounds(101, 70, 46, 14);
		getContentPane().add(lbl1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:/Users/usuario/Documents/Universidad/4to. Semestre/Algorítmos y Estructura de Datos/grafo10.jpg"));
		lblNewLabel.setBounds(0, 0, 1432, 611);
		getContentPane().add(lblNewLabel);
		//lbl1.setIcon(new ImageIcon("playera.png"));
		//lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("playera.png")));
		
	}
	
	public void visible(){
		setVisible(true);
		
	}
	public void invisible(){
		setVisible(false);
	}
	public void initialize(){
		
		
	}
	
}
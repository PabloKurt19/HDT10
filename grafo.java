import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class grafo extends JFrame {
	
	private JLabel lbl1;
	
	public grafo() {
		getContentPane().setLayout(null);
		
		setVisible(false);
		setSize(400,350);
		
		JLabel lbl1 = new JLabel(new ImageIcon("playera.png"));
		lbl1.setBounds(101, 70, 46, 14);
		getContentPane().add(lbl1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\usuario1\\Desktop\\Nueva carpeta\\HDT10\\src\\playera.jpg"));
		lblNewLabel.setBounds(60, 27, 264, 227);
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

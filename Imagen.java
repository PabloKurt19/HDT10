import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Imagen extends JFrame{

	private JFrame frame;
	private JButton btnVerGrafo;
	private ImageIcon Imagen;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagen window = new Imagen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Imagen() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lbImagen = new JLabel("-");
		lbImagen.setBounds(157, 106, 46, 14);
		frame.getContentPane().add(lbImagen);
		
		JButton btnVerGrafo = new JButton("Ver grafo");
		btnVerGrafo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grafo obj = new grafo();
				obj.visible();
				setVisible(false);
			}
			
		});
		
		btnVerGrafo.setBounds(142, 29, 89, 23);
		frame.getContentPane().add(btnVerGrafo);
	}
	
		
}

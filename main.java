import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

public class main {

	private JFrame frame;
	private JComboBox comboBox1;
	private JComboBox comboBox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		grafo dbgrafo = new grafo();
		dbgrafo.crearGrafo();
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ver Grafo");
		btnNewButton.setBounds(49, 36, 130, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver PageRank");
		btnNewButton_1.setBounds(49, 330, 130, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("M\u00E1 Comunidados");
		btnNewButton_2.setBounds(37, 228, 158, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Menos Comunicados");
		btnNewButton_3.setBounds(37, 281, 158, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"}));
		comboBox1.setBounds(37, 138, 64, 22);
		frame.getContentPane().add(comboBox1);
		
		JLabel lblDePersona = new JLabel("De persona");
		lblDePersona.setBounds(32, 109, 80, 16);
		frame.getContentPane().add(lblDePersona);
		
		JLabel lblAPersona = new JLabel("A persona");
		lblAPersona.setBounds(131, 109, 80, 16);
		frame.getContentPane().add(lblAPersona);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "TODOS"}));
		comboBox2.setBounds(134, 138, 58, 22);
		frame.getContentPane().add(comboBox2);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(69, 172, 97, 25);
		frame.getContentPane().add(btnMostrar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(255, 65, 389, 284);
		frame.getContentPane().add(textArea);
		
		JLabel lblEstadsticas = new JLabel("Estad\u00EDsticas");
		lblEstadsticas.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblEstadsticas.setBounds(382, 13, 158, 39);
		frame.getContentPane().add(lblEstadsticas);
	}
}

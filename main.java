import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JTextArea textArea;

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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Mostrar el grafo
			}
		});
		btnNewButton.setBounds(49, 36, 130, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver PageRank");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				dbgrafo.pagerank();
				textArea.setText(dbgrafo.obtenerPuestos());
			}
		});
		btnNewButton_1.setBounds(49, 330, 130, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("M\u00E1 Comunidados");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.setText(dbgrafo.mas());
			}
		});
		btnNewButton_2.setBounds(37, 228, 158, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Menos Comunicados");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea.setText(dbgrafo.menos());
			}
		});
		btnNewButton_3.setBounds(37, 281, 158, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Per 1", "Per 2", "Per 3", "Per 4", "Per 5", "Per 6", "Per 7", "Per 8", "Per 9", "Per 10", "Per 11", "Per 12", "Per 13", "Per 14"}));
		comboBox1.setBounds(37, 138, 64, 22);
		frame.getContentPane().add(comboBox1);
		
		JLabel lblDePersona = new JLabel("De persona");
		lblDePersona.setBounds(32, 109, 80, 16);
		frame.getContentPane().add(lblDePersona);
		
		JLabel lblAPersona = new JLabel("A persona");
		lblAPersona.setBounds(131, 109, 80, 16);
		frame.getContentPane().add(lblAPersona);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Per 1", "Per 2", "Per 3", "Per 4", "Per 5", "Per 6", "Per 7", "Per 8", "Per 9", "Per 10", "Per 11", "Per 12", "Per 13", "Per 14", "TODOS"}));
		comboBox2.setBounds(134, 138, 58, 22);
		frame.getContentPane().add(comboBox2);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String origen = (String) comboBox1.getSelectedItem().toString();
				String destino = (String) comboBox2.getSelectedItem().toString();
				
				if(!destino.equals("TODOS")){
					textArea.setText(dbgrafo.envios(origen, destino));
				}
				else{
					String[] fin = new String[14];
					for (int i=0; i<14; i++){
						fin[i]= "Persona"+(i+1);
					}
					String respuesta = "";
					for (String temp: fin){
						respuesta = respuesta + dbgrafo.envios(origen, temp) +"\n";
					}
					textArea.setText(respuesta);
				}
			}
		});
		btnMostrar.setBounds(69, 172, 97, 25);
		frame.getContentPane().add(btnMostrar);
		
		textArea = new JTextArea();
		textArea.setBounds(255, 65, 389, 284);
		frame.getContentPane().add(textArea);
		
		JLabel lblEstadsticas = new JLabel("Estad\u00EDsticas");
		lblEstadsticas.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblEstadsticas.setBounds(382, 13, 158, 39);
		frame.getContentPane().add(lblEstadsticas);
		
		JButton btnNewButton_4 = new JButton("6 o m\u00E1s");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostrar grafo de 6
			}
		});
		btnNewButton_4.setBounds(49, 71, 130, 25);
		frame.getContentPane().add(btnNewButton_4);
	}
}

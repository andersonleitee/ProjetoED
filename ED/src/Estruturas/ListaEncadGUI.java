package Estruturas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ListaEncadGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaEncadGUI frame = new ListaEncadGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaEncadGUI() {
		JFrame listaencad = new JFrame();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		listaencad.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
		
		JLabel lblListaEncadeada = new JLabel("Lista Encadeada");
		lblListaEncadeada.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 23));
		lblListaEncadeada.setBounds(106, 11, 199, 36);
		contentPane.add(lblListaEncadeada);
	}
}

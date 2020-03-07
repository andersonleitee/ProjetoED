package Estruturas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioGUI frame = new InicioGUI();
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
	public InicioGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstrututuraDeDados = new JLabel("Escolha a estrutura de dados");
		lblEstrututuraDeDados.setForeground(Color.BLACK);
		lblEstrututuraDeDados.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 24));
		lblEstrututuraDeDados.setBackground(Color.LIGHT_GRAY);
		lblEstrututuraDeDados.setBounds(34, 11, 360, 30);
		contentPane.add(lblEstrututuraDeDados);
		
		
			//** Botão Lista Sequencial **\\
		JButton btnNewButton = new JButton("Lista Sequencial");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ListaSeqGUI().setVisible(true);	
			}
		});
		btnNewButton.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(89, 64, 248, 23);
		contentPane.add(btnNewButton);
		
		//** Botão Lista Encadeada **\\
		
		JButton btnNewButton_1 = new JButton("Lista Encadeada");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListaEncadGUI().setVisible(true);	
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(89, 109, 248, 23);
		contentPane.add(btnNewButton_1);
		
		//** Botão Pilha **\\
		JButton btnNewButton_2 = new JButton("Pilha");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PilhaGUI().setVisible(true);	
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(89, 151, 248, 23);
		contentPane.add(btnNewButton_2);
		
		//** Botão Fila **\\
		JButton btnNewButton_3 = new JButton("Fila");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FilaGUI().setVisible(true);	
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setBounds(89, 195, 248, 23);
		contentPane.add(btnNewButton_3);
	}
}

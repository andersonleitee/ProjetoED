package Estruturas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ListaSeqGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton quadrado [] = new JButton [10]; 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaSeqGUI frame = new ListaSeqGUI();
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
	public ListaSeqGUI() {
		JFrame listaseq = new JFrame();
		ListaSeq lista = new ListaSeq();
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		listaseq.setDefaultCloseOperation(DISPOSE_ON_CLOSE);



		JLabel lblListaSequencial = new JLabel("Lista Sequencial");
		lblListaSequencial.setForeground(Color.BLACK);
		lblListaSequencial.setFont(new Font("Swis721 Hv BT", Font.BOLD, 20));
		lblListaSequencial.setBounds(123, 0, 190, 48);
		contentPane.add(lblListaSequencial);

		/*Botão inserir*/
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setForeground(Color.BLACK);
		btnInserir.setBackground(new Color(0, 191, 255));
		btnInserir.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posi;
				String dados;
				int pos,dado;				
				posi = JOptionPane.showInputDialog("Digite um número para posição");
				dados = JOptionPane.showInputDialog("Digite um número para armazenar");
				pos = Integer.parseInt(posi);
				dado = Integer.parseInt(dados);

				if(lista.cheia() || pos > (lista.tamanho()) + 1 || pos <= 0) {
					JOptionPane.showMessageDialog(null, "Digite um valor válido para posição");
				} else {
					lista.insere(pos, dado);
					int i = lista.tamanho();
					//quadrado[i].setVisible(true);
					for (i = lista.tamanho() -1 ; i >= pos-1; i-- ) {	
						quadrado[i+1].setText(quadrado[i].getText()); // getText pega o valor
						quadrado[i].setText(dados);				  
					} 

					//	quadrado[i].setVisible(true);
				}}
		});

		btnInserir.setBounds(0, 54, 138, 23);
		contentPane.add(btnInserir);

		/*Botão Remover*/
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBackground(new Color(255, 0, 0));
		btnRemover.setForeground(Color.BLACK);
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String posi;
				int pos;
				posi = JOptionPane.showInputDialog("Digite a posição que deseja remover");
				pos = Integer.parseInt(posi);
				
				if(pos > lista.tamanho() || pos <1 || lista.vazia() ) {
					JOptionPane.showMessageDialog(null, "Digite um valor válido para posição");
				
				} else {
					lista.remove(pos);
					for (int i = pos-1; i < lista.tamanho(); i++) {
						quadrado[i].setText(quadrado[i+1].getText());
						quadrado[lista.tamanho()].setText(null);
					}

				}

			}
		});
		//btnRemover.setVisible(true);
		btnRemover.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnRemover.setBounds(307, 54, 127, 23);
		contentPane.add(btnRemover);



		JButton btnB1 = new JButton();
		btnB1.setHorizontalAlignment(SwingConstants.LEFT);
		btnB1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB1.setBackground(Color.WHITE);
		btnB1.setForeground(Color.BLACK);
		btnB1.setBounds(10, 118, 46, 23);
		contentPane.add(btnB1);
		//btnB1.setVisible(false);

		JButton btnB2 = new JButton();
		btnB2.setHorizontalAlignment(SwingConstants.LEFT);
		btnB2.setForeground(Color.BLACK);
		btnB2.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB2.setBackground(Color.WHITE);
		btnB2.setBounds(47, 118, 46, 23);
		contentPane.add(btnB2);
		//btnB2.setVisible(false);

		JButton btnB3 = new JButton();
		btnB3.setHorizontalAlignment(SwingConstants.LEFT);
		btnB3.setForeground(Color.BLACK);
		btnB3.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB3.setBackground(Color.WHITE);
		btnB3.setBounds(87, 118, 46, 23);
		contentPane.add(btnB3);
		//btnB3.setVisible(false);

		JButton btnB4 = new JButton();
		btnB4.setHorizontalAlignment(SwingConstants.LEFT);
		btnB4.setForeground(Color.BLACK);
		btnB4.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB4.setBackground(Color.WHITE);
		btnB4.setBounds(130, 118, 46, 23);
		contentPane.add(btnB4);
		//btnB4.setVisible(false);

		JButton btnB5 = new JButton();
		btnB5.setHorizontalAlignment(SwingConstants.LEFT);
		btnB5.setForeground(Color.BLACK);
		btnB5.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB5.setBackground(Color.WHITE);
		btnB5.setBounds(172, 118, 46, 23);
		contentPane.add(btnB5);
		//btnB5.setVisible(false);

		JButton btnB6 = new JButton();
		btnB6.setHorizontalAlignment(SwingConstants.LEFT);
		btnB6.setForeground(Color.BLACK);
		btnB6.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB6.setBackground(Color.WHITE);
		btnB6.setBounds(212, 118, 46, 23);
		contentPane.add(btnB6);
		//btnB6.setVisible(false);

		JButton btnB7 = new JButton();
		btnB7.setHorizontalAlignment(SwingConstants.LEFT);
		btnB7.setForeground(Color.BLACK);
		btnB7.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB7.setBackground(Color.WHITE);
		btnB7.setBounds(254, 118, 46, 23);
		contentPane.add(btnB7);
		//btnB7.setVisible(false);

		JButton btnB8 = new JButton();
		btnB8.setHorizontalAlignment(SwingConstants.LEFT);
		btnB8.setForeground(Color.BLACK);
		btnB8.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB8.setBackground(Color.WHITE);
		btnB8.setBounds(292, 118, 46, 23);
		contentPane.add(btnB8);
		//btnB8.setVisible(false);

		JButton btnB9 = new JButton();
		btnB9.setHorizontalAlignment(SwingConstants.LEFT);
		btnB9.setForeground(Color.BLACK);
		btnB9.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB9.setBackground(Color.WHITE);
		btnB9.setBounds(336, 118, 46, 23);
		contentPane.add(btnB9);
		//btnB9.setVisible(false);

		JButton btnB10 = new JButton();
		btnB10.setHorizontalAlignment(SwingConstants.LEFT);
		btnB10.setForeground(Color.BLACK);
		btnB10.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB10.setBackground(Color.WHITE);
		btnB10.setBounds(378, 118, 46, 23);
		contentPane.add(btnB10);
		//btnB10.setVisible(false);

		/* Quadrados*/
		quadrado[0] = btnB1;
		quadrado[1] = btnB2;
		quadrado[2] = btnB3;
		quadrado[3] = btnB4;
		quadrado[4] = btnB5;
		quadrado[5] = btnB6;
		quadrado[6] = btnB7;
		quadrado[7] = btnB8;
		quadrado[8] = btnB9;
		quadrado[9] = btnB10;



		/*quadrado[0].setVisible(false);
		quadrado[1].setVisible(false);
		quadrado[2].setVisible(false);
		quadrado[3].setVisible(false);
		quadrado[4].setVisible(false);
		quadrado[5].setVisible(false);
		quadrado[6].setVisible(false);
		quadrado[7].setVisible(false);
		quadrado[8].setVisible(false);
		quadrado[9].setVisible(false);*/


	}
}

package Estruturas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class FilaGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton quadrado[] = new JButton[10];
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilaGUI frame = new FilaGUI();
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
	public FilaGUI() {
		Fila fila = new Fila();
		JFrame filaseq = new JFrame();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		filaseq.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JLabel lblFila = new JLabel("Fila");
		lblFila.setForeground(Color.BLACK);
		lblFila.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 22));
		lblFila.setBounds(179, 11, 48, 28);
		contentPane.add(lblFila);

		JButton btnB1 = new JButton();
		btnB1.setHorizontalAlignment(SwingConstants.LEFT);
		btnB1.setForeground(Color.BLACK);
		btnB1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB1.setBackground(Color.WHITE);
		btnB1.setBounds(10, 130, 46, 23);
		contentPane.add(btnB1);

		JButton btnB2 = new JButton();
		btnB2.setHorizontalAlignment(SwingConstants.LEFT);
		btnB2.setForeground(Color.BLACK);
		btnB2.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB2.setBackground(Color.WHITE);
		btnB2.setBounds(47, 130, 46, 23);
		contentPane.add(btnB2);

		JButton btnB3 = new JButton();
		btnB3.setHorizontalAlignment(SwingConstants.LEFT);
		btnB3.setForeground(Color.BLACK);
		btnB3.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB3.setBackground(Color.WHITE);
		btnB3.setBounds(87, 130, 46, 23);
		contentPane.add(btnB3);

		JButton btnB4 = new JButton();
		btnB4.setHorizontalAlignment(SwingConstants.LEFT);
		btnB4.setForeground(Color.BLACK);
		btnB4.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB4.setBackground(Color.WHITE);
		btnB4.setBounds(130, 130, 46, 23);
		contentPane.add(btnB4);

		JButton btnB5 = new JButton();
		btnB5.setHorizontalAlignment(SwingConstants.LEFT);
		btnB5.setForeground(Color.BLACK);
		btnB5.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB5.setBackground(Color.WHITE);
		btnB5.setBounds(172, 130, 46, 23);
		contentPane.add(btnB5);

		JButton btnB6 = new JButton();
		btnB6.setHorizontalAlignment(SwingConstants.LEFT);
		btnB6.setForeground(Color.BLACK);
		btnB6.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB6.setBackground(Color.WHITE);
		btnB6.setBounds(212, 130, 46, 23);
		contentPane.add(btnB6);

		JButton btnB7 = new JButton();
		btnB7.setHorizontalAlignment(SwingConstants.LEFT);
		btnB7.setForeground(Color.BLACK);
		btnB7.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB7.setBackground(Color.WHITE);
		btnB7.setBounds(254, 130, 46, 23);
		contentPane.add(btnB7);

		JButton btnB8 = new JButton();
		btnB8.setHorizontalAlignment(SwingConstants.LEFT);
		btnB8.setForeground(Color.BLACK);
		btnB8.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB8.setBackground(Color.WHITE);
		btnB8.setBounds(292, 130, 46, 23);
		contentPane.add(btnB8);

		JButton btnB9 = new JButton();
		btnB9.setHorizontalAlignment(SwingConstants.LEFT);
		btnB9.setForeground(Color.BLACK);
		btnB9.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB9.setBackground(Color.WHITE);
		btnB9.setBounds(336, 130, 46, 23);
		contentPane.add(btnB9);

		JButton btnB10 = new JButton();
		btnB10.setHorizontalAlignment(SwingConstants.LEFT);
		btnB10.setForeground(Color.BLACK);
		btnB10.setFont(new Font("Arial", Font.PLAIN, 11));
		btnB10.setBackground(Color.WHITE);
		btnB10.setBounds(378, 130, 46, 23);
		contentPane.add(btnB10);

		/*Botão inserir*/
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setForeground(Color.BLACK);
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String element;
				element = JOptionPane.showInputDialog("Digite o elemento que deseja inserir na lista ");
				int elemento;
				elemento = Integer.parseInt(element);
				fila.adcionar(elemento);
				if (fila.estaCheia()) {
					JOptionPane.showMessageDialog(null, "A fila está cheia!");
				} else {
				int i = fila.tamanho();
				for(i = fila.tamanho() - 1; i < fila.tamanho(); i++) {
					quadrado[i].setText(element);
				}
					
				}
				
				
			}
		});
		btnInserir.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnInserir.setBackground(new Color(0, 191, 255));
		btnInserir.setBounds(0, 53, 138, 23);
		contentPane.add(btnInserir);

		/*Botão Remover*/
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fila.remover();
				if (fila.estaVazia()) {
					JOptionPane.showMessageDialog(null, "A fila está vazia!");
				} else {
					
					for(int i = 0; i<fila.tamanho()-1;i++) {
						int tamanho = fila.tamanho();
						quadrado[i].setText(quadrado[i+1].getText());;
						quadrado[tamanho].setText(null);
						}
						
					
				}
			}
		});
		btnRemover.setForeground(Color.BLACK);
		btnRemover.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnRemover.setBackground(Color.RED);
		btnRemover.setBounds(307, 56, 127, 23);
		contentPane.add(btnRemover);

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

	}

}

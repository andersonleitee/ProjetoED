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
import javax.swing.UIManager;

public class PilhaGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton quadrado[] = new JButton [8];
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PilhaGUI frame = new PilhaGUI();
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
	public PilhaGUI() {
		JFrame pilhaseq = new JFrame();
		Pilha pilha = new Pilha();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		pilhaseq.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JLabel lblPilha = new JLabel("Pilha");
		lblPilha.setForeground(Color.BLACK);
		lblPilha.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 22));
		lblPilha.setBounds(188, 11, 54, 40);
		contentPane.add(lblPilha);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.setForeground(Color.BLACK);
		btnInserir.setBackground(new Color(30, 144, 255));
		btnInserir.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value;
				int valor;
				value = JOptionPane.showInputDialog("Digite o valor que deseja incluir no topo da pilha");
				valor = Integer.parseInt(value);
				pilha.push(valor);
				if (pilha.cheia()) {
					JOptionPane.showMessageDialog(null, "Pilha está cheia!");
				} else {
					int i = pilha.tamanho();
					for(i = pilha.tamanho() - 1; i < pilha.tamanho(); i++) {
						quadrado[i].setText(value);
					}
				}
			}

		});
		btnInserir.setBounds(0, 38, 123, 23);
		contentPane.add(btnInserir);

		JButton btnRemover = new JButton("Remover");
		btnRemover.setForeground(Color.BLACK);
		btnRemover.setBackground(new Color(255, 0, 0));
		btnRemover.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 18));
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pilha.pop();
				if (quadrado[0].getText() == null && pilha.vazia()) {
					JOptionPane.showMessageDialog(null, "Pilha está vazia!");
				} else {
				int tamanho;
				tamanho = pilha.tamanho();
				quadrado[tamanho].setText(null);
				}
			}
		});
		btnRemover.setBounds(311, 38, 123, 23);
		contentPane.add(btnRemover);

		JButton btnB7 = new JButton();
		btnB7.setBackground(Color.WHITE);
		btnB7.setBounds(163, 60, 108, 23);
		contentPane.add(btnB7);

		JButton btnB6 = new JButton();
		btnB6.setBackground(Color.WHITE);
		btnB6.setBounds(163, 90, 108, 23);
		contentPane.add(btnB6);

		JButton btnB5 = new JButton();
		btnB5.setBackground(Color.WHITE);
		btnB5.setBounds(163, 120, 108, 23);
		contentPane.add(btnB5);

		JButton btnB4 = new JButton();
		btnB4.setBackground(Color.WHITE);
		btnB4.setBounds(163, 150, 108, 23);
		contentPane.add(btnB4);

		JButton btnB3 = new JButton();
		btnB3.setBackground(Color.WHITE);
		btnB3.setBounds(163, 180, 108, 23);
		contentPane.add(btnB3);

		JButton btnB2 = new JButton();
		btnB2.setBackground(Color.WHITE);
		btnB2.setBounds(163, 210, 108, 23);
		contentPane.add(btnB2);

		JButton btnB1 = new JButton();
		btnB1.setBackground(Color.WHITE);
		btnB1.setBounds(163, 240, 108, 23);
		contentPane.add(btnB1);

		/* Quadrados*/
		quadrado[0] = btnB1;
		quadrado[1] = btnB2;
		quadrado[2] = btnB3;
		quadrado[3] = btnB4;
		quadrado[4] = btnB5;
		quadrado[5] = btnB6;
		quadrado[6] = btnB7;


	}
}

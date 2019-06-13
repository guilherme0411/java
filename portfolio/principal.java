package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(principal.class.getResource("/icones/Projeto.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnImc = new JButton("");
		btnImc.setIcon(new ImageIcon(principal.class.getResource("/icones/peso.png")));
		btnImc.setBackground(Color.BLACK);
		btnImc.setForeground(Color.WHITE);
		btnImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoIMC novo = new CalculoIMC();
				novo.setVisible(true);
			}
		});
		btnImc.setBounds(116, 64, 96, 96);
		contentPane.add(btnImc);
		
		JButton btnCalculo = new JButton("");
		btnCalculo.setIcon(new ImageIcon(principal.class.getResource("/icones/iconfinder_09_Calculator_1871426.png")));
		btnCalculo.setBackground(Color.BLACK);
		btnCalculo.setForeground(Color.WHITE);
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoMedia novamedia = new CalculoMedia();
				novamedia.setVisible(true);
			}
		});
		btnCalculo.setBounds(10, 64, 96, 96);
		contentPane.add(btnCalculo);
		
		JButton btnJokenpo = new JButton("");
		btnJokenpo.setBackground(Color.BLACK);
		btnJokenpo.setIcon(new ImageIcon(principal.class.getResource("/icones/pedra.png")));
		btnJokenpo.setForeground(Color.WHITE);
		btnJokenpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedraPapelTesoura novoJokenpo = new PedraPapelTesoura();
				novoJokenpo.setVisible(true);
			}
		});
		btnJokenpo.setBounds(116, 171, 96, 96);
		contentPane.add(btnJokenpo);
		
		JButton btnSobre = new JButton("");
		btnSobre.setBackground(Color.BLACK);
		btnSobre.setIcon(new ImageIcon(principal.class.getResource("/icones/Interroga\u00E7\u00E3o.png")));
		btnSobre.setForeground(Color.WHITE);
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre novosobre = new Sobre();
				novosobre.setVisible(true);
			}
		});
		btnSobre.setBounds(328, 171, 96, 96);
		contentPane.add(btnSobre);
		
		JLabel lblProjetoPortiflio = new JLabel("Portif\u00F3lio de Projetos\r\n");
		lblProjetoPortiflio.setForeground(Color.WHITE);
		lblProjetoPortiflio.setBackground(Color.WHITE);
		lblProjetoPortiflio.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblProjetoPortiflio.setBounds(109, 11, 238, 28);
		contentPane.add(lblProjetoPortiflio);
		
		JButton btnIndito = new JButton("");
		btnIndito.setIcon(new ImageIcon(principal.class.getResource("/icones/jogo da velha.png")));
		btnIndito.setBackground(Color.BLACK);
		btnIndito.setForeground(Color.WHITE);
		btnIndito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interface intface = new Interface(null, rootPaneCheckingEnabled);
				intface.setVisible(true);
			}
		});
		btnIndito.setBounds(222, 64, 96, 96);
		contentPane.add(btnIndito);
		
		JButton btnRepetio = new JButton("");
		btnRepetio.setIcon(new ImageIcon(principal.class.getResource("/icones/nmr.jpg")));
		btnRepetio.setForeground(Color.WHITE);
		btnRepetio.setBackground(Color.BLACK);
		btnRepetio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Repeticao repet = new Repeticao();
				repet.setVisible(true);
			}
		});
		btnRepetio.setBounds(222, 171, 96, 96);
		contentPane.add(btnRepetio);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(principal.class.getResource("/icones/icons8-idade-64.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sirlene sisi = new Sirlene();
				sisi.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(328, 64, 96, 96);
		contentPane.add(btnNewButton);
		
		JButton btnPdv = new JButton("");
		btnPdv.setIcon(new ImageIcon(principal.class.getResource("/icones/icons8-performance-de-vendas-100.png")));
		btnPdv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PDV pdvv = new PDV();
				pdvv.setVisible(true);
			}
		});
		btnPdv.setForeground(Color.WHITE);
		btnPdv.setBackground(Color.BLACK);
		btnPdv.setBounds(10, 171, 96, 96);
		contentPane.add(btnPdv);
	}
}

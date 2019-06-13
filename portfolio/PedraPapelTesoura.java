package portfolio;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class PedraPapelTesoura extends JFrame {

	private JPanel contentPane;
	private JLabel lblComputador;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedraPapelTesoura frame = new PedraPapelTesoura();
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
	public PedraPapelTesoura() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PedraPapelTesoura.class.getResource("/icones/icon.png")));
		setResizable(false);
		setTitle("Jokenp\u00F4");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 326, 392);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPedra = new JButton("");
		btnPedra.setToolTipText("PEDRA");
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 1;
				jogar();
			}
		});
		btnPedra.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/pedra.png")));
		btnPedra.setBounds(117, 269, 70, 70);
		contentPane.add(btnPedra);
		
		JButton btnPapel = new JButton("");
		btnPapel.setToolTipText("PAPEL");
		btnPapel.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/papel.png")));
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 2;
				jogar();
			}
		});
		btnPapel.setBounds(24, 269, 70, 70);
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("");
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = 3;
				jogar();
			}
		});
		btnTesoura.setToolTipText("TESOURA");
		btnTesoura.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/tesoura.png")));
		btnTesoura.setBounds(221, 269, 70, 70);
		contentPane.add(btnTesoura);
		
		JLabel lblNewLabel = new JLabel("Escolha uma op\u00E7\u00E3o");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setBounds(91, 223, 146, 35);
		contentPane.add(lblNewLabel);
		
		lblComputador = new JLabel("");
		lblComputador.setBounds(62, 45, 171, 139);
		contentPane.add(lblComputador);
		
		JLabel lblComp = new JLabel("Computador");
		lblComp.setForeground(Color.BLUE);
		lblComp.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblComp.setBounds(117, 11, 93, 35);
		contentPane.add(lblComp);
		
		lblResultado = new JLabel("");
		lblResultado.setBackground(SystemColor.textHighlightText);
		lblResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(101, 195, 112, 29);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel_1 = new JLabel("RESULTADO:");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 2, 84, 55);
		contentPane.add(lblNewLabel_1);
	}
	
	int jogador, computador; 
	
	
	private void jogar(){
		//btnTesoura.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/br/com/icons/tesoura.png")));
	
		Random gerador = new Random();
		computador = gerador.nextInt(3) + 1;
		
		switch(computador){
		case 1:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/pcpedra.png")));
			break;
		case 2:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/pcpapel.png")));
			break;
		case 3:
			lblComputador.setIcon(new ImageIcon(PedraPapelTesoura.class.getResource("/icones/pctesoura.png")));
			break;
		}
		
		if (jogador == computador) {
			lblResultado.setText("EMPATE");
		} else {
			if ((jogador == 3 && computador == 2) || (jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)) {

				lblResultado.setText("JOGADOR");
			} else {
				lblResultado.setText("COMPUTADOR");
			}
	}
}
}
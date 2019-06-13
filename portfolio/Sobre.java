package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/icones/Intego.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeGuilhermeDe = new JLabel("Nome: Guilherme de Oliveira");
		lblNomeGuilhermeDe.setBounds(10, 101, 222, 14);
		contentPane.add(lblNomeGuilhermeDe);
		
		JLabel lblDesenvolvidoByGuilherme = new JLabel("Desenvolvido por Guilherme \r\n");
		lblDesenvolvidoByGuilherme.setFont(new Font("Swis721 Hv BT", Font.BOLD, 20));
		lblDesenvolvidoByGuilherme.setBounds(55, 11, 318, 40);
		contentPane.add(lblDesenvolvidoByGuilherme);
		
		JLabel lblDataDeNasc = new JLabel("Data de Nasc.: 04.11.2000");
		lblDataDeNasc.setBounds(10, 126, 171, 14);
		contentPane.add(lblDataDeNasc);
		
		JLabel lblProjetoPortflioDe = new JLabel("Projeto: Portf\u00F3lio - Orientador: Jos\u00E9 de Assis");
		lblProjetoPortflioDe.setBounds(10, 151, 332, 14);
		contentPane.add(lblProjetoPortflioDe);
		
		JLabel lblDataDeCriao = new JLabel("Data de cria\u00E7\u00E3o: 12.06.2019");
		lblDataDeCriao.setBounds(10, 176, 187, 14);
		contentPane.add(lblDataDeCriao);
		
		JLabel lblInstituioSenac = new JLabel("Institui\u00E7\u00E3o Senac - Tatuap\u00E9");
		lblInstituioSenac.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInstituioSenac.setBounds(127, 236, 171, 14);
		contentPane.add(lblInstituioSenac);
		
		JLabel lblTurmaTi = new JLabel("Turma: TI - 01 / 2018");
		lblTurmaTi.setBounds(10, 201, 147, 14);
		contentPane.add(lblTurmaTi);
	}
}

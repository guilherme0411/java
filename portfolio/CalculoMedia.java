package portfolio;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoMedia extends JFrame {

	private JPanel contentPane;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField txtMedia;
	private JLabel txtNota1;
	private JLabel txtNota2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoMedia frame = new CalculoMedia();
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
	public CalculoMedia() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoMedia.class.getResource("/icones/iconfinder_calculator_3827987.png")));
		setTitle("Calculadora da m\u00E9dia");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 372, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(10, 25, 48, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(10, 52, 48, 14);
		contentPane.add(lblNota_1);
		
		textNota1 = new JTextField();
		textNota1.setBounds(56, 22, 116, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setBounds(56, 49, 116, 20);
		contentPane.add(textNota2);
		textNota2.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			//evento "clicar" no botão
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setIcon(new ImageIcon(CalculoMedia.class.getResource("/icones/iconfinder_calculator_icon_1741324.png")));
		btnCalcular.setBounds(23, 95, 128, 128);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(CalculoMedia.class.getResource("/icones/iconfinder_draw-08_725558.png")));
		btnLimpar.setBounds(191, 95, 128, 128);
		contentPane.add(btnLimpar);
		
		JLabel lblMdia = new JLabel("M\u00E9dia");
		lblMdia.setBounds(223, 25, 34, 14);
		contentPane.add(lblMdia);
		
		txtMedia = new JTextField();
		txtMedia.setBounds(205, 49, 70, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);
	}
	//método para calcular a média
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.0");
		double nota1,nota2,media;
		//a linha abaixo captura o conteudo da caixa de texto, converte para o tipo Double e armazena na variável
		//.replace troca um caractere por outro
		nota1 = Double.parseDouble(textNota1.getText().replace(",","."));
		nota2 = Double.parseDouble(textNota1.getText().replace(",","."));
		media = (nota1 + nota2) / 2;
		txtMedia.setText(formatador.format(media));
		if (media < 5) {
				JOptionPane.showMessageDialog(null,"REPROVADO","Status",JOptionPane.ERROR_MESSAGE);
		}
		else {
				JOptionPane.showMessageDialog(null,"APROVADO","Status",JOptionPane.ERROR_MESSAGE);
		}
	}
	//Método para limpar os campos
	private void limpar() {
		textNota1.setText(null);
		textNota2.setText(null);	
		txtMedia.setText(null);
	}
}

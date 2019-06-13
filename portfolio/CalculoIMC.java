package portfolio;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoIMC extends JFrame {
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtIMC;
	private JLabel lblStatus;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMC frame = new CalculoIMC();
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
	public CalculoIMC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoIMC.class.getResource("/icones/imc.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 492, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 30, 48, 14);
		contentPane.add(lblPeso);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 66, 48, 14);
		contentPane.add(lblAltura);

		txtPeso = new JTextField();
		txtPeso.setBounds(53, 27, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(53, 63, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel lblimc = new JLabel("IMC:");
		lblimc.setBounds(174, 30, 48, 14);
		contentPane.add(lblimc);

		txtIMC = new JTextField();
		txtIMC.setBounds(174, 63, 96, 20);
		contentPane.add(txtIMC);
		txtIMC.setColumns(10);

		JButton btnCalcular = new JButton("OK");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(280, 10, 61, 70);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/limpar.png")));
		btnLimpar.setBounds(363, 16, 61, 64);
		contentPane.add(btnLimpar);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/tabela_imc.jpg")));
		lblStatus.setBounds(45, 91, 399, 208);
		contentPane.add(lblStatus);
	}

	private void calcular() {
		DecimalFormat formatar = new DecimalFormat("0.0");
		double peso, altura, imc;
		// A linha abaixo captura o conteúdo da caixa de texto, converte para o tipo
		// Double e armazena na Variavel
		peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
		altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
		imc = peso / (altura * altura);
		txtIMC.setText(formatar.format(imc));
		if (imc < 18.5) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_abaixo.jpg")));
		} else if (imc >= 18.5 && imc < 25) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_normal.jpg")));

		} else if (imc > 25 && imc < 30) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_acima.jpg")));

		} else {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_obeso.jpg")));

		}

	}

	private void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtIMC.setText(null);
	}
}

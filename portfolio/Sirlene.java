package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Sirlene extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdade;
	private JTextField txtDias;
	private JLabel lblSuaIdadeEm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sirlene frame = new Sirlene();
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
	public Sirlene() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sirlene.class.getResource("/icones/agendaaaaa.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 206, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(10, 96, 96, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNumero = new JLabel("Escreva sua Idade:  ");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumero.setBounds(10, 65, 170, 20);
		contentPane.add(lblNumero);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnOk.setBounds(108, 227, 59, 23);
		contentPane.add(btnOk);
		
		txtDias = new JTextField();
		txtDias.setEditable(false);
		txtDias.setBounds(10, 183, 96, 20);
		contentPane.add(txtDias);
		txtDias.setColumns(10);
		
		lblSuaIdadeEm = new JLabel("Sua idade em dias:");
		lblSuaIdadeEm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSuaIdadeEm.setBounds(10, 152, 135, 20);
		contentPane.add(lblSuaIdadeEm);
		
	}
	private void calcular() {
		double A;
		
		A = Double.parseDouble(txtIdade.getText());
		A = A*365; 
		txtDias.setText(A + " Dias");
		
	}
	
	
}

package portfolio;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;


public class PDV extends JFrame {
	
	private JTextField txtVT;
	private JTextField txtDesc;
	private JTextField txtVP;
	private JTextField txtTroco;
	private JTextField txtTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PDV frame = new PDV();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	public PDV() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PDV.class.getResource("/icones/iconfinder_calculator_3827987.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		txtVT = new JTextField();
		txtVT.setBounds(133, 27, 96, 20);
		getContentPane().add(txtVT);
		txtVT.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setBounds(10, 30, 96, 14);
		getContentPane().add(lblValorTotal);
		
		txtDesc = new JTextField();
		txtDesc.setBounds(133, 58, 96, 20);
		getContentPane().add(txtDesc);
		txtDesc.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto %:");
		lblDesconto.setBounds(10, 61, 96, 14);
		getContentPane().add(lblDesconto);
		
		JLabel lblTotalComDesconto = new JLabel("Total com Desconto:");
		lblTotalComDesconto.setBounds(10, 100, 130, 14);
		getContentPane().add(lblTotalComDesconto);
		
		txtVP = new JTextField();
		txtVP.setBounds(328, 176, 96, 20);
		getContentPane().add(txtVP);
		txtVP.setColumns(10);
		
		JLabel lblValorPago = new JLabel("Valor Pago:");
		lblValorPago.setBounds(221, 179, 96, 14);
		getContentPane().add(lblValorPago);
		
		txtTroco = new JTextField();
		txtTroco.setBounds(328, 207, 96, 20);
		getContentPane().add(txtTroco);
		txtTroco.setColumns(10);
		
		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setBounds(221, 210, 63, 14);
		getContentPane().add(lblTroco);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(133, 97, 96, 20);
		getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(348, 30, 48, 14);
		getContentPane().add(lblStatus);
		
		JButton btnNewButton = new JButton("Calcularu");
		btnNewButton.setBounds(328, 125, 96, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calcularu();		
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(10, 206, 96, 23);
		getContentPane().add(btnLimpar);
		
		JButton btnFim = new JButton("Calcular");
		btnFim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnFim.setBounds(31, 143, 119, 53);
		getContentPane().add(btnFim);
	}// FIM do construtor 
	
	/* Variáveis Mundiais */
	double Total,VT;
	// FIM das variáveis mundiais 
	
	/* horario() */
	private void horario(AbstractButton lblStatus) {
		Date Data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			lblStatus.setText(formatador.format(Data));
	}// FIM horario()
	
	/* calcular() */
	private void calcular() {
		DecimalFormat numero = new DecimalFormat("0.00");
		double Desc;
			VT = Double.parseDouble(txtVT.getText().replace(",", "."));
			Desc = Double.parseDouble(txtDesc.getText().replace(",", "."));
			
			Total = (VT - (Desc / 100 * (VT)));
		txtTotal.setText("R$ " + numero.format(Total));
		
	}// FIM Calcular()
	
	/* calcularu() */
	private void Calcularu() {
		DecimalFormat numero = new DecimalFormat("0.00");
		double VP,Troco;
			VP = Double.parseDouble(txtVP.getText().replace(",", "."));
			
		Troco = VP - Total;
		txtTroco.setText("R$" + numero.format(Troco));
	}// FIM calcularu()
	
	/* limpar() */
	private void limpar() {
		txtVT.setText(null);
		txtDesc.setText(null);
		txtVP.setText(null);
		txtTotal.setText(null);
		txtTroco.setText(null);
		
	}// FIM limpar()
}/* FIM da principal */
	



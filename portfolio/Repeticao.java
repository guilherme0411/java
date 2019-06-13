package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Repeticao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Repeticao frame = new Repeticao();
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
	public Repeticao() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		int x = -1;
		int y = 11;
		String mostrar = "";
		String positivo = "";
		while (y >= 0) {
			while (x < 10) {
				y = y - 1;
				x = x + 1;
				mostrar = mostrar + "\n" + y;
				positivo = positivo + "\n" + x;
			}
			JOptionPane.showMessageDialog(null, "" + mostrar);
			JOptionPane.showMessageDialog(null, "" + positivo);
			System.exit(0);

		}

	}

}

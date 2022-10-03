import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazCalamar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCalamar frame = new InterfazCalamar();
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
	public InterfazCalamar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVidas = new JLabel("");
		lblVidas.setBounds(36, 20, 45, 13);
		contentPane.add(lblVidas);
		
		JButton btnPrueba1 = new JButton("Prueba 1");
		btnPrueba1.setBounds(10, 64, 85, 21);
		btnPrueba1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba1 prueba = new Prueba1 ();
				prueba.setVisible(true);
				
				
			}
		});
		contentPane.add(btnPrueba1);
		
		JButton btnPrueba2 = new JButton("Prueba 2");
		btnPrueba2.setBounds(10, 110, 85, 21);
		contentPane.add(btnPrueba2);
		btnPrueba2.setVisible(false);
		
		JButton btnPrueba3 = new JButton("Prueba 3");
		btnPrueba3.setBounds(10, 158, 85, 21);
		contentPane.add(btnPrueba3);
		btnPrueba3.setVisible(false);
		
		
	}
}

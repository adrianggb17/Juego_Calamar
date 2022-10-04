import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

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
		setBounds(100, 100, 637, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("BIENVENIDO AL JUEGO DEL CALAMAR");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo.setBounds(113, 10, 424, 44);
		contentPane.add(lblTitulo);
		
		JLabel imagenInicio = new JLabel("");
		imagenInicio.setBounds(0, 0, 637, 358);
		imagenInicio.setIcon(new ImageIcon("src/imagenes/inicio.jpg"));
		contentPane.add(imagenInicio);
		
		JButton btnPrueba1 = new JButton("Prueba 1");
		btnPrueba1.setBounds(267, 64, 85, 21);
		btnPrueba1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba1 prueba = new Prueba1 ();
				prueba.setVisible(true);
				
				
			}
		});
		contentPane.add(btnPrueba1);
		
		JButton btnPrueba2 = new JButton("Prueba 2");
		btnPrueba2.setBounds(267, 104, 85, 21);
		contentPane.add(btnPrueba2);
		btnPrueba2.setVisible(false);
		
		JButton btnPrueba3 = new JButton("Prueba 3");
		btnPrueba3.setBounds(267, 147, 85, 21);
		contentPane.add(btnPrueba3);
		btnPrueba3.setVisible(false);
		
		
	}
}

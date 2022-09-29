import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNumCanicaJug;
	private JTextField textNumCanicaIA;
	private JTextField textContadorCanicaJUG;
	private JTextField textContadorCanicaIA;
	private JTextField textApuestaIA;
	private JTextField textApuestaJugIA;
	private JTextField textPARIMPAR;
	private JTextField textGanador1;
	private JTextField textGanador2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 frame = new Prueba1();
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
	public Prueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNumCanicaJug = new JTextField();
		textNumCanicaJug.setBounds(243, 63, 96, 19);
		contentPane.add(textNumCanicaJug);
		textNumCanicaJug.setColumns(10);
		
		JLabel lblNumJUGCanica = new JLabel("Elige el numero de canicas que vas a jugar:");
		lblNumJUGCanica.setBounds(39, 66, 218, 13);
		contentPane.add(lblNumJUGCanica);
		
		textNumCanicaIA = new JTextField();
		textNumCanicaIA.setBounds(188, 169, 96, 19);
		contentPane.add(textNumCanicaIA);
		textNumCanicaIA.setColumns(10);
		
		JButton btnParJUG = new JButton("Par");
		btnParJUG.setBounds(43, 119, 85, 21);
		contentPane.add(btnParJUG);
		
		JButton btnImparJUG = new JButton("Impar");
		btnImparJUG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImparJUG.setBounds(188, 119, 85, 21);
		contentPane.add(btnImparJUG);
		
		JLabel lblNumIACanica = new JLabel("La IA ha sacado estas canicas:");
		lblNumIACanica.setBounds(43, 172, 141, 13);
		contentPane.add(lblNumIACanica);
		
		textContadorCanicaJUG = new JTextField();
		textContadorCanicaJUG.setBounds(72, 10, 96, 19);
		contentPane.add(textContadorCanicaJUG);
		textContadorCanicaJUG.setColumns(10);
		
		textContadorCanicaIA = new JTextField();
		textContadorCanicaIA.setColumns(10);
		textContadorCanicaIA.setBounds(243, 10, 96, 19);
		contentPane.add(textContadorCanicaIA);
		
		JLabel lblContJUG = new JLabel("JUGADOR:");
		lblContJUG.setBounds(10, 13, 59, 13);
		contentPane.add(lblContJUG);
		
		JLabel lblContIA = new JLabel("IA:");
		lblContIA.setBounds(214, 13, 19, 13);
		contentPane.add(lblContIA);
		
		JLabel lblEligirIA = new JLabel("Elige el numero de canicas que vas a jugar:");
		lblEligirIA.setBounds(39, 239, 201, 13);
		contentPane.add(lblEligirIA);
		
		JLabel lblElegirJUG = new JLabel("Elige si la IA tiene un numero de canicas par o impar:");
		lblElegirJUG.setBounds(39, 96, 276, 13);
		contentPane.add(lblElegirJUG);
		
		textApuestaIA = new JTextField();
		textApuestaIA.setColumns(10);
		textApuestaIA.setBounds(240, 236, 96, 19);
		contentPane.add(textApuestaIA);
		
		JLabel lblApuestaIA = new JLabel("La IA ha apostado ");
		lblApuestaIA.setBounds(39, 274, 89, 13);
		contentPane.add(lblApuestaIA);
		
		textApuestaJugIA = new JTextField();
		textApuestaJugIA.setBounds(137, 271, 96, 19);
		contentPane.add(textApuestaJugIA);
		textApuestaJugIA.setColumns(10);
		
		JLabel lblCanicas = new JLabel("canicas a:");
		lblCanicas.setBounds(243, 274, 51, 13);
		contentPane.add(lblCanicas);
		
		textPARIMPAR = new JTextField();
		textPARIMPAR.setBounds(298, 271, 96, 19);
		contentPane.add(textPARIMPAR);
		textPARIMPAR.setColumns(10);
		
		JLabel lblGanador1 = new JLabel("El ganador es:");
		lblGanador1.setBounds(39, 207, 66, 13);
		contentPane.add(lblGanador1);
		
		textGanador1 = new JTextField();
		textGanador1.setBounds(107, 204, 96, 19);
		contentPane.add(textGanador1);
		textGanador1.setColumns(10);
		
		JLabel lblGanador2 = new JLabel("El ganador es:");
		lblGanador2.setBounds(39, 308, 66, 13);
		contentPane.add(lblGanador2);
		
		textGanador2 = new JTextField();
		textGanador2.setColumns(10);
		textGanador2.setBounds(107, 305, 96, 19);
		contentPane.add(textGanador2);
	}
}

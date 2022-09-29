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
	private JTextField textApuestaIA;
	private JLabel lblContadorCanicaJUG;
	private JLabel lblNumCanicaIA;
	
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
		int canicaIA = 12;
		int  canicaJUG = 12;
		int canicaIAaleatoria= (int)(1+ Math.random()*canicaIA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNumCanicaJug = new JTextField();
		textNumCanicaJug.setBounds(293, 63, 96, 19);
		contentPane.add(textNumCanicaJug);
		textNumCanicaJug.setColumns(10);
		
		JLabel lblNumJUGCanica = new JLabel("Elige el numero de canicas que vas a jugar:");
		lblNumJUGCanica.setBounds(39, 66, 270, 13);
		contentPane.add(lblNumJUGCanica);
		
		JLabel lblNumIACanica = new JLabel("La IA ha sacado estas canicas:");
		lblNumIACanica.setBounds(43, 172, 192, 13);
		contentPane.add(lblNumIACanica);
		
		JLabel lblContJUG = new JLabel("JUGADOR:");
		lblContJUG.setBounds(10, 13, 73, 13);
		contentPane.add(lblContJUG);
		
		JLabel lblContIA = new JLabel("IA:");
		lblContIA.setBounds(188, 13, 19, 13);
		contentPane.add(lblContIA);
		
		JLabel lblEligirIA = new JLabel("Elige el numero de canicas que vas a jugar:");
		lblEligirIA.setBounds(39, 239, 249, 13);
		contentPane.add(lblEligirIA);
		
		JLabel lblElegirJUG = new JLabel("Elige si la IA tiene un numero de canicas par o impar:");
		lblElegirJUG.setBounds(39, 96, 395, 13);
		contentPane.add(lblElegirJUG);
		
		textApuestaIA = new JTextField();
		textApuestaIA.setColumns(10);
		textApuestaIA.setBounds(293, 236, 96, 19);
		contentPane.add(textApuestaIA);
		
		JLabel lblApuestaIA = new JLabel("La IA ha apostado ");
		lblApuestaIA.setBounds(39, 274, 121, 13);
		contentPane.add(lblApuestaIA);
		
		JLabel lblCanicas = new JLabel("canicas a:");
		lblCanicas.setBounds(264, 274, 75, 13);
		contentPane.add(lblCanicas);
		
		JLabel lblGanador1 = new JLabel("El ganador es:");
		lblGanador1.setBounds(39, 207, 89, 13);
		contentPane.add(lblGanador1);
		
		JLabel lblGanador2 = new JLabel("El ganador es:");
		lblGanador2.setBounds(39, 308, 89, 13);
		contentPane.add(lblGanador2);
		
		lblContadorCanicaJUG = new JLabel("");
		lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
		lblContadorCanicaJUG.setBounds(93, 13, 45, 13);
		contentPane.add(lblContadorCanicaJUG);
		
		JLabel lblContadorCanicaIA = new JLabel("");
		lblContadorCanicaIA.setText(String.valueOf(canicaIA));
		lblContadorCanicaIA.setBounds(243, 13, 45, 13);
		contentPane.add(lblContadorCanicaIA);
		
		JLabel lblNumCanicaIA = new JLabel("");
		lblNumCanicaIA.setBounds(278, 172, 45, 13);
		contentPane.add(lblNumCanicaIA);
		
		JLabel lblGanador1_1 = new JLabel("");
		lblGanador1_1.setBounds(157, 207, 378, 13);
		contentPane.add(lblGanador1_1);
		
		JLabel lblGanador2_2 = new JLabel("");
		lblGanador2_2.setBounds(149, 308, 45, 13);
		contentPane.add(lblGanador2_2);
		
		JLabel lblApuestaJugIA = new JLabel("");
		lblApuestaJugIA.setBounds(149, 274, 45, 13);
		contentPane.add(lblApuestaJugIA);
		
		JLabel lblPARIMPAR = new JLabel("");
		lblPARIMPAR.setBounds(363, 274, 45, 13);
		contentPane.add(lblPARIMPAR);
		
		JButton btnParJUG = new JButton("Par");
		btnParJUG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumCanicaIA.setText(String.valueOf(canicaIAaleatoria));
				
				if(canicaIAaleatoria%2==0) {
					lblGanador1_1.setText(" Jugador, con " + textNumCanicaJug.getText() + " canicas");
				}else {
					lblGanador1_1.setText(" IA, con " + textNumCanicaJug.getText() + " canicas");
				}
			}
		});
		btnParJUG.setBounds(43, 119, 85, 21);
		contentPane.add(btnParJUG);
		
		
		
		
		JButton btnImparJUG = new JButton("Impar");
		btnImparJUG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNumCanicaIA.setText(String.valueOf(canicaIAaleatoria));
				
				if(canicaIAaleatoria%2!=0) {
					lblGanador1_1.setText(" Jugador, con " + textNumCanicaJug.getText() + " canicas");
				}else {
					lblGanador1_1.setText(" IA, con " + textNumCanicaJug.getText() + " canicas");
				}
				
			}
		});
		btnImparJUG.setBounds(188, 119, 85, 21);
		contentPane.add(btnImparJUG);
	}
}

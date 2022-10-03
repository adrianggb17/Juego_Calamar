import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNumCanicaJug;
	private JTextField textApuestaJUG;
	public JLabel lblContadorCanicaJUG;
	private JLabel lblNumCanicaIA;
	public int canicaIA = 12;
	public int  canicaJUG = 12;

	private JPanel panel;
	
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
		setBounds(100, 100, 807, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		
		JButton pasarPrueba = new JButton("Continuamos a la prueba 2");
		pasarPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba2 prueba = new Prueba2 ();
				prueba.setVisible(true);
			}
		});
		pasarPrueba.setBounds(530, 406, 232, 21);
		contentPane.add(pasarPrueba);
		pasarPrueba.setVisible(false);
		
		JLabel imagen = new JLabel("");
		imagen.setBounds(459, 0, 324, 463);
		imagen.setIcon(new ImageIcon("src/imagenes/game.jpg"));
		contentPane.add(imagen);
		imagen.setVisible(false);
		
		JLabel imagen2 = new JLabel("");
		imagen2.setBounds(405, 0, 378, 473);
		imagen2.setIcon(new ImageIcon("src/imagenes/win.jpg"));
		contentPane.add(imagen2);
		imagen2.setVisible(false);
		
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
		
		textApuestaJUG = new JTextField();
		textApuestaJUG.setBounds(293, 236, 96, 19);
		textApuestaJUG.setColumns(10);
		contentPane.add(textApuestaJUG);
		
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
		lblGanador2.setBounds(39, 333, 89, 13);
		contentPane.add(lblGanador2);
		
		lblContadorCanicaJUG = new JLabel("");
		lblContadorCanicaJUG.setBounds(93, 13, 45, 13);
		lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
		contentPane.add(lblContadorCanicaJUG);
		
		JLabel lblContadorCanicaIA = new JLabel("");
		lblContadorCanicaIA.setBounds(243, 13, 45, 13);
		lblContadorCanicaIA.setText(String.valueOf(canicaIA));
		contentPane.add(lblContadorCanicaIA);
		
		JLabel lblNumCanicaIA = new JLabel("");
		lblNumCanicaIA.setBounds(278, 172, 45, 13);
		contentPane.add(lblNumCanicaIA);
		
		JLabel lblGanador1_1 = new JLabel("");
		lblGanador1_1.setBounds(157, 207, 378, 13);
		contentPane.add(lblGanador1_1);
		
		JLabel lblGanador2_2 = new JLabel("");
		lblGanador2_2.setBounds(162, 333, 287, 13);
		contentPane.add(lblGanador2_2);
		
		JLabel lblApuestaJugIA = new JLabel("");
		lblApuestaJugIA.setBounds(149, 274, 45, 13);
		contentPane.add(lblApuestaJugIA);
		
		JLabel lblPARIMPAR = new JLabel("");
		lblPARIMPAR.setBounds(363, 274, 45, 13);
		contentPane.add(lblPARIMPAR);
		
		JButton btnParJUG = new JButton("Par");
		btnParJUG.setBounds(43, 119, 85, 21);
		btnParJUG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int canicaIAaleatoria = (int)(1+ Math.random()*canicaIA);
				lblNumCanicaIA.setText(String.valueOf(canicaIAaleatoria));
				
				if(canicaIAaleatoria%2==0) {
					lblGanador1_1.setText(" Jugador, con " + textNumCanicaJug.getText() + " canicas");
					canicaJUG = canicaJUG + Integer.parseInt(textNumCanicaJug.getText());
					canicaIA =  canicaIA - Integer.parseInt(textNumCanicaJug.getText());
					lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
					lblContadorCanicaIA.setText(String.valueOf(canicaIA));
				
					
				}else {
					lblGanador1_1.setText(" IA, con " + textNumCanicaJug.getText() + " canicas");
					canicaJUG = canicaJUG - Integer.parseInt(textNumCanicaJug.getText());
					canicaIA =  canicaIA + Integer.parseInt(textNumCanicaJug.getText());
					lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
					lblContadorCanicaIA.setText(String.valueOf(canicaIA));
				
				}
				if(canicaJUG<=0) {
					imagen.setVisible(true);
					
				}else if(canicaIA<=0){
					imagen2.setVisible(true);
					pasarPrueba.setVisible(true);
				}
			}
		});
		contentPane.add(btnParJUG);
		
		
		JButton btnImparJUG = new JButton("Impar");
		btnImparJUG.setBounds(188, 119, 85, 21);
		btnImparJUG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int canicaIAaleatoria = (int)(1+ Math.random()*canicaIA);
				lblNumCanicaIA.setText(String.valueOf(canicaIAaleatoria));
				
				if(canicaIAaleatoria%2!=0) {
					lblGanador1_1.setText(" Jugador, con " + textNumCanicaJug.getText() + " canicas");
					canicaJUG = canicaJUG + Integer.parseInt(textNumCanicaJug.getText());
					canicaIA =  canicaIA - Integer.parseInt(textNumCanicaJug.getText());
					lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
					lblContadorCanicaIA.setText(String.valueOf(canicaIA));
					
					
					
					
				}else {
					lblGanador1_1.setText(" IA, con " + textNumCanicaJug.getText() + " canicas");
					canicaJUG = canicaJUG - Integer.parseInt(textNumCanicaJug.getText());
					canicaIA =  canicaIA + Integer.parseInt(textNumCanicaJug.getText());
					lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
					lblContadorCanicaIA.setText(String.valueOf(canicaIA));
					
					
				}
				if(canicaJUG<=0) {
					imagen.setVisible(true);
				}else if(canicaIA<=0){
					imagen2.setVisible(true);
					pasarPrueba.setVisible(true);
				}
			}
		});
		contentPane.add(btnImparJUG);
		
		JButton botonJuegoIA = new JButton("Resultado");
		botonJuegoIA.setBounds(157, 405, 168, 23);
		botonJuegoIA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int canicaIAaleatoria = (int)(1+ Math.random()*canicaIA);
				
				int parImpar = (int)(1+ Math.random()*2);
				
				if(parImpar == 1) {
					lblApuestaJugIA.setText(String.valueOf(canicaIAaleatoria));
					lblPARIMPAR.setText(" par");
					if(Integer.parseInt(textApuestaJUG.getText())%2==0) {
						
						lblGanador2_2.setText(" IA, con " + lblApuestaJugIA.getText() + " canicas");
						
						canicaJUG = canicaJUG - Integer.parseInt(lblApuestaJugIA.getText());
						canicaIA =  canicaIA + Integer.parseInt(lblApuestaJugIA.getText());
						
					}else {
						lblGanador2_2.setText(" JUGADOR, con " + lblApuestaJugIA.getText() + " canicas");
						
						canicaJUG = canicaJUG + Integer.parseInt(lblApuestaJugIA.getText());
						canicaIA =  canicaIA - Integer.parseInt(lblApuestaJugIA.getText());
					}
					lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
					lblContadorCanicaIA.setText(String.valueOf(canicaIA));
				}else {
					lblApuestaJugIA.setText(String.valueOf(canicaIAaleatoria));
					lblPARIMPAR.setText(" impar");
					
					if(Integer.parseInt(textApuestaJUG.getText())%2!=0) {
					lblGanador2_2.setText(" IA, con " + lblApuestaJugIA.getText() + " canicas");
					
					canicaJUG = canicaJUG - Integer.parseInt(lblApuestaJugIA.getText());
					canicaIA =  canicaIA + Integer.parseInt(lblApuestaJugIA.getText());
					
					}else {
						lblGanador2_2.setText(" JUGADOR, con " + lblApuestaJugIA.getText() + " canicas");
						
						canicaJUG = canicaJUG + Integer.parseInt(lblApuestaJugIA.getText());
						canicaIA =  canicaIA - Integer.parseInt(lblApuestaJugIA.getText());
					}
					lblContadorCanicaJUG.setText(String.valueOf(canicaJUG));
					lblContadorCanicaIA.setText(String.valueOf(canicaIA));
				}
				if(canicaJUG<=0) {
					imagen.setVisible(true);
				}else if(canicaIA<=0) {
					imagen2.setVisible(true);
					pasarPrueba.setVisible(true);
				}
			}
		});
		contentPane.add(botonJuegoIA);
	}
}

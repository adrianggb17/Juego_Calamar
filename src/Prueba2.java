import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Prueba2 extends JFrame {

	private JPanel contentPane;
	int numDealer=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba2 frame = new Prueba2();
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
	public Prueba2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		
		JLabel imagen = new JLabel("");
		imagen.setBounds(252, 10, 552, 374);
		imagen.setIcon(new ImageIcon("src/imagenes/game.jpg"));
		contentPane.add(imagen);
		imagen.setVisible(false);
		
		JLabel imagen2 = new JLabel("");
		imagen2.setBounds(280, 10, 524, 364);
		imagen2.setIcon(new ImageIcon("src/imagenes/win.jpg"));
		contentPane.add(imagen2);
		imagen2.setVisible(false);
		
		
		
		JLabel lblCartasJug = new JLabel("CARTAS DEL JUGADOR");
		lblCartasJug.setForeground(Color.WHITE);
		lblCartasJug.setBounds(20, 389, 144, 13);
		contentPane.add(lblCartasJug);
		
		JLabel lblNumJug = new JLabel("");
		lblNumJug.setForeground(Color.WHITE);
		lblNumJug.setBounds(174, 389, 45, 13);
		contentPane.add(lblNumJug);
		
		JLabel lblCartasDealer = new JLabel("CARTAS DEALER");
		lblCartasDealer.setForeground(Color.WHITE);
		lblCartasDealer.setBounds(299, 389, 113, 13);
		contentPane.add(lblCartasDealer);
		
		JLabel lblNumDealer = new JLabel("");
		lblNumDealer.setForeground(Color.WHITE);
		lblNumDealer.setBounds(442, 389, 45, 13);
		contentPane.add(lblNumDealer);
		
		JButton btnInicio = new JButton("INICIAR JUEGO");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numJugador = (int)(1+ Math.random()*20);
				lblNumJug.setText(String.valueOf(numJugador));
				
				int numDealer = (int)(1+ Math.random()*10);
				lblNumDealer.setText(String.valueOf(numDealer));
				
				
			}
		});
		btnInicio.setBounds(10, 318, 154, 21);
		contentPane.add(btnInicio);
		
		JButton btnPlantarse = new JButton("PLANTARSE");
		btnPlantarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba3 prueba = new Prueba3 ();
				
				do {
				numDealer = (int)(1+ Math.random()*10);
				lblNumDealer.setText(String.valueOf(Integer.parseInt(lblNumDealer.getText())+numDealer));
				
				}while(Integer.parseInt(lblNumDealer.getText())<17);
				if((Integer.parseInt(lblNumDealer.getText()))<=20 && (Integer.parseInt(lblNumDealer.getText()))<(Integer.parseInt(lblNumJug.getText()))) {
					imagen2.setVisible(true);
					prueba.setVisible(true);
				}else if(Integer.parseInt(lblNumDealer.getText())>20) {
				imagen2.setVisible(true);
				prueba.setVisible(true);
				}else if((Integer.parseInt(lblNumDealer.getText()))==(Integer.parseInt(lblNumJug.getText()))){
					
				}else {
					imagen.setVisible(true);
				}
			}
		});
		btnPlantarse.setBounds(650, 318, 113, 21);
		contentPane.add(btnPlantarse);
		
		
		JButton btnPedir = new JButton("PEDIR CARTA");
		btnPedir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numJugador = (int)(1+ Math.random()*10);
				lblNumJug.setText(String.valueOf(Integer.parseInt(lblNumJug.getText())+numJugador));
				
				if((Integer.parseInt(lblNumJug.getText()))>20) {
					btnPlantarse.setVisible(false);
					imagen.setVisible(true);
				}
				
			}
		});
		btnPedir.setBounds(498, 318, 128, 21);
		contentPane.add(btnPedir);
		
		JLabel lblImagenDealer = new JLabel("");
		lblImagenDealer.setBounds(10, 0, 794, 432);
		lblImagenDealer.setIcon(new ImageIcon("src/imagenes/dealer.jpg"));
		contentPane.add(lblImagenDealer);
		
		
		
		
	}
}

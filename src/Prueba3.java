import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba3 extends JFrame {

	private JPanel contentPane;

	 int mina1 = (int)(1+ Math.random()*12);
	 int mina2 = 0;
	 int mina3 = 0;
	 int mina4 = 0;
	 int contador = 0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba3 frame = new Prueba3();
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
	public Prueba3() {
		
		
		do {
		  mina2 = (int)(1+ Math.random()*12);
		}while(mina1 == mina2);
		
		do { 
		mina3 = (int)(1+ Math.random()*12);
		}while(mina2 == mina3 || mina3 == mina1); 
		
		do {
			mina4 = (int)(1+ Math.random()*12);
		}while(mina4 == mina3 || mina4 == mina2 || mina4 == mina1);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelImagenGanar = new JLabel("");
		labelImagenGanar.setBounds(10, 11, 752, 470);
		contentPane.add(labelImagenGanar);
		labelImagenGanar.setIcon(new ImageIcon("src/imagenes/win.jpg"));
		labelImagenGanar.setVisible(false);
		
		
		JLabel labelImagen = new JLabel("");
		labelImagen.setBounds(10, 11, 752, 455);
		contentPane.add(labelImagen);
		labelImagen.setIcon(new ImageIcon("src/imagenes/buscamina.jpg"));
		labelImagen.setVisible(false);
		
		
		JLabel lblNewLabel = new JLabel("Buscaminas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(77, 11, 256, 34);
		contentPane.add(lblNewLabel);
		
		System.out.println(mina1);
		System.out.println(mina2);
		System.out.println(mina3);
		System.out.println(mina4);
		
		JButton boton1 = new JButton("");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 1) || (mina2 == 1) ||  (mina3 == 1) || (mina4 == 1)) {
				
					labelImagen.setVisible(true);
				
				}else {
					
					boton1.setBackground(Color.GREEN);
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
				}
			}
		});
		boton1.setBounds(25, 83, 89, 49);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				if((mina1 == 2) || (mina2 == 2) ||  (mina3 == 2) || (mina4 == 2)) {
				
					labelImagen.setVisible(true);
						
				
				}else {
					
					boton2.setBackground(Color.GREEN);
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
				}
		
				
			}
		});
		boton2.setBounds(25, 143, 89, 49);
		contentPane.add(boton2);
		
		JButton boton6 = new JButton("");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 6) || (mina2 == 6) ||  (mina3 == 6) || (mina4 == 6)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton6.setBackground(Color.GREEN);
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
				}
				
			}
		});
		boton6.setBounds(153, 143, 89, 49);
		contentPane.add(boton6);
		
		JButton boton5 = new JButton("");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 5) || (mina2 == 5) ||  (mina3 == 5) || (mina4 == 5)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton5.setBackground(Color.GREEN);
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
				}
				
			}
		});
		boton5.setBounds(153, 83, 89, 49);
		contentPane.add(boton5);
		
		JButton boton4 = new JButton("");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if((mina1 == 4) || (mina2 == 4 ) ||  (mina3 == 4) || (mina4 == 4)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton4.setBackground(Color.GREEN);
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
				}
				
			}
		});
		boton4.setBounds(25, 283, 89, 49);
		contentPane.add(boton4);
		
		JButton boton9 = new JButton("");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 9) || (mina2 == 9) ||  (mina3 == 9) || (mina4 == 9)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton9.setBackground(Color.GREEN);
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
				}
				
			}
		});
		boton9.setBounds(290, 83, 89, 49);
		contentPane.add(boton9);
		
		JButton boton3 = new JButton("");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 3) || (mina2 == 3) ||  (mina3 == 3) || (mina4 == 3)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton3.setBackground(Color.GREEN);
					
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
					
				}
				
			}
		});
		boton3.setBounds(25, 214, 89, 49);
		contentPane.add(boton3);
		
		JButton boton10 = new JButton("");
		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 10) || (mina2 == 10) ||  (mina3 == 10) || (mina4 == 10)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton10.setBackground(Color.GREEN);
					
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
					
				}
				
			}
		});
		boton10.setBounds(290, 143, 89, 49);
		contentPane.add(boton10);
		
		JButton boton7 = new JButton("");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if((mina1 == 7) || (mina2 == 7) ||  (mina3 == 7) || (mina4 == 7)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton7.setBackground(Color.GREEN);
					
					contador++;
					if(contador == 7) {
						labelImagenGanar.setVisible(true);
					}
					
				}
				
			}
		});
		boton7.setBounds(153, 216, 89, 47);
		contentPane.add(boton7);
		
		JButton boton12 = new JButton("");
		boton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 12) || (mina2 == 12) ||  (mina3 == 12) || (mina4 == 12)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton12.setBackground(Color.GREEN);
					

					contador++;
					if(contador == 8) {
						labelImagenGanar.setVisible(true);
					}
					
				}
				
			}
		});
		boton12.setBounds(290, 282, 89, 50);
		contentPane.add(boton12);
		
		JButton boton11 = new JButton("");
		boton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 11) || (mina2 == 11) ||  (mina3 == 11) || (mina4 == 11)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton11.setBackground(Color.GREEN);
					
				}
				
			}
		});
		boton11.setBounds(290, 217, 89, 46);
		contentPane.add(boton11);
		
		JButton boton8 = new JButton("");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((mina1 == 8) || (mina2 == 8) ||  (mina3 == 8) || (mina4 == 8)) {
					
					labelImagen.setVisible(true);
					
					
				}else {
					
					boton8.setBackground(Color.GREEN);
					
					contador++;
					if(contador == 8) {
						labelImagenGanar.setVisible(true);
					}
					
				}
				
			}
		});
		boton8.setBounds(153, 280, 89, 52);
		contentPane.add(boton8);
		
	
		
		
		
		
	}
}

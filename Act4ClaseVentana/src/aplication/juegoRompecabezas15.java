package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

public class juegoRompecabezas15 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	JButton btnNewButton_10;
	JButton btnNewButton_11;
	JButton btnNewButton_12;
	JButton btnNewButton_13;
	JButton btnNewButton_14;
	JButton btnNewButton_15;
	JButton btnNewButton_16;
	
	String [] numeros = {"1","2","3","4",
						"5","6","7","8",
						"9","10","11","12",
						"13","14","15",""};
	
	List<String> lista = Arrays.asList(numeros);
	private JButton BotonReIniciar;
	private JLabel lblNewLabel_1;
	
	int noMovimientos=0;
	private JButton botonIniciar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juegoRompecabezas15 frame = new juegoRompecabezas15();
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
	public juegoRompecabezas15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 623);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBounds(5, 5, 692, 35);
		header.setBackground(new Color(0, 128, 128));
		contentPane.add(header);
		
		JLabel lblNewLabel = new JLabel("Rompecabezas númerico");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		header.add(lblNewLabel);
		
		JPanel right = new JPanel();
		right.setBounds(471, 40, 226, 498);
		right.setBackground(new Color(0, 128, 128));
		contentPane.add(right);
		
		JPanel left = new JPanel();
		left.setBounds(5, 40, 10, 498);
		left.setBackground(new Color(0, 128, 128));
		contentPane.add(left);
		right.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("No. Movimientos: "+noMovimientos);
		lblNewLabel_1.setBounds(23, 38, 193, 49);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		right.add(lblNewLabel_1);
		
		
		
		JPanel body = new JPanel();
		body.setBounds(15, 40, 456, 498);
		body.setBackground(new Color(0, 128, 128));
		contentPane.add(body);
		body.setLayout(new GridLayout(4, 4, 5, 5));
		
		btnNewButton_1 = new JButton(numeros[0]);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_2.getText().equals("")) {
					 btnNewButton_2.setText(btnNewButton_1.getText());
					 btnNewButton_1.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_5.getText().equals("")) {
					 btnNewButton_5.setText(btnNewButton_1.getText());
					 btnNewButton_1.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				
				 ganar();
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_2 = new JButton(numeros[1]);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_1.getText().equals("")) {
					 btnNewButton_1.setText(btnNewButton_2.getText());
					 btnNewButton_2.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_3.getText().equals("")) {
					 btnNewButton_3.setText(btnNewButton_2.getText());
					 btnNewButton_2.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_2.getText());
					 btnNewButton_2.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_3 = new JButton(numeros[2]);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_2.getText().equals("")) {
					 btnNewButton_2.setText(btnNewButton_3.getText());
					 btnNewButton_3.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_4.getText().equals("")) {
					 btnNewButton_4.setText(btnNewButton_3.getText());
					 btnNewButton_3.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_7.getText().equals("")) {
					 btnNewButton_7.setText(btnNewButton_3.getText());
					 btnNewButton_3.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		
		btnNewButton_4 = new JButton(numeros[3]);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_3.getText().equals("")) {
					 btnNewButton_3.setText(btnNewButton_4.getText());
					 btnNewButton_4.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_8.getText().equals("")) {
					 btnNewButton_8.setText(btnNewButton_4.getText());
					 btnNewButton_4.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_5 = new JButton(numeros[4]);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_1.getText().equals("")) {
					 btnNewButton_1.setText(btnNewButton_5.getText());
					 btnNewButton_5.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_5.getText());
					 btnNewButton_5.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_9.getText().equals("")) {
					 btnNewButton_9.setText(btnNewButton_5.getText());
					 btnNewButton_5.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_6 = new JButton(numeros[5]);
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_5.getText().equals("")) {
					 btnNewButton_5.setText(btnNewButton_6.getText());
					 btnNewButton_6.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_2.getText().equals("")) {
					 btnNewButton_2.setText(btnNewButton_6.getText());
					 btnNewButton_6.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_7.getText().equals("")) {
					 btnNewButton_7.setText(btnNewButton_6.getText());
					 btnNewButton_6.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_6.getText());
					 btnNewButton_6.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_7 = new JButton(numeros[6]);
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_7.getText());
					 btnNewButton_7.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_3.getText().equals("")) {
					 btnNewButton_3.setText(btnNewButton_7.getText());
					 btnNewButton_7.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_8.getText().equals("")) {
					 btnNewButton_8.setText(btnNewButton_7.getText());
					 btnNewButton_7.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_11.getText().equals("")) {
					 btnNewButton_11.setText(btnNewButton_7.getText());
					 btnNewButton_7.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		
		btnNewButton_8 = new JButton(numeros[7]);
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_4.getText().equals("")) {
					 btnNewButton_4.setText(btnNewButton_8.getText());
					 btnNewButton_8.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_7.getText().equals("")) {
					 btnNewButton_7.setText(btnNewButton_8.getText());
					 btnNewButton_8.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_12.getText().equals("")) {
					 btnNewButton_12.setText(btnNewButton_8.getText());
					 btnNewButton_8.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_9 = new JButton(numeros[8]);
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_5.getText().equals("")) {
					 btnNewButton_5.setText(btnNewButton_9.getText());
					 btnNewButton_9.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_9.getText());
					 btnNewButton_9.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_13.getText().equals("")) {
					 btnNewButton_13.setText(btnNewButton_9.getText());
					 btnNewButton_9.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_10 = new JButton(numeros[9]);
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_9.getText().equals("")) {
					 btnNewButton_9.setText(btnNewButton_10.getText());
					 btnNewButton_10.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_6.getText().equals("")) {
					 btnNewButton_6.setText(btnNewButton_10.getText());
					 btnNewButton_10.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_11.getText().equals("")) {
					 btnNewButton_11.setText(btnNewButton_10.getText());
					 btnNewButton_10.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_14.getText().equals("")) {
					 btnNewButton_14.setText(btnNewButton_10.getText());
					 btnNewButton_10.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
	
		btnNewButton_11 = new JButton(numeros[10]);
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_11.getText());
					 btnNewButton_11.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_7.getText().equals("")) {
					 btnNewButton_7.setText(btnNewButton_11.getText());
					 btnNewButton_11.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_12.getText().equals("")) {
					 btnNewButton_12.setText(btnNewButton_11.getText());
					 btnNewButton_11.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_15.getText().equals("")) {
					 btnNewButton_15.setText(btnNewButton_11.getText());
					 btnNewButton_11.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_12 = new JButton(numeros[11]);
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_11.getText().equals("")) {
					 btnNewButton_11.setText(btnNewButton_12.getText());
					 btnNewButton_12.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_8.getText().equals("")) {
					 btnNewButton_8.setText(btnNewButton_12.getText());
					 btnNewButton_12.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_16.getText().equals("")) {
					 btnNewButton_16.setText(btnNewButton_12.getText());
					 btnNewButton_12.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		
		btnNewButton_13 = new JButton(numeros[12]);
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_13);
		btnNewButton_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_9.getText().equals("")) {
					 btnNewButton_9.setText(btnNewButton_13.getText());
					 btnNewButton_13.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_14.getText().equals("")) {
					 btnNewButton_14.setText(btnNewButton_13.getText());
					 btnNewButton_13.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_14 = new JButton(numeros[13]);
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_14);
		btnNewButton_14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_13.getText().equals("")) {
					 btnNewButton_13.setText(btnNewButton_14.getText());
					 btnNewButton_14.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_10.getText().equals("")) {
					 btnNewButton_10.setText(btnNewButton_14.getText());
					 btnNewButton_14.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_15.getText().equals("")) {
					 btnNewButton_15.setText(btnNewButton_14.getText());
					 btnNewButton_14.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_15 = new JButton(numeros[14]);
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_15);
		btnNewButton_15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_14.getText().equals("")) {
					 btnNewButton_14.setText(btnNewButton_15.getText());
					 btnNewButton_15.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_11.getText().equals("")) {
					 btnNewButton_11.setText(btnNewButton_15.getText());
					 btnNewButton_15.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_16.getText().equals("")) {
					 btnNewButton_16.setText(btnNewButton_15.getText());
					 btnNewButton_15.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();
				 
				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		btnNewButton_16 = new JButton(numeros[15]);
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_16);
		btnNewButton_16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(btnNewButton_15.getText().equals("")) {
					 btnNewButton_15.setText(btnNewButton_16.getText());
					 btnNewButton_16.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 if(btnNewButton_12.getText().equals("")) {
					 btnNewButton_12.setText(btnNewButton_16.getText());
					 btnNewButton_16.setText("");
					 noMovimientos++;
					 lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
				 }
				 
				 ganar();

				 contentPane.repaint();
				 contentPane.revalidate();
				}
			});
		
		
		JPanel footer = new JPanel();
		footer.setBounds(5, 538, 466, 43);
		footer.setBackground(new Color(0, 128, 128));
		contentPane.add(footer);
		footer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		botonIniciar = new JButton("Iniciar");
		botonIniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonIniciar.setBounds(23, 127, 135, 33);
		right.add(botonIniciar);
		
		botonIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 Collections.shuffle(lista);
				 btnNewButton_1.setText(lista.get(0));
			        btnNewButton_2.setText(lista.get(1));
			        btnNewButton_3.setText(lista.get(2));
			        btnNewButton_4.setText(lista.get(3));
			        btnNewButton_5.setText(lista.get(4));
			        btnNewButton_6.setText(lista.get(5));
			        btnNewButton_7.setText(lista.get(6));
			        btnNewButton_8.setText(lista.get(7));
			        btnNewButton_9.setText(lista.get(8));
			        btnNewButton_10.setText(lista.get(9));
			        btnNewButton_11.setText(lista.get(10));
			        btnNewButton_12.setText(lista.get(11));
			        btnNewButton_13.setText(lista.get(12));
			        btnNewButton_14.setText(lista.get(13));
			        btnNewButton_15.setText(lista.get(14));
			        btnNewButton_16.setText(lista.get(15)); 
			        
			        btnNewButton_1.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_3.setEnabled(true);
					btnNewButton_4.setEnabled(true);
					btnNewButton_5.setEnabled(true);
					btnNewButton_6.setEnabled(true);
					btnNewButton_7.setEnabled(true);
					btnNewButton_8.setEnabled(true);
					btnNewButton_9.setEnabled(true);
					btnNewButton_10.setEnabled(true);
					btnNewButton_11.setEnabled(true);
					btnNewButton_12.setEnabled(true);
					btnNewButton_13.setEnabled(true);
					btnNewButton_14.setEnabled(true);
					btnNewButton_15.setEnabled(true);
					btnNewButton_16.setEnabled(true);
					
					noMovimientos=0;
					lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
					contentPane.repaint();
					contentPane.revalidate();
				}
			});
		
		JButton botonPausar = new JButton("Pausar");
		botonPausar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonPausar.setBounds(23, 179, 135, 33);
		right.add(botonPausar);
		botonPausar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
	        	btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_6.setEnabled(false);
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnNewButton_9.setEnabled(false);
				btnNewButton_10.setEnabled(false);
				btnNewButton_11.setEnabled(false);
				btnNewButton_12.setEnabled(false);
				btnNewButton_13.setEnabled(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_15.setEnabled(false);
				btnNewButton_16.setEnabled(false);
		        
		    }
		});
		JButton botonReanudar = new JButton("Reanudar");
		botonReanudar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonReanudar.setBounds(23, 232, 135, 33);
		right.add(botonReanudar);
		botonReanudar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	btnNewButton_1.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnNewButton_5.setEnabled(true);
				btnNewButton_6.setEnabled(true);
				btnNewButton_7.setEnabled(true);
				btnNewButton_8.setEnabled(true);
				btnNewButton_9.setEnabled(true);
				btnNewButton_10.setEnabled(true);
				btnNewButton_11.setEnabled(true);
				btnNewButton_12.setEnabled(true);
				btnNewButton_13.setEnabled(true);
				btnNewButton_14.setEnabled(true);
				btnNewButton_15.setEnabled(true);
				btnNewButton_16.setEnabled(true);
		        
		    }
		});
		
		BotonReIniciar = new JButton("Reiniciar");
		BotonReIniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		footer.add(BotonReIniciar);
		BotonReIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 
					btnNewButton_1.setText("1");
					btnNewButton_2.setText("2");
					btnNewButton_3.setText("3");
					btnNewButton_4.setText("4");
					btnNewButton_5.setText("5");
					btnNewButton_6.setText("6");
					btnNewButton_7.setText("7");
					btnNewButton_8.setText("8");
					btnNewButton_9.setText("9");
					btnNewButton_10.setText("10");
					btnNewButton_11.setText("11");
					btnNewButton_12.setText("12");
					btnNewButton_13.setText("13");
					btnNewButton_14.setText("14");
					btnNewButton_15.setText("15");
					btnNewButton_16.setText("");
					
					btnNewButton_1.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_3.setEnabled(true);
					btnNewButton_4.setEnabled(true);
					btnNewButton_5.setEnabled(true);
					btnNewButton_6.setEnabled(true);
					btnNewButton_7.setEnabled(true);
					btnNewButton_8.setEnabled(true);
					btnNewButton_9.setEnabled(true);
					btnNewButton_10.setEnabled(true);
					btnNewButton_11.setEnabled(true);
					btnNewButton_12.setEnabled(true);
					btnNewButton_13.setEnabled(true);
					btnNewButton_14.setEnabled(true);
					btnNewButton_15.setEnabled(true);
					btnNewButton_16.setEnabled(true);
					
					noMovimientos=0;
					lblNewLabel_1.setText("No. Movimientos: "+noMovimientos);
					body.repaint();
					body.revalidate();
					contentPane.repaint();
					contentPane.revalidate();
				}
			});
		
		
	}
	public void pausa() {
		
		boolean pausado=false;
		btnNewButton_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_3.setEnabled(false);
		btnNewButton_4.setEnabled(false);
		btnNewButton_5.setEnabled(false);
		btnNewButton_6.setEnabled(false);
		btnNewButton_7.setEnabled(false);
		btnNewButton_8.setEnabled(false);
		btnNewButton_9.setEnabled(false);
		btnNewButton_10.setEnabled(false);
		btnNewButton_11.setEnabled(false);
		btnNewButton_12.setEnabled(false);
		btnNewButton_13.setEnabled(false);
		btnNewButton_14.setEnabled(false);
		btnNewButton_15.setEnabled(false);
		btnNewButton_16.setEnabled(false);
	}
	public void ganar() {
		
		if(btnNewButton_1.getText().equals("1")&&btnNewButton_2.getText().equals("2")&&btnNewButton_3.getText().equals("3")&&btnNewButton_4.getText().equals("4")&&
				btnNewButton_5.getText().equals("5")&&btnNewButton_6.getText().equals("6")&&btnNewButton_7.getText().equals("7")&&btnNewButton_8.getText().equals("8")&&
				btnNewButton_9.getText().equals("9")&&btnNewButton_10.getText().equals("10")&&btnNewButton_11.getText().equals("11")&&btnNewButton_12.getText().equals("12")&&
				btnNewButton_13.getText().equals("13")&&btnNewButton_14.getText().equals("14")&&btnNewButton_15.getText().equals("15")&&btnNewButton_16.getText().equals("")) {
			JOptionPane.showMessageDialog(juegoRompecabezas15.this, "¡Felicidades! Has completado el rompecabezas.", "¡Ganaste!", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_1.setEnabled(false);
			btnNewButton_2.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			btnNewButton_9.setEnabled(false);
			btnNewButton_10.setEnabled(false);
			btnNewButton_11.setEnabled(false);
			btnNewButton_12.setEnabled(false);
			btnNewButton_13.setEnabled(false);
			btnNewButton_14.setEnabled(false);
			btnNewButton_15.setEnabled(false);
			btnNewButton_16.setEnabled(false);
		}
		
	}
}

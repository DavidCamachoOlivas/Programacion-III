package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Tiktactoe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Boolean turno = true;
	String player;
	JButton btnNewButton_2;
	JButton btnNewButton;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_6;
	JButton btnNewButton_1;
	JButton btnNewButton_5;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	int contadorPlayerX=0,contadorPlayerO=0;
	JLabel lblNewLabel = new JLabel();
	JLabel lblNewLabel_1 = new JLabel();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tiktactoe frame = new Tiktactoe();
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
	public Tiktactoe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(92, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(100, 50, 400, 400);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		btnNewButton_2 = new JButton("");
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_2.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_2.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_2.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_2.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_2.setEnabled(false);
				btnNewButton_2.setText(player);
				verificar();
				}
			});
		
		btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton.setEnabled(false);
				btnNewButton.setText(player);
				verificar();
				}
			});
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_3.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_3.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_3.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_3.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_3.setEnabled(false);
				btnNewButton_3.setText(player);
				verificar();
				}
			});
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_4.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_4.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_4.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_4.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_4.setEnabled(false);
				btnNewButton_4.setText(player);
				verificar();
				}
			});
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_6.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_6.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_6.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_6.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_6.setEnabled(false);
				btnNewButton_6.setText(player);
				verificar();
				}
			});
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_1.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_1.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_1.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_1.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_1.setEnabled(false);
				btnNewButton_1.setText(player);
				verificar();
				}
			});
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_5.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_5.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_5.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_5.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_5.setEnabled(false);
				btnNewButton_5.setText(player);
				verificar();
				}
			});
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_7.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_7.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_7.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_7.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_7.setEnabled(false);
				btnNewButton_7.setText(player);
				verificar();
				}
			});
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_8);
		
		btnNewButton_8.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player = "X";
					btnNewButton_8.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
					btnNewButton_8.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/mikuChileMorron2.jpg")));
				}
				else {
					turno=true;
					player = "O";
					btnNewButton_8.setIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
					btnNewButton_8.setDisabledIcon(new ImageIcon(Tiktactoe.class.getResource("/aplication/myMelody2.jpg")));
				}
				btnNewButton_8.setEnabled(false);
				btnNewButton_8.setText(player);
				verificar();
				}
			
			});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(100, 0, 400, 500);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("Jugador 1: " + contadorPlayerX);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 119, 25);
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Jugador 2: " + contadorPlayerO);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(271, 10, 119, 25);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_9.setBounds(130, 459, 142, 31);
		panel_1.add(btnNewButton_9);
		
		btnNewButton_9.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				btnNewButton.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnNewButton_6.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnNewButton_5.setEnabled(true);
				btnNewButton_7.setEnabled(true);
				btnNewButton_8.setEnabled(true);
				
				btnNewButton_2.setIcon(null);
				btnNewButton.setIcon(null);
				btnNewButton_3.setIcon(null);
				btnNewButton_4.setIcon(null);
				btnNewButton_6.setIcon(null);
				btnNewButton_1.setIcon(null);
				btnNewButton_5.setIcon(null);
				btnNewButton_7.setIcon(null);
				btnNewButton_8.setIcon(null);
				
				btnNewButton_2.setText("");
				btnNewButton.setText("");
				btnNewButton_3.setText("");
				btnNewButton_4.setText("");
				btnNewButton_6.setText("");
				btnNewButton_1.setText("");
				btnNewButton_5.setText("");
				btnNewButton_7.setText("");
				btnNewButton_8.setText("");
				}
			
			});
		
		
		
		
	}
	public void verificar() {
		
		if(btnNewButton_2.getText().equals(btnNewButton.getText()) && btnNewButton.getText().equals(btnNewButton_3.getText()) && !btnNewButton_2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton_2.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			
			
			anunciarGanador(btnNewButton_2.getText());
		}
		if(btnNewButton_4.getText().equals(btnNewButton_6.getText()) && btnNewButton_6.getText().equals(btnNewButton_1.getText()) && !btnNewButton_4.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton_4.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			
			anunciarGanador(btnNewButton_4.getText());
		}
		if(btnNewButton_5.getText().equals(btnNewButton_7.getText()) && btnNewButton_7.getText().equals(btnNewButton_8.getText()) && !btnNewButton_5.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton_5.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			
			anunciarGanador(btnNewButton_5.getText());
		}
		if(btnNewButton_2.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_5.getText()) && !btnNewButton_2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton_2.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			
			anunciarGanador(btnNewButton_2.getText());
		}
		if(btnNewButton.getText().equals(btnNewButton_6.getText()) && btnNewButton_6.getText().equals(btnNewButton_7.getText()) && !btnNewButton.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			
			anunciarGanador(btnNewButton.getText());
		}
		if(btnNewButton_3.getText().equals(btnNewButton_1.getText()) && btnNewButton_1.getText().equals(btnNewButton_8.getText()) && !btnNewButton_3.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton_3.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			
			anunciarGanador(btnNewButton_3.getText());
		}
		if(btnNewButton_2.getText().equals(btnNewButton_6.getText()) && btnNewButton_6.getText().equals(btnNewButton_8.getText()) && !btnNewButton_2.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton_2.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
		}
		if(btnNewButton_3.getText().equals(btnNewButton_6.getText()) && btnNewButton_6.getText().equals(btnNewButton_5.getText()) && !btnNewButton_3.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ganó " + btnNewButton_3.getText(), "Ganaste", JOptionPane.INFORMATION_MESSAGE);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_3.setEnabled(false);
			btnNewButton_4.setEnabled(false);
			btnNewButton_6.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_5.setEnabled(false);
			btnNewButton_7.setEnabled(false);
			btnNewButton_8.setEnabled(false);
			
			anunciarGanador(btnNewButton_3.getText());
		}
		
		
		
		
	}
	private void anunciarGanador(String jugador) {
		JOptionPane.showMessageDialog(null,"Ganó " + jugador);
		if(jugador.equals("X")) {
			contadorPlayerX++;
		}
		if(jugador.equals("O")) {
			contadorPlayerO++;
		}
	    lblNewLabel.setText("Jugador 1: " + contadorPlayerX);
	    lblNewLabel_1.setText("Jugador 2: " + contadorPlayerO);

	}
}

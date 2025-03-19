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
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(70, 50, 400, 400);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno=false;
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
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
					player="X";
				}
				else {
					turno=true;
					player="O";
				}
				btnNewButton_8.setEnabled(false);
				btnNewButton_8.setText(player);
				verificar();
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
		}
		
		
	}
}

package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

public class juegoRompecabezas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juegoRompecabezas frame = new juegoRompecabezas();
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
	public juegoRompecabezas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 623);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 128, 128));
		contentPane.add(header, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Rompecabezas númerico");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		header.add(lblNewLabel);
		
		JPanel body = new JPanel();
		body.setBackground(new Color(0, 128, 128));
		contentPane.add(body, BorderLayout.CENTER);
		body.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("10");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_10);
	
		JButton btnNewButton_11 = new JButton("11");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("12");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("13");
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("14");
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 24));
		body.add(btnNewButton_16);
		
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(0, 128, 128));
		contentPane.add(footer, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		footer.add(btnNewButton);
		
		JPanel right = new JPanel();
		right.setBackground(new Color(0, 128, 128));
		contentPane.add(right, BorderLayout.EAST);
		
		JPanel left = new JPanel();
		left.setBackground(new Color(0, 128, 128));
		contentPane.add(left, BorderLayout.WEST);
	}

}

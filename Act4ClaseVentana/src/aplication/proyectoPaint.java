package aplication;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class proyectoPaint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proyectoPaint frame = new proyectoPaint();
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
	public proyectoPaint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 986, 663);
		panel.setBackground(Color.decode("#ece8da"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel top = new JPanel();
		top.setBounds(0, 0, 986, 31);
		panel.add(top);
		top.setLayout(null);
		
		JPanel west = new JPanel();
		west.setBounds(0, 31, 167, 632);
		panel.add(west);
		west.setBackground(Color.decode("#ece8da"));
		west.setLayout(null);
		
		

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/pincelWOB.png")));
		btnNewButton.setBounds(28, 26, 52, 52);
		west.add(btnNewButton);
		
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/borrador.png")));
		btnNewButton_3.setBounds(90, 26, 52, 52);
		west.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/escobaWOB.png")));
		btnNewButton_1.setBounds(28, 88, 52, 52);
		west.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/linea-removebg-preview.png")));
		btnNewButton_4.setBounds(90, 223, 52, 52);
		west.add(btnNewButton_4);
		
		JSlider slider = new JSlider();
		slider.setBounds(28, 318, 114, 32);
		west.add(slider);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/rectangulo-removebg-preview.png")));
		btnNewButton_1_1.setBounds(28, 165, 52, 52);
		west.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/circulo.png")));
		btnNewButton_1_2.setBounds(90, 165, 52, 52);
		west.add(btnNewButton_1_2);
		
		JLabel lblNewLabel = new JLabel("Grosor:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 285, 114, 32);
		west.add(lblNewLabel);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/triangulo-removebg-preview.png")));
		btnNewButton_1_1_1.setBounds(28, 223, 52, 52);
		west.add(btnNewButton_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(177, 42, 768, 485);
		panel.add(panel_1);
		
		JPanel colors = new JPanel();
		colors.setBounds(177, 557, 366, 80);
		panel.add(colors);
		colors.setLayout(new GridLayout(2, 3, 5, 5));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		colors.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		colors.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 0, 0));
		colors.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(0, 0, 0));
		colors.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(0, 128, 255));
		colors.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(new Color(0, 255, 128));
		colors.add(btnNewButton_9);
	}
}

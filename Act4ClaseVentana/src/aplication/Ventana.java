package aplication;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	public Ventana(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(1000,700);
		
		this.setResizable(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(1000, 700);
		login.setOpaque(true);
		login.setBackground(Color.red);
		login.setVisible(true);
		login.setLayout(null);
		
		this.add(login);
		this.repaint();
		
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(200, 50);
		etiqueta1.setLocation(400, 50);
		etiqueta1.setBackground(Color.black);
		etiqueta1.setVisible(true);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER); 
		etiqueta1.setVerticalAlignment(JLabel.CENTER);   
		etiqueta1.setForeground(Color.white); 
		
		login.add(etiqueta1);


		
	}

}

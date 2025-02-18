package aplication;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.font.TextAttribute;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	public Ventana(String title) {
		
		this.setTitle(title);
		
		this.setSize(1000,700);
		
		this.setResizable(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(1000, 700);
		login.setOpaque(true);
		login.setBackground(Color.black);
		login.setVisible(true);
		login.setLayout(null);
		
		
		this.add(login);
		this.repaint();
		
		
		JPanel etiqueta1 = new JPanel();
		etiqueta1.setSize(600, 600);
		etiqueta1.setLocation(50, 30);
		etiqueta1.setBackground(Color.decode("#2c8444"));
		etiqueta1.setVisible(true);
		etiqueta1.setOpaque(true);
		etiqueta1.setForeground(Color.decode("#bdc2bc")); 
		etiqueta1.setLayout(null);
		
		login.add(etiqueta1);
		
		JLabel titulo = new JLabel("Inicio de sesión");
		
		titulo.setSize(500, 50);
		titulo.setLocation(50,40);
		titulo.setBackground(Color.decode("#2c8444"));
		titulo.setHorizontalAlignment(JLabel.CENTER); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(true);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(titulos);
		
		etiqueta1.add(titulo);

		JLabel nombre = new JLabel("Nombre de usuario:");
		
		nombre.setSize(500, 50);
		nombre.setLocation(20,130);
		nombre.setBackground(Color.decode("#2c8444"));
		nombre.setHorizontalAlignment(JLabel.LEFT); 
		nombre.setVerticalAlignment(JLabel.CENTER); 
		nombre.setVisible(true);
		nombre.setOpaque(true);
		nombre.setForeground(Color.WHITE);
		nombre.setFont(subtitulos);
		etiqueta1.add(nombre);
		
		JTextField nombreInp = new JTextField();
		
		nombreInp.setBounds(20, 190, 500, 50);
		nombreInp.setBackground(Color.white);
		nombreInp.setForeground(Color.black);
		nombreInp.setVisible(true);
		nombreInp.setOpaque(true);
		nombreInp.setFont(subtitulos);
		nombreInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(nombreInp);
		
		JLabel contraseña = new JLabel("Contraseña:");
		
		contraseña.setSize(500, 50);
		contraseña.setLocation(20,260);
		contraseña.setBackground(Color.decode("#2c8444"));
		contraseña.setHorizontalAlignment(JLabel.LEFT); 
		contraseña.setVerticalAlignment(JLabel.CENTER); 
		contraseña.setVisible(true);
		contraseña.setOpaque(true);
		contraseña.setForeground(Color.WHITE);
		contraseña.setFont(subtitulos);
		etiqueta1.add(contraseña);
		
		JPasswordField contraInp = new JPasswordField();
		
		contraInp.setBounds(20, 320, 500, 50);
		contraInp.setBackground(Color.white);
		contraInp.setForeground(Color.black);
		contraInp.setVisible(true);
		contraInp.setOpaque(true);
		contraInp.setFont(subtitulos);
		contraInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(contraInp);
		
		JCheckBox caja = new JCheckBox();
		
		caja.setBounds(20, 370, 170, 30);
		caja.setText("Recordar mi usuario");
		caja.setVisible(true);
		caja.setOpaque(true);
		caja.setBackground(Color.decode("#2c8444"));
		caja.setForeground(Color.white);
		caja.setFont(texto);
		etiqueta1.add(caja);
		
		
		JButton contraOlvidada = new JButton();
		
		contraOlvidada.setBounds(280, 370, 260, 30);
		contraOlvidada.setText("<html><u>¿Olvidaste tu contraseña?</u></html>");
		contraOlvidada.setVisible(true);
		contraOlvidada.setOpaque(true);
		contraOlvidada.setBackground(Color.decode("#2c8444"));
		contraOlvidada.setForeground(Color.white);
		contraOlvidada.setBorderPainted(false);
		contraOlvidada.setFont(texto);
		etiqueta1.add(contraOlvidada);
		this.setVisible(true);
		
		
		JButton enter = new JButton();
		
		enter.setBounds(400, 532, 160, 40);
		enter.setText("Ingresar");
		enter.setVisible(true);
		enter.setOpaque(true);
		enter.setBackground(Color.decode("#216233"));
		enter.setForeground(Color.white);
		enter.setFont(subtitulos);
		etiqueta1.add(enter);
		this.setVisible(true);
		
		
	}

}

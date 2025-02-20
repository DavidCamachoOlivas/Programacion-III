package aplication;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.font.TextAttribute;

public class Calculadora extends JFrame{
	
	public Calculadora(String title) {
		this.setTitle(title);
		this.setSize(500,700);
		
		this.setResizable(true);
		this.setLayout(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel panelCalculadora = calculadora();
		this.add(panelCalculadora);
		
        this.setVisible(true);
		this.repaint();
		this.revalidate();
	}
	
	public JPanel calculadora() {
		
		Font titulos = new Font("Inika", Font.BOLD, 45);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		JPanel calc = new JPanel();
		calc.setBounds(0, 0, 500, 700);
		calc.setBackground(Color.BLACK);
		calc.setLayout(null);

		JLabel titulo = new JLabel("3.1416 * 3");
		
		titulo.setSize(400, 80);
		titulo.setLocation(40,50);
		titulo.setBackground(Color.white);
		titulo.setHorizontalAlignment(JLabel.LEFT); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(true);
		titulo.setForeground(Color.black);
		titulo.setFont(titulos);
		calc.add(titulo);
		
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(40, 250, 400, 300); 
		panelBotones.setLayout(new GridLayout(4, 4, 10, 10)); 
		panelBotones.setBackground(Color.DARK_GRAY);

		
		String[] botones = {
			"1", "2", "3", "/",
			"4", "5", "6", "*",
			"7", "8", "9", "-",
			"0", "C", "=", "+"
		};

		
		for (String text : botones) {
			JButton boton = new JButton(text);
			boton.setFont(new Font("Arial", Font.BOLD, 24));
			boton.setForeground(Color.WHITE);
			boton.setBackground(Color.GRAY);
			boton.setFocusable(false); 
			panelBotones.add(boton);
		}

		
		calc.add(panelBotones);
		
		
		return calc;
	}

}

package aplication;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;
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
		calc.setBounds(0, 0, 400, 600);
		calc.setBackground(Color.BLACK);
		calc.setLayout(new BorderLayout());
		

		
		JLabel titulo = new JLabel("3.1416 * 3");
		
		//titulo.setSize(400, 80);
		//titulo.setLocation(40,50);
		titulo.setBackground(Color.white);
		titulo.setHorizontalAlignment(JLabel.LEFT); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(true);
		titulo.setForeground(Color.black);
		titulo.setFont(titulos);
		calc.add(titulo,BorderLayout.NORTH);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(4,4));
		panelBotones.setBackground(Color.cyan);
		
		calc.add(panelBotones,BorderLayout.CENTER);
		
		
		


		JButton boton1 = new JButton("1");
		boton1.setForeground(Color.WHITE);
		boton1.setFont(subtitulos);
		boton1.setBackground(Color.GRAY);
		panelBotones.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setForeground(Color.WHITE);
		boton2.setFont(subtitulos);
		boton2.setBackground(Color.GRAY);
		panelBotones.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setForeground(Color.WHITE);
		boton3.setFont(subtitulos);
		boton3.setBackground(Color.GRAY);
		panelBotones.add(boton3);
		
		JButton botonMas = new JButton("+");
		botonMas.setForeground(Color.WHITE);
		botonMas.setFont(subtitulos);
		botonMas.setBackground(Color.BLUE);
		panelBotones.add(botonMas);
		
		JButton boton4 = new JButton("4");
		boton4.setForeground(Color.WHITE);
		boton4.setFont(subtitulos);
		boton4.setBackground(Color.GRAY);
		panelBotones.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setForeground(Color.WHITE);
		boton5.setFont(subtitulos);
		boton5.setBackground(Color.GRAY);
		panelBotones.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setForeground(Color.WHITE);
		boton6.setFont(subtitulos);
		boton6.setBackground(Color.GRAY);
		panelBotones.add(boton6);
		
		JButton botonMenos = new JButton("-");
		botonMenos.setForeground(Color.WHITE);
		botonMenos.setFont(subtitulos);
		botonMenos.setBackground(Color.BLUE);
		panelBotones.add(botonMenos);
		
		JButton boton7 = new JButton("7");
		boton7.setForeground(Color.WHITE);
		boton7.setFont(subtitulos);
		boton7.setBackground(Color.GRAY);
		panelBotones.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setForeground(Color.WHITE);
		boton8.setFont(subtitulos);
		boton8.setBackground(Color.GRAY);
		panelBotones.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setForeground(Color.WHITE);
		boton9.setFont(subtitulos);
		boton9.setBackground(Color.GRAY);
		panelBotones.add(boton9);
		
		JButton botonMult = new JButton("x");
		botonMult.setForeground(Color.WHITE);
		botonMult.setFont(subtitulos);
		botonMult.setBackground(Color.BLUE);
		panelBotones.add(botonMult);
		
		JButton boton10 = new JButton("0");
		boton10.setForeground(Color.WHITE);
		boton10.setFont(subtitulos);
		boton10.setBackground(Color.GRAY);
		panelBotones.add(boton10);
		
		
		JButton boton11 = new JButton("C");
		boton11.setForeground(Color.WHITE);
		boton11.setFont(subtitulos);
		boton11.setBackground(Color.GRAY);
		panelBotones.add(boton11);
		
		JButton boton12 = new JButton("=");
		boton12.setForeground(Color.WHITE);
		boton12.setFont(subtitulos);
		boton12.setBackground(Color.BLUE);
		panelBotones.add(boton12);
		
		
		JButton botonDiv = new JButton("/");
		botonDiv.setForeground(Color.WHITE);
		botonDiv.setFont(subtitulos);
		botonDiv.setBackground(Color.BLUE);
		panelBotones.add(botonDiv);
		
				
		
		return calc;
	}

}

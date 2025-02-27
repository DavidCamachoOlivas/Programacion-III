package aplication;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.font.TextAttribute;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class InterfazLayout extends JFrame{

	public InterfazLayout (String text) {
		
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		this.setTitle(text);
		
		this.setSize(600,700);
		
		this.setResizable(true);
		//this.setLayout(new BorderLayout());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//---------------------------------------------------------------------------------
		JPanel interfaz = new JPanel();
		
		interfaz.setSize(400,600);
		interfaz.setBackground(Color.black);
		interfaz.setVisible(true);
		interfaz.setLayout(new BorderLayout());
		Label titulo = new Label("Interés");
		titulo.setSize(50, 50);
		titulo.setFont(titulos);
		titulo.setBackground(Color.white);
		titulo.setVisible(true);
		interfaz.add(titulo, BorderLayout.PAGE_START);
		
		
		//---------------------------------------------------------------------------------

		Border bordeInterno = BorderFactory.createTitledBorder("CALCULAR");
		Border bordeExterno = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border bordeFinal = BorderFactory.createCompoundBorder(bordeInterno, bordeExterno);
		JPanel calcular = new JPanel();
		calcular.setLayout(new GridLayout(4,2, 100, 100));
		calcular.setVisible(true);
		calcular.setBackground(Color.gray);
		
		calcular.setBorder(bordeFinal);
		
		JLabel capital = new JLabel("Capital: ");
		capital.setBackground(Color.red);
		capital.setFont(subtitulos);
		capital.setForeground(Color.white);
		calcular.add(capital);
		
		JTextField capital1 = new JTextField("Capital:");
		capital1.setBackground(Color.white);
		capital1.setFont(subtitulos);
		capital1.setForeground(Color.gray);
		calcular.add(capital1);
		
		JLabel tiempo = new JLabel("Tiempo: ");
		tiempo.setBackground(Color.red);
		tiempo.setFont(subtitulos);
		tiempo.setForeground(Color.white);
		calcular.add(tiempo);
		
		JTextField tiempo1 = new JTextField("Tiempo");
		tiempo1.setBackground(Color.white);
		tiempo1.setFont(subtitulos);
		tiempo1.setForeground(Color.gray);
		calcular.add(tiempo1);
		
		JLabel tasa = new JLabel("Tasa de intereses");
		tasa.setBackground(Color.red);
		tasa.setFont(subtitulos);
		tasa.setForeground(Color.white);
		calcular.add(tasa);
		
		JTextField tasa1 = new JTextField("Tasa");
		tasa1.setBackground(Color.white);
		tasa1.setFont(subtitulos);
		tasa1.setForeground(Color.gray);
		calcular.add(tasa1);
		
		
		
		JButton calc = new JButton("Calcular");
		calc.setFont(subtitulos);
		calcular.add(calc);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(subtitulos);
		calcular.add(cancelar);
		
		
		
		
		//---------------------------------------------------------------------------------

		JPanel mostrar = new JPanel();
		mostrar.setLayout(new GridLayout(2,2,10,10));
		mostrar.setBackground(Color.red);
		mostrar.setVisible(true);
		mostrar.setBorder(bordeFinal);
		
		JLabel interes_tag = new JLabel("Interés");
		interes_tag.setFont(subtitulos);
		interes_tag.setForeground(Color.white);
		TextField interes_input = new TextField("315.00000002");
		interes_input.setFont(subtitulos);
		
		JLabel amount_tag = new JLabel("Monto");
		amount_tag.setFont(subtitulos);
		amount_tag.setForeground(Color.white);
		JTextField amount_input = new JTextField("1815.00000002");
		amount_input.setFont(subtitulos);
		
		mostrar.add(interes_tag);
		mostrar.add(interes_input);
		mostrar.add(amount_tag);
		mostrar.add(amount_input);
		
		
		//---------------------------------------------------------------------------------

		//interfaz.add(new Button("ok"), BorderLayout.SOUTH);
		interfaz.add(calcular, BorderLayout.CENTER);
		interfaz.add(mostrar, BorderLayout.PAGE_END);
		
		
		this.add(interfaz);
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
	}
		
		
	
}

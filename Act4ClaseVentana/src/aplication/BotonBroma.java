package aplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BotonBroma extends JFrame{
	public BotonBroma (String title) {
	
		setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        
		JPanel panel = new JPanel();
		panel.setBounds(0,0,700,700);
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setOpaque(true);
		add(panel);
		JPanel etiqueta1 = new JPanel();
		etiqueta1.setSize(700, 700);
		etiqueta1.setLocation(0, 0);
		etiqueta1.setBackground(Color.black);
		etiqueta1.setVisible(true);
		etiqueta1.setOpaque(true);
		etiqueta1.setForeground(Color.black);//decode("#bdc2bc")); 
		etiqueta1.setLayout(null);
		
		Font titulos = new Font("Inika", Font.BOLD, 38);
		JButton boton = new JButton("Click me");
		boton.setBounds(250,500,200,70);
		boton.setBackground(Color.white);
		boton.setForeground(Color.black);
		boton.setVisible(true);
		boton.setOpaque(true);
		boton.setFont(titulos);
		panel.add(boton);
		
		Random randy = new Random();
		
		
		boton.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int x = randy.nextInt(701-1)+1;
				int y = randy.nextInt(701-1)+1;
				int ancho = randy.nextInt(301-11)+10;
				int alto = randy.nextInt(301-11)+10;
				
				float r = randy.nextFloat();
				float g = randy.nextFloat();
				float b = randy.nextFloat();
				
				Color randomColor = new Color(r, g, b);

				JButton botonCreado = new JButton("palabra");
				botonCreado.setBounds(x,y,ancho,alto);
				botonCreado.setBackground(new Color(r, g, b));
				botonCreado.setVisible(true);
				botonCreado.setOpaque(true);
				botonCreado.addActionListener(new ActionListener() {

					@SuppressWarnings("unlikely-arg-type")
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "El color es "+ randomColor, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
						}
					});
				
				//
				etiqueta1.add(botonCreado);
				
				panel.revalidate();
				panel.repaint();
			}});;
		
		panel.add(etiqueta1);
		
		setVisible(true);
		
	}
	
}

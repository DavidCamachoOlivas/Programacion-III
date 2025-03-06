package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Casa extends JFrame{
	public Casa(String title) {
		
		this.setTitle(title);
		this.setBackground(Color.decode("#6cebff"));
		this.setSize(700,500);
		
		this.setResizable(true);
		this.setLayout(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
        
        
        this.setIconImage(new ImageIcon("logo.png").getImage());

        
       
        this.setVisible(true);
		this.repaint();
		this.revalidate();
		
		
	}
	
	
	
	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//cielo------------------------------
		g2.setColor(Color.decode("#6cebff"));
		g2.fillRect(0, 0, 700, 300);
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.decode("#000000"));
		g2.drawArc(400, 50, 50, 50, 30, 100);
		g2.drawArc(440, 52, 50, 50, 30, 100);
		g2.setColor(Color.decode("#fff74c"));
		g2.fillOval(0, 0, 100, 100);
		
		//pasto------------------------------
		g2.setColor(Color.decode("#73f04e"));
		g2.fillRect(0, 300, 700, 300);
		
		//cerca------------------------------
		g2.setColor(Color.decode("#9b7d2c"));
		g2.fillRect(50, 240, 10, 100);
		g2.fillRect(100, 240, 10, 100);
		g2.fillRect(150, 240, 10, 100);
		g2.fillRect(200, 240, 10, 100);
		g2.fillRect(250, 240, 10, 100);
		g2.fillRect(300, 240, 10, 100);
		g2.fillRect(350, 240, 10, 100);
		g2.fillRect(400, 240, 10, 100);
		g2.fillRect(450, 240, 10, 100);
		g2.fillRect(500, 240, 10, 100);
		g2.fillRect(550, 240, 10, 100);
		g2.fillRect(600, 240, 10, 100);
		
		
		g2.fillRect(0, 270, 600, 10);
		g2.fillRect(0, 310, 600, 10);
		
		
		g2.fillRect(640, 270, 10, 100);
		g2.fillRect(680, 300, 10, 100);
		
		
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(600, 270, 690, 330);
		g2.drawLine(600, 310, 690, 370);
		
		//casa-------------------------------
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.decode("#cad1c8"));
		g2.fillRect(100, 200, 300, 150);
		g2.setColor(Color.decode("#888888"));
		g2.fillRect(90, 200, 320, 20);
		g2.setColor(Color.decode("#cad1c8"));
		g2.fillRect(200,100,200,100);
		g2.setColor(Color.decode("#888888"));
		g2.fillRect(190, 100, 220, 20);
		//ventana----------------------------
		g2.setColor(Color.decode("#ffffff"));
		g2.fillRect(140,250,90,50);
		g2.setColor(Color.decode("#888888"));
		g2.drawRect(140,250,90,50);
		g2.drawLine(180, 250, 180, 300);
		
		g2.setColor(Color.decode("#ffffff"));
		g2.fillRect(230,135,90,50);
		g2.setColor(Color.decode("#888888"));
		g2.drawRect(230,135,90,50);
		g2.drawLine(270, 135, 270, 185);
		
		
		
		
		
		
		
		//alberca-----------------------------
		g2.setColor(Color.decode("#5194e5"));
		int[] xs1 = {100,400,480,20};
		int[] ys1 = {350,350,400,400};
		g2.fillPolygon(xs1,ys1,4);
		
		g2.setColor(Color.decode("#888888"));
		g2.setStroke(new BasicStroke(5));
		int[] xs = {100,400,480,20};
		int[] ys = {350,350,400,400};
		g2.drawPolygon(xs,ys,4);
		
		g2.setColor(Color.decode("#4793cf"));
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(101, 353, 101, 397);
		g2.drawLine(399, 353, 399, 397);
		
		
		//perro------------------------------
		//g2.setColor(Color.decode("#b06e23"));
		//g2.fillOval(300, 420, 80, 40);
		
		
	}
}

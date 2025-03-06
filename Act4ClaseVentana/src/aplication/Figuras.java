package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class Figuras extends JFrame {

	public Figuras(String title) {
		
		this.setTitle(title);
		
		this.setSize(1000,700);
		
		this.setResizable(true);
		this.setLayout(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
        
        /*JPanel usuarios = usuarios();
        this.add(usuarios);*/
        
        
        
        this.setIconImage(new ImageIcon("logo.png").getImage());

        
        this.setVisible(true);
		this.repaint();
		this.revalidate();
		
		
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.red);
		
		g2.drawRect(80, 80, 400, 400);
		g2.fillRect(40, 40, 200, 200);
		
		g2.setColor(Color.blue);
		g2.fillRoundRect(200, 50, 100, 100, 15, 15);
		
		g2.setColor(Color.green);
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(100, 100, 600, 500);
		
		g2.setColor(Color.decode("#d133ff"));
		g2.drawOval(100, 500, 60, 60);
		g2.fillOval(500, 500, 60, 60);
		
		//pokebola-------------------------------------------------------------
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.decode("#de0303"));
		g2.fillArc(600, 300, 100, 100, 1, 180);
		g2.setColor(Color.decode("#000000"));
		g2.drawArc(600, 300, 100, 100, 1, 180);
		g2.drawArc(600, 300, 100, 100, 1, -180);
		g2.drawOval(635, 335, 30, 30);
		g2.setColor(Color.decode("#f3f3f3"));
		g2.fillOval(637, 337, 25, 25);
		
		//----------------------------------------------------------------------
		
		g2.setColor(Color.decode("#292929"));
		g2.setFont(titulos);
		g2.drawString("pokeball:",500,250);
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("artist.jpg"));
			g2.drawImage(image, 650, 125, 140, 140, Color.gray, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int[] xs = {300,600,700,200};
		int[] ys = {150,150,300,300};
		
		
		g2.drawPolygon(xs,ys,4);
		
		g2.clearRect(100, 100, 50, 50);
	}
}

package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MarioWorld2 extends JFrame {
	public MarioWorld2(String title) {
		
		this.setTitle(title);
		this.setBackground(Color.decode("#6cebff"));
		this.setSize(1100,700);
		
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
		
		//cielo-----------------------------------------------------------------------
		g2.setColor(Color.decode("#325dd5"));
		g2.fillRect(0, 0, 1100, 700);
		
		//piso------------------------------------------------------
		g2.setColor(Color.decode("#d18a4c"));
		g2.fillRect(0, 600, 1100, 100);
		g2.setColor(Color.decode("#d18a4c"));
		g2.fillRect(0, 630, 1100, 70);
		g2.setColor(Color.decode("#1ce600"));
		g2.fillRect(0, 600, 1100, 20);
		
		
		//montañas cian-----------------------------------------------------------------
		
		g2.setColor(Color.decode("#97dcd4"));
		g2.fillArc(30, 200, 200, 200, 0, 180);
		g2.fillRect(30, 300, 200, 300);
		g2.setColor(Color.decode("#aefff6"));
		g2.fillArc(30, 200, 170, 200, 0, 180);
		g2.fillRect(30, 300, 170, 300);
		
		g2.setColor(Color.decode("#97dcd4"));
		g2.fillArc(450, 200, 200, 200, 0, 180);
		g2.fillRect(450, 300, 200, 300);
		g2.setColor(Color.decode("#aefff6"));
		g2.fillArc(450, 200, 170, 200, 0, 180);
		g2.fillRect(450, 300, 170, 300);
		
		g2.setColor(Color.decode("#97dcd4"));
		g2.fillArc(650, 100, 200, 200, 0, 180);
		g2.fillRect(650, 200, 200, 400);
		g2.setColor(Color.decode("#aefff6"));
		g2.fillArc(650, 100, 170, 200, 0, 180);
		g2.fillRect(650, 200, 170, 400);
		
		//montañas azules
		
		g2.setColor(Color.decode("#4a78a0"));
		g2.fillArc(500, 450, 250, 250, 0, 180);
		g2.fillRect(500, 575, 250, 125);
		g2.setColor(Color.decode("#63a0d5"));
		g2.fillArc(500, 450, 200, 200, 0, 180);
		g2.fillRect(500, 450, 200, 150);
		
		
		//nubes
		g2.setColor(Color.decode("#e3e3e3"));
		g2.fillRoundRect(0, 100, 200, 50, 70, 70);
		g2.setColor(Color.decode("#ffffff"));
		g2.fillRoundRect(0, 100, 200, 40, 70, 70);
		
		g2.setColor(Color.decode("#e3e3e3"));
		g2.fillRoundRect(70, 300, 200, 50, 70, 70);
		g2.setColor(Color.decode("#ffffff"));
		g2.fillRoundRect(70, 300, 200, 40, 70, 70);
		
		g2.setColor(Color.decode("#e3e3e3"));
		g2.fillRoundRect(300, 350, 200, 50, 70, 70);
		g2.setColor(Color.decode("#ffffff"));
		g2.fillRoundRect(300, 350, 200, 40, 70, 70);
		
		//tubo
		
		g2.setColor(Color.decode("#5d28ea"));
		g2.fillRect(600, 450, 125, 150);
		g2.fillRect(590, 400, 145, 50);
		g2.setColor(Color.decode("#7f54f1"));
		g2.drawLine(600, 400, 600, 450);
		g2.drawLine(610, 450, 610, 600);

		g2.setColor(Color.decode("#ae90fe"));
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(615, 400, 615, 450);
		g2.drawLine(625, 450, 625, 600);
		
		g2.setColor(Color.decode("#4725a3"));
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(720, 400, 720, 450);
		g2.drawLine(710, 450, 710, 600);
		g2.setColor(Color.decode("#000000"));
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(730, 400, 730, 450);
		g2.drawLine(719, 450, 719, 600);
		
		
		g2.setColor(Color.decode("#000000"));
		g2.drawRect(600, 450, 125, 150);
		g2.drawRect(590, 400, 145, 50);
		
		
		
		//mario-------------------------------------------------------------------------
				BufferedImage image;
				try {
					image = ImageIO.read(new File("mario.png"));
					g2.drawImage(image, 400, 500, 100, 100, null, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}

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

public class MarioWorld extends JFrame{

public MarioWorld(String title) {
		
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
		g2.setColor(Color.decode("#8cecff"));
		g2.fillRect(0, 0, 1100, 700);
		
		
		
		//cajas power up--------------------------------------------------------------
		
			//caja super izq----------------------------------------------------------
		g2.setColor(Color.decode("#000000"));
		g2.fillRect(195, 105, 70, 70);
		g2.setColor(Color.decode("#f9a55b"));
		g2.fillRect(200, 100, 70, 70);
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.decode("#000000"));
		g2.drawRect(200, 100, 70, 70);
		g2.fillRect(210, 110, 5, 5);
		g2.fillRect(255, 110, 5, 5);
		g2.fillRect(210, 155, 5, 5);
		g2.fillRect(255, 155, 5, 5);
		g2.setColor(Color.decode("#ffffff"));
		g2.drawArc(225, 120, 18, 18, 270, 270);
		g2.drawLine(233, 139, 233, 145);
		g2.fillRect(231, 153, 5, 5);
		
			//caja super der-----------------------------------------------------------
		g2.setColor(Color.decode("#000000"));
		g2.fillRect(270, 105, 70, 70);
		g2.setColor(Color.decode("#f9a55b"));
		g2.fillRect(275, 100, 70, 70);
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.decode("#000000"));
		g2.drawRect(275, 100, 70, 70);
		g2.fillRect(285, 110, 5, 5);
		g2.fillRect(330, 110, 5, 5);
		g2.fillRect(285, 155, 5, 5);
		g2.fillRect(330, 155, 5, 5);
		g2.setColor(Color.decode("#ffffff"));
		g2.drawArc(303, 120, 18, 18, 270, 270);
		g2.drawLine(311, 139, 311, 145);
		g2.fillRect(309, 153, 5, 5);
		
			//power Up----------------------------------------------------------------------
		
				BufferedImage image4;
				try {
					image4 = ImageIO.read(new File("powerUp.png"));
					g2.drawImage(image4, 45, 250, 70, 70, Color.decode("#8cecff"), null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//caja inf izq-------------------------------------------------------------
		g2.setColor(Color.decode("#000000"));
		g2.fillRect(40, 325, 70, 70);
		g2.setColor(Color.decode("#f9a55b"));
		g2.fillRect(45, 320, 70, 70);
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.decode("#000000"));
		g2.drawRect(45, 320, 70, 70);
		g2.fillRect(55, 330, 5, 5);
		g2.fillRect(100, 330, 5, 5);
		g2.fillRect(55, 375, 5, 5);
		g2.fillRect(100, 375, 5, 5);
		
		
			//caja inf der-------------------------------------------------------------
		g2.setColor(Color.decode("#000000"));
		g2.fillRect(900, 205, 70, 70);
		g2.setColor(Color.decode("#f9a55b"));
		g2.fillRect(905, 200, 70, 70);
		g2.setStroke(new BasicStroke(5));
		g2.setColor(Color.decode("#000000"));
		g2.drawRect(905, 200, 70, 70);
		g2.fillRect(915, 210, 5, 5);
		g2.fillRect(960, 210, 5, 5);
		g2.fillRect(915, 255, 5, 5);
		g2.fillRect(960, 255, 5, 5);
		g2.setColor(Color.decode("#ffffff"));
		g2.drawArc(932, 220, 18, 18, 270, 270);
		g2.drawLine(940, 238, 940, 246);
		g2.fillRect(938, 253, 5, 5);
		
		//cajas background--------------------------------------------------------------
		
			//sombra caja alta----------------------------------------------------------
		g2.setColor(Color.black);
		g2.fillRoundRect(420, 270, 200, 330, 15, 15);
			//caja alta-----------------------------------------------------------------
		g2.setColor(Color.decode("#05a3d6"));
		g2.fillRoundRect(400, 250, 200, 350, 15, 15);
		g2.setColor(Color.black);
		g2.drawRoundRect(400, 250, 200, 350, 15, 15);
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(410, 260, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(410, 260, 20, 20);
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(570, 260, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(570, 260, 20, 20);
		
			//sombra caja cuadrada------------------------------------------------------
		g2.setColor(Color.black);
		g2.fillRoundRect(280, 420, 200, 180, 15, 15);
			//caja cuadrada-------------------------------------------------------------
		g2.setColor(Color.decode("#facca7"));
		g2.fillRoundRect(260, 400, 200, 200, 15, 15);
		g2.setColor(Color.black);
		g2.drawRoundRect(260, 400, 200, 200, 15, 15);
		
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(270, 410, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(270, 410, 20, 20);
		
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(430, 410, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(430, 410, 20, 20);
		
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(270, 570, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(270, 570, 20, 20);
		
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(430, 570, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(430, 570, 20, 20);
		
		
			//caja cuadrada de de la derecha--------------------------------------------
		g2.setColor(Color.decode("#51de85"));
		g2.fillRoundRect(900, 400, 200, 200, 15, 15);
		g2.setColor(Color.black);
		g2.drawRoundRect(900, 400, 200, 200, 15, 15);
		
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(910, 410, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(910, 410, 20, 20);
		
		g2.setColor(Color.decode("#c9c7c7"));
		g2.fillOval(910, 570, 20, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawOval(910, 570, 20, 20);
		
		//carnivora----------------------------------------------------------------------
		
		BufferedImage image2;
		try {
			image2 = ImageIO.read(new File("canivoraPVZ.png"));
			g2.drawImage(image2, 700, 285, 120, 120, Color.decode("#8cecff"), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//tubo carvinvora----------------------------------------------------------------
		g2.setColor(Color.decode("#148e00"));
		g2.fillRect(700, 450, 125, 200);
		g2.fillRect(690, 400, 145, 50);
		g2.setColor(Color.decode("#1fdc00"));
		g2.drawLine(700, 400, 700, 450);
		g2.drawLine(710, 450, 710, 600);

		g2.setColor(Color.decode("#1bbe00"));
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(715, 400, 715, 450);
		g2.drawLine(725, 450, 725, 600);
		
		g2.setColor(Color.decode("#106e00"));
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(820, 400, 820, 450);
		g2.drawLine(810, 450, 810, 600);
		g2.setColor(Color.decode("#000000"));
		g2.setStroke(new BasicStroke(5));
		g2.drawLine(830, 400, 830, 450);
		g2.drawLine(819, 450, 819, 600);
		
		
		g2.setColor(Color.decode("#000000"));
		g2.drawRect(700, 450, 125, 200);
		g2.drawRect(690, 400, 145, 50);
		
		
		//mario fake--------------------------------------------------------------------
		
				BufferedImage image1;
				try {
					image1 = ImageIO.read(new File("mario3.png"));
					g2.drawImage(image1, 480, 487, 117, 117, Color.decode("#05a3d6"), null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		//piso---------------------------------------------------------------------------
		g2.setColor(Color.decode("#facca7"));
		g2.fillRect(0, 600, 1100, 100);
		g2.setColor(Color.decode("#f9a55b"));
		g2.fillRect(0, 630, 1100, 70);
		g2.setColor(Color.decode("#b76f2e"));
		g2.fillRect(0, 630, 1100, 20);
		g2.setColor(Color.decode("#000000"));
		g2.drawLine(0, 600, 1100, 600);
		g2.drawLine(0, 630, 1100, 630);
		g2.drawLine(0, 650, 1100, 650);
		int x1=10;
		int x2=100;
		
		for(int i=0;i<=20;i++) {
			g2.drawLine(x1, 650, x2, 700);
			x1=x1+50;
			x2=x2+50;
		}
		
		
		
		//mario-------------------------------------------------------------------------
		BufferedImage image;
		try {
			image = ImageIO.read(new File("mario.png"));
			g2.drawImage(image, 400, 146, 100, 100, Color.decode("#8cecff"), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}

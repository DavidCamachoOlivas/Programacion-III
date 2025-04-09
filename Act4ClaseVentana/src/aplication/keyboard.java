package aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aplication.proyectoPaint.figura;
import aplication.proyectoPaint.myPoint;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class keyboard extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int x=320, y=250;
	private int sizePlayer=30;
	JPanel panel_2;
	private Player player;
	private ArrayList<Player> obstaculos = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	
	class PaintPanel extends JPanel {
		public PaintPanel(){
			this.setBackground(Color.black);
		}
 	    @Override
 	    protected void paintComponent(Graphics g) {
 	        super.paintComponent(g);
 	        Graphics g2 = (Graphics2D) g;
 	        
 	        g2.setColor(Color.green);
 	        g2.fillRect(x, y, 30, 30);
 	        
 	        for (Player obs : obstaculos) {
 	        	g2.setColor(obs.c);
 	        	g2.fillRect(obs.x, obs.y, obs.w, obs.h);
 	       		}
 	        
 	        }
 	    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					keyboard frame = new keyboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public keyboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton reset = new JButton("Reiniciar");
		panel_1.add(reset);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=panel_2.getWidth()/2;
				y=panel_2.getHeight()/2;
				player.x=x;
				player.y=y;
				panel_2.repaint();
				keyboard.this.requestFocusInWindow();			}
		});	
			
		panel_2 = new PaintPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		
		
		
		this.addKeyListener(this);
		this.setFocusable(true);
		player = new Player(x, y, sizePlayer, sizePlayer, Color.green);
		obstaculos.add(new Player(200,200,300,50,Color.orange));
		obstaculos.add(new Player(200,50,50,500,Color.orange));
		this.requestFocusInWindow();

		
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tecla: " + e.getKeyCode());
		int playerX=player.x;
		int playerY=player.y;
		if(e.getKeyCode() == KeyEvent.VK_W) {
			playerY-=10;
			if(player.y - 10 <= 0) {
				playerY = panel_2.getHeight();
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			playerY+=10;
			if(playerY > panel_2.getHeight()) {
				playerY = -sizePlayer;
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			playerX+=10;
			if(playerX > panel_2.getWidth()) {
				playerX = -sizePlayer;
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			playerX-=10;
			if(playerX + sizePlayer < 0) {
				playerX = panel_2.getWidth();
			}
		}
		
		
		Player intento = new Player(playerX, playerY, sizePlayer, sizePlayer, player.c);
		
		boolean Colision = false;
        for (Player obstaculo : obstaculos) {
            if (intento.colision(obstaculo)) {
            	System.out.println("Colisión en: " + obstaculo.x + ", " + obstaculo.y );
            	Colision = true;
                break;
            }
        }
        if (!Colision) {
            player.x = playerX;
            player.y = playerY;
            x = playerX;
            y = playerY;
        }
		
		System.out.println("X= "+x+"Y= "+y);
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	class Player{
		int x,y,h,w;
		Color c = Color.black;
		
		public Player(int x, int y, int h, int w, Color c) {
			this.x=x;
			this.y=y;
			this.h=h;
			this.w=w;
			this.c=c;
		}
		public Boolean colision(Player target) {
			return this.x<target.x+target.w &&
					this.x+this.w>target.x &&
					this.y<target.y+target.h &&
					this.y+this.h>target.y;						
		}
	}

}

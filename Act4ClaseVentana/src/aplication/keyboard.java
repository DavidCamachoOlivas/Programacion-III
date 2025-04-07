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

	/**
	 * Launch the application.
	 */
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
		
			
		JPanel panel_2 = new PaintPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		this.addKeyListener(this);
		this.setFocusable(true);
		this.requestFocusInWindow();

		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=320;
				y=250;
				panel_2.repaint();
				keyboard.this.requestFocusInWindow();			}
		});	
	}
	
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
 	        
 	        }
 	    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyChar() == 'w') {
			y-=10;
		}
		if(e.getKeyChar() == 's') {
			y+=10;
		}
		if(e.getKeyChar() == 'd') {
			x+=10;
		}
		if(e.getKeyChar() == 'a') {
			x-=10;
		}
		
		System.out.println(e.getKeyChar());
		
		this.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

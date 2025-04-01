package aplication;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class proyectoPaint extends JFrame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private proyectoPaint panel;
	
	private ArrayList<Point> puntos = new ArrayList<Point>();
 	
 	List<List<Point>> listaDePuntos = new ArrayList<>(); 
 	List<Color> listaDeColores = new ArrayList<>();
 	List<Integer> listaDeGrosores = new ArrayList<>();
 	
	Color color = Color.BLACK;
	private int grosor = 3;
	PaintPanel panelDibujo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proyectoPaint frame = new proyectoPaint();
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
	public proyectoPaint() {
		inicializar();
	}
	
	private void inicializar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 986, 663);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.decode("#ece8da"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel top = new JPanel();
		top.setBounds(0, 0, 986, 31);
		top.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(top);
		top.setLayout(null);
		
		JPanel west = new JPanel();
		west.setBounds(0, 31, 167, 632);
		west.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(west);
		west.setBackground(Color.decode("#ece8da"));
		west.setLayout(null);
		
		

		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/pincelWOB.png")));
		btnNewButton.setBounds(28, 26, 52, 52);
		west.add(btnNewButton);
		
		
		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/borrador.png")));
		btnNewButton_3.setBounds(90, 26, 52, 52);
		west.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/escobaWOB.png")));
		btnNewButton_1.setBounds(28, 88, 52, 52);
		west.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton();
		btnNewButton_4.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/linea-removebg-preview.png")));
		btnNewButton_4.setBounds(90, 223, 52, 52);
		west.add(btnNewButton_4);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,1,10,3);
		slider.setBounds(28, 318, 114, 32);
		west.add(slider);
		slider.addChangeListener(e -> {
		    grosor = slider.getValue(); 
		});
		
		JButton btnNewButton_1_1 = new JButton();
		btnNewButton_1_1.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/rectangulo-removebg-preview.png")));
		btnNewButton_1_1.setBounds(28, 165, 52, 52);
		west.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton();
		btnNewButton_1_2.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/circulo.png")));
		btnNewButton_1_2.setBounds(90, 165, 52, 52);
		west.add(btnNewButton_1_2);
		
		JLabel lblNewLabel = new JLabel("Grosor:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 285, 114, 32);
		west.add(lblNewLabel);
		
		JButton btnNewButton_1_1_1 = new JButton();
		btnNewButton_1_1_1.setIcon(new ImageIcon(proyectoPaint.class.getResource("/aplication/triangulo-removebg-preview.png")));
		btnNewButton_1_1_1.setBounds(28, 223, 52, 52);
		west.add(btnNewButton_1_1_1);
		
		panelDibujo = new PaintPanel();
		panelDibujo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelDibujo.setBounds(177, 42, 768, 485);
		panel.add(panelDibujo);
		panelDibujo.setLayout(null);
		
		panelDibujo.addMouseListener(this);
		panelDibujo.addMouseMotionListener(this);
		
		JPanel colors = new JPanel();
		colors.setBounds(177, 557, 366, 80);
		panel.add(colors);
		colors.setLayout(new GridLayout(2, 3, 5, 5));
		
		//------------------------------------------------------------------------
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(128, 0, 255);
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 255));
		colors.add(btnNewButton_2);
		
		//------------------------------------------------------------------------
		
		JButton btnNewButton_5 = new JButton();
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(192, 192, 192);
			}
		});
		btnNewButton_5.setBackground(new Color(192, 192, 192));
		colors.add(btnNewButton_5);
		
		//------------------------------------------------------------------------
		
		JButton btnNewButton_6 = new JButton();
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(255, 0, 0);
			}
		});
		btnNewButton_6.setBackground(new Color(255, 0, 0));
		colors.add(btnNewButton_6);
		
		//------------------------------------------------------------------------
		
		JButton btnNewButton_7 = new JButton();
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 0, 0);
			}
		});
		btnNewButton_7.setBackground(new Color(0, 0, 0));
		colors.add(btnNewButton_7);
		
		//------------------------------------------------------------------------
		
		JButton btnNewButton_8 = new JButton();
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 128, 255);
			}
		});
		btnNewButton_8.setBackground(new Color(0, 128, 255));
		colors.add(btnNewButton_8);
		
		//------------------------------------------------------------------------
		
		JButton btnNewButton_9 = new JButton();
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = new Color(0, 255, 128);
			}
		});
		btnNewButton_9.setBackground(new Color(0, 255, 128));
		colors.add(btnNewButton_9);
	}
	@Override
 	public void mouseClicked(MouseEvent e) {
 		// TODO Auto-generated method stub
 		
 	}
 
 	@Override
 	public void mousePressed(MouseEvent e) {
 		// TODO Auto-generated method stub
 		
 	}
 
 	@Override
 	public void mouseReleased(MouseEvent e) {
 		
 		//crear una copia de los puntos
 		ArrayList ArrList2  = (ArrayList)puntos.clone();
 		
 		//se guarda en el historial de dibujos
 		listaDePuntos.add(ArrList2);
 		
 		listaDeColores.add(color);
 		
 		listaDeGrosores.add(grosor);
 		
 		//limpiamos el trazo actual
 		puntos.clear();
 		
 		
 	}
 
 	@Override
 	public void mouseEntered(MouseEvent e) { 
 		
 	}
 
 	@Override
 	public void mouseExited(MouseEvent e) { 
 		
 	}
 
 	@Override
 	public void mouseDragged(MouseEvent e) {
 		panelDibujo.repaint();  
 		
 		puntos.add(e.getPoint());
 		
 	}
 
 	@Override
 	public void mouseMoved(MouseEvent e) { 
 		
 	}
 	
 	class PaintPanel extends JPanel{
 		
 		public PaintPanel()
 		{
 			this.setBackground(Color.white);
 		}
 		
 		@Override
 	   public void paintComponent(Graphics g) {
 	       super.paintComponent(g);
 	       
 	       Graphics2D g2 = (Graphics2D) g; 
 	       g2.setColor(color); 
 	       
 		   
 	       //dibujar la trayectoria de puntos 
 	       //solo cuando tengo más de 2 puntos
 	       for(int i=0;i<listaDePuntos.size();i++) {
 	    	   g2.setColor(listaDeColores.get(i));
 	    	   g2.setStroke(new BasicStroke(listaDeGrosores.get(i))); 
 	    	   List<Point> trazo = listaDePuntos.get(i);
 	    	   
 	    	   if(trazo.size() > 1) {
 	    		   for(int j=1;j<trazo.size();j++) {
 	    			  g2.drawLine(trazo.get(j - 1).x, trazo.get(j - 1).y, trazo.get(j).x, trazo.get(j).y);
 	    		   }
 	    	   }
 	       }
 	       
 	       g2.setColor(color);
 	       g2.setStroke(new BasicStroke(grosor));
 	       if(puntos.size()>1) {
 	    	  for (int i = 1; i < puntos.size(); i++) {
 	             g2.drawLine(puntos.get(i - 1).x, puntos.get(i - 1).y, puntos.get(i).x, puntos.get(i).y);
 	         }
 	       }
 	       
 	   }
 		
 	}
}

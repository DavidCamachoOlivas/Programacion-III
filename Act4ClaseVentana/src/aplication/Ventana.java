package aplication;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Ventana extends JFrame{
	public Ventana(String title) {
		
		this.setTitle(title);
		
		this.setSize(750,700);
		
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel panelInicio = login();
        this.add(panelInicio);
        
        /*JPanel registro = registro();
        //this.add(registro);*/
        
        /*JPanel usuarios = usuarios();
        this.add(usuarios);*/
        
        
        //crear menu
        JMenuBar barra = new JMenuBar();
        
        JMenu menu1 = new JMenu("Archivo");
        JMenu menu2 = new JMenu("Ayuda");
        JMenu menu3 = new JMenu("Cuenta");
        
        //menu-Archivo--------------------------------------------------------------------------
        JMenuItem op_new = new JMenuItem("Nuevo");
        JMenuItem op_open = new JMenuItem("Abrir");
        JMenuItem op_close = new JMenuItem("Cerrar");
        
        menu1.add(op_new);
        menu1.add(op_open);
        menu1.add(op_close);
        
        //menu Ayuda----------------------------------------------------------------------------
        JRadioButtonMenuItem op_help = new JRadioButtonMenuItem("Manual de usuario");
        JCheckBoxMenuItem op_support = new JCheckBoxMenuItem("Soporte");
        
        menu2.add(op_help);
        menu2.add(op_support);
        
        //menu inicio de sesion-----------------------------------------------------------------
        JMenuItem logIn = new JMenuItem("Acceder");
        JMenuItem logOut = new JMenuItem("Crear cuenta");
        
        menu3.add(logIn);
        menu3.add(logOut);
        
        //añadir todo al menu
        barra.add(menu1);
        barra.add(menu2);
        barra.add(menu3);
        
        
        
        this.setJMenuBar(barra);
        
        this.setIconImage(new ImageIcon("logo.png").getImage());

        
        this.setVisible(true);
		this.repaint();
		this.revalidate();
		
		
		logIn.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				manager("registro");
			}});
		
		logOut.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				manager("login");
			}});
	}
	
	
	public JPanel login() {
		
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		
		
		
		JPanel fondo = new JPanel();
		fondo.setBounds(0, 0, 750, 700);
		fondo.setLayout(null);
		fondo.setVisible(true);
		fondo.setOpaque(false);
		ImageIcon img = new ImageIcon(new ImageIcon("fondo.jpg").getImage().getScaledInstance(750, 700, java.awt.Image.SCALE_SMOOTH));
		JLabel fondoImg = new JLabel(img);
		fondoImg.setBounds(0, 0, 750, 700);
		
		
		ImageIcon icon = new ImageIcon(new ImageIcon("user.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		JLabel userIcon = new JLabel(icon);
		userIcon.setBounds(70, 160, 50, 50);
		
		ImageIcon icon2 = new ImageIcon(new ImageIcon("password.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		JLabel passwordIcon = new JLabel(icon2);
		passwordIcon.setBounds(70, 290, 50, 50);
		
		
		
		
		JPanel etiqueta1 = new JPanel();
		etiqueta1.setSize(600, 600);
		etiqueta1.setLocation(50, 30);
		//etiqueta1.setBackground(Color.decode("#2c8444"));
		etiqueta1.setVisible(true);
		etiqueta1.setOpaque(false);
		etiqueta1.setForeground(Color.black);//decode("#bdc2bc")); 
		etiqueta1.setLayout(null);
		
		fondo.add(etiqueta1);
		
		JLabel titulo = new JLabel("Inicio de sesión");
		
		titulo.setSize(500, 50);
		titulo.setLocation(50,40);
		//titulo.setBackground(Color.decode("#2c8444"));
		titulo.setHorizontalAlignment(JLabel.CENTER); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(true);
		titulo.setForeground(Color.black);
		titulo.setFont(titulos);
		
		etiqueta1.add(titulo);

		JLabel nombre = new JLabel("Nombre de usuario:");
		
		nombre.setSize(450, 50);
		nombre.setLocation(70,130);
		//nombre.setBackground(Color.decode("#2c8444"));
		nombre.setHorizontalAlignment(JLabel.LEFT); 
		nombre.setVerticalAlignment(JLabel.CENTER); 
		nombre.setVisible(true);
		nombre.setOpaque(true);
		nombre.setForeground(Color.black);
		nombre.setFont(subtitulos);
		etiqueta1.add(nombre);
		
		JTextField nombreInp = new JTextField();
		
		nombreInp.setBounds(20, 180, 500, 40);
		nombreInp.setBackground(Color.white);
		nombreInp.setForeground(Color.black);
		nombreInp.setVisible(true);
		nombreInp.setOpaque(true);
		nombreInp.setFont(subtitulos);
		nombreInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(nombreInp);
		
		JLabel contraseña = new JLabel("Contraseña:");
		
		contraseña.setSize(450, 50);
		contraseña.setLocation(70,260);
		//contraseña.setBackground(Color.decode("#2c8444"));
		contraseña.setHorizontalAlignment(JLabel.LEFT); 
		contraseña.setVerticalAlignment(JLabel.CENTER); 
		contraseña.setVisible(true);
		contraseña.setOpaque(true);
		contraseña.setForeground(Color.black);
		contraseña.setFont(subtitulos);
		etiqueta1.add(contraseña);
		
		JPasswordField contraInp = new JPasswordField();
		
		contraInp.setBounds(20, 310, 500, 40);
		contraInp.setBackground(Color.white);
		contraInp.setForeground(Color.black);
		contraInp.setVisible(true);
		contraInp.setOpaque(true);
		contraInp.setFont(subtitulos);
		contraInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(contraInp);
		
		JCheckBox caja = new JCheckBox();
		
		caja.setBounds(20, 370, 170, 30);
		caja.setText("Recordar mi usuario");
		caja.setVisible(true);
		caja.setOpaque(true);
		//caja.setBackground(Color.decode("#2c8444"));
		caja.setForeground(Color.black);
		caja.setFont(texto);
		etiqueta1.add(caja);
		
		
		JButton contraOlvidada = new JButton();
		
		contraOlvidada.setBounds(280, 370, 260, 30);
		contraOlvidada.setText("<html><u>¿Olvidaste tu contraseña?</u></html>");
		contraOlvidada.setVisible(true);
		contraOlvidada.setOpaque(true);
		//contraOlvidada.setBackground(Color.decode("#2c8444"));
		contraOlvidada.setForeground(Color.black);
		contraOlvidada.setBorderPainted(false);
		contraOlvidada.setFont(texto);
		etiqueta1.add(contraOlvidada);
		this.setVisible(true);
		
		
		JButton enter = new JButton();
		
		enter.setBounds(400, 532, 160, 40);
		enter.setText("Ingresar");
		enter.setVisible(true);
		enter.setOpaque(true);
		//enter.setBackground(Color.decode("#216233"));
		enter.setForeground(Color.black);
		enter.setFont(subtitulos);
		etiqueta1.add(enter);
		this.setVisible(true);
		
		fondo.add(userIcon);
		fondo.add(passwordIcon);
		fondo.add(fondoImg);
		
		enter.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (nombreInp.getText().equals("David")) {
				    nombreInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));

				    String password = new String(contraInp.getPassword()); 
				    if (password.equals("contraseñaSecreta")) { 
				        contraInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				        JOptionPane.showMessageDialog(null, "Bienvenido de vuelta", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
				    }
				}else {
					nombreInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
					contraInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Advertencia", JOptionPane.WARNING_MESSAGE);
				}
			}});
		
		JButton ir_a_registro = new JButton("<html><u>¿No tienes cuenta?</u></html>");
		ir_a_registro.setSize(200,50);
		ir_a_registro.setLocation(25,450);
		ir_a_registro.setBackground(null);
		ir_a_registro.setVisible(true);
		ir_a_registro.setOpaque(true);
		ir_a_registro.setForeground(Color.black);
		ir_a_registro.setBorderPainted(false);
		ir_a_registro.setFont(texto);
		
		etiqueta1.add(ir_a_registro);
		
		ir_a_registro.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				manager("registro");
			}});
		return fondo;
	}
	
	public JPanel registro() {
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		
		JPanel login = new JPanel();
		login.setLocation(0,0);
		login.setSize(1000, 700);
		login.setOpaque(true);
		login.setBackground(Color.black);
		login.setVisible(true);
		login.setLayout(null);
		
		
		
		JPanel etiqueta1 = new JPanel();
		etiqueta1.setSize(600, 600);
		etiqueta1.setLocation(50, 30);
		etiqueta1.setBackground(Color.decode("#2c8444"));
		etiqueta1.setVisible(true);
		etiqueta1.setOpaque(true);
		etiqueta1.setForeground(Color.decode("#bdc2bc")); 
		etiqueta1.setLayout(null);
		
		login.add(etiqueta1);
		
		JLabel titulo = new JLabel("Registro");
		
		titulo.setSize(500, 50);
		titulo.setLocation(50,40);
		titulo.setBackground(Color.decode("#2c8444"));
		titulo.setHorizontalAlignment(JLabel.CENTER); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(true);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(titulos);
		
		etiqueta1.add(titulo);

		JLabel nombre = new JLabel("Nombre de usuario:");
		
		nombre.setSize(500, 50);
		nombre.setLocation(20,100);
		nombre.setBackground(Color.decode("#2c8444"));
		nombre.setHorizontalAlignment(JLabel.LEFT); 
		nombre.setVerticalAlignment(JLabel.CENTER); 
		nombre.setVisible(true);
		nombre.setOpaque(true);
		nombre.setForeground(Color.WHITE);
		nombre.setFont(subtitulos);
		etiqueta1.add(nombre);
		
		JTextField nombreInp = new JTextField();
		
		nombreInp.setBounds(20, 150, 500, 40);
		nombreInp.setBackground(Color.white);
		nombreInp.setForeground(Color.black);
		nombreInp.setVisible(true);
		nombreInp.setOpaque(true);
		nombreInp.setFont(subtitulos);
		nombreInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(nombreInp);
		
		JLabel biografia = new JLabel("Biografía:");
		
		biografia.setSize(150, 50);
		biografia.setLocation(20,190);
		biografia.setBackground(Color.decode("#2c8444"));
		biografia.setHorizontalAlignment(JLabel.LEFT); 
		biografia.setVerticalAlignment(JLabel.CENTER); 
		biografia.setVisible(true);
		biografia.setOpaque(true);
		biografia.setForeground(Color.WHITE);
		biografia.setFont(subtitulos);
		etiqueta1.add(biografia);
		
		JTextField bioInp = new JTextField();
		
		bioInp.setBounds(20, 240, 380, 100);
		bioInp.setBackground(Color.white);
		bioInp.setForeground(Color.black);
		bioInp.setVisible(true);
		bioInp.setOpaque(true);
		bioInp.setFont(subtitulos);
		bioInp.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		etiqueta1.add(bioInp);
		
		JLabel lugar = new JLabel("Lugar:");
		
		lugar.setSize(150, 50);
		lugar.setLocation(410,190);
		lugar.setBackground(Color.decode("#2c8444"));
		lugar.setHorizontalAlignment(JLabel.LEFT); 
		lugar.setVerticalAlignment(JLabel.CENTER); 
		lugar.setVisible(true);
		lugar.setOpaque(true);
		lugar.setForeground(Color.WHITE);
		lugar.setFont(subtitulos);
		etiqueta1.add(lugar);
		
		String [] colonias_dataset = {"Pedregal","Centro","Villas del encanto","Diana Laura"};
		
		JComboBox lugarInp = new JComboBox(colonias_dataset);
		
		lugarInp.setSize(170, 30);
		lugarInp.setLocation(410,240);
		lugarInp.setBackground(Color.white);
		lugarInp.setVisible(true);
		lugarInp.setOpaque(true);
		lugarInp.setForeground(Color.black);
		lugarInp.setFont(texto);
		etiqueta1.add(lugarInp); 
		
		
		JLabel pref = new JLabel("Preferencias:");
		
		pref.setSize(500, 50);
		pref.setLocation(20,340);
		pref.setBackground(Color.decode("#2c8444"));
		pref.setHorizontalAlignment(JLabel.LEFT); 
		pref.setVerticalAlignment(JLabel.CENTER); 
		pref.setVisible(true);
		pref.setOpaque(true);
		pref.setForeground(Color.WHITE);
		pref.setFont(subtitulos);
		etiqueta1.add(pref);
		
		JCheckBox caja1 = new JCheckBox();
		
		caja1.setBounds(20, 390, 170, 30);
		caja1.setText("Dulce");
		caja1.setVisible(true);
		caja1.setOpaque(true);
		caja1.setBackground(Color.decode("#2c8444"));
		caja1.setForeground(Color.white);
		caja1.setFont(texto);
		etiqueta1.add(caja1);
		
		JCheckBox caja2 = new JCheckBox();
		
		caja2.setBounds(190, 390, 170, 30);
		caja2.setText("Salado");
		caja2.setVisible(true);
		caja2.setOpaque(true);
		caja2.setBackground(Color.decode("#2c8444"));
		caja2.setForeground(Color.white);
		caja2.setFont(texto);
		etiqueta1.add(caja2);
		
		JCheckBox caja3 = new JCheckBox();
		
		caja3.setBounds(360, 390, 170, 30);
		caja3.setText("Saludable");
		caja3.setVisible(true);
		caja3.setOpaque(true);
		caja3.setBackground(Color.decode("#2c8444"));
		caja3.setForeground(Color.white);
		caja3.setFont(texto);
		etiqueta1.add(caja3);
		
		
		
		JLabel terminos = new JLabel("Terminos:");
		
		terminos.setSize(500, 50);
		terminos.setLocation(20,420);
		terminos.setBackground(Color.decode("#2c8444"));
		terminos.setHorizontalAlignment(JLabel.LEFT); 
		terminos.setVerticalAlignment(JLabel.CENTER); 
		terminos.setVisible(true);
		terminos.setOpaque(true);
		terminos.setForeground(Color.WHITE);
		terminos.setFont(subtitulos);
		etiqueta1.add(terminos);
		
		ButtonGroup terminosCheck = new ButtonGroup();
		
		JRadioButton terms1 = new JRadioButton("Acepto los terminos", true);
		terms1.setBounds(20, 470, 170, 30);
		terms1.setBackground(Color.decode("#2c8444"));
		terms1.setFont(texto);
		terms1.setForeground(Color.WHITE);
		terms1.setBorderPainted(true);
		//terms1.setBorder(BorderFactory.createLineBorder(Color.red));
		etiqueta1.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("No acepto los terminos");
		terms2.setBounds(350, 470, 200, 30);
		terms2.setBackground(Color.decode("#2c8444"));
		terms2.setFont(texto);
		terms2.setForeground(Color.WHITE);
		terms2.setBorderPainted(true);
		//terms2.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		etiqueta1.add(terms2);
		
		terminosCheck.add(terms1);
		terminosCheck.add(terms2);
		
		
		
		JButton enter = new JButton();
		
		enter.setBounds(400, 532, 160, 40);
		enter.setText("Ingresar");
		enter.setVisible(true);
		enter.setOpaque(true);
		enter.setBackground(Color.decode("#216233"));
		enter.setForeground(Color.white);
		enter.setFont(subtitulos);
		etiqueta1.add(enter);
		this.setVisible(true);
		
		enter.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (nombreInp.getText().equals("")||bioInp.getText().equals("")) {
				    nombreInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				    bioInp.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				    JOptionPane.showMessageDialog(null, "Llene los espacios correspondientes", "Advertencia", JOptionPane.WARNING_MESSAGE);

				}
				else {
					nombreInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				    bioInp.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				}
				if(!terms1.isSelected()) {
					terms1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
					JOptionPane.showMessageDialog(null, "Acepte los terminos y condiciones",  "Advertencia",JOptionPane.WARNING_MESSAGE);
				}
				else {
					terms1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				}
			}});
		
		JButton ir_a_login = new JButton("<html><u>Iniciar sesión</u></html>");
		ir_a_login.setSize(200,50);
		ir_a_login.setLocation(25,500);
		ir_a_login.setBackground(null);
		ir_a_login.setVisible(true);
		ir_a_login.setOpaque(true);
		ir_a_login.setForeground(Color.black);
		ir_a_login.setBorderPainted(false);
		ir_a_login.setFont(texto);
		
		etiqueta1.add(ir_a_login);
		
		ir_a_login.addActionListener(new ActionListener() {

			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				manager("login");
			}});
		return login;
	}
	
	public void manager(String target) {
		this.getContentPane().removeAll();
		
		if(target.equals("login")) {
			this.add(login());
		}
		if(target.equals("registro")) {
			this.add(registro());
		}
		
		this.repaint();
		this.revalidate();
	}


	public JPanel usuarios() {
		
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		JPanel usuarios = new JPanel();
		usuarios.setLocation(250, 0);
		usuarios.setSize(900, 700);
		usuarios.setOpaque(true);
		usuarios.setBackground(Color.decode("#2c8444"));
		usuarios.setVisible(true);
		usuarios.setLayout(null);
		
		JLabel titulo = new JLabel("Usuarios");
		
		titulo.setSize(500, 50);
		titulo.setLocation(200,50);
		titulo.setBackground(Color.decode("#2c8444"));
		titulo.setHorizontalAlignment(JLabel.CENTER); 
		titulo.setVerticalAlignment(JLabel.CENTER); 
		titulo.setVisible(true);
		titulo.setOpaque(true);
		titulo.setForeground(Color.WHITE);
		titulo.setFont(titulos);
		usuarios.add(titulo);
		
		JLabel totalUsuarios = new JLabel("Total de usuarios:");
		
		totalUsuarios.setSize(400, 100);
		totalUsuarios.setLocation(20,150);
		totalUsuarios.setBackground(Color.decode("#2c8444"));
		totalUsuarios.setHorizontalAlignment(JLabel.LEFT); 
		totalUsuarios.setVerticalAlignment(JLabel.TOP); 
		totalUsuarios.setVisible(true);
		totalUsuarios.setOpaque(true);
		totalUsuarios.setForeground(Color.WHITE);
		totalUsuarios.setFont(titulos);
		usuarios.add(totalUsuarios);
		
		
		String[] columnNames = {
				"First name",
				"Last name",
				"Game",
				"Age",
				"Meat eater"
		};
		
		Object [][] data = {
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
				{"Katy", "Perez","Basquet","1998",true},
		};
		
		JTable tabla = new JTable(data,columnNames);
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setSize(800,200);
		scrollPane.setLocation(30,350);
		
		JButton exportar = new JButton();
		
		exportar.setBounds(500, 300, 160, 40);
		exportar.setText("Exportar");
		exportar.setVisible(true);
		exportar.setOpaque(true);
		exportar.setBackground(Color.decode("#216233"));
		exportar.setForeground(Color.white);
		exportar.setFont(subtitulos);
		usuarios.add(exportar);
		this.setVisible(true);
		
		JButton añadir = new JButton();
		
		añadir.setBounds(670, 300, 160, 40);
		añadir.setText("Añadir");
		añadir.setVisible(true);
		añadir.setOpaque(true);
		añadir.setBackground(Color.decode("#216233"));
		añadir.setForeground(Color.white);
		añadir.setFont(subtitulos);
		usuarios.add(añadir);
		this.setVisible(true);
		
		usuarios.add(scrollPane);
		this.setVisible(true);
		return usuarios;
		
		
	}
	
	
	
}

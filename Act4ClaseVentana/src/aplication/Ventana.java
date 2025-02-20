package aplication;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.font.TextAttribute;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	public Ventana(String title) {
		
		this.setTitle(title);
		
		this.setSize(1500,700);
		
		this.setResizable(true);
		this.setLayout(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//JPanel panelInicio = login();
        //this.add(panelInicio);
        
        //JPanel registro = registro();
        //this.add(registro);
        
        JPanel usuarios = usuarios();
        this.add(usuarios);
        
        this.setVisible(true);
		this.repaint();
		this.revalidate();
		
		
	}
	public JPanel login() {
		
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		
		JPanel login = new JPanel();
		login.setLocation(0, 0);
		login.setSize(750, 700);
		login.setOpaque(true);
		login.setBackground(Color.black);
		login.setVisible(true);
		login.setLayout(null);
		
		
		//this.add(login);
		//this.repaint();
		
		
		JPanel etiqueta1 = new JPanel();
		etiqueta1.setSize(600, 600);
		etiqueta1.setLocation(50, 30);
		etiqueta1.setBackground(Color.decode("#2c8444"));
		etiqueta1.setVisible(true);
		etiqueta1.setOpaque(true);
		etiqueta1.setForeground(Color.decode("#bdc2bc")); 
		etiqueta1.setLayout(null);
		
		login.add(etiqueta1);
		
		JLabel titulo = new JLabel("Inicio de sesión");
		
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
		nombre.setLocation(20,130);
		nombre.setBackground(Color.decode("#2c8444"));
		nombre.setHorizontalAlignment(JLabel.LEFT); 
		nombre.setVerticalAlignment(JLabel.CENTER); 
		nombre.setVisible(true);
		nombre.setOpaque(true);
		nombre.setForeground(Color.WHITE);
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
		
		contraseña.setSize(500, 50);
		contraseña.setLocation(20,260);
		contraseña.setBackground(Color.decode("#2c8444"));
		contraseña.setHorizontalAlignment(JLabel.LEFT); 
		contraseña.setVerticalAlignment(JLabel.CENTER); 
		contraseña.setVisible(true);
		contraseña.setOpaque(true);
		contraseña.setForeground(Color.WHITE);
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
		caja.setBackground(Color.decode("#2c8444"));
		caja.setForeground(Color.white);
		caja.setFont(texto);
		etiqueta1.add(caja);
		
		
		JButton contraOlvidada = new JButton();
		
		contraOlvidada.setBounds(280, 370, 260, 30);
		contraOlvidada.setText("<html><u>¿Olvidaste tu contraseña?</u></html>");
		contraOlvidada.setVisible(true);
		contraOlvidada.setOpaque(true);
		contraOlvidada.setBackground(Color.decode("#2c8444"));
		contraOlvidada.setForeground(Color.white);
		contraOlvidada.setBorderPainted(false);
		contraOlvidada.setFont(texto);
		etiqueta1.add(contraOlvidada);
		this.setVisible(true);
		
		
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
		
		return login;
	}
	public JPanel registro() {
		Font titulos = new Font("Inika", Font.BOLD, 32);
		Font subtitulos = new Font("Inika", Font.ROMAN_BASELINE, 22);
		Font texto = new Font("Inika", Font.ROMAN_BASELINE, 16);
		
		
		JPanel login = new JPanel();
		login.setLocation(750,0);
		login.setSize(1000, 700);
		login.setOpaque(true);
		login.setBackground(Color.black);
		login.setVisible(true);
		login.setLayout(null);
		
		
		//this.add(login);
		//this.repaint();
		
		
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
		/*lugar.setHorizontalAlignment(JLabel.LEFT); 
		lugar.setVerticalAlignment(JLabel.CENTER); */
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
		
		
		/*JButton contraOlvidada = new JButton();
		
		contraOlvidada.setBounds(280, 370, 260, 30);
		contraOlvidada.setText("<html><u>¿Olvidaste tu contraseña?</u></html>");
		contraOlvidada.setVisible(true);
		contraOlvidada.setOpaque(true);
		contraOlvidada.setBackground(Color.decode("#2c8444"));
		contraOlvidada.setForeground(Color.white);
		contraOlvidada.setBorderPainted(false);
		contraOlvidada.setFont(texto);
		etiqueta1.add(contraOlvidada);
		this.setVisible(true);*/
		
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
		terms1.setBorder(BorderFactory.createLineBorder(Color.red));
		etiqueta1.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("No acepto los terminos");
		terms2.setBounds(350, 470, 200, 30);
		terms2.setBackground(Color.decode("#2c8444"));
		terms2.setFont(texto);
		terms2.setForeground(Color.WHITE);
		terms2.setBorderPainted(true);
		terms2.setBorder(BorderFactory.createLineBorder(Color.red, 3));
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
		
		return login;
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

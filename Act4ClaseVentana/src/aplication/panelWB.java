package aplication;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;

public class panelWB extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panelWB frame = new panelWB();
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
	public panelWB() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Win11\\git\\Programacion\\Act4ClaseVentana\\pizzaPlanet.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 760);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro de usuarios");
		lblNewLabel.setFont(new Font("Magneto", Font.PLAIN, 40));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		
		JPanel panelFondo = new JPanel();
		panelFondo.setBackground(new Color(0, 128, 192));
		contentPane.add(panelFondo, BorderLayout.CENTER);
		GridBagLayout gbl_panelFondo = new GridBagLayout();
		gbl_panelFondo.columnWidths = new int[]{333, 333, 0};
		gbl_panelFondo.rowHeights = new int[]{339, 339, 0};
		gbl_panelFondo.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelFondo.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelFondo.setLayout(gbl_panelFondo);
		
		
		Border bordeInterno = BorderFactory.createTitledBorder("Datos generales");
		Border bordeExterno = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border bordeFinal = BorderFactory.createCompoundBorder(bordeInterno, bordeExterno);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(50, 141, 102));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(7, 7, 7, 7);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel_1.setBorder(bordeFinal);
		panel_1.setLayout(null);
		panelFondo.add(panel_1, gbc_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(74, 61, 62, 21);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(146, 63, 126, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Primer apellido:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(37, 92, 109, 21);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(146, 94, 126, 21);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(146, 125, 126, 21);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Segundo apellido:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(25, 125, 111, 21);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(10, 154, 121, 21);
		panel_1.add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setText("       --/--/--");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(146, 156, 98, 21);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sexo:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(37, 185, 62, 21);
		panel_1.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(50, 141, 102));
		rdbtnNewRadioButton.setBounds(116, 186, 71, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setForeground(new Color(255, 255, 255));
		rdbtnMujer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMujer.setBackground(new Color(50, 141, 102));
		rdbtnMujer.setBounds(116, 209, 71, 21);
		panel_1.add(rdbtnMujer);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nacionalidad:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(37, 245, 81, 21);
		panel_1.add(lblNewLabel_1_2);
		
		String [] paises_dataset = {"México","Nicaragua","Chile","Venezuela","Argentina", "Brasil"};
		JComboBox comboBox = new JComboBox(paises_dataset);
		comboBox.setBounds(128, 246, 116, 20);
		panel_1.add(comboBox);
		
		
		Border bordeInterno2 = BorderFactory.createTitledBorder("Perfil de usuario");
		Border bordeExterno2 = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border bordeFinal2 = BorderFactory.createCompoundBorder(bordeInterno2, bordeExterno2);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(234, 192, 49));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(7, 7, 7, 7);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panel_2.setBorder(bordeFinal2);
		panel_2.setLayout(null);
		panelFondo.add(panel_2, gbc_panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(109, 25, 100, 100);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Win11\\git\\Programacion\\Act4ClaseVentana\\ftPerfil (1).png"));
		panel_2.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(234, 192, 49));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(79, 180, 167, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrar = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxMostrar.setBackground(new Color(234, 192, 49));
		chckbxMostrar.setBounds(79, 242, 182, 21);
		panel_2.add(chckbxMostrar);
		
		Image usuarioImg= new ImageIcon("logo.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon usuarioIcon = new ImageIcon(usuarioImg);
		JLabel fotoPerfil = new JLabel(usuarioIcon);
		
		Border bordeInterno3 = BorderFactory.createTitledBorder("Datos personales");
		Border bordeExterno3 = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border bordeFinal3 = BorderFactory.createCompoundBorder(bordeInterno3, bordeExterno3);
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(84, 208, 218));
		panel_3.setBorder(bordeFinal3);
		panel_3.setLayout(null);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(7, 7, 7, 7);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panelFondo.add(panel_3, gbc_panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 163, 107);
		panel_3.add(scrollPane);
		
		JTextArea txtrLoremIpsumDolor = new JTextArea();
		txtrLoremIpsumDolor.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor \r\nincididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud \r\nexercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure \r\ndolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \r\nExcepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit \r\nanim id est laborum.");
		scrollPane.setViewportView(txtrLoremIpsumDolor);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(190, 109, 105, 107);
		panel_3.add(scrollPane_1);
		
		String [] hobbies = {"Leer","Musica","Deportes","Peliculas","Correr","Videojuegos","Otros"};
		JList list = new JList(hobbies);
		scrollPane_1.setViewportView(list);
		
		JLabel lblNewLabel_4 = new JLabel("Descripción personal");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 84, 121, 15);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Pasatiempos");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(190, 84, 105, 15);
		panel_3.add(lblNewLabel_4_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(243, 41, 188));
		panel_4.setLayout(null);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(7, 7, 7, 7);
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 1;
		panelFondo.add(panel_4, gbc_panel_4);
		
		JButton btnNewButton = new JButton("NUEVO");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(101, 34, 121, 47);
		panel_4.add(btnNewButton);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGuardar.setBackground(new Color(128, 0, 128));
		btnGuardar.setBounds(101, 128, 121, 47);
		panel_4.add(btnGuardar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBackground(new Color(128, 0, 128));
		btnSalir.setBounds(101, 224, 121, 47);
		panel_4.add(btnSalir);
	}
}

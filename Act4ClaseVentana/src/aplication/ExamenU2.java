package aplication;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ExamenU2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamenU2 frame = new ExamenU2();
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
	public ExamenU2() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//--------------------------------------------------------------------------------------------------
		JPanel header = new JPanel();
		header.setBackground(Color.decode("#3d6a94"));
		header.setBounds(0, 0, 500, 100);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en java - Eclipse - ArrayList y POO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(29, 22, 425, 37);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[sin base de datos]");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(29, 57, 140, 20);
		header.add(lblNewLabel_1);
		//--------------------------------------------------------------------------------------------------
		Border bordeInterno = BorderFactory.createTitledBorder("Datos del Cliente");
		Border bordeExterno = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border bordeFinal = BorderFactory.createCompoundBorder(bordeInterno, bordeExterno);
		JPanel datosDelCliente = new JPanel();
		datosDelCliente.setBounds(5, 100, 475, 100);
		datosDelCliente.setBorder(bordeFinal);
		contentPane.add(datosDelCliente);
		datosDelCliente.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 24, 86, 20);
		datosDelCliente.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Dirección:");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 54, 86, 20);
		datosDelCliente.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombres:");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(215, 24, 86, 20);
		datosDelCliente.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Teléfono:");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(215, 54, 86, 20);
		datosDelCliente.add(lblNewLabel_2_3);
		
		textField = new JTextField("12345");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setBounds(91, 26, 96, 20);
		datosDelCliente.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("John Nothing");
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(285, 26, 96, 20);
		datosDelCliente.add(textField_1);
		
		textField_2 = new JTextField("Calle ***");
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(91, 56, 96, 20);
		datosDelCliente.add(textField_2);
		
		textField_3 = new JTextField("612 1111111");
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(285, 56, 96, 20);
		datosDelCliente.add(textField_3);
		
		//--------------------------------------------------------------------------------------------------
		Border bordeInterno1 = BorderFactory.createTitledBorder("Datos de Factura");
		Border bordeExterno1 = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border bordeFinal1 = BorderFactory.createCompoundBorder(bordeInterno1, bordeExterno1);
		JPanel datosDeFactura = new JPanel();
		datosDeFactura.setBounds(5, 200, 475, 100);
		datosDeFactura.setBorder(bordeFinal1);
		contentPane.add(datosDeFactura);
		datosDeFactura.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("No. de Factura:");
		lblNewLabel_3.setBounds(10, 46, 118, 20);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		datosDeFactura.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("1");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(138, 46, 48, 20);
		datosDeFactura.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Fecha:");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(210, 46, 74, 20);
		datosDeFactura.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("2025/01/01");
		lblNewLabel_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1_1.setBounds(294, 46, 104, 20);
		datosDeFactura.add(lblNewLabel_3_1_1);
		
		
		
		//--------------------------------------------------------------------------------------------------
		Border bordeInterno2 = BorderFactory.createTitledBorder("Listado de Facturas");
		Border bordeExterno2 = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		Border bordeFinal2 = BorderFactory.createCompoundBorder(bordeInterno2, bordeExterno2);
		JPanel listadoFacturas = new JPanel();
		listadoFacturas.setBounds(5, 300, 475, 200);
		listadoFacturas.setBorder(bordeFinal2);
		contentPane.add(listadoFacturas);
		
		
		
		String[] columnNames = {
				"Producto ",
				"Cantidad ",
				"Valor ",
				"Sub Total "
		};
		
		Object [][] data = {
				
				{"Agua", "3","17","58"},
				{"Cereal", "6","56","336"},
				{"Leche", "8","22","176"},
				{"Agua", "3","17","58"}
		};
		table = new JTable(data,columnNames);
		listadoFacturas.setLayout(null);
		JScrollPane scrollPane_1 = new JScrollPane(table);
		scrollPane_1.setBounds(10, 78, 450, 100);
		listadoFacturas.add(scrollPane_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Ver listado de facturas");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3_3.setBounds(50, 27, 118, 20);
		listadoFacturas.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Win11\\git\\Programacion\\Act4ClaseVentana\\mas.png"));
		lblNewLabel_4.setBounds(222, 27, 30, 30); // Ajusta el tamaño según la imagen
		//lblNewLabel_4.setBounds(9, 31, 33, 32);
		listadoFacturas.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel();
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\Win11\\git\\Programacion\\Act4ClaseVentana\\cerrar (1).png"));
		lblNewLabel_4_1.setBounds(332, 27, 30, 30);
		listadoFacturas.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel();
		lblNewLabel_4_2.setIcon(new ImageIcon("C:\\Users\\Win11\\git\\Programacion\\Act4ClaseVentana\\lista (1).png"));
		lblNewLabel_4_2.setBounds(10, 27, 30, 30);
		listadoFacturas.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Añadir");
		lblNewLabel_3_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3_3_1.setBounds(254, 31, 68, 20);
		listadoFacturas.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("Cerrar");
		lblNewLabel_3_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_3_3_1_1.setBounds(372, 31, 68, 20);
		listadoFacturas.add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Subtotal: ");
		lblNewLabel_3_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3_2_1.setBounds(10, 520, 74, 20);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("6600.00");
		lblNewLabel_3_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1_1_1.setBounds(115, 520, 74, 20);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("% descuento: ");
		lblNewLabel_3_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1.setBounds(10, 546, 96, 20);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		textField_4 = new JTextField("5%");
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(115, 546, 61, 20);
		contentPane.add(textField_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(182, 546, 26, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("IVA %19:");
		lblNewLabel_3_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1_1.setBounds(10, 576, 96, 20);
		contentPane.add(lblNewLabel_3_2_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_2 = new JLabel("Total factura:");
		lblNewLabel_3_2_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1_2.setBounds(10, 604, 119, 20);
		contentPane.add(lblNewLabel_3_2_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("6600.00");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1_1_1_1.setBounds(115, 576, 74, 20);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("6600.00");
		lblNewLabel_3_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1_1_1_2.setBounds(115, 604, 74, 20);
		contentPane.add(lblNewLabel_3_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_2_1 = new JLabel("Total descuento:");
		lblNewLabel_3_2_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1_2_1.setBounds(226, 546, 119, 20);
		contentPane.add(lblNewLabel_3_2_1_1_2_1);
		
		JLabel lblNewLabel_3_1_1_1_3 = new JLabel("6600.00");
		lblNewLabel_3_1_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3_1_1_1_3.setBounds(333, 546, 74, 20);
		contentPane.add(lblNewLabel_3_1_1_1_3);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(304, 605, 138, 32);
		contentPane.add(btnNewButton);
		
		listadoFacturas.revalidate();
		listadoFacturas.repaint();
		/*JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(5,300,100,100);*/
	}
}

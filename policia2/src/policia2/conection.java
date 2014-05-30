package policia2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class conection extends JFrame {
	Connection conexion = null; //maneja la conexión
	Statement instruccion = null;// instrucción de consulta
	private JPanel contentPane;
	private JTextField Dni;
	private JTextField Nombre;
	private JTextField Edad;
	private JTextField Altura;
	private JTextField Crimen;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conection frame = new conection();
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
	public conection() {
		getContentPane().setLayout(null);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(10, 23, 46, 14);
		getContentPane().add(lblDni);
		
		Dni = new JTextField();
		Dni.setBounds(66, 20, 86, 20);
		getContentPane().add(Dni);
		Dni.setColumns(10);
		
		Nombre = new JTextField();
		Nombre.setBounds(66, 63, 86, 20);
		getContentPane().add(Nombre);
		Nombre.setColumns(10);
		
		Edad = new JTextField();
		Edad.setBounds(66, 105, 86, 20);
		getContentPane().add(Edad);
		Edad.setColumns(10);
		
		Altura = new JTextField();
		Altura.setBounds(66, 151, 86, 20);
		getContentPane().add(Altura);
		Altura.setColumns(10);
		
		Crimen = new JTextField();
		Crimen.setBounds(66, 194, 86, 20);
		getContentPane().add(Crimen);
		Crimen.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 66, 46, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 108, 46, 14);
		getContentPane().add(lblEdad);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 154, 46, 14);
		getContentPane().add(lblAltura);
		
		JLabel lblCrimen = new JLabel("Crimen");
		lblCrimen.setBounds(10, 197, 46, 14);
		getContentPane().add(lblCrimen);
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Class.forName("com.mysql.jdbc.Driver");
			// establece la conexión a la base de datos
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/fichapolicia","root","");
			// crea objeto Statement para consultar la base de datos
			instruccion = (Statement) conexion.createStatement();
			// insercion en base de datos
			String Instrucction="INSERT INTO policia  (Dni,Nombre,Edad,Crimen,Altura) VALUES("+Dni'+"','+Nombre+2,");
			instruccion.executeUpdate
			catch( SQLException excepcionSql ){
			excepcionSql.printStackTrace();
		}// fin de catch
			catch( ClassNotFoundException noEncontroClase )
			{
				noEncontroClase.printStackTrace();
			}// fin de catch
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton Limpiar = new JButton("Limpiar");
		Limpiar.setBounds(10, 49, 158, 136);
		contentPane.add(Limpiar);
		
		JButton Enviar = new JButton("Enviar");
		Enviar.setBounds(264, 49, 145, 136);
		contentPane.add(Enviar);
		
	}
}




import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class fichapolicia extends JFrame {

	//Elementos de la pantalla
	Connection conexion = null; //maneja la conexión
	Statement instruccion = null;// instrucción de consulta
	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Edad;
	private JTextField Altura;
	private JTextField Crimen;
	private JOptionPane error;
	private delincuente delin;
	
	//ComboBox para guardar delincuentes
	private JComboBox<delincuente> delincuentes;

	//Lanza la aplicación
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fichapolicia frame = new fichapolicia();
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
	public fichapolicia() {
		//try{
		//	Class.forName("com.mysql.jdbc.Driver");
			
			//Class.forName("com.mysql.jdbc.Driver");
			// establece la conexión a la base de datos
			//conexion = DriverManager.getConnection("jdbc:mysql://localhost/fichapolicia","root","");
			// crea objeto Statement para consultar la base de datos
			//instruccion = (Statement) conexion.createStatement();
			// insercion en base de datos
			//String Instrucction="INSERT INTO policia  (Dni,Nombre,Edad,Crimen,Altura) VALUES("+Nombre+"','"+Edad+"','"+Crimen+"','"+Altura+")";
			//instruccion.executeUpdate
			//catch( SQLException excepcionSql ){
			//excepcionSql.printStackTrace();
		//}// fin de catch
			//catch( ClassNotFoundException noEncontroClase )
			//{
			//	noEncontroClase.printStackTrace();
//			}// fin de catch

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		delincuentes = new JComboBox<delincuente>();

		delincuentes.setBounds(10, 49, 414, 20);
		contentPane.add(delincuentes);

		JLabel lblNombreDelicuente = new JLabel("Ficha");
		lblNombreDelicuente.setBounds(10, 25, 308, 14);
		contentPane.add(lblNombreDelicuente);

		JLabel lblApellidosNombre = new JLabel("Apellidos, Nombre");
		lblApellidosNombre.setBounds(10, 80, 158, 14);
		contentPane.add(lblApellidosNombre);

		Nombre = new JTextField();
		Nombre.setBounds(10, 105, 414, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 136, 88, 14);
		contentPane.add(lblEdad);

		Edad = new JTextField();
		Edad.setColumns(10);
		Edad.setBounds(10, 161, 88, 20);
		contentPane.add(Edad);

		JLabel lblAltura = new JLabel("Altura (cm)");
		lblAltura.setBounds(10, 197, 88, 14);
		contentPane.add(lblAltura);

		Altura = new JTextField();
		Altura.setColumns(10);
		Altura.setBounds(10, 222, 88, 20);
		contentPane.add(Altura);

		JLabel lblCrimen = new JLabel("Crimen");
		lblCrimen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCrimen.setBounds(336, 136, 88, 14);
		contentPane.add(lblCrimen);


		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aquí realizaremos los siguientes pasos
				//1.- Comprobaremos que todos los campos están completados
				if ( Nombre.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else if ( Edad.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else if ( Altura.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else if ( Crimen.getText().equals("")){
					JOptionPane.showMessageDialog(null,"campo vacio");
				}

				else{
				//2.- Crearemos un nuevo objeto delincuente
				//delin=new delincuente();
				delincuente delin=new delincuente();
				
				delin.guardaNombre(Nombre.getText());
				delin.guardaraltura(Integer.parseInt(Altura.getText()));
				delin.guardarcrimen(Crimen.getText());
				delin.guardarEdad(Integer.parseInt(Edad.getText()));

				//3.- Lo almacenaremos en el ComboBox
				delincuentes.addItem(delin);
				}
			}
		});
		botonGuardar.setBounds(10, 272, 89, 23);
		contentPane.add(botonGuardar);

		Crimen = new JTextField();
		Crimen.setBounds(148, 161, 276, 20);
		contentPane.add(Crimen);
		Crimen.setColumns(10);
		
		JButton Modificar = new JButton("Modificar");
		Modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			delincuentes.getItemAt(delincuentes.getSelectedIndex());
			
			delin.guardaNombre(Nombre.getText());
			delin.guardaraltura(Integer.parseInt(Altura.getText()));
			delin.guardarcrimen(Crimen.getText());
			delin.guardarEdad(Integer.parseInt(Edad.getText()));
			
			
		}
		});
		Modificar.setBounds(136, 272, 89, 23);
		contentPane.add(Modificar);
		JButton Borrar = new JButton("Borrar");
		Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			delincuentes.removeItem(delincuentes.getItemAt(delincuentes.getSelectedIndex()));
			}
		});
		Borrar.setBounds(273, 272, 89, 23);
		contentPane.add(Borrar);
		
		
		
		delincuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delin=delincuentes.getItemAt(delincuentes.getSelectedIndex());
				
				Nombre.setText(String.valueOf(delin.cogerNombre()));
				Edad.setText(String.valueOf(delin.cogeredad()));
				Altura.setText(String.valueOf(delin.cogeraltura()));
				Crimen.setText(String.valueOf(delin.cogercrimen()));
			}
		});		
	}
}
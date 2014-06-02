package proyecto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaLiga extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLiga frame = new VentanaLiga();
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
	public VentanaLiga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de Liga");
		lblNewLabel.setBounds(21, 48, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Equipo a modificar");
		lblNewLabel_1.setBounds(21, 121, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(21, 73, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 146, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(18, 199, 89, 23);
		contentPane.add(btnModificar);
		
		JLabel lblNumeroEquipos = new JLabel("Numero Equipos");
		lblNumeroEquipos.setBounds(240, 48, 97, 14);
		contentPane.add(lblNumeroEquipos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 73, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}

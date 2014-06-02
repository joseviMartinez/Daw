package proyecto2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaEquipo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEquipo frame = new VentanaEquipo();
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
	public VentanaEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreEquipo = new JLabel("Nombre Equipo");
		lblNombreEquipo.setBounds(29, 11, 88, 14);
		contentPane.add(lblNombreEquipo);
		
		textField = new JTextField();
		textField.setBounds(132, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGolesAFavor = new JLabel("Goles a favor");
		lblGolesAFavor.setBounds(30, 50, 87, 14);
		contentPane.add(lblGolesAFavor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 47, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGolesEnContra = new JLabel("Goles en contra");
		lblGolesEnContra.setBounds(29, 79, 75, 14);
		contentPane.add(lblGolesEnContra);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 78, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPartidosGanados = new JLabel("Partidos Ganados");
		lblPartidosGanados.setBounds(29, 104, 88, 14);
		contentPane.add(lblPartidosGanados);
		
		textField_3 = new JTextField();
		textField_3.setBounds(132, 109, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPartidosPerdidos = new JLabel("Partidos Perdidos");
		lblPartidosPerdidos.setBounds(29, 140, 88, 14);
		contentPane.add(lblPartidosPerdidos);
		
		textField_4 = new JTextField();
		textField_4.setBounds(132, 137, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnMostarJugador = new JButton("Mostar Jugador");
		btnMostarJugador.setBounds(29, 176, 137, 23);
		contentPane.add(btnMostarJugador);
		
		textField_5 = new JTextField();
		textField_5.setBounds(171, 177, 32, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPosicionJugador = new JLabel("Posicion Jugador");
		lblPosicionJugador.setBounds(213, 180, 88, 14);
		contentPane.add(lblPosicionJugador);
		
		JButton btnModificarJugador = new JButton("Modificar Jugador");
		btnModificarJugador.setBounds(297, 176, 127, 23);
		contentPane.add(btnModificarJugador);
		
		JLabel lblN = new JLabel("N");
		lblN.setBounds(172, 208, 46, 14);
		contentPane.add(lblN);
	}
}

package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 22, 66, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(193, 27, 63, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo:");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 65, 66, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_3.setBounds(193, 63, 83, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DNI:");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 12));
		lblNewLabel_4.setBounds(374, 22, 44, 23);
		contentPane.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(86, 24, 96, 18);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(266, 24, 96, 18);
		contentPane.add(txtApellido);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(87, 66, 96, 18);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(266, 67, 96, 18);
		contentPane.add(txtTelefono);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(404, 24, 96, 18);
		contentPane.add(txtDNI);
		
		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdicionar.setBounds(10, 96, 126, 20);
		contentPane.add(btnAdicionar);
		
		JButton btnReportar = new JButton("REPORTAR");
		btnReportar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReportar.setBounds(183, 96, 126, 20);
		contentPane.add(btnReportar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEliminar.setBounds(361, 97, 126, 20);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 144, 503, 225);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);

	}
}

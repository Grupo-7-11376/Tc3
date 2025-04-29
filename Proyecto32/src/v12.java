import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtInventario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v12 frame = new v12();
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
	public v12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 219, 123));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 132, 416, 121);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		lblNewLabel.setBounds(10, 10, 64, 30);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(71, 12, 124, 21);
		contentPane.add(comboBox_1);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProcesar.setBounds(216, 12, 85, 21);
		contentPane.add(btnProcesar);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad a comprar");
		lblNewLabel_1.setBounds(10, 70, 106, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modificar inventario");
		lblNewLabel_2.setBounds(10, 109, 106, 13);
		contentPane.add(lblNewLabel_2);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(110, 67, 96, 19);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtInventario = new JTextField();
		txtInventario.setBounds(110, 103, 96, 19);
		contentPane.add(txtInventario);
		txtInventario.setColumns(10);
		
		JButton btncomprado = new JButton("Comprado");
		btncomprado.setBounds(216, 66, 85, 21);
		contentPane.add(btncomprado);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(216, 97, 85, 21);
		contentPane.add(btnAgregar);
		
		JButton btnDisminuir = new JButton("Disminuir");
		btnDisminuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDisminuir.setBounds(313, 97, 85, 21);
		contentPane.add(btnDisminuir);
	}
}

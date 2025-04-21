package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel TxtCodigo;
	private JComboBox comboBox;
	private JButton btnBuscar;
	private JScrollPane scrollPane;
	private JComboBox comboBox_1;
	private JTextField txtCantidad;
	private JTextField txtInventario;
	private JButton btncomprado;
	private JButton btnAgregar;
	private JButton BtnDisminuir;
	private JButton BtnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 227, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			TxtCodigo = new JLabel("Codigo");
			TxtCodigo.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			TxtCodigo.setBounds(10, 61, 82, 25);
			contentPane.add(TxtCodigo);
		}
		{
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"0101", "0202", "0303"}));
			comboBox.setBounds(90, 52, 116, 34);
			contentPane.add(comboBox);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.setBackground(new Color(173, 216, 230));
			btnBuscar.addActionListener(this);
			btnBuscar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			btnBuscar.setBounds(235, 50, 116, 34);
			contentPane.add(btnBuscar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 332, 579, 170);
			contentPane.add(scrollPane);
			{
				comboBox_1 = new JComboBox();
				comboBox_1.setFont(new Font("Javanese Text", Font.PLAIN, 10));
				scrollPane.setViewportView(comboBox_1);
			}
		}
		
		JLabel lblCantidadAComprar = new JLabel("Cantidad a comprar");
		lblCantidadAComprar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCantidadAComprar.setBounds(10, 219, 138, 25);
		contentPane.add(lblCantidadAComprar);
		
		JLabel lblModificarInv = new JLabel("Modificar Inventario");
		lblModificarInv.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblModificarInv.setBounds(10, 270, 156, 25);
		contentPane.add(lblModificarInv);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(176, 212, 156, 34);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtInventario = new JTextField();
		txtInventario.setBounds(176, 263, 156, 34);
		contentPane.add(txtInventario);
		txtInventario.setColumns(10);
		{
			btncomprado = new JButton("COMPRADO");
			btncomprado.addActionListener(this);
			btncomprado.setBackground(new Color(255, 192, 203));
			btncomprado.setBounds(342, 212, 116, 34);
			contentPane.add(btncomprado);
		}
		{
			btnAgregar = new JButton("AGREGAR");
			btnAgregar.addActionListener(this);
			btnAgregar.setBackground(new Color(255, 192, 203));
			btnAgregar.setBounds(468, 212, 116, 34);
			contentPane.add(btnAgregar);
		}
		{
			BtnDisminuir = new JButton("DISMINUIR");
			BtnDisminuir.addActionListener(this);
			BtnDisminuir.setBackground(new Color(255, 192, 203));
			BtnDisminuir.setBounds(468, 261, 116, 34);
			contentPane.add(BtnDisminuir);
		}
		{
			BtnListar = new JButton("LISTAR");
			BtnListar.addActionListener(this);
			BtnListar.setBackground(new Color(255, 192, 203));
			BtnListar.setBounds(342, 261, 116, 34);
			contentPane.add(BtnListar);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnDisminuir) {
			do_btnDisminuir_actionPerformed(e);
		}
		if (e.getSource() == BtnListar) {
			do_btnListar_actionPerformed(e);
		}
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == btncomprado) {
			do_btncomprado_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		
	}
	protected void do_btncomprado_actionPerformed(ActionEvent e) {
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
	}
	protected void do_btnListar_actionPerformed(ActionEvent e) {
	}
	protected void do_btnDisminuir_actionPerformed(ActionEvent e) {
	}
}

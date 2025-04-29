package MenuPri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class VentanaVenta extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton BtnRegresar;
	private JLabel lblCodigoDelPeluche;
	private JLabel lblCantidad;
	private JTextField TxtCantidad;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblMetodoDePago;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFactura;
	private JRadioButton rdbtnEfectivo;
	private JRadioButton rdbtnTarjeta;
	private JLabel lblTipo;
	private JLabel lblPrecio;
	private JTextField TxtPrecio;
	private JButton BtnAñadir;
	private JButton BtnCalcular;
	private JButton BtnComprado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVenta frame = new VentanaVenta();
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
	public VentanaVenta() {
		setTitle("Venta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			BtnRegresar = new JButton("Regresar");
			BtnRegresar.addActionListener(this);
			BtnRegresar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnRegresar.setBounds(10, 349, 109, 39);
			contentPane.add(BtnRegresar);
		}
		{
			lblCodigoDelPeluche = new JLabel("Codigo del peluche");
			lblCodigoDelPeluche.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCodigoDelPeluche.setBounds(10, 18, 151, 26);
			contentPane.add(lblCodigoDelPeluche);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCantidad.setBounds(10, 75, 151, 26);
			contentPane.add(lblCantidad);
		}
		{
			TxtCantidad = new JTextField();
			TxtCantidad.setColumns(10);
			TxtCantidad.setBounds(194, 75, 158, 31);
			contentPane.add(TxtCantidad);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300", "310", "320", "330", "340", "350", "360", "370", "380", "390", "400", "410", "420", "430", "440", "450", "460", "470", "480", "490", "500", "510", "520", "530", "540", "550", "560", "570", "580", "590"}));
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
			comboBox.setBounds(194, 15, 158, 32);
			contentPane.add(comboBox);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(485, 18, 189, 327);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			lblMetodoDePago = new JLabel("Metodo De Pago");
			lblMetodoDePago.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblMetodoDePago.setBounds(10, 187, 151, 26);
			contentPane.add(lblMetodoDePago);
		}
		{
			rdbtnNewRadioButton = new JRadioButton("Boleta");
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			rdbtnNewRadioButton.setBounds(194, 234, 109, 23);
			contentPane.add(rdbtnNewRadioButton);
		}
		{
			rdbtnFactura = new JRadioButton("Factura");
			rdbtnFactura.setFont(new Font("Tahoma", Font.PLAIN, 16));
			rdbtnFactura.setBounds(305, 234, 109, 23);
			contentPane.add(rdbtnFactura);
		}
		{
			rdbtnEfectivo = new JRadioButton("Efectivo");
			rdbtnEfectivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			rdbtnEfectivo.setBounds(194, 191, 109, 23);
			contentPane.add(rdbtnEfectivo);
		}
		{
			rdbtnTarjeta = new JRadioButton("Tarjeta");
			rdbtnTarjeta.setFont(new Font("Tahoma", Font.PLAIN, 16));
			rdbtnTarjeta.setBounds(305, 191, 109, 23);
			contentPane.add(rdbtnTarjeta);
		}
		{
			lblTipo = new JLabel("Tipo");
			lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblTipo.setBounds(10, 230, 126, 26);
			contentPane.add(lblTipo);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblPrecio.setBounds(10, 131, 151, 26);
			contentPane.add(lblPrecio);
		}
		{
			TxtPrecio = new JTextField();
			TxtPrecio.setColumns(10);
			TxtPrecio.setBounds(194, 131, 158, 31);
			contentPane.add(TxtPrecio);
		}
		{
			BtnAñadir = new JButton("Añadir");
			BtnAñadir.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnAñadir.setBounds(10, 299, 109, 39);
			contentPane.add(BtnAñadir);
		}
		{
			BtnCalcular = new JButton("Calcular");
			BtnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnCalcular.setBounds(153, 299, 109, 39);
			contentPane.add(BtnCalcular);
		}
		{
			BtnComprado = new JButton("Comprado");
			BtnComprado.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnComprado.setBounds(290, 299, 109, 39);
			contentPane.add(BtnComprado);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnRegresar) {
			do_btnRegresar_actionPerformed(e);
		}
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent e) {
	
		VentanaMenu newframe = new VentanaMenu();
		newframe.setVisible(true);
		this.dispose();
	}
}

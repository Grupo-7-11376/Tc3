package MenuPri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Inventario extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton BtnRegresar;
	private JLabel LblCodigoDelPeluche;
	private JButton BtnListar;
	private JComboBox comboBox;
	private JLabel lblEmpresa;
	private JLabel lblCantidad;
	private JButton BtnAgregar;
	private JButton BtnEliminar;
	private JTextField TxtCantidad;
	private JComboBox comboBox_1;
	private JScrollPane scrollPane;
	private JTextArea TxtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
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
	public Inventario() {
		setTitle("Inventario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			BtnRegresar = new JButton("Regresar");
			BtnRegresar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnRegresar.addActionListener(this);
			BtnRegresar.setBounds(10, 318, 109, 39);
			contentPane.add(BtnRegresar);
		}
		{
			LblCodigoDelPeluche = new JLabel("Codigo del peluche");
			LblCodigoDelPeluche.setFont(new Font("Tahoma", Font.PLAIN, 16));
			LblCodigoDelPeluche.setBounds(10, 11, 151, 26);
			contentPane.add(LblCodigoDelPeluche);
		}
		{
			BtnListar = new JButton("Listar");
			BtnListar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnListar.setBounds(314, 208, 109, 39);
			contentPane.add(BtnListar);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300", "310", "320", "330", "340", "350", "360", "370", "380", "390", "400", "410", "420", "430", "440", "450", "460", "470", "480", "490", "500", "510", "520", "530", "540", "550", "560", "570", "580", "590"}));
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
			comboBox.setBounds(183, 11, 158, 32);
			contentPane.add(comboBox);
		}
		{
			lblEmpresa = new JLabel("Empresa");
			lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEmpresa.setBounds(10, 112, 151, 26);
			contentPane.add(lblEmpresa);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCantidad.setBounds(10, 63, 151, 26);
			contentPane.add(lblCantidad);
		}
		{
			BtnAgregar = new JButton("Agregar");
			BtnAgregar.addActionListener(this);
			BtnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnAgregar.setBounds(29, 208, 109, 39);
			contentPane.add(BtnAgregar);
		}
		{
			BtnEliminar = new JButton("Eliminar");
			BtnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnEliminar.setBounds(168, 208, 109, 39);
			contentPane.add(BtnEliminar);
		}
		{
			TxtCantidad = new JTextField();
			TxtCantidad.setBounds(183, 63, 158, 31);
			contentPane.add(TxtCantidad);
			TxtCantidad.setColumns(10);
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BuildABear", "PokemonCenter", "Disney", "Nintendo", "MiPeluche", "Sanrio", "Peluche Creation", "DePeluche", "Huellitas y Apapachos"}));
			comboBox_1.setBounds(183, 111, 158, 32);
			contentPane.add(comboBox_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(498, 11, 161, 346);
			contentPane.add(scrollPane);
			{
				TxtS = new JTextArea();
				scrollPane.setViewportView(TxtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == BtnRegresar) {
			do_btnRegresar_actionPerformed(e);
		}
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent e) {
	
		VentanaMenu newframe = new VentanaMenu();
		newframe.setVisible(true);
		this.dispose();
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
	
		try {
			 int cantidad = Integer.parseInt(TxtCantidad.getText());
			 if (cantidad < 0) {
		            JOptionPane.showMessageDialog(null, "Ingrese un número positivo");
		        } else {
		            
		        }
		}catch(Exception e2) {
			JOptionPane.showMessageDialog(null, "Ingrese numero valido");
		}
	}
}

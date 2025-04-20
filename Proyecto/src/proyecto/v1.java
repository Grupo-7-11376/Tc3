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
			TxtCodigo.setBounds(10, 55, 82, 25);
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
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		
	}
}

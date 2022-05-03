package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JdVentas extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8984852498326091462L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cmbProducto;
	private JLabel lblProducto;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtAreaResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdVentas dialog = new JdVentas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdVentas() {
		setTitle("Ventas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 15, 65, 14);
		contentPanel.add(lblProducto);
		
		JLabel lblPrecio = new JLabel("Precio (S/):");
		lblPrecio.setBounds(10, 40, 65, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(10, 65, 65, 14);
		contentPanel.add(lblCantidad);
		
	     cmbProducto = new JComboBox();
		cmbProducto.setBounds(85, 11, 185, 22);
		contentPanel.add(cmbProducto);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(85, 37, 185, 20);
		contentPanel.add(txtPrecio);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(85, 62, 185, 20);
		contentPanel.add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(335, 11, 89, 23);
		contentPanel.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 40, 89, 23);
		contentPanel.add(btnCerrar);
		
		JScrollPane scpScroll = new JScrollPane();
		scpScroll.setBounds(10, 90, 414, 164);
		contentPanel.add(scpScroll);
		
		txtAreaResultado = new JTextArea();
		scpScroll.setViewportView(txtAreaResultado);
	}
}

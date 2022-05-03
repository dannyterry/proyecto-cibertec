package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JdAlmacen extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3892336101646689978L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtStockActual;
	private JTextField txtNuevoStock;
	private JLabel lblProducto;
	private JLabel lblStockActual;
	private JLabel lblNuevoStock;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JButton btnAgregar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdAlmacen dialog = new JdAlmacen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdAlmacen() {
		setTitle("Almacen");
		setBounds(100, 100, 450, 140);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 11, 76, 14);
		contentPanel.add(lblProducto);
		
		lblStockActual = new JLabel("Stock Actual:");
		lblStockActual.setBounds(10, 43, 76, 14);
		contentPanel.add(lblStockActual);
		
		lblNuevoStock = new JLabel("Nuevo Stock:");
		lblNuevoStock.setBounds(10, 74, 76, 14);
		contentPanel.add(lblNuevoStock);
		
		JComboBox cmbProducto = new JComboBox();
		cmbProducto.setBounds(96, 7, 170, 22);
		contentPanel.add(cmbProducto);
		
		txtStockActual = new JTextField();
		txtStockActual.setEnabled(false);
		txtStockActual.setBounds(96, 40, 170, 20);
		contentPanel.add(txtStockActual);
		txtStockActual.setColumns(10);
		
		txtNuevoStock = new JTextField();
		txtNuevoStock.setBounds(96, 71, 170, 20);
		contentPanel.add(txtNuevoStock);
		txtNuevoStock.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(335, 7, 89, 23);
		contentPanel.add(btnAgregar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(335, 39, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(335, 70, 89, 23);
		contentPanel.add(btnCancelar);
	}
}

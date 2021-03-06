package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JdClientes extends JDialog {

	private final JPanel PanelCliente = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdClientes dialog = new JdClientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdClientes() {
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(new BorderLayout());
		PanelCliente.setLayout(new FlowLayout());
		PanelCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(PanelCliente, BorderLayout.CENTER);
	}

}

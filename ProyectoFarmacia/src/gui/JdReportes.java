package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JdReportes extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6077794790250683692L;
	private final JPanel contentPanel = new JPanel();
	private JScrollPane scpScroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdReportes dialog = new JdReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdReportes() {
		setTitle("Reportes");
		setBounds(100, 100, 450, 590);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnNewButton = new JButton("Listar");
			btnNewButton.setBounds(172, 11, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			scpScroll = new JScrollPane();
			scpScroll.setBounds(10, 45, 414, 495);
			contentPanel.add(scpScroll);
			{
				JTextArea textArea = new JTextArea();
				scpScroll.setViewportView(textArea);
			}
		}
	}

}

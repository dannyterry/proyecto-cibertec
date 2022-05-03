package gui;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

public class JfMenú extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6015939131979328474L;
	private JPanel contentPane;
	private JMenu mnMantenimiento;
	private JMenuItem mntmClientes;
	private JMenuItem mntmProductos;
	private JMenuBar menuBar;
	private JMenu mnVentas;
	private JMenu mnAlmacen;
	private JMenu mnReportes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfMenú frame = new JfMenú();
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
	public JfMenú() {
		setTitle("Men\u00FA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(this);
		mnMantenimiento.add(mntmClientes);
		
		mntmProductos = new JMenuItem("Productos");
		mnMantenimiento.add(mntmProductos);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mnAlmacen = new JMenu("Almac\u00E9n");
		menuBar.add(mnAlmacen);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mntmClientes) {
			
		}
		
		if(e.getSource()==mntmProductos) {
			
		}
		
		if(e.getSource()==mnVentas) {
			
		}
		
		if(e.getSource()==mnAlmacen) {
			
		}
		
		if(e.getSource()==mnReportes) {
			
		}
	}
	
	
	
	
	
	
	
	@SuppressWarnings("unused")
	private static void addPopup(final Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

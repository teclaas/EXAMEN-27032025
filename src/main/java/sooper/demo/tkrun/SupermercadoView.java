package sooper.demo.tkrun;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Label;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Panel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.TextField;

public class SupermercadoView {

	protected JFrame frmSupermercado;
	private JTextField textField;
	private JTable table;
	private JButton btnEmbolsar;
	private JScrollPane scrollPane_1;
	private JTable tablaEmbolsados;
	private JButton btnEnvioAlmacen;
	private SupermercadoController controller;
	private DefaultTableModel modeloArticulo;
	private DefaultTableModel modeloListaEmbolsados;

	

	 public SupermercadoView(SupermercadoController controlador) {
		// TODO Auto-generated constructor stub
		initialize(controlador);
	} 

	private void initialize(SupermercadoController controlador) {

		modeloArticulo = new DefaultTableModel(new Object[][] {
		},
		new String[] {
				"idArticulo", "idPedido", "Volumen"
			}
		);
		
		modeloListaEmbolsados = new DefaultTableModel(new Object[][] {
		},
		new String[] {
				"idArticulo", "idContenedor"
			});
		
		
		frmSupermercado = new JFrame();
		frmSupermercado.setBounds(0,0,500,500);
		this.controller = controlador; //aqui ya tengo vinculada la vista con el controlador que creo en el swingMain
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		frmSupermercado.getContentPane().setLayout(new MigLayout("", "[470px]", "[20px][23px][427px][23px][427px][][][][23px]"));
	
		textField.setText("<introduce aqui el id Pedido>");
		frmSupermercado.getContentPane().add(textField, "cell 0 0,growx,aligny top");
		textField.setColumns(10);
		
		JButton btnAniadirPedido = new JButton("Añadir Pedido");
		btnAniadirPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.AniadirArticulosPedido(Integer.parseInt(textField.getText()));
			}
		});
		
		frmSupermercado.getContentPane().add(btnAniadirPedido, "cell 0 1,alignx left,aligny top");
		
		JScrollPane scrollPane = new JScrollPane();
		frmSupermercado.getContentPane().add(scrollPane, "cell 0 2,grow");
		
		table = new JTable();
		table.setModel(modeloListaEmbolsados);
		scrollPane.setViewportView(table);

		btnEmbolsar = new JButton("Embolsar");
		frmSupermercado.getContentPane().add(btnEmbolsar, "cell 0 3,alignx left,aligny top");
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		frmSupermercado.getContentPane().add(scrollPane_1, "cell 0 4,grow");
		
		tablaEmbolsados = new JTable();
		tablaEmbolsados.setModel(modeloListaEmbolsados);
		scrollPane_1.setViewportView(tablaEmbolsados);
		
		btnEnvioAlmacen = new JButton("Enviar a almacén");
		btnEnvioAlmacen.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			}
		});
		btnEnvioAlmacen.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		btnEnvioAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
			}
		});
		frmSupermercado.getContentPane().add(btnEnvioAlmacen, "cell 0 8,alignx left,aligny top");
		frmSupermercado.setVisible(true);
	}
	
	public JFrame getFrame() {
		return this.frmSupermercado;
	}
	
public void rellenaListaArticulos(Object[] rowArticulo) {
		
		this.modeloArticulo.addRow(rowArticulo);	
		this.table.setModel(modeloArticulo);
		
	}
}
		
package sooper.demo.tkrun;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Button;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import java.awt.Label;
import javax.swing.table.DefaultTableModel;

public class JGestionAlmacen {
	
	protected JFrame frmPanel;
	private JTable table;
	private JTable table_1;

	public void JPanelView () {
		
		//Todo aqutogenerated contructor stub
		initialize();
			
		}
		/**
		 * @wbp.parser.entryPoint
		 */
		private void initialize() {
			
			JFrame frame = new JFrame(); 
			Frame.setBounds(0,0,400, 500);// es el tamaño y aumentarlo//
			frmSupermercado =frame;
			frame.getContentPane().setLayout(new MigLayout("", "[grow][grow]", "[][grow][][grow][grow][]"));
			
			JLabel lblNewLabel = new JLabel("Articulos a Embolsar");
			frame.getContentPane().add(lblNewLabel, "cell 1 0");
			
			JScrollPane scrollPane_1 = new JScrollPane();
			frame.getContentPane().add(scrollPane_1, "cell 1 3,grow");
			
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"idpedido", "idcontenedor"
				}
			));
			scrollPane_1.setViewportView(table_1);
			
			JButton btnNewButton_2 = new JButton("anadir articulo");
			frame.getContentPane().add(btnNewButton_2, "cell 1 5");
			frmSupermercado.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][grow][]"));
			
			textField = new JTextField();
			frmSupermercado.getContentPane().add(textField, "cell 0 0,growx");
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("New button");
			frmSupermercado.getContentPane().add(btnNewButton, "cell 0 1");
			
			JScrollPane scrollPane = new JScrollPane();
			frmSupermercado.getContentPane().add(scrollPane, "cell 0 2,grow");
			
			table = new JTable();
			scrollPane.setViewportView(table);
			
			JButton btnNewButton_1 = new JButton("New button");
			frmSupermercado.getContentPane().add(btnNewButton_1, "cell 0 3");
			frmSupermercado.setVisible(true);
			
		}
}

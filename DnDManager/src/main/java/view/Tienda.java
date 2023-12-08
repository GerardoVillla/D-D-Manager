package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Character;
import model.Equippable;
import model.Item;
import model.Shield;
import model.Storage;
import model.Usable;
import model.Weapon;
import control.ControlTienda;
import javax.swing.border.LineBorder;

public class Tienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane JScrollPane;
	private DefaultTableModel modelE;
	private DefaultTableModel modelU;
	private DefaultTableModel modelI;
	private JList listStorage;
	private JLabel goldValue;
	private AbstractButton btnComprarObjeto;
	private JButton btnVender;
	private JLabel priceValue;
	private JList listUs;
	private JList listEq;
	private DefaultListModel dlmSt;
	private DefaultListModel dlmUs;
	private DefaultListModel dlmEq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
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
	public Tienda() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 130, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTienda = new JLabel("Tienda");
		lblTienda.setBackground(new Color(0, 0, 0));
		lblTienda.setBounds(213, 0, 89, 40);
		lblTienda.setForeground(new Color(0, 0, 0));
		lblTienda.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		contentPane.add(lblTienda);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(155, 55, 255));
		panel.setBounds(40, 51, 430, 399);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEquipables = new JLabel("Equipables");
		lblEquipables.setBounds(76, 19, 76, 22);
		lblEquipables.setForeground(new Color(0, 0, 0));
		lblEquipables.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		panel.add(lblEquipables);
		
		JLabel lblConsumibles = new JLabel("Consumibles");
		lblConsumibles.setForeground(Color.BLACK);
		lblConsumibles.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblConsumibles.setBounds(275, 19, 94, 22);
		panel.add(lblConsumibles);
		
		JScrollPane scrollPaneEquip = new JScrollPane();
		scrollPaneEquip.setBounds(30, 52, 168, 289);
		panel.add(scrollPaneEquip);
		
		listEq = new JList<Equippable>();
		listEq.setBackground(new Color(192, 130, 255));
		dlmEq = new DefaultListModel<Equippable>();
		scrollPaneEquip.setViewportView(listEq);
		modelE =new DefaultTableModel();
		modelE.addColumn("Objeto");
		modelE.addColumn("Precio");
		
		JScrollPane scrollPaneConsu = new JScrollPane();
		scrollPaneConsu.setBounds(234, 52, 168, 290);
		panel.add(scrollPaneConsu);
		modelU=new DefaultTableModel();
		modelU.addColumn("Objeto");
		modelU.addColumn("Precio");
		panel.add(scrollPaneConsu);
		
		listUs = new JList<Usable>();
		listUs.setBackground(new Color(192, 130, 255));
		dlmUs = new DefaultListModel<Usable>();
		scrollPaneConsu.setViewportView(listUs);
		
		JLabel priceLabel = new JLabel("Precio: ");
		priceLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		priceLabel.setBounds(143, 362, 63, 26);
		panel.add(priceLabel);
		
		priceValue = new JLabel("");
		priceValue.setFont(new Font("Segoe UI", Font.BOLD, 16));
		priceValue.setBounds(202, 362, 42, 26);
		panel.add(priceValue);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(157, 60, 255));
		panel_1.setBounds(510, 58, 234, 392);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel goldLabel = new JLabel("Oro:");
		goldLabel.setForeground(Color.BLACK);
		goldLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		goldLabel.setBounds(25, 19, 49, 22);
		panel_1.add(goldLabel);
		
		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setForeground(Color.BLACK);
		lblInventario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblInventario.setBounds(80, 52, 74, 22);
		panel_1.add(lblInventario);
		
		btnVender = new JButton("Vender Objeto");
		btnVender.setContentAreaFilled(false);
		btnVender.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnVender.setBounds(25, 353, 184, 28);
		btnVender.setForeground(Color.WHITE);
		btnVender.setBackground(new Color(155, 55, 255));
		btnVender.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		panel_1.add(btnVender);
		
		btnComprarObjeto = new JButton("Comprar Objeto\r\n");
		btnComprarObjeto.setContentAreaFilled(false);
		btnComprarObjeto.setBounds(25, 308, 184, 28);
		panel_1.add(btnComprarObjeto);
		btnComprarObjeto.setForeground(new Color(255, 255, 255));
		btnComprarObjeto.setBackground(new Color(155, 55, 255));
		btnComprarObjeto.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		btnComprarObjeto.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		goldValue = new JLabel("999999");
		goldValue.setFont(new Font("Segoe UI", Font.BOLD, 16));
		goldValue.setBounds(84, 19, 58, 22);
		panel_1.add(goldValue);
		
		JScrollPane scrollPaneInvent = new JScrollPane();
		scrollPaneInvent.setBounds(25, 84, 184, 213);
		panel_1.add(scrollPaneInvent);
		
		listStorage = new JList<Item>();
		listStorage.setBackground(new Color(192, 130, 255));
		dlmSt = new DefaultListModel<Item>();
		scrollPaneInvent.setViewportView(listStorage);
		modelI=new DefaultTableModel();
		modelI.addColumn("Objeto");
		modelI.addColumn("Precio");
		
		JLabel lblPersonaje = new JLabel("Personaje\r\n");
		lblPersonaje.setForeground(Color.BLACK);
		lblPersonaje.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblPersonaje.setBackground(Color.BLACK);
		lblPersonaje.setBounds(562, 10, 130, 41);
		contentPane.add(lblPersonaje);
	}

	public DefaultListModel getDlmSt() {
		return dlmSt;
	}

	public void setDlmSt(DefaultListModel dlmSt) {
		this.dlmSt = dlmSt;
	}

	public DefaultListModel<Usable> getDlmUs() {
		return dlmUs;
	}

	public void setDlmUs(DefaultListModel<Usable> dlmUs) {
		this.dlmUs = dlmUs;
	}

	public DefaultListModel<Equippable> getDlmEq() {
		return dlmEq;
	}

	public void setDlmEq(DefaultListModel<Equippable> dlmEq) {
		this.dlmEq = dlmEq;
	}

	public JList<Item> getListStorage() {
		return listStorage;
	}

	public void setListStorage(JList<Item> listStorage) {
		this.listStorage = listStorage;
	}

	public JLabel getGoldValue() {
		return goldValue;
	}

	public void setGoldValue(JLabel goldValue) {
		this.goldValue = goldValue;
	}

	public AbstractButton getBtnComprarObjeto() {
		return btnComprarObjeto;
	}

	public void setBtnComprarObjeto(AbstractButton btnComprarObjeto) {
		this.btnComprarObjeto = btnComprarObjeto;
	}

	public JButton getBtnVender() {
		return btnVender;
	}

	public void setBtnVender(JButton btnVender) {
		this.btnVender = btnVender;
	}

	public JLabel getPriceValue() {
		return priceValue;
	}

	public void setPriceValue(JLabel priceValue) {
		this.priceValue = priceValue;
	}

	public JList getListUs() {
		return listUs;
	}

	public void setListUs(JList listUs) {
		this.listUs = listUs;
	}

	public JList getListEq() {
		return listEq;
	}

	public void setListEq(JList listEq) {
		this.listEq = listEq;
	}
}
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.List;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import model.Character;
import model.Item;
import javax.swing.JComboBox;

public class StoreObjectView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameValue;
	private JTextField priceValue;
	private JButton btnAddItem;
	private JList listItem;
	private JLabel priceLabel;
	private JTextArea descriptionValue;
	private DefaultListModel<Item> dlm;
	private JTextField dieNValue;
	private JTextField usesValue;
	private JTextField dieFValue;
	private JTextField healingValue;
	private JTextField shieldValue;
	private JTextField armorClassValue;
	private JComboBox tipo;
	private JButton Atras;

	public JButton getAtras() {
		return Atras;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreObjectView frame = new StoreObjectView();
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
	public StoreObjectView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(242, 234, 188));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(188, 205, 203));
		panel.setBounds(10, 22, 358, 398);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tienda");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(120, -16, 121, 93);
		panel.add(lblNewLabel_1);
		
		btnAddItem = new JButton("Agregar objeto");
		btnAddItem.setBounds(110, 360, 131, 23);
		panel.add(btnAddItem);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 75, 260, 272);
		panel.add(scrollPane);
		
		listItem = new JList();
		dlm = new DefaultListModel<Item>();
		scrollPane.setViewportView(listItem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(188, 205, 203));
		panel_1.setBounds(403, 22, 346, 398);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Objeto");
		lblNewLabel_1_1.setBounds(120, 11, 98, 43);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 32));
		
		priceLabel = new JLabel("Precio");
		priceLabel.setBounds(125, 87, 46, 14);
		panel_1.add(priceLabel);
		
		priceValue = new JTextField();
		priceValue.setBounds(125, 112, 86, 20);
		panel_1.add(priceValue);
		priceValue.setColumns(10);
		
		descriptionValue = new JTextArea();
		descriptionValue.setBounds(29, 278, 283, 90);
		descriptionValue.setWrapStyleWord(true);
		descriptionValue.setRows(5);
		descriptionValue.setLineWrap(true);
		descriptionValue.setForeground(Color.BLACK);
		descriptionValue.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		descriptionValue.setColumns(20);
		descriptionValue.setBorder(new LineBorder(Color.WHITE));
		descriptionValue.setBackground(Color.WHITE);
		panel_1.add(descriptionValue);
		
		JLabel typeLabel = new JLabel("Tipo");
		typeLabel.setBounds(221, 87, 46, 14);
		panel_1.add(typeLabel);
		
		JLabel dieNLabel = new JLabel("Num. Dados");
		dieNLabel.setBounds(125, 143, 79, 14);
		panel_1.add(dieNLabel);
		
		dieNValue = new JTextField();
		dieNValue.setBounds(125, 168, 86, 20);
		dieNValue.setColumns(10);
		panel_1.add(dieNValue);
		
		JLabel usesLable = new JLabel("Usos");
		usesLable.setBounds(29, 143, 46, 14);
		panel_1.add(usesLable);
		
		usesValue = new JTextField();
		usesValue.setBounds(29, 168, 86, 20);
		usesValue.setColumns(10);
		panel_1.add(usesValue);
		
		JLabel dieFLabel = new JLabel("Num. Caras");
		dieFLabel.setBounds(221, 143, 79, 14);
		panel_1.add(dieFLabel);
		
		dieFValue = new JTextField();
		dieFValue.setBounds(221, 168, 86, 20);
		dieFValue.setColumns(10);
		panel_1.add(dieFValue);
		
		JLabel descriptionLabel = new JLabel("Descripcion");
		descriptionLabel.setBounds(29, 254, 66, 14);
		panel_1.add(descriptionLabel);
		
		healingValue = new JTextField();
		healingValue.setColumns(10);
		healingValue.setBounds(29, 224, 86, 20);
		panel_1.add(healingValue);
		
		JLabel healingLabel = new JLabel("Curacion");
		healingLabel.setBounds(29, 199, 46, 14);
		panel_1.add(healingLabel);
		
		JLabel shieldLabel = new JLabel("Defensa Escudo");
		shieldLabel.setBounds(125, 199, 79, 14);
		panel_1.add(shieldLabel);
		
		shieldValue = new JTextField();
		shieldValue.setColumns(10);
		shieldValue.setBounds(125, 224, 86, 20);
		panel_1.add(shieldValue);
		
		JLabel armorClassLabel = new JLabel("Clase de armadura");
		armorClassLabel.setBounds(221, 199, 91, 14);
		panel_1.add(armorClassLabel);
		
		armorClassValue = new JTextField();
		armorClassValue.setColumns(10);
		armorClassValue.setBounds(221, 224, 86, 20);
		panel_1.add(armorClassValue);
		
		JLabel nameLabel = new JLabel("Nombre");
		nameLabel.setBounds(29, 89, 46, 14);
		panel_1.add(nameLabel);
		
		nameValue = new JTextField();
		nameValue.setBounds(29, 112, 86, 20);
		panel_1.add(nameValue);
		nameValue.setColumns(10);
		
		tipo = new JComboBox();
		tipo.setBounds(221, 111, 86, 22);
		tipo.addItem("Arma");
		tipo.addItem("Escudo");
		tipo.addItem("Armadura");
		tipo.addItem("Consumible");
		panel_1.add(tipo);
		
		Atras = new JButton("ATRAS");
		Atras.setForeground(new Color(0, 0, 0));
		Atras.setBackground(new Color(242, 234, 188));
		Atras.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		Atras.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		Atras.setBounds(10, 430, 125, 23);
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		contentPane.add(Atras);
	}

	public JTextField getHealingValue() {
		return healingValue;
	}

	public void setHealingValue(JTextField healingValue) {
		this.healingValue = healingValue;
	}

	public JTextField getCuracionValue() {
		return healingValue;
	}

	public void setCuracionValue(JTextField curacionValue) {
		this.healingValue = curacionValue;
	}

	public JTextField getShieldValue() {
		return shieldValue;
	}

	public void setShieldValue(JTextField shieldValue) {
		this.shieldValue = shieldValue;
	}

	public JTextField getArmorClassValue() {
		return armorClassValue;
	}

	public void setArmorClassValue(JTextField armorClassValue) {
		this.armorClassValue = armorClassValue;
	}

	public JTextField getDieNValue() {
		return dieNValue;
	}

	public void setDieNValue(JTextField dieNValue) {
		this.dieNValue = dieNValue;
	}

	public JTextField getUsesValue() {
		return usesValue;
	}

	public void setUsesValue(JTextField usesValue) {
		this.usesValue = usesValue;
	}

	public JTextField getDieFValue() {
		return dieFValue;
	}

	public void setDieFValue(JTextField dieFValue) {
		this.dieFValue = dieFValue;
	}

	public JTextArea getDescriptionValue() {
		return descriptionValue;
	}

	public void setDescriptionValue(JTextArea descriptionValue) {
		this.descriptionValue = descriptionValue;
	}

	public DefaultListModel<Item> getDlm() {
		return dlm;
	}

	public void setDlm(DefaultListModel<Item> dlm) {
		this.dlm = dlm;
	}

	public JTextField getNameValue() {
		return nameValue;
	}

	public void setNameValue(JTextField nameValue) {
		this.nameValue = nameValue;
	}

	

	public JComboBox getTipo() {
		return tipo;
	}

	public void setTipo(JComboBox tipo) {
		this.tipo = tipo;
	}

	public JTextField getPriceValue() {
		return priceValue;
	}

	public void setPriceValue(JTextField priceValue) {
		this.priceValue = priceValue;
	}

	public JButton getBtnAddItem() {
		return btnAddItem;
	}

	public void setBtnAddItem(JButton btnAddItem) {
		this.btnAddItem = btnAddItem;
	}

	public JList getListItem() {
		return listItem;
	}

	public void setListItem(JList listItem) {
		this.listItem = listItem;
	}
}

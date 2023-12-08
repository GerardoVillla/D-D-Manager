package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Character;
import model.Equippable;
import model.Shield;
import model.Storage;
import model.Usable;
import model.Weapon;
import control.ControlTienda;

public class Tienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane JScrollPane;
	private JTable Equiptable;
	private JTable Consumibletable;
	private JTable Inventorytable;
	private DefaultTableModel modelE;
	private DefaultTableModel modelU;
	private DefaultTableModel modelI;

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
		lblTienda.setBounds(210, 10, 90, 41);
		lblTienda.setForeground(new Color(0, 0, 0));
		lblTienda.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		contentPane.add(lblTienda);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(155, 55, 255));
		panel.setBounds(40, 58, 430, 372);
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
		
		Equiptable = new JTable();
		scrollPaneEquip.setViewportView(Equiptable);
		modelE =new DefaultTableModel();
		Equiptable.setModel(modelE);
		modelE.addColumn("Objeto");
		modelE.addColumn("Precio");
		
		//
		/*
		ArrayList<Equippable> Equipables = new ArrayList<Equippable>();
		Weapon Sword = new Weapon("Espada","Arma basica de rango medio-corto",100,true,1,6,35);
		Shield SmallShield = new Shield("Escudo pequeño", "Escudo de tamaño mediano capaz de cubrir el torso",140,true,1,10,50);
		LightArmor LeatherArmor = new LightArmor("Armadura de Cuero", "Armadura sencilla de cuero",75,true,1,8,15);
		Equipables.add(Sword);
		Equipables.add(SmallShield);
		Equipables.add(LeatherArmor);
		*/
		/*
		System.out.println(Equipables.size());
		for(Equippable Equipable: Equipables) {
			
			Object[] fila = new Object[3];
			fila[0]=Equipable.getName();
			fila[1]=Equipable.getPrice();
			
			modelE.addRow(fila);
		}
		*/
			Equiptable.setEnabled(false);
			Equiptable.getColumnModel().getColumn(0).setPreferredWidth(100);
			Equiptable.getColumnModel().getColumn(1).setPreferredWidth(50);
			scrollPaneEquip.setViewportView(Equiptable);
		
		JScrollPane scrollPaneConsu = new JScrollPane();
		scrollPaneConsu.setBounds(234, 52, 168, 290);
		panel.add(scrollPaneConsu);
		
		
		//
		
		Consumibletable = new JTable();
		scrollPaneConsu.setViewportView(Consumibletable);
		modelU=new DefaultTableModel();
		Consumibletable.setModel(modelU);
		modelU.addColumn("Objeto");
		modelU.addColumn("Precio");
		/*
		ArrayList<Usable> Usables = new ArrayList<Usable>();
		Usable HealingPotion = new Usable("Pocion Curativa", "Pocion de un solo uso que regenera una buena parte de la vida",125,1);
		Usable Potion2 = new Usable("Pocion reusable", "Cura menos pero tiene mas usos",115,2);
		Usable Potion3 = new Usable("Pocion S", "Pocion de un solo uso que regenera una buena parte de la vida",200,3);
		Usable Potion4 = new Usable("Pocion 1", "Pocion de un solo uso que regenera una buena parte de la vida",175,2);
		Usables.add(HealingPotion);
		Usables.add(Potion2);
		Usables.add(Potion3);
		Usables.add(Potion4);
		
		System.out.println(Usables.size());
		for(Usable Usable: Usables) {
			Object[] fila = new Object[4];
			fila[0]=Usable.getName();
			fila[1]=Usable.getPrice();
			
			modelU.addRow(fila);
		}
		*/
		Consumibletable.setEnabled(false);
		Consumibletable.getColumnModel().getColumn(0).setPreferredWidth(100);
		Consumibletable.getColumnModel().getColumn(1).setPreferredWidth(50);
		panel.add(scrollPaneConsu);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(157, 60, 255));
		panel_1.setBounds(510, 58, 234, 372);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOro = new JLabel("Oro:");
		lblOro.setForeground(Color.BLACK);
		lblOro.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblOro.setBounds(25, 19, 49, 22);
		panel_1.add(lblOro);
		
		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setForeground(Color.BLACK);
		lblInventario.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblInventario.setBounds(80, 52, 74, 22);
		panel_1.add(lblInventario);
		
		JButton btnVender = new JButton("Vender Objeto");
		btnVender.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnVender.setBounds(25, 315, 184, 21);
		btnVender.setForeground(new Color(255, 255, 255));
		btnVender.setBackground(new Color(155, 55, 255));
		btnVender.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		panel_1.add(btnVender);
		
		JButton btnComprarObjeto = new JButton("Comprar Objeto\r\n");
		btnComprarObjeto.setBounds(25, 284, 184, 21);
		panel_1.add(btnComprarObjeto);
		btnComprarObjeto.setForeground(new Color(255, 255, 255));
		btnComprarObjeto.setBackground(new Color(155, 55, 255));
		btnComprarObjeto.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		btnComprarObjeto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("999999");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(88, 19, 58, 22);
		panel_1.add(lblNewLabel);
		
		JScrollPane scrollPaneInvent = new JScrollPane();
		scrollPaneInvent.setBounds(25, 84, 184, 190);
		panel_1.add(scrollPaneInvent);
		
		Inventorytable = new JTable();
		scrollPaneInvent.setViewportView(Inventorytable);
		modelI=new DefaultTableModel();
		Inventorytable.setModel(modelI);
		modelI.addColumn("Objeto");
		modelI.addColumn("Precio");
		/*
		Character C = new Character();
		C.getStorage().addEquippableItem(LeatherArmor);
		C.getStorage().addUsableItem(Potion3);
		C.getStorage().addUsableItem(Potion4);
		C.getStorage().addEquippableItem(Sword);
		
		
		for(Usable Usable: C.getStorage().getUsableitems()) {
			Object[] fila = new Object[C.getStorage().getSizeUsable()];
			fila[0]=Usable.getName();
			fila[1]=Usable.getPrice();
			
			modelI.addRow(fila);
		}
		for(Equippable Equippable: C.getStorage().getEquippableitems()) {
			Object[] fila = new Object[C.getStorage().getSizeEquippable()];
			fila[0]=Equippable.getName();
			fila[1]=Equippable.getPrice();
			
			modelI.addRow(fila);
		}
		*/
		Inventorytable.setEnabled(false);
		Inventorytable.getColumnModel().getColumn(0).setPreferredWidth(100);
		Inventorytable.getColumnModel().getColumn(1).setPreferredWidth(50);
		scrollPaneInvent.setViewportView(Inventorytable);
		
		JLabel lblPersonaje = new JLabel("Personaje\r\n");
		lblPersonaje.setForeground(Color.BLACK);
		lblPersonaje.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblPersonaje.setBackground(Color.BLACK);
		lblPersonaje.setBounds(562, 10, 130, 41);
		contentPane.add(lblPersonaje);
	}

	public JTable getEquiptable() {
		return Equiptable;
	}

	public JTable getConsumibletable() {
		return Consumibletable;
	}

	public JTable getInventorytable() {
		return Inventorytable;
	}

	
}

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JList;

public class Tienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JList list = new JList();
		list.setBounds(234, 51, 166, 290);
		panel.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(30, 51, 168, 290);
		panel.add(list_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(157, 60, 255));
		panel_1.setBounds(510, 58, 234, 372);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(25, 84, 184, 190);
		panel_1.add(scrollPane_3);
		
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
		
		JLabel lblPersonaje = new JLabel("Personaje\r\n");
		lblPersonaje.setForeground(Color.BLACK);
		lblPersonaje.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblPersonaje.setBackground(Color.BLACK);
		lblPersonaje.setBounds(562, 10, 130, 41);
		contentPane.add(lblPersonaje);
	}
}

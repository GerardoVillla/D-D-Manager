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
import javax.swing.ImageIcon;

public class StoreObjectView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		
		JList list = new JList();
		list.setBounds(96, 100, 1, 1);
		contentPane.add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(430, 101, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo");
		lblNewLabel_4.setBounds(430, 185, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5_1 = new JLabel("Descripcion");
		lblNewLabel_5_1.setBounds(431, 257, 66, 14);
		contentPane.add(lblNewLabel_5_1);
		
		textField = new JTextField();
		textField.setBounds(430, 124, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(431, 209, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(188, 205, 203));
		panel.setBounds(27, 34, 358, 406);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tienda");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(120, -16, 121, 93);
		panel.add(lblNewLabel_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(294, 166, 17, 48);
		panel.add(scrollBar);
		
		List list_1 = new List();
		list_1.setBounds(58, 66, 230, 269);
		panel.add(list_1);
		
		JButton btnNewButton_1 = new JButton("Editar obj");
		btnNewButton_1.setBounds(187, 358, 78, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Agregar obj");
		btnNewButton_1_1.setBounds(87, 358, 90, 23);
		panel.add(btnNewButton_1_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField_4 = new JTextField();
		textField_4.setBounds(431, 282, 306, 105);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(188, 205, 203));
		panel_1.setBounds(409, 34, 346, 406);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Objeto");
		lblNewLabel_1_1.setBounds(106, 11, 98, 43);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 32));
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(186, 65, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 90, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(186, 180, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Efecto");
		lblNewLabel_5.setBounds(186, 159, 46, 14);
		panel_1.add(lblNewLabel_5);
	}
}

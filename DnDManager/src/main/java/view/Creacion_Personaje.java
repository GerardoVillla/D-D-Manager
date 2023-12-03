package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Creacion_Personaje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creacion_Personaje frame = new Creacion_Personaje();
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
	public Creacion_Personaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crea a tu personaje");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 10, 258, 41);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblIngresaLosAtributos = new JLabel("Ingresa los atributos de personaje");
		lblIngresaLosAtributos.setForeground(Color.WHITE);
		lblIngresaLosAtributos.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblIngresaLosAtributos.setBounds(22, 45, 278, 41);
		contentPane.add(lblIngresaLosAtributos);
		
		JLabel lblIngresaLosAtributos_1 = new JLabel("DESTREZA\r\n");
		lblIngresaLosAtributos_1.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1.setBounds(22, 244, 89, 30);
		contentPane.add(lblIngresaLosAtributos_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setBounds(170, 383, 122, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("FINALIZAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0,125,0));
		btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBounds(357, 125, 121, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblIngresaLosAtributos_1_1 = new JLabel("NIVEL\r\n");
		lblIngresaLosAtributos_1_1.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_1.setBounds(343, 380, 50, 30);
		contentPane.add(lblIngresaLosAtributos_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBox.setBounds(421, 384, 57, 24);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("PUNTOS DE VIDA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 380, 146, 30);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(22, 125, 318, 31);
		contentPane.add(textField_1);
		
		JLabel lblIngresaLosAtributos_1_2 = new JLabel("NOMBRE");
		lblIngresaLosAtributos_1_2.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_2.setBounds(22, 86, 65, 41);
		contentPane.add(lblIngresaLosAtributos_1_2);
		
		JLabel lblIngresaLosAtributos_1_3 = new JLabel("FUERZA");
		lblIngresaLosAtributos_1_3.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_3.setBounds(22, 175, 65, 30);
		contentPane.add(lblIngresaLosAtributos_1_3);
		
		JLabel lblIngresaLosAtributos_1_4 = new JLabel("CONSTITUCION\r\n");
		lblIngresaLosAtributos_1_4.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_4.setBounds(22, 313, 112, 30);
		contentPane.add(lblIngresaLosAtributos_1_4);
		
		JLabel lblIngresaLosAtributos_1_4_1 = new JLabel("SABIDURIA");
		lblIngresaLosAtributos_1_4_1.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_4_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_4_1.setBounds(287, 244, 112, 30);
		contentPane.add(lblIngresaLosAtributos_1_4_1);
		
		JLabel lblIngresaLosAtributos_1_4_2 = new JLabel("CARISMA");
		lblIngresaLosAtributos_1_4_2.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_4_2.setBounds(287, 313, 112, 30);
		contentPane.add(lblIngresaLosAtributos_1_4_2);
		
		JLabel lblIngresaLosAtributos_1_4_3 = new JLabel("INTELIGENCIA");
		lblIngresaLosAtributos_1_4_3.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_4_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_4_3.setBounds(287, 175, 98, 30);
		contentPane.add(lblIngresaLosAtributos_1_4_3);
		
        JLabel imagen = new JLabel(); //JLabel Creation
        imagen.setIcon(new ImageIcon("Interfaces/src/vista/DND.jpg")); //Sets the image to be displayed as an icon
        Dimension size = imagen.getPreferredSize(); //Gets the size of the image
        imagen.setBounds(50, 30, size.width, size.height); //Sets the location of the image
        contentPane.add(imagen);
		
		JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBox_1_2_1.setBounds(170, 178, 57, 24);
		contentPane.add(comboBox_1_2_1);
		
		JComboBox comboBox_1_2_1_2 = new JComboBox();
		comboBox_1_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBox_1_2_1_2.setBounds(170, 247, 57, 24);
		contentPane.add(comboBox_1_2_1_2);
		
		JComboBox comboBox_1_2_1_3 = new JComboBox();
		comboBox_1_2_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBox_1_2_1_3.setBounds(170, 316, 57, 24);
		contentPane.add(comboBox_1_2_1_3);
		
		JComboBox comboBox_1_2_1_1 = new JComboBox();
		comboBox_1_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBox_1_2_1_1.setBounds(421, 316, 57, 24);
		contentPane.add(comboBox_1_2_1_1);
		
		JComboBox comboBox_1_2_1_4 = new JComboBox();
		comboBox_1_2_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBox_1_2_1_4.setBounds(421, 247, 57, 24);
		contentPane.add(comboBox_1_2_1_4);
		
		JComboBox comboBox_1_2_1_5 = new JComboBox();
		comboBox_1_2_1_5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBox_1_2_1_5.setBounds(421, 178, 57, 23);
		contentPane.add(comboBox_1_2_1_5);
		
		JLabel Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon(Creacion_Personaje.class.getResource("/image/DND.jpg")));
		Imagen.setBounds(508, 0, 278, 463);
		ImageIcon ico = new ImageIcon(getClass().getResource("/image/DND.jpg"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_SMOOTH));
		Imagen.setIcon(img);
		contentPane.add(Imagen);
	}
}

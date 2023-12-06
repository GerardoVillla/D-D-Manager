package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import model.*;
public class Creacion_Personaje extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField HP;
	private JTextField nombre;
	private JButton finalizar;
	private JComboBox<Object> comboBoxFue;
	private JComboBox<Integer> comboBoxDes;
	private JComboBox<Integer> comboBoxCons;
	private JComboBox<Integer> comboBoxInt;
	private JComboBox<Integer> comboBoxSab;
	private JComboBox<Integer> comboBoxCar;
	private JComboBox<Integer> lvl;
	private JComboBox<String> comboBoxRaza;
	private JComboBox<String> comboBoxClase;

	

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
		lblIngresaLosAtributos_1.setBounds(22, 230, 89, 30);
		contentPane.add(lblIngresaLosAtributos_1);
		
		HP = new JTextField();
		HP.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		HP.setBounds(170, 343, 122, 24);
		contentPane.add(HP);
		HP.setColumns(10);
		
		finalizar = new JButton("FINALIZAR");
		finalizar.setForeground(new Color(255, 255, 255));
		finalizar.setBackground(new Color(0,125,0));
		finalizar.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		finalizar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		finalizar.setBackground(new Color(0, 128, 0));
		finalizar.setBounds(357, 125, 121, 31);
		contentPane.add(finalizar);
		
		JLabel lblIngresaLosAtributos_1_1 = new JLabel("NIVEL\r\n");
		lblIngresaLosAtributos_1_1.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_1.setBounds(343, 340, 50, 30);
		contentPane.add(lblIngresaLosAtributos_1_1);
		
		lvl = new JComboBox<Integer>();
		lvl.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lvl.setBounds(421, 343, 57, 24);
		for(int i=1;i<=20;i++) {
			lvl.addItem(i);
		}
		contentPane.add(lvl);
		
		JLabel lblNewLabel_1 = new JLabel("PUNTOS DE VIDA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(22, 340, 131, 30);
		contentPane.add(lblNewLabel_1);
		
		nombre = new JTextField();
		nombre.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		nombre.setColumns(10);
		nombre.setBounds(22, 125, 318, 31);
		contentPane.add(nombre);
		
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
		lblIngresaLosAtributos_1_4.setBounds(22, 285, 112, 30);
		contentPane.add(lblIngresaLosAtributos_1_4);
		
		JLabel lblIngresaLosAtributos_1_4_1 = new JLabel("SABIDURIA");
		lblIngresaLosAtributos_1_4_1.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_4_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_4_1.setBounds(287, 230, 112, 30);
		contentPane.add(lblIngresaLosAtributos_1_4_1);
		
		JLabel lblIngresaLosAtributos_1_4_2 = new JLabel("CARISMA");
		lblIngresaLosAtributos_1_4_2.setForeground(Color.WHITE);
		lblIngresaLosAtributos_1_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblIngresaLosAtributos_1_4_2.setBounds(287, 285, 112, 30);
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
		
		comboBoxFue = new JComboBox();
		comboBoxFue.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxFue.setBounds(170, 178, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxFue.addItem(i);
		}
		contentPane.add(comboBoxFue);
		
		comboBoxDes = new JComboBox<Integer>();
		comboBoxDes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxDes.setBounds(170, 233, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxDes.addItem(i);
		}
		contentPane.add(comboBoxDes);
		
		comboBoxCons = new JComboBox<Integer>();
		comboBoxCons.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxCons.setBounds(170, 288, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxCons.addItem(i);
		}
		contentPane.add(comboBoxCons);
		
		comboBoxCar = new JComboBox<Integer>();
		comboBoxCar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxCar.setBounds(421, 288, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxCar.addItem(i);
		}
		contentPane.add(comboBoxCar);
		
		comboBoxSab = new JComboBox<Integer>();
		comboBoxSab.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxSab.setBounds(421, 233, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxSab.addItem(i);
		}
		contentPane.add(comboBoxSab);
		
		comboBoxInt = new JComboBox<Integer>();
		comboBoxInt.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxInt.setBounds(421, 178, 57, 23);
		for(int i=1;i<=20;i++) {
			comboBoxInt.addItem(i);
		}
		contentPane.add(comboBoxInt);
		
		JLabel Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon(Creacion_Personaje.class.getResource("/image/DND.jpg")));
		Imagen.setBounds(508, 0, 278, 463);
		ImageIcon ico = new ImageIcon(getClass().getResource("/image/DND.jpg"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_SMOOTH));
		Imagen.setIcon(img);
		contentPane.add(Imagen);
		
		JLabel lblNewLabel_1_1 = new JLabel("RAZA");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(22, 395, 50, 30);
		contentPane.add(lblNewLabel_1_1);
		
		comboBoxRaza = new JComboBox<String>();
		comboBoxRaza.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxRaza.setBounds(97, 398, 122, 24);
		
		comboBoxRaza.addItem("Dragonborn");
		comboBoxRaza.addItem("Dwarf");
		comboBoxRaza.addItem("Elf");
		comboBoxRaza.addItem("Gnome");
		comboBoxRaza.addItem("Half-Elf");
		comboBoxRaza.addItem("Half-Orc");
		comboBoxRaza.addItem("Human");
		comboBoxRaza.addItem("Halfling");
		comboBoxRaza.addItem("Tiefling");
		contentPane.add(comboBoxRaza);
		
		JLabel LabelClase = new JLabel("CLASE");
		LabelClase.setForeground(Color.WHITE);
		LabelClase.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		LabelClase.setBounds(266, 395, 50, 30);
		contentPane.add(LabelClase);
		
		comboBoxClase = new JComboBox<String>();
		comboBoxClase.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxClase.setBounds(356, 398, 122, 24);
		comboBoxClase.addItem("Barbarian");
		comboBoxClase.addItem("Bard");
		comboBoxClase.addItem("Cleric");
		comboBoxClase.addItem("Druid");
		comboBoxClase.addItem("Fighter");
		comboBoxClase.addItem("Monk");
		comboBoxClase.addItem("Paladin");
		comboBoxClase.addItem("Ranger");
		comboBoxClase.addItem("Rogue");
		comboBoxClase.addItem("Sourcerer");
		comboBoxClase.addItem("Warlock");
		comboBoxRaza.addItem("Wizard");
		contentPane.add(comboBoxClase);
		
		
	}

	public JComboBox getComboBoxClase() {
		return comboBoxClase;
	}

	public void setComboBoxClase(JComboBox comboBoxClase) {
		this.comboBoxClase = comboBoxClase;
	}

	

	public JButton getFinalizar() {
		return finalizar;
	}

	public void setFinalizar(JButton finalizar) {
		this.finalizar = finalizar;
	}
	public JTextField getHP() {
		return HP;
	}

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JComboBox getComboBoxFue() {
		return comboBoxFue;
	}

	public void setComboBoxFue(JComboBox comboBoxFue) {
		this.comboBoxFue = comboBoxFue;
	}

	public JComboBox getComboBoxDes() {
		return comboBoxDes;
	}

	public void setComboBoxDes(JComboBox comboBoxDes) {
		this.comboBoxDes = comboBoxDes;
	}

	public JComboBox getComboBoxCons() {
		return comboBoxCons;
	}

	public void setComboBoxCons(JComboBox comboBoxCons) {
		this.comboBoxCons = comboBoxCons;
	}

	public JComboBox getComboBoxInt() {
		return comboBoxInt;
	}

	public void setComboBoxInt(JComboBox comboBoxInt) {
		this.comboBoxInt = comboBoxInt;
	}

	public JComboBox getComboBoxSab() {
		return comboBoxSab;
	}

	public void setComboBoxSab(JComboBox comboBoxSab) {
		this.comboBoxSab = comboBoxSab;
	}

	public JComboBox getComboBoxCar() {
		return comboBoxCar;
	}

	public void setComboBoxCar(JComboBox comboBoxCar) {
		this.comboBoxCar = comboBoxCar;
	}

	public void setHP(JTextField hP) {
		HP = hP;
	}
	
	public JComboBox getLvl() {
		return this.lvl;
	}
	public void setComboBoxRaza(JComboBox comboBoxRaza) {
		this.comboBoxRaza = comboBoxRaza;
	}

	public JComboBox getComboBoxRaza() {
		return comboBoxRaza;
	}
}

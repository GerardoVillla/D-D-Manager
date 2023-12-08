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
import javax.swing.border.LineBorder;

public class EditarPersonaje extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField HP;
	private JButton btnFinalizar;
	private JComboBox<Object> comboBoxFue;
	private JComboBox<Integer> comboBoxDes;
	private JComboBox<Integer> comboBoxCons;
	private JComboBox<Integer> comboBoxInt;
	private JComboBox<Integer> comboBoxSab;
	private JComboBox<Integer> comboBoxCar;
	private JComboBox<Integer> lvl;
	private JTextField Oro;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarPersonaje frame = new EditarPersonaje();
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
	public EditarPersonaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edita a tu personaje");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 10, 313, 41);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblIngresaLosAtributos = new JLabel("Edita los atributos de personaje");
		lblIngresaLosAtributos.setForeground(Color.WHITE);
		lblIngresaLosAtributos.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblIngresaLosAtributos.setBounds(22, 45, 278, 41);
		contentPane.add(lblIngresaLosAtributos);
		
		JLabel DestrezaLabel = new JLabel("DESTREZA\r\n");
		DestrezaLabel.setForeground(Color.WHITE);
		DestrezaLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		DestrezaLabel.setBounds(22, 180, 89, 30);
		contentPane.add(DestrezaLabel);
		
		HP = new JTextField();
		HP.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		HP.setBounds(170, 323, 122, 24);
		contentPane.add(HP);
		HP.setColumns(10);
		
		btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.setContentAreaFilled(false);
		btnFinalizar.setForeground(new Color(255, 255, 255));
		btnFinalizar.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFinalizar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnFinalizar.setBackground(new Color(128, 0, 0));
		btnFinalizar.setBounds(357, 392, 121, 31);
		contentPane.add(btnFinalizar);
		
		JLabel NivelLabel = new JLabel("NIVEL\r\n");
		NivelLabel.setForeground(Color.WHITE);
		NivelLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		NivelLabel.setBounds(343, 320, 50, 30);
		contentPane.add(NivelLabel);
		
		lvl = new JComboBox<Integer>();
		lvl.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lvl.setBounds(421, 323, 57, 24);
		for(int i=1;i<=20;i++) {
			lvl.addItem(i);
		}
		contentPane.add(lvl);
		
		JLabel HPLabel = new JLabel("PUNTOS DE VIDA");
		HPLabel.setForeground(new Color(255, 255, 255));
		HPLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		HPLabel.setBounds(22, 320, 131, 30);
		contentPane.add(HPLabel);
		
		JLabel FuerzaLabel = new JLabel("FUERZA");
		FuerzaLabel.setForeground(Color.WHITE);
		FuerzaLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		FuerzaLabel.setBounds(22, 110, 65, 30);
		contentPane.add(FuerzaLabel);
		
		JLabel ConstitucionLabel = new JLabel("CONSTITUCION\r\n");
		ConstitucionLabel.setForeground(Color.WHITE);
		ConstitucionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		ConstitucionLabel.setBounds(22, 250, 112, 30);
		contentPane.add(ConstitucionLabel);
		
		JLabel SabiduriaLabel = new JLabel("SABIDURIA");
		SabiduriaLabel.setForeground(Color.WHITE);
		SabiduriaLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		SabiduriaLabel.setBounds(287, 180, 112, 30);
		contentPane.add(SabiduriaLabel);
		
		JLabel CarismaLabel = new JLabel("CARISMA");
		CarismaLabel.setForeground(Color.WHITE);
		CarismaLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		CarismaLabel.setBounds(287, 250, 112, 30);
		contentPane.add(CarismaLabel);
		
		JLabel InteligenciaLabel = new JLabel("INTELIGENCIA");
		InteligenciaLabel.setForeground(Color.WHITE);
		InteligenciaLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		InteligenciaLabel.setBounds(287, 110, 98, 30);
		contentPane.add(InteligenciaLabel);
		
        JLabel imagen = new JLabel(); 
        imagen.setIcon(new ImageIcon("Interfaces/src/vista/FondoRojo.jpg")); 
        Dimension size = imagen.getPreferredSize(); 
        imagen.setBounds(50, 30, size.width, size.height); 
        contentPane.add(imagen);
		
		comboBoxFue = new JComboBox();
		comboBoxFue.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxFue.setBounds(170, 113, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxFue.addItem(i);
		}
		contentPane.add(comboBoxFue);
		
		comboBoxDes = new JComboBox<Integer>();
		comboBoxDes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxDes.setBounds(170, 183, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxDes.addItem(i);
		}
		contentPane.add(comboBoxDes);
		
		comboBoxCons = new JComboBox<Integer>();
		comboBoxCons.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxCons.setBounds(170, 253, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxCons.addItem(i);
		}
		contentPane.add(comboBoxCons);
		
		comboBoxCar = new JComboBox<Integer>();
		comboBoxCar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxCar.setBounds(421, 253, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxCar.addItem(i);
		}
		contentPane.add(comboBoxCar);
		
		comboBoxSab = new JComboBox<Integer>();
		comboBoxSab.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxSab.setBounds(421, 183, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxSab.addItem(i);
		}
		contentPane.add(comboBoxSab);
		
		comboBoxInt = new JComboBox<Integer>();
		comboBoxInt.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxInt.setBounds(421, 113, 57, 24);
		for(int i=1;i<=20;i++) {
			comboBoxInt.addItem(i);
		}
		contentPane.add(comboBoxInt);
		
		JLabel Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon(EditarPersonaje.class.getResource("/image/FondoRojo.jpg")));
		Imagen.setBounds(508, 0, 278, 463);
		ImageIcon ico = new ImageIcon(getClass().getResource("/image/FondoRojo.jpg"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_SMOOTH));
		Imagen.setIcon(img);
		contentPane.add(Imagen);
		
		JLabel OroLabel = new JLabel("ORO");
		OroLabel.setForeground(Color.WHITE);
		OroLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		OroLabel.setBounds(22, 390, 44, 30);
		contentPane.add(OroLabel);
		
		Oro = new JTextField();
		Oro.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		Oro.setColumns(10);
		Oro.setBounds(170, 393, 122, 24);
		contentPane.add(Oro);
		
		
	}

	public JTextField getTextField() {
		return Oro;
	}

	public JTextField getOro() {
		return Oro;
	}

	public void setOro(JTextField oro) {
		Oro = oro;
	}

	public JButton getBtnFinalizar() {
		return btnFinalizar;
	}

	public void setBtnFinalizar(JButton finalizar) {
		this.btnFinalizar = finalizar;
	}
	public JTextField getHP() {
		return HP;
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

}
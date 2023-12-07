package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class StartView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton tienda;
	private JButton consultarPersonaje;
	private JButton crearPersonaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartView frame = new StartView();
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
	public StartView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(166, 246, 175));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(96, 219, 194));
		panel.setBounds(22, 21, 738, 415);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("D-D Manager");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 35));
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBounds(56, 33, 272, 80);
		panel.add(lblNewLabel);
		
		 consultarPersonaje = new JButton("Consultar personaje");
		consultarPersonaje.setBounds(79, 220, 230, 75);
		panel.add(consultarPersonaje);
		
		 tienda = new JButton("Editar tienda");
		tienda.setBounds(79, 308, 230, 62);
		panel.add(tienda);
		
		 crearPersonaje = new JButton("Crear personaje");
		crearPersonaje.setBounds(79, 138, 230, 69);
		panel.add(crearPersonaje);
	}

	public JButton getTienda() {
		return tienda;
	}

	public void setTienda(JButton tienda) {
		this.tienda = tienda;
	}

	public JButton getConsultarPersonaje() {
		return consultarPersonaje;
	}

	public void setConsultarPersonaje(JButton consultarPersonaje) {
		this.consultarPersonaje = consultarPersonaje;
	}

	public JButton getCrearPersonaje() {
		return crearPersonaje;
	}

	public void setCrearPersonaje(JButton crearPersonaje) {
		this.crearPersonaje = crearPersonaje;
	}
	
	
}

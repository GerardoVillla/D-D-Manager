package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import javax.swing.DropMode;

public class CrearTiendaView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearTiendaView frame = new CrearTiendaView();
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
	public CrearTiendaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setDoubleBuffered(false);
		panel.setBackground(new Color(0, 217, 174));
		panel.setBounds(0, 0, 784, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crear Tienda");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
		lblNewLabel.setBounds(288, 25, 190, 43);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 170, 124));
		panel_1.setBounds(100, 100, 580, 300);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(125, 60, 60, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descripción:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(103, 125, 82, 25);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField.setFont(new Font("Segoe UI", Font.BOLD, 16));
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(0, 170, 124));
		textField.setBounds(195, 64, 205, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(195, 83, 205, 2);
		panel_1.add(separator);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setRows(5);
		textArea.setLineWrap(true);
		textArea.setColumns(20);
		textArea.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textArea.setForeground(Color.WHITE);
		textArea.setBorder(new LineBorder(Color.WHITE));
		textArea.setBackground(new Color(0, 170, 124));
		textArea.setBounds(195, 127, 205, 90);
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Importar Tienda");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		btnNewButton.setBackground(new Color(0, 217, 174));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setBounds(150, 245, 125, 25);
		panel_1.add(btnNewButton);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAceptar.setBackground(new Color(0, 217, 174));
		btnAceptar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAceptar.setBounds(310, 245, 125, 25);
		panel_1.add(btnAceptar);
	}
}

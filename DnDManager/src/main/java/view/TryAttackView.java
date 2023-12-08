package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TryAttackView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField caValue;
	private JButton btnTryAttack;
	private JButton btnCancelar;
	private JLabel regMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryAttackView frame = new TryAttackView();
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
	public TryAttackView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa la CA a superar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(96, 11, 271, 65);
		contentPane.add(lblNewLabel);
		
		caValue = new JTextField();
		caValue.setBounds(141, 76, 159, 41);
		contentPane.add(caValue);
		caValue.setColumns(10);
		
		btnTryAttack = new JButton("Atacar");
		btnTryAttack.setBounds(55, 144, 147, 41);
		contentPane.add(btnTryAttack);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(226, 144, 147, 41);
		contentPane.add(this.btnCancelar);
		
		regMessage = new JLabel("");
		regMessage.setFont(new Font("Segoe UI", Font.BOLD, 18));
		regMessage.setHorizontalAlignment(SwingConstants.CENTER);
		regMessage.setBounds(119, 212, 190, 38);
		contentPane.add(regMessage);
	}

	public JLabel getRegMessage() {
		return regMessage;
	}

	public void setRegMessage(JLabel regMessage) {
		this.regMessage = regMessage;
	}

	public JButton getBtnTryAttack() {
		return btnTryAttack;
	}

	public void setBtnTryAttack(JButton tryAttack) {
		this.btnTryAttack = tryAttack;
	}

	public JTextField getTextField() {
		return caValue;
	}

	public void setTextField(JTextField textField) {
		this.caValue = textField;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
	
	
}
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NameField;
	private JPanel BG;
	private JLabel Title;
	private JPanel DataBG;
	private JLabel NameLabel;
	private JLabel DescriptionLabel;
	private JSeparator NameLine;
	private JTextArea DescriptionField;
	private JButton btnImport;
	private JButton btnAccept;
	private JLabel regMessage;

	/**
	 * Create the frame.
	 */
	public Window1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BG = new JPanel();
		BG.setDoubleBuffered(false);
		BG.setBackground(new Color(0, 217, 174));
		BG.setBounds(0, 0, 784, 461);
		contentPane.add(BG);
		BG.setLayout(null);
		
		Title = new JLabel("Crear Tienda");
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("Segoe UI", Font.BOLD, 32));
		Title.setBounds(288, 25, 190, 43);
		BG.add(Title);
		
		DataBG = new JPanel();
		DataBG.setBackground(new Color(0, 170, 124));
		DataBG.setBounds(100, 100, 580, 300);
		BG.add(DataBG);
		DataBG.setLayout(null);
		
		NameLabel = new JLabel("Nombre:");
		NameLabel.setForeground(Color.WHITE);
		NameLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NameLabel.setBounds(125, 60, 60, 25);
		DataBG.add(NameLabel);
		
		DescriptionLabel = new JLabel("Descripción:");
		DescriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DescriptionLabel.setForeground(Color.WHITE);
		DescriptionLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		DescriptionLabel.setBounds(103, 125, 82, 25);
		DataBG.add(DescriptionLabel);
		
		NameField = new JTextField();
		NameField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		NameField.setFont(new Font("Segoe UI", Font.BOLD, 16));
		NameField.setForeground(Color.WHITE);
		NameField.setBackground(new Color(0, 170, 124));
		NameField.setBounds(195, 64, 205, 20);
		DataBG.add(NameField);
		NameField.setColumns(10);
		
		NameLine = new JSeparator();
		NameLine.setBounds(195, 83, 205, 2);
		DataBG.add(NameLine);
		
		DescriptionField = new JTextArea();
		DescriptionField.setWrapStyleWord(true);
		DescriptionField.setRows(5);
		DescriptionField.setLineWrap(true);
		DescriptionField.setColumns(20);
		DescriptionField.setFont(new Font("Segoe UI", Font.BOLD, 14));
		DescriptionField.setForeground(Color.WHITE);
		DescriptionField.setBorder(new LineBorder(Color.WHITE));
		DescriptionField.setBackground(new Color(0, 170, 124));
		DescriptionField.setBounds(195, 127, 205, 90);
		DataBG.add(DescriptionField);
		
		btnImport = new JButton("Salir");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImport.setContentAreaFilled(false);
		btnImport.setForeground(Color.WHITE);
		btnImport.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImport.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		btnImport.setBackground(new Color(0, 217, 174));
		btnImport.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnImport.setBounds(150, 245, 125, 25);
		DataBG.add(btnImport);
		
		btnAccept = new JButton("Aceptar");
		btnAccept.setContentAreaFilled(false);
		btnAccept.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAccept.setForeground(Color.WHITE);
		btnAccept.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAccept.setBackground(new Color(0, 217, 174));
		btnAccept.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAccept.setBounds(310, 245, 125, 25);
		DataBG.add(btnAccept);
		
		regMessage = new JLabel("");
		regMessage.setForeground(Color.WHITE);
		regMessage.setFont(new Font("Segoe UI", Font.BOLD, 20));
		regMessage.setHorizontalAlignment(SwingConstants.CENTER);
		regMessage.setBounds(100, 411, 580, 39);
		BG.add(regMessage);
	}

	public JLabel getRegMessage() {
		return regMessage;
	}

	public void setRegMessage(JLabel regMessage) {
		this.regMessage = regMessage;
	}

	public JTextField getNameField() {
		return NameField;
	}

	public void setNameField(JTextField nameField) {
		NameField = nameField;
	}

	public JPanel getBG() {
		return BG;
	}

	public void setBG(JPanel bG) {
		BG = bG;
	}

	public String getTitle() {
		return Title.getText();
	}

	public void setTitle(JLabel title) {
		Title = title;
	}

	public JPanel getDataBG() {
		return DataBG;
	}

	public void setDataBG(JPanel dataBG) {
		DataBG = dataBG;
	}

	public JLabel getNameLabel() {
		return NameLabel;
	}

	public void setNameLabel(JLabel nameLabel) {
		NameLabel = nameLabel;
	}

	public JLabel getDescriptionLabel() {
		return DescriptionLabel;
	}

	public void setDescriptionLabel(JLabel descriptionLabel) {
		DescriptionLabel = descriptionLabel;
	}

	public JSeparator getNameLine() {
		return NameLine;
	}

	public void setNameLine(JSeparator nameLine) {
		NameLine = nameLine;
	}

	public JTextArea getDescriptionField() {
		return DescriptionField;
	}

	public void setDescriptionField(JTextArea descriptionField) {
		DescriptionField = descriptionField;
	}

	public JButton getBtnImport() {
		return btnImport;
	}

	public void setBtnImport(JButton btnImport) {
		this.btnImport = btnImport;
	}

	public JButton getBtnAccept() {
		return btnAccept;
	}

	public void setBtnAccept(JButton btnAccept) {
		this.btnAccept = btnAccept;
	}
}
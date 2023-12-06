package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Window2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CurrentHPValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 frame = new Window2();
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
	public Window2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BG = new JPanel();
		BG.setBackground(new Color(0, 88, 200));
		BG.setBounds(0, 0, 784, 461);
		contentPane.add(BG);
		BG.setLayout(null);
		
		JPanel CharacterBG = new JPanel();
		CharacterBG.setBorder(null);
		CharacterBG.setBackground(new Color(8, 65, 138));
		CharacterBG.setBounds(10, 90, 180, 360);
		BG.add(CharacterBG);
		CharacterBG.setLayout(null);
		
		JPanel StatsBG = new JPanel();
		StatsBG.setBackground(new Color(8, 65, 138));
		StatsBG.setBounds(220, 10, 250, 440);
		BG.add(StatsBG);
		StatsBG.setLayout(null);
		
		JLabel StatsTitle = new JLabel("Estadisticas de");
		StatsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		StatsTitle.setForeground(Color.WHITE);
		StatsTitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
		StatsTitle.setBounds(35, 0, 180, 32);
		StatsBG.add(StatsTitle);
		
		JLabel StatsTitle2 = new JLabel("Personaje");
		StatsTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		StatsTitle2.setForeground(Color.WHITE);
		StatsTitle2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		StatsTitle2.setBounds(35, 28, 180, 32);
		StatsBG.add(StatsTitle2);
		
		JLabel StrenghtLabel = new JLabel("Fuerza:");
		StrenghtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StrenghtLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		StrenghtLabel.setForeground(Color.WHITE);
		StrenghtLabel.setBounds(55, 80, 80, 20);
		StatsBG.add(StrenghtLabel);
		
		JLabel DexterityLabel = new JLabel("Destreza:");
		DexterityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DexterityLabel.setForeground(Color.WHITE);
		DexterityLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		DexterityLabel.setBounds(55, 110, 80, 20);
		StatsBG.add(DexterityLabel);
		
		JLabel ConstitutionLabel = new JLabel("Constitución:");
		ConstitutionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ConstitutionLabel.setForeground(Color.WHITE);
		ConstitutionLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		ConstitutionLabel.setBounds(55, 140, 80, 20);
		StatsBG.add(ConstitutionLabel);
		
		JLabel WisdomLabel = new JLabel("Sabiduria:");
		WisdomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WisdomLabel.setForeground(Color.WHITE);
		WisdomLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		WisdomLabel.setBounds(55, 170, 80, 20);
		StatsBG.add(WisdomLabel);
		
		JLabel CharismaLabel = new JLabel("Carisma:");
		CharismaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CharismaLabel.setForeground(Color.WHITE);
		CharismaLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CharismaLabel.setBounds(55, 200, 80, 20);
		StatsBG.add(CharismaLabel);
		
		JLabel IntelligenceLabel = new JLabel("Inteligencia:");
		IntelligenceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		IntelligenceLabel.setForeground(Color.WHITE);
		IntelligenceLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		IntelligenceLabel.setBounds(55, 230, 80, 20);
		StatsBG.add(IntelligenceLabel);
		
		JLabel LevelLabel = new JLabel("Nivel:");
		LevelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LevelLabel.setForeground(Color.WHITE);
		LevelLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		LevelLabel.setBounds(10, 300, 70, 20);
		StatsBG.add(LevelLabel);
		
		JLabel MaxHPLabel = new JLabel("MAX HP:");
		MaxHPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MaxHPLabel.setForeground(Color.WHITE);
		MaxHPLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		MaxHPLabel.setBounds(115, 285, 60, 20);
		StatsBG.add(MaxHPLabel);
		
		JLabel CurrentHPLabel = new JLabel("HP Actual:");
		CurrentHPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CurrentHPLabel.setForeground(Color.WHITE);
		CurrentHPLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CurrentHPLabel.setBounds(115, 315, 60, 20);
		StatsBG.add(CurrentHPLabel);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(80, 395, 90, 25);
		StatsBG.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atacar");
		btnNewButton_1.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_1.setBounds(130, 355, 90, 25);
		StatsBG.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Acción");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_2.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBounds(30, 355, 90, 25);
		StatsBG.add(btnNewButton_2);
		
		JLabel StrenghtValue = new JLabel("1");
		StrenghtValue.setHorizontalAlignment(SwingConstants.CENTER);
		StrenghtValue.setForeground(Color.WHITE);
		StrenghtValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		StrenghtValue.setBounds(165, 80, 30, 20);
		StatsBG.add(StrenghtValue);
		
		JLabel DexterityValue = new JLabel("1");
		DexterityValue.setHorizontalAlignment(SwingConstants.CENTER);
		DexterityValue.setForeground(Color.WHITE);
		DexterityValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		DexterityValue.setBounds(165, 110, 30, 20);
		StatsBG.add(DexterityValue);
		
		JLabel ConstitutionValue = new JLabel("1");
		ConstitutionValue.setHorizontalAlignment(SwingConstants.CENTER);
		ConstitutionValue.setForeground(Color.WHITE);
		ConstitutionValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		ConstitutionValue.setBounds(165, 140, 30, 20);
		StatsBG.add(ConstitutionValue);
		
		JLabel WisdomValue = new JLabel("1");
		WisdomValue.setHorizontalAlignment(SwingConstants.CENTER);
		WisdomValue.setForeground(Color.WHITE);
		WisdomValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		WisdomValue.setBounds(165, 170, 30, 20);
		StatsBG.add(WisdomValue);
		
		JLabel CharismaValue = new JLabel("1");
		CharismaValue.setHorizontalAlignment(SwingConstants.CENTER);
		CharismaValue.setForeground(Color.WHITE);
		CharismaValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CharismaValue.setBounds(165, 200, 30, 20);
		StatsBG.add(CharismaValue);
		
		JLabel IntelligenceValue = new JLabel("1");
		IntelligenceValue.setHorizontalAlignment(SwingConstants.CENTER);
		IntelligenceValue.setForeground(Color.WHITE);
		IntelligenceValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		IntelligenceValue.setBounds(165, 230, 30, 20);
		StatsBG.add(IntelligenceValue);
		
		JLabel LevelValue = new JLabel("1");
		LevelValue.setHorizontalAlignment(SwingConstants.CENTER);
		LevelValue.setForeground(Color.WHITE);
		LevelValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		LevelValue.setBounds(75, 300, 30, 20);
		StatsBG.add(LevelValue);
		
		JLabel MaxHPValue = new JLabel("1");
		MaxHPValue.setHorizontalAlignment(SwingConstants.CENTER);
		MaxHPValue.setForeground(Color.WHITE);
		MaxHPValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		MaxHPValue.setBounds(185, 285, 30, 20);
		StatsBG.add(MaxHPValue);
		
		CurrentHPValue = new JTextField();
		CurrentHPValue.setBackground(new Color(8, 65, 138));
		CurrentHPValue.setHorizontalAlignment(SwingConstants.CENTER);
		CurrentHPValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CurrentHPValue.setForeground(Color.WHITE);
		CurrentHPValue.setBounds(185, 315, 30, 20);
		StatsBG.add(CurrentHPValue);
		CurrentHPValue.setColumns(10);
		
		JPanel InventoryBG = new JPanel();
		InventoryBG.setBackground(new Color(8, 65, 138));
		InventoryBG.setLayout(null);
		InventoryBG.setBounds(500, 10, 250, 440);
		BG.add(InventoryBG);
		
		JLabel lblInventario = new JLabel("Inventario");
		lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventario.setForeground(Color.WHITE);
		lblInventario.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblInventario.setBounds(36, 11, 180, 32);
		InventoryBG.add(lblInventario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Segoe UI", Font.BOLD, 12));
		scrollPane.setBackground(new Color(8, 65, 138));
		scrollPane.setBounds(10, 54, 230, 375);
		InventoryBG.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(new Color(8, 65, 138));
		scrollPane.setRowHeaderView(scrollBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(8, 65, 138));
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBackground(new Color(8, 65, 138));
		list.setBounds(0, 0, 211, 373);
		panel.add(list);
		
		JLabel Title = new JLabel("Consulta de");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("Segoe UI", Font.BOLD, 30));
		Title.setBounds(10, 10, 180, 32);
		BG.add(Title);
		
		JLabel Title2 = new JLabel("Personaje");
		Title2.setHorizontalAlignment(SwingConstants.CENTER);
		Title2.setForeground(Color.WHITE);
		Title2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		Title2.setBounds(10, 47, 180, 32);
		BG.add(Title2);
	}
}

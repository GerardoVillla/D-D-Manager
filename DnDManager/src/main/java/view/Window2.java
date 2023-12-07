package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.W2Controller;
import model.Character;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JInternalFrame;
import java.awt.Cursor;

public class Window2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CurrentHPValue;
	private JPanel BG;
	private JPanel CharacterBG;
	private JPanel StatsBG;
	private JLabel StatsTitle;
	private JLabel StatsTitle2;
	private JLabel StrenghtLabel;
	private JLabel DexterityLabel;
	private JLabel ConstitutionLabel;
	private JLabel WisdomLabel;
	private JLabel CharismaLabel;
	private JLabel IntelligenceLabel;
	private JLabel LevelLabel;
	private JLabel MaxHPLabel;
	private JLabel CurrentHPLabel;
	private JButton btnEdit;
	private JButton btnAttack;
	private JButton btnAction;
	private JLabel StrenghtValue;
	private JLabel DexterityValue;
	private JLabel ConstitutionValue;
	private JLabel WisdomValue;
	private JLabel CharismaValue;
	private JLabel IntelligenceValue;
	private JLabel LevelValue;
	private JLabel MaxHPValue;
	private JPanel InventoryBG;
	private JLabel lblInventario;
	private JLabel Title;
	private JLabel Title2;
	private JButton btnBuySell;
	private JList<Character> list;
	private DefaultListModel dlm;
	private JButton btnAddCh;

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
		
		BG = new JPanel();
		BG.setBackground(new Color(0, 88, 200));
		BG.setBounds(0, 0, 784, 461);
		contentPane.add(BG);
		BG.setLayout(null);
		
		CharacterBG = new JPanel();
		CharacterBG.setBorder(null);
		CharacterBG.setBackground(new Color(8, 65, 138));
		CharacterBG.setBounds(10, 90, 180, 360);
		BG.add(CharacterBG);
		CharacterBG.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		scrollPane.setAutoscrolls(true);
		scrollPane.setBackground(new Color(8, 65, 138));
		scrollPane.setBounds(0, 0, 180, 360);
		CharacterBG.add(scrollPane);
		
		list = new JList<Character>();
		list.setForeground(Color.WHITE);
		list.setFont(new Font("Segoe UI", Font.BOLD, 20));
		dlm = new DefaultListModel<Character>();
		list.setBackground(new Color(8, 65, 138));
		scrollPane.setViewportView(list);

		
		StatsBG = new JPanel();
		StatsBG.setBackground(new Color(8, 65, 138));
		StatsBG.setBounds(220, 10, 250, 440);
		BG.add(StatsBG);
		StatsBG.setLayout(null);
		
		StatsTitle = new JLabel("Estadisticas de");
		StatsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		StatsTitle.setForeground(Color.WHITE);
		StatsTitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
		StatsTitle.setBounds(35, 0, 180, 32);
		StatsBG.add(StatsTitle);
		
		StatsTitle2 = new JLabel("Personaje");
		StatsTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		StatsTitle2.setForeground(Color.WHITE);
		StatsTitle2.setFont(new Font("Segoe UI", Font.BOLD, 24));
		StatsTitle2.setBounds(35, 28, 180, 32);
		StatsBG.add(StatsTitle2);
		
		StrenghtLabel = new JLabel("Fuerza:");
		StrenghtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StrenghtLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		StrenghtLabel.setForeground(Color.WHITE);
		StrenghtLabel.setBounds(55, 80, 80, 20);
		StatsBG.add(StrenghtLabel);
		
		DexterityLabel = new JLabel("Destreza:");
		DexterityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DexterityLabel.setForeground(Color.WHITE);
		DexterityLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		DexterityLabel.setBounds(55, 110, 80, 20);
		StatsBG.add(DexterityLabel);
		
		ConstitutionLabel = new JLabel("Constitución:");
		ConstitutionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ConstitutionLabel.setForeground(Color.WHITE);
		ConstitutionLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		ConstitutionLabel.setBounds(55, 140, 80, 20);
		StatsBG.add(ConstitutionLabel);
		
		WisdomLabel = new JLabel("Sabiduria:");
		WisdomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WisdomLabel.setForeground(Color.WHITE);
		WisdomLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		WisdomLabel.setBounds(55, 170, 80, 20);
		StatsBG.add(WisdomLabel);
		
		CharismaLabel = new JLabel("Carisma:");
		CharismaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CharismaLabel.setForeground(Color.WHITE);
		CharismaLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CharismaLabel.setBounds(55, 200, 80, 20);
		StatsBG.add(CharismaLabel);
		
		IntelligenceLabel = new JLabel("Inteligencia:");
		IntelligenceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		IntelligenceLabel.setForeground(Color.WHITE);
		IntelligenceLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		IntelligenceLabel.setBounds(55, 230, 80, 20);
		StatsBG.add(IntelligenceLabel);
		
		LevelLabel = new JLabel("Nivel:");
		LevelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LevelLabel.setForeground(Color.WHITE);
		LevelLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		LevelLabel.setBounds(10, 300, 70, 20);
		StatsBG.add(LevelLabel);
		
		MaxHPLabel = new JLabel("MAX HP:");
		MaxHPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MaxHPLabel.setForeground(Color.WHITE);
		MaxHPLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		MaxHPLabel.setBounds(115, 285, 60, 20);
		StatsBG.add(MaxHPLabel);
		
		CurrentHPLabel = new JLabel("HP Actual:");
		CurrentHPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CurrentHPLabel.setForeground(Color.WHITE);
		CurrentHPLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CurrentHPLabel.setBounds(115, 315, 60, 20);
		StatsBG.add(CurrentHPLabel);
		
		btnEdit = new JButton("Editar");
		btnEdit.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnEdit.setContentAreaFilled(false);
		btnEdit.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setBounds(80, 395, 90, 25);
		StatsBG.add(btnEdit);
		
		btnAttack = new JButton("Atacar");
		btnAttack.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAttack.setContentAreaFilled(false);
		btnAttack.setForeground(Color.WHITE);
		btnAttack.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAttack.setBounds(130, 355, 90, 25);
		StatsBG.add(btnAttack);
		
		btnAction = new JButton("Acción");
		btnAction.setForeground(Color.WHITE);
		btnAction.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAction.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAction.setContentAreaFilled(false);
		btnAction.setBounds(30, 355, 90, 25);
		StatsBG.add(btnAction);
		
		StrenghtValue = new JLabel("1");
		StrenghtValue.setHorizontalAlignment(SwingConstants.CENTER);
		StrenghtValue.setForeground(Color.WHITE);
		StrenghtValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		StrenghtValue.setBounds(165, 80, 30, 20);
		StatsBG.add(StrenghtValue);
		
		DexterityValue = new JLabel("1");
		DexterityValue.setHorizontalAlignment(SwingConstants.CENTER);
		DexterityValue.setForeground(Color.WHITE);
		DexterityValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		DexterityValue.setBounds(165, 110, 30, 20);
		StatsBG.add(DexterityValue);
		
		ConstitutionValue = new JLabel("1");
		ConstitutionValue.setHorizontalAlignment(SwingConstants.CENTER);
		ConstitutionValue.setForeground(Color.WHITE);
		ConstitutionValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		ConstitutionValue.setBounds(165, 140, 30, 20);
		StatsBG.add(ConstitutionValue);
		
		WisdomValue = new JLabel("1");
		WisdomValue.setHorizontalAlignment(SwingConstants.CENTER);
		WisdomValue.setForeground(Color.WHITE);
		WisdomValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		WisdomValue.setBounds(165, 170, 30, 20);
		StatsBG.add(WisdomValue);
		
		CharismaValue = new JLabel("1");
		CharismaValue.setHorizontalAlignment(SwingConstants.CENTER);
		CharismaValue.setForeground(Color.WHITE);
		CharismaValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		CharismaValue.setBounds(165, 200, 30, 20);
		StatsBG.add(CharismaValue);
		
		IntelligenceValue = new JLabel("1");
		IntelligenceValue.setHorizontalAlignment(SwingConstants.CENTER);
		IntelligenceValue.setForeground(Color.WHITE);
		IntelligenceValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		IntelligenceValue.setBounds(165, 230, 30, 20);
		StatsBG.add(IntelligenceValue);
		
		LevelValue = new JLabel("1");
		LevelValue.setHorizontalAlignment(SwingConstants.CENTER);
		LevelValue.setForeground(Color.WHITE);
		LevelValue.setFont(new Font("Segoe UI", Font.BOLD, 12));
		LevelValue.setBounds(75, 300, 30, 20);
		StatsBG.add(LevelValue);
		
		MaxHPValue = new JLabel("1");
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
		
		InventoryBG = new JPanel();
		InventoryBG.setBackground(new Color(8, 65, 138));
		InventoryBG.setBounds(500, 10, 250, 440);
		BG.add(InventoryBG);
		InventoryBG.setLayout(null);
		
		lblInventario = new JLabel("Inventario");
		lblInventario.setBounds(66, 5, 118, 32);
		lblInventario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventario.setForeground(Color.WHITE);
		lblInventario.setFont(new Font("Segoe UI", Font.BOLD, 24));
		InventoryBG.add(lblInventario);
		
		btnBuySell = new JButton("Comprar/Vender");
		btnBuySell.setForeground(Color.WHITE);
		btnBuySell.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnBuySell.setContentAreaFilled(false);
		btnBuySell.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnBuySell.setBounds(66, 404, 118, 25);
		InventoryBG.add(btnBuySell);
		
		btnAddCh = new JButton("Add Character");
		btnAddCh.setBounds(66, 66, 104, 23);
		InventoryBG.add(btnAddCh);
		
		Title = new JLabel("Consulta de");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("Segoe UI", Font.BOLD, 30));
		Title.setBounds(10, 10, 180, 32);
		BG.add(Title);
		
		Title2 = new JLabel("Personaje");
		Title2.setHorizontalAlignment(SwingConstants.CENTER);
		Title2.setForeground(Color.WHITE);
		Title2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		Title2.setBounds(10, 47, 180, 32);
		BG.add(Title2);
	}

	public JButton getBtnAddCh() {
		return btnAddCh;
	}

	public void setBtnAddCh(JButton btnAddCh) {
		this.btnAddCh = btnAddCh;
	}

	public DefaultListModel getDlm() {
		return dlm;
	}

	public void setDlm(DefaultListModel dlm) {
		this.dlm = dlm;
	}

	public JList<Character> getList() {
		return list;
	}

	public void setList(JList<Character> list) {
		this.list = list;
	}

	public JButton getBtnBuySell() {
		return btnBuySell;
	}

	public void setBtnBuySell(JButton btnBuySell) {
		this.btnBuySell = btnBuySell;
	}

	public JTextField getCurrentHPValue() {
		return CurrentHPValue;
	}

	public void setCurrentHPValue(JTextField currentHPValue) {
		CurrentHPValue = currentHPValue;
	}

	public JPanel getBG() {
		return BG;
	}

	public void setBG(JPanel bG) {
		BG = bG;
	}

	public JPanel getCharacterBG() {
		return CharacterBG;
	}

	public void setCharacterBG(JPanel characterBG) {
		CharacterBG = characterBG;
	}

	public JPanel getStatsBG() {
		return StatsBG;
	}

	public void setStatsBG(JPanel statsBG) {
		StatsBG = statsBG;
	}

	public JLabel getStatsTitle() {
		return StatsTitle;
	}

	public void setStatsTitle(JLabel statsTitle) {
		StatsTitle = statsTitle;
	}

	public JLabel getStatsTitle2() {
		return StatsTitle2;
	}

	public void setStatsTitle2(JLabel statsTitle2) {
		StatsTitle2 = statsTitle2;
	}

	public JLabel getStrenghtLabel() {
		return StrenghtLabel;
	}

	public void setStrenghtLabel(JLabel strenghtLabel) {
		StrenghtLabel = strenghtLabel;
	}

	public JLabel getDexterityLabel() {
		return DexterityLabel;
	}

	public void setDexterityLabel(JLabel dexterityLabel) {
		DexterityLabel = dexterityLabel;
	}

	public JLabel getConstitutionLabel() {
		return ConstitutionLabel;
	}

	public void setConstitutionLabel(JLabel constitutionLabel) {
		ConstitutionLabel = constitutionLabel;
	}

	public JLabel getWisdomLabel() {
		return WisdomLabel;
	}

	public void setWisdomLabel(JLabel wisdomLabel) {
		WisdomLabel = wisdomLabel;
	}

	public JLabel getCharismaLabel() {
		return CharismaLabel;
	}

	public void setCharismaLabel(JLabel charismaLabel) {
		CharismaLabel = charismaLabel;
	}

	public JLabel getIntelligenceLabel() {
		return IntelligenceLabel;
	}

	public void setIntelligenceLabel(JLabel intelligenceLabel) {
		IntelligenceLabel = intelligenceLabel;
	}

	public JLabel getLevelLabel() {
		return LevelLabel;
	}

	public void setLevelLabel(JLabel levelLabel) {
		LevelLabel = levelLabel;
	}

	public JLabel getMaxHPLabel() {
		return MaxHPLabel;
	}

	public void setMaxHPLabel(JLabel maxHPLabel) {
		MaxHPLabel = maxHPLabel;
	}

	public JLabel getCurrentHPLabel() {
		return CurrentHPLabel;
	}

	public void setCurrentHPLabel(JLabel currentHPLabel) {
		CurrentHPLabel = currentHPLabel;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	public JButton getBtnAttack() {
		return btnAttack;
	}

	public void setBtnAttack(JButton btnAttack) {
		this.btnAttack = btnAttack;
	}

	public JButton getBtnAction() {
		return btnAction;
	}

	public void setBtnAction(JButton btnAction) {
		this.btnAction = btnAction;
	}

	public JLabel getStrenghtValue() {
		return StrenghtValue;
	}

	public void setStrenghtValue(JLabel strenghtValue) {
		StrenghtValue = strenghtValue;
	}

	public JLabel getDexterityValue() {
		return DexterityValue;
	}

	public void setDexterityValue(JLabel dexterityValue) {
		DexterityValue = dexterityValue;
	}

	public JLabel getConstitutionValue() {
		return ConstitutionValue;
	}

	public void setConstitutionValue(JLabel constitutionValue) {
		ConstitutionValue = constitutionValue;
	}

	public JLabel getWisdomValue() {
		return WisdomValue;
	}

	public void setWisdomValue(JLabel wisdomValue) {
		WisdomValue = wisdomValue;
	}

	public JLabel getCharismaValue() {
		return CharismaValue;
	}

	public void setCharismaValue(JLabel charismaValue) {
		CharismaValue = charismaValue;
	}

	public JLabel getIntelligenceValue() {
		return IntelligenceValue;
	}

	public void setIntelligenceValue(JLabel intelligenceValue) {
		IntelligenceValue = intelligenceValue;
	}

	public JLabel getLevelValue() {
		return LevelValue;
	}

	public void setLevelValue(JLabel levelValue) {
		LevelValue = levelValue;
	}

	public JLabel getMaxHPValue() {
		return MaxHPValue;
	}

	public void setMaxHPValue(JLabel maxHPValue) {
		MaxHPValue = maxHPValue;
	}

	public JPanel getInventoryBG() {
		return InventoryBG;
	}

	public void setInventoryBG(JPanel inventoryBG) {
		InventoryBG = inventoryBG;
	}

	public JLabel getLblInventario() {
		return lblInventario;
	}

	public void setLblInventario(JLabel lblInventario) {
		this.lblInventario = lblInventario;
	}

	public String getTitle() {
		return Title.getText();
	}

	public void setTitle(JLabel title) {
		Title = title;
	}

	public JLabel getTitle2() {
		return Title2;
	}

	public void setTitle2(JLabel title2) {
		Title2 = title2;
	}
}

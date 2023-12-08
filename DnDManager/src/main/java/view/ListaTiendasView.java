
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;


import model.Store;

public class ListaTiendasView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList list;
	private JLabel lblTitle;
	private JButton btnAddStore;
	private DefaultListModel<Store> dlm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaTiendasView frame = new ListaTiendasView();
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
	public ListaTiendasView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(201, 134, 71));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(140, 70, 0));
		panel.setBounds(57, 76, 673, 326);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 653, 304);
		panel.add(scrollPane);
		
		list = new JList();
		list.setForeground(Color.WHITE);
		list.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		list.setBackground(new Color(140, 70, 0));
		dlm = new DefaultListModel<Store>();
		scrollPane.setViewportView(list);
		
		lblTitle = new JLabel("Selecciona una tienda");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		lblTitle.setBounds(269, 29, 262, 26);
		contentPane.add(lblTitle);
		
		btnAddStore = new JButton("Crear Tienda");
		btnAddStore.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnAddStore.setForeground(Color.WHITE);
		btnAddStore.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnAddStore.setContentAreaFilled(false);
		btnAddStore.setBounds(325, 413, 141, 37);
		contentPane.add(btnAddStore);
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public JButton getBtnAddStore() {
		return btnAddStore;
	}

	public void setBtnAddStore(JButton btnAddStore) {
		this.btnAddStore = btnAddStore;
	}

	public DefaultListModel<Store> getDlm() {
		return dlm;
	}

	public void setDlm(DefaultListModel<Store> dlm) {
		this.dlm = dlm;
	}
}

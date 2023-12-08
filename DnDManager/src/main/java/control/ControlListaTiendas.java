package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dao.CharacterDao;
import dao.StoreDao;
import model.Store;
import view.ListaTiendasView;
import view.StoreObjectView;
import view.Window1;

public class ControlListaTiendas implements ActionListener{
	private ArrayList<Store> stores;
	private ListaTiendasView ltv;
	private CharacterDao cd;
	private StoreDao sd;
	
	public ControlListaTiendas(CharacterDao cd, StoreDao sd, ListaTiendasView ltv) {
		this.cd = cd;
		this.sd = sd;
		this.ltv = ltv;
		this.stores = (ArrayList<Store>) this.sd.getStores();
		
		ltv.getBtnAddStore().addActionListener(this);
		
		for(Store store: this.stores) {
			ltv.getDlm().addElement(store);
		}
		
		ltv.getList().setCellRenderer(new ListCellRenderer<Store>() {
		    public Component getListCellRendererComponent(JList<? extends Store> list, Store value, int index, boolean isSelected, boolean cellHasFocus) {
		        String displayString = value.getName();
		        JLabel label = new JLabel(displayString);
		        if (isSelected) {
		            label.setBackground(list.getSelectionBackground());
		            label.setForeground(list.getSelectionForeground());
		        } else {
		            label.setBackground(list.getBackground());
		            label.setForeground(list.getForeground());
		        }
		        return label;
		    }
		});
		
		ltv.getList().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				if(!e.getValueIsAdjusting()) {
					
					//Store sc = (Store) ltv.getList().getSelectedValue();
					int index = ltv.getList().getSelectedIndex();
					
					StoreObjectView sov= new StoreObjectView();
					ControlStoreObject csb=new ControlStoreObject( cd, sd,  sov,  index);
					sov.setVisible(true);
					
					ltv.dispose();
				}
			}
			
		}
		);
		ltv.getList().setModel(ltv.getDlm());
	}

	public void actionPerformed(ActionEvent e) {
		if (ltv.getBtnAddStore() == e.getSource()) {
			Window1 w1=new Window1();
			W1Controller w1c=new W1Controller(cd,sd,w1);
			w1.setVisible(true);
			ltv.dispose();
		}
	}
	
}
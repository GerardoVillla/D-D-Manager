package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import dao.CharacterDao;
import dao.StoreDao;
import model.Armor;
import model.Item;
import model.Shield;
import model.Store;
import model.Usable;
import model.Weapon;
import view.StoreObjectView;

public class ControlStoreObject implements ActionListener{
	
	private ArrayList<Item> items;
	private Store store;
	private ArrayList<Store> stores;
	private StoreDao sd;
	private CharacterDao cd;
	private StoreObjectView storeObjectView;
	private int i;
	
	public ControlStoreObject(CharacterDao cd,StoreDao sd, StoreObjectView storeObjectView, int i) {
		this.sd = sd;
		this.cd=cd;
		this.stores= (ArrayList<Store>) sd.getStores();
		this.storeObjectView = storeObjectView;
		this.i=i;
		System.out.println(this.stores.get(this.i));
		System.out.println(i);
		
		storeObjectView.getBtnAddItem().addActionListener(this);
		for(Item item: this.stores.get(i).getStorage().getEquippableitems()) {
			storeObjectView.getDlm().addElement(item);
		}
		for(Item item: this.stores.get(i).getStorage().getUsableitems()) {
			storeObjectView.getDlm().addElement(item);
		}
		storeObjectView.getListItem().setCellRenderer(new ListCellRenderer<Item>() {
		    public Component getListCellRendererComponent(JList<? extends Item> list, Item value, int index, boolean isSelected, boolean cellHasFocus) {
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
		storeObjectView.getListItem().setModel(storeObjectView.getDlm());
		
	}
	//getEquippableItem

	public void actionPerformed(ActionEvent e) {
		
		String name = storeObjectView.getNameValue().getText();
		String description = storeObjectView.getDescriptionValue().getText();
		int price = Integer.parseInt(storeObjectView.getPriceValue().getText());
		int dieN = Integer.parseInt(storeObjectView.getDieNValue().getText());
		int dieF = Integer.parseInt(storeObjectView.getDieFValue().getText());
		int shieldValue = Integer.parseInt(storeObjectView.getShieldValue().getText());
		int armorClass = Integer.parseInt(storeObjectView.getArmorClassValue().getText());
		int usesLeft = Integer.parseInt(storeObjectView.getUsesValue().getText());
		int healing = Integer.parseInt(storeObjectView.getHealingValue().getText());
		String select=String.valueOf(this.storeObjectView.getTipo().getSelectedItem());
		
		if(storeObjectView.getBtnAddItem() == e.getSource()) {
			switch(select) {
			case "Arma":
				Weapon weapon = new Weapon(name, description, price, dieN, dieF);
				this.stores.get(i).getStorage().addEquippableItem(weapon);
				System.out.println(this.stores.get(i).getStorage().getEquippableItem(0).getName());
				//storeObjectView.getDlm().addElement(weapon);
				break;
			case "Escudo":
				Shield shield= new Shield(name, description, price, shieldValue);
				this.stores.get(i).getStorage().addEquippableItem(shield);
				//storeObjectView.getDlm().addElement(shield);
				break;
			case "Armadura":
				Armor armor=new Armor(name, description, price, armorClass);
				this.stores.get(i).getStorage().addEquippableItem(armor);
				//storeObjectView.getDlm().addElement(armor);
				break;
			case "Consumible":
				Usable usable= new Usable(name, description, price, usesLeft, healing);
				 this.stores.get(i).getStorage().addUsableItem(usable);
				//storeObjectView.getDlm().addElement(usable);
				break;
			
			}
			sd.setStores(stores);
			sd.updateJsonFile();
			storeObjectView.getDescriptionValue().setText(null);
			storeObjectView.getPriceValue().setText(null);
			storeObjectView.getDieFValue().setText(null);
			storeObjectView.getDieNValue().setText(null);
			storeObjectView.getShieldValue().setText(null);
			storeObjectView.getArmorClassValue().setText(null);
			storeObjectView.getUsesValue().setText(null);
			storeObjectView.getNameValue().setText(null);
			storeObjectView.getUsesValue().setText(null);
			storeObjectView.getHealingValue().setText(null);
			
			
			 //System.out.println(this.stores.get(i).getStorage().getEquippableItem(0).getName());
			
		}
		
	}
	
}

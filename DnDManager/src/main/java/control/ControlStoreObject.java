package control;

import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import dao.CharacterDao;
import dao.StoreDao;
import model.*;
import view.StoreObjectView;
import view.*;

public class ControlStoreObject implements ActionListener{
	
	private ArrayList<Item> items;
	private Store store;
	private StoreDao sd;
	private StoreObjectView so;
	
	public ControlStoreObject(StoreDao sd, StoreObjectView so) {
		this.sd = sd;
		this.so = so;
		
		so.getBtnAddItem().addActionListener(this);
		
	}


	public void actionPerformed(ActionEvent e) {
		
		String name = so.getNameValue().getText();
		String description = so.getDescriptionValue().getText();
		int price = Integer.parseInt(so.getPriceValue().getText());
		int dieN = Integer.parseInt(so.getDieNValue().getText());
		int dieF = Integer.parseInt(so.getDieFValue().getText());
		int shieldValue = Integer.parseInt(so.getShieldValue().getText());
		int armorClass = Integer.parseInt(so.getArmorClassValue().getText());
		int usesLeft = Integer.parseInt(so.getUsesValue().getText());
		int healing = Integer.parseInt(so.getHealingValue().getText());
		
		
		if(so.getBtnAddItem() == e.getSource()) {

			if(so.getTypeValue().getText() == "Arma" || so.getTypeValue().getText() == "Weapon") {
				so.getDlm().addElement(new Weapon(name, description, price, false, dieN, dieF));
			}
			else if(so.getTypeValue().getText() == "Escudo" || so.getTypeValue().getText() == "Shield"){
				so.getDlm().addElement(new Shield(name, description, price, false, shieldValue));
			}
			else if(so.getTypeValue().getText() == "Armadura" || so.getTypeValue().getText() == "Armor") {
				so.getDlm().addElement(new Armor(name, description, price, false, armorClass));
			}
			else if(so.getTypeValue().getText() == "Consumible" || so.getTypeValue().getText() == "Usable") {
				so.getDlm().addElement(new Usable(name, description, price, usesLeft, healing));
			}
			
		}
		
	}
	
}

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
import model.Character;
import model.Equippable;
import model.Item;
import model.Store;
import model.Usable;
import view.Tienda;
public class ControlTienda implements ActionListener{
	private int indexStore;
	private int indexChar;
	private int indexBuy;
	private ArrayList<Character> characters;
	private ArrayList<Store>stores;
	private CharacterDao cd;
	private StoreDao sd;
	private Tienda tienda;
	private Item paraComprar;
	private Item paraVender;
	private int indexSell;
	private Equippable sellEq;
	private Usable sellUs;
	
	public ControlTienda(CharacterDao cd, StoreDao sd,Tienda tienda,int indexStore, int indexChar) {
		this.tienda=tienda;
		this.cd=cd;
		this.sd=sd;
		this.stores=(ArrayList<Store>) sd.getStores();
		this.characters=(ArrayList<Character>) cd.getCharacters();
		this.indexChar=indexChar;
		this.indexStore=indexStore;
		this.tienda.getGoldValue().setText(String.valueOf(this.characters.get(indexChar).getMoney()));
		tienda.getBtnComprarObjeto().addActionListener(this);
		tienda.getBtnVender().addActionListener(this);
		
		this.refrech();
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tienda.getBtnComprarObjeto()) {
			if(this.characters.get(indexChar).tryBuy(paraComprar.getPrice())==true) {
				this.characters.get(indexChar).buy(paraComprar);
				cd.setCharacters(characters);
				cd.updateJsonFile();
				this.afterBuy();
			}
			
		}
		if(e.getSource()==tienda.getBtnVender()) {
			if(paraVender instanceof Usable) {
				this.characters.get(indexChar).sell((Usable)paraVender, indexSell);
			}else {
				this.characters.get(indexChar).sell((Equippable)paraVender, indexSell);
			}
			cd.setCharacters(characters);
			cd.updateJsonFile();
			this.afterBuy();
			
		}
		
	}
	
	private void refrech() {
		for(Equippable item:this.stores.get(indexStore).getStorage().getEquippableitems()) {
			tienda.getDlmEq().addElement(item);
		}
		tienda.getListEq().setModel(tienda.getDlmEq());
		tienda.getListEq().setCellRenderer(new ListCellRenderer<Equippable>() {
		    public Component getListCellRendererComponent(JList<? extends Equippable> list, Equippable value, int index, boolean isSelected, boolean cellHasFocus) {
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
		tienda.getListEq().addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
					
				if(!e.getValueIsAdjusting()) {
					Equippable es = (Equippable) tienda.getListEq().getSelectedValue();
					tienda.getPriceValue().setText(String.valueOf(es.getPrice()));;
					paraComprar=es;
				}
			}
			
		});
		
		for(Usable item:this.stores.get(indexStore).getStorage().getUsableitems()) {
			tienda.getDlmUs().addElement(item);
		}
		tienda.getListUs().setModel(tienda.getDlmUs());
		tienda.getListUs().setCellRenderer(new ListCellRenderer<Usable>() {
		    public Component getListCellRendererComponent(JList<? extends Usable> list, Usable value, int index, boolean isSelected, boolean cellHasFocus) {
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
		tienda.getListUs().addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
					
				if(!e.getValueIsAdjusting()) {
					Usable es = (Usable) tienda.getListUs().getSelectedValue();
					tienda.getPriceValue().setText(String.valueOf(es.getPrice()));;
					paraComprar=es;
				}
			}
			
		});
		
		for(Equippable item:this.characters.get(indexChar).getStorage().getEquippableitems()) {
			tienda.getDlmSt().addElement(item);
		}
		for(Usable item:this.characters.get(indexChar).getStorage().getUsableitems()) {
			tienda.getDlmSt().addElement(item);
		}
		tienda.getListStorage().setModel(tienda.getDlmSt());
		tienda.getListStorage().setCellRenderer(new ListCellRenderer<Item>() {
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
		tienda.getListStorage().addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
					
				if(!e.getValueIsAdjusting()) {
					Item es = (Item) tienda.getListStorage().getSelectedValue();
					if(es!=null) {
						tienda.getPriceValue().setText(String.valueOf((es.getPrice())));
					}
					
					paraVender=es;
					indexSell=tienda.getListStorage().getSelectedIndex();
				}
			}
			
		});
		
	}

	/*
	private int  calcVenta(int price) {
		int finalPrice= (int) ((double) price % 0.75);
		return finalPrice;
		
	}
	*/
	
	private void afterBuy() {

		tienda.getDlmSt().clear();
		this.tienda.getGoldValue().setText(String.valueOf(this.characters.get(indexChar).getMoney()));
		
		for(Equippable item:this.characters.get(indexChar).getStorage().getEquippableitems()) {
			tienda.getDlmSt().addElement(item);
		}
		for(Usable item:this.characters.get(indexChar).getStorage().getUsableitems()) {
			tienda.getDlmSt().addElement(item);
		}
		tienda.getListStorage().setModel(tienda.getDlmSt());
		tienda.getListStorage().setCellRenderer(new ListCellRenderer<Item>() {
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
	}
}
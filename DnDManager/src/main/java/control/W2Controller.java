package control;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dao.CharacterDao;
import dao.StoreDao;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;

import model.Character;
import model.*;
import view.*;

public class W2Controller implements ActionListener {
	private ArrayList<Character> characters;
	private Window2 w2;
	private CharacterDao cd;
	private StoreDao sd;
	
	public W2Controller(CharacterDao cd, StoreDao sd,Window2 w2) {
		this.cd=cd;
		this.sd=sd;
		this.w2 = w2;
		this.characters = (ArrayList<Character>) cd.getCharacters();
		
		for(Character character: characters) {
			w2.getDlm().addElement(character);
		}
		w2.getBtnAction().addActionListener(this);
		w2.getBtnAttack().addActionListener(this);
		w2.getBtnEdit().addActionListener(this);
		w2.getBtnBuySell().addActionListener(this);
		w2.getList().setModel(w2.getDlm());
		w2.getList().setCellRenderer(new ListCellRenderer<Character>() {
		    public Component getListCellRendererComponent(JList<? extends Character> list, Character value, int index, boolean isSelected, boolean cellHasFocus) {
		        String displayString = value.getCharacterName();
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
		w2.getList().addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
					
				
				if(!e.getValueIsAdjusting()) {
					Character sc = (model.Character) w2.getList().getSelectedValue();
					w2.getStrenghtValue().setText(String.valueOf(sc.getStrength()));
					w2.getDexterityValue().setText(String.valueOf(sc.getDexterity()));
					w2.getConstitutionValue().setText(String.valueOf(sc.getConstitution()));
					w2.getCharismaValue().setText(String.valueOf(sc.getCharisma()));
					w2.getWisdomValue().setText(String.valueOf(sc.getWisdom()));
					w2.getIntelligenceValue().setText(String.valueOf(sc.getIntelligence()));
					w2.getMaxHPValue().setText(String.valueOf(sc.getMaxHP()));
					w2.getLevelValue().setText(String.valueOf(sc.getLevel()));
				}
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(w2.getBtnAction() == e.getSource()) {
			int r =(int) (Math.random() * 20 + 1);
			System.out.println("Tirada aleatoria: " + r);
			//Falta sumarle el modificador del personaje
		}
		else if(w2.getBtnAttack() == e.getSource()) {
			try {
				System.out.println("Resultado del ataque:" + this.characters.get(0).attack(10));
			}catch(Exception ex) {
				System.out.println("Lo sentimos, aun no hay personajes para atacar");
			}
			
			
		}
		else if(w2.getBtnEdit() == e.getSource()) {
			//Sustituir por la ventana de Editar
			w2.dispose();
		}
		else if(w2.getBtnBuySell() == e.getSource()) {
			//Sustituir por la ventana de Tienda
			w2.dispose();
		}
		
		
	}

}

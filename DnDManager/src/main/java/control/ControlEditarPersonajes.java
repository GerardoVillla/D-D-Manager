package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import dao.CharacterDao;
import dao.StoreDao;
import model.Character;
import view.EditarPersonaje;
import view.Window2;

public class ControlEditarPersonajes implements ActionListener{
	
	private ArrayList<Character> characters;
	private EditarPersonaje epv;
	private CharacterDao cd;
	private StoreDao sd;
	private int ind;
	
	public ControlEditarPersonajes(int ind, EditarPersonaje epv, CharacterDao cd, StoreDao sd) {
		this.cd=cd;
		this.sd=sd;
		this.epv = epv;
		this.characters=(ArrayList<Character>) cd.getCharacters();
		
		epv.getFinalizar().addActionListener(this);
		epv.getAtras().addActionListener(this);
		
		
		epv.getOro().setText(String.valueOf(this.characters.get(ind).getMoney()));
		epv.getHP().setText(String.valueOf(this.characters.get(ind).getMaxHP()));
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		int fue= Integer.parseInt(String.valueOf(this.epv.getComboBoxFue().getSelectedItem()));
		int des= Integer.parseInt(String.valueOf(this.epv.getComboBoxDes().getSelectedItem()));
		int cons= Integer.parseInt(String.valueOf(this.epv.getComboBoxCons().getSelectedItem()));
		int sab= Integer.parseInt(String.valueOf(this.epv.getComboBoxSab().getSelectedItem()));
		int car= Integer.parseInt(String.valueOf(this.epv.getComboBoxCar().getSelectedItem()));
		int inte= Integer.parseInt(String.valueOf(this.epv.getComboBoxInt().getSelectedItem()));
		int lvl= Integer.parseInt(String.valueOf(this.epv.getLvl().getSelectedItem()));
		int hp= Integer.parseInt(String.valueOf(this.epv.getHP().getText()));
		int oro= Integer.parseInt(String.valueOf(this.epv.getOro().getText()));

		this.characters.get(ind).setStrength(fue);
		this.characters.get(ind).setDexterity(des);
		this.characters.get(ind).setConstitution(cons);
		this.characters.get(ind).setWisdom(sab);
		this.characters.get(ind).setCharisma(car);
		this.characters.get(ind).setIntelligence(inte);
		this.characters.get(ind).setLevel(lvl);
		this.characters.get(ind).setMaxHP(hp);
		this.characters.get(ind).setMoney(oro);

		cd.setCharacters(characters);
		cd.updateJsonFile();
		Window2 w2 = new Window2();
		W2Controller cw2 = new W2Controller(cd, sd, w2);
		w2.setVisible(true);
		epv.dispose();
	}
	
}
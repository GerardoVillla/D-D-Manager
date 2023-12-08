package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import dao.CharacterDao;
import dao.StoreDao;
import model.Character;
import model.Dragonborn;
import model.Dwarf;
import model.Myclass;
import model.Race;
import model.*;
import view.Creacion_Personaje;
import view.StartView;


public class ControlCreacionPersonaje implements ActionListener {
	public CharacterDao cd;
	public StoreDao sd;
    public Creacion_Personaje creacionPersonaje;
    
    
    public ControlCreacionPersonaje(StoreDao sd,CharacterDao cd, Creacion_Personaje creacionPersonaje) {
        this.cd=cd;
        this.sd=sd;
        this.creacionPersonaje = creacionPersonaje;
        
        this.creacionPersonaje.getFinalizar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.creacionPersonaje.getFinalizar()) {
            String name=String.valueOf(this.creacionPersonaje.getNombre().getText());
            int hp= Integer.parseInt(this.creacionPersonaje.getHP().getText());
            int fuerza= Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxFue().getSelectedItem()));
            int sabiduria = Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxSab().getSelectedItem()));
            int carisma = Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxCar().getSelectedItem()));
            int destreza= Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxDes().getSelectedItem()));
            int constitucion= Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxCons().getSelectedItem()));
            int inteligencia= Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxInt().getSelectedItem()));
            int lvl= Integer.parseInt(String.valueOf(this.creacionPersonaje.getLvl().getSelectedItem()));
            String raza = String.valueOf(this.creacionPersonaje.getComboBoxRaza().getSelectedItem());
            String clase = String.valueOf(this.creacionPersonaje.getComboBoxClase().getSelectedItem());

            Character character=null;
            
            switch(raza) {
            case "Dragonborn":
            	 character = new Character(new Dragonborn(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl);
            	 break;
            case "Dwarf":
            	 character = new Character(new Dwarf(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl); 
            	 break;
            case "Elf":
            	character = new Character(new Elf(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl); 
            	break;
            case "Gnome":
            	character = new Character(new Gnome(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl); 
            	break;
            case "Half-Elf":
            	character = new Character(new HalfElf(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl);
            	break;
            case "Half-Orc":
            	character = new Character(new HalfOrc(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl); 
            	break;
            case "Human":
            	character = new Character(new Human(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl); 
            	//System.out.println("Raza seleccionada: " + raza);
            	//System.out.println("Raza del personaje: " + character.getRace().getName());

            	break;
            	
            case "Halfling":
            	character = new Character(new Halfling(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl);
            	break;
            case "Tiefling":
            	character = new Character(new Tiefling(), name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl); 
            	break;
            }
            
            //System.out.println(character.getRace().getName());
            
            switch(clase) {
            case "Barbarian":
            	character.setCalss(new Barbarian());
            	break;
            case "Bard":
            	character.setCalss(new Bard());
            	break;
            case "Cleric":
            	character.setCalss(new Cleric());
            	break;
            case "Druid":
            	character.setCalss(new Druid());
            	break;
            case "Fighter":
            	character.setCalss(new Fighter());
            	break;
            case "Monk":
            	character.setCalss(new Monk());
            	break;
            case "Paladin":
            	character.setCalss(new Paladin());
            	break;
            case "Ranger":
            	character.setCalss(new Ranger());
            	break;
            case "Rogue":
            	character.setCalss(new Rogue());
            	break;
            case "Sourcerer":
            	character.setCalss(new Sourcerer());
            	break;
            case "Warlock":
            	character.setCalss(new Warlock());
            	break;
            case "Wizard":
            	character.setCalss(new Wizard());
            	break;
            }
            
     
            //Characters.add(new Character(raza, clase, name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl));
            this.cd.saveCharacter(character);
            this.creacionPersonaje.dispose();
            
            StartView st= new StartView();
            ControlStartView csv=new ControlStartView(this.cd,this.sd,st);
            st.setVisible(true);
            //Me marca que "view.StartView.setVisible(boolean)"
        }

    }
}

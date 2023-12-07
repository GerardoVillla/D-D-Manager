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
    public Character character;
    public Creacion_Personaje creacionPersonaje;
    private ArrayList<Character> characters;
    public StartView StartView; //Era para abrir la ventana de inicio pero la marca nula
    
    public ControlCreacionPersonaje(CharacterDao cd, Creacion_Personaje creacionPersonaje) {
        this.cd=cd;
        this.creacionPersonaje = creacionPersonaje;
        this.characters= new ArrayList<Character>();
        
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
            Race race=new Race();
            
            switch(raza) {
            case "Dragonborn":
            	race=new Dragonborn();
            case "Dwarf":
            	race=new Dwarf();       
            case "Elf":
            	race = new Elf();  
            case "Gnome":
            	race= new Gnome(); 
            case "Half-Elf":
            	race=new HalfElf();
            case "Half-Orc":
            	race=new HalfOrc(); 
            case "Human":
            	race = new Human(); 
            case "Halfling":
            	race = new Halfling();
            case "Tiefling":
            	race=new Tiefling(); 
            }
            Character Character = new Character(race, name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl);
            
            switch(clase) {
            case "Barbarian":
            	Character.setCalss(new Barbarian());
            case "Bard":
            	Character.setCalss(new Bard());
            case "Cleric":
            	Character.setCalss(new Cleric());
            case "Druid":
            	Character.setCalss(new Druid());
            case "Fighter":
            	Character.setCalss(new Fighter());
            case "Monk":
            	Character.setCalss(new Monk());
            case "Paladin":
            	Character.setCalss(new Paladin());
            case "Ranger":
            	Character.setCalss(new Ranger());
            case "Rogue":
            	Character.setCalss(new Rogue());
            case "Sourcerer":
            	Character.setCalss(new Sourcerer());
            case "Warlock":
            	Character.setCalss(new Warlock());
            case "Wizard":
            	Character.setCalss(new Wizard());
            }
            
     
            //Characters.add(new Character(raza, clase, name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl));
            characters.add(Character);
            this.cd.saveCharacter(Character);
            this.creacionPersonaje.dispose();
           /* StartView ST= new StartView();
            this.StartView.setVisible(true);*/
            //Me marca que "view.StartView.setVisible(boolean)"
        }

    }
}

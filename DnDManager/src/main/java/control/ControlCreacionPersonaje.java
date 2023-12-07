package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Character;
import model.Dragonborn;
import model.Dwarf;
import model.Myclass;
import model.Race;
import model.*;
import view.Creacion_Personaje;
import view.StartView;


public class ControlCreacionPersonaje implements ActionListener {
    public Character character;
    public Creacion_Personaje creacionPersonaje;
    private ArrayList<Character> Characters = new ArrayList<Character>();
    public StartView StartView; //Era para abrir la ventana de inicio pero la marca nula
    
    public ControlCreacionPersonaje(Character character, Creacion_Personaje creacionPersonaje) {
        this.character = character;
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
            Dragonborn G1 = new Dragonborn();
            Barbarian G2 = new Barbarian();
            Character Character = new Character(G1, G2, name, fuerza,destreza,sabiduria , carisma, constitucion, inteligencia, hp,lvl);
            
            switch(raza) {
            case "Dragonborn":
            	Character.setRace(new Dragonborn());
            case "Dwarf":
            	Character.setRace(new Dwarf());       
            case "Elf":
            	Character.setRace(new Elf());  
            case "Gnome":
            	Character.setRace(new Gnome()); 
            case "Half-Elf":
            	Character.setRace(new HalfElf()); 
            case "Half-Orc":
            	Character.setRace(new HalfOrc()); 
            case "Human":
            	Character.setRace(new Human()); 
            case "Halfling":
            	Character.setRace(new Halfling()); 
            case "Tiefling":
            	Character.setRace(new Tiefling()); 
            }
            
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
            Characters.add(Character);
            this.creacionPersonaje.dispose();
           /* StartView ST= new StartView();
            this.StartView.setVisible(true);*/
            //Me marca que "view.StartView.setVisible(boolean)"
        }

    }
}

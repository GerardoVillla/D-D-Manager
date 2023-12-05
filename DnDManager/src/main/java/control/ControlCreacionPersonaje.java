package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Character;
import view.Creacion_Personaje;


public class ControlCreacionPersonaje implements ActionListener {
    public Character character;
    public Creacion_Personaje creacionPersonaje;

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
            int destreza= Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxDes().getSelectedItem()));
            int constitucion= Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxCons().getSelectedItem()));
            int inteligencia= Integer.parseInt(String.valueOf(this.creacionPersonaje.getComboBoxInt().getSelectedItem()));
            //int lvl= Integer.parseInt(this.creacionPersonaje.getLvl().getSelectedItem());
            //Character character = new Character(name, hp, fuerza, destreza, constitucion, inteligencia, lvl);
            
        }

    }
}

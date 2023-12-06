package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TryAttackView;
import model.Character;

public class ControlTryAttack implements ActionListener{
    public Character character;
    public TryAttackView tryAttack;

    public ControlTryAttack(Character character, TryAttackView tryAttack) {
        this.character = character;
        this.tryAttack = tryAttack;
        this.tryAttack.getTryAttack().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.tryAttack.getTryAttack()) {
            this.tryAttack.dispose();
            int ca= Integer.parseInt(this.tryAttack.getTextField().getText());
            if(this.character.tryAttack(ca)==true){
                
            }
            else{
                this.tryAttack.dispose();
                new ControlTryAttack(character, new TryAttackView());
            }
    }



}
}

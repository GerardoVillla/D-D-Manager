package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import dao.CharacterDao;
import dao.StoreDao;

import view.TryAttackView;
import view.Window2;
import model.Character;

public class ControlTryAttack implements ActionListener{
    private Character character;
    private TryAttackView tryAttack;
    private CharacterDao cd;
	private StoreDao sd;
	private int index;

    public ControlTryAttack(CharacterDao cd, StoreDao sd , TryAttackView tryAttack, int index) {
        this.cd=cd;
        this.sd=sd;
        this.index=index;
        this.tryAttack = tryAttack;
        this.tryAttack.getBtnTryAttack().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.tryAttack.getBtnTryAttack()) {
            int ca= Integer.parseInt(this.tryAttack.getTextField().getText());
            if(this.cd.getCharacters().get(index).tryAttack(ca)==true){
            	int r =(int) (Math.random() * 20 + 1);
            	int d = this.cd.getCharacters().get(index).calculateDamage();
            	tryAttack.getRegMessage().setText("Lograste atacar e hiciste: " + d + " daño");
            }
            else{
            	tryAttack.getRegMessage().setText("Ataque Fallido");
            	tryAttack.getRegMessage().addMouseListener(new MouseAdapter() {

        			public void mouseReleased(MouseEvent e) {
        				Window2 w2 = new Window2(); //CheckCharacterView es Window2, pero en esta version lo habia cambiado, fue antes de que me dijeras que lo dejara asi
        				W2Controller cw2 = new W2Controller(ControlTryAttack.this.cd, ControlTryAttack.this.sd, w2);
        				w2.setVisible(true);
        				tryAttack.dispose();
        			}
        		});
            }
        }
    }
}
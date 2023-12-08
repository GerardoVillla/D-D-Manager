package model;

/**
 *
 * @author usuario
 */

public class Weapon extends Equippable {
	private int diceNum;
	private int facesNum;
    
    public Weapon(String name, String description, int price, int diceNum, int facesNum) {
		super(name, description, price);
		this.diceNum=diceNum;
		this.facesNum=facesNum;
		
	}


    
    /*
    public void ataque(){
        
    }
    */
   
}

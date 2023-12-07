package model;

/**
 *
 * @author usuario
 */

public class Weapon extends Equippable {
	private int damage;
    
    public Weapon(String name, String description, int price, boolean status, int diceNum, int facesNum, int damage) {
		super(name, description, price, status, diceNum, facesNum);
		this.damage=damage;
		// TODO Auto-generated constructor stub
	}


    
    /*
    public void ataque(){
        
    }
    */
    public int getDamage(){
        return this.damage;
    }
}

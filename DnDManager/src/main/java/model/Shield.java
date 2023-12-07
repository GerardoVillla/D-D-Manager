package model;

/**
 *
 * @author usuario
 */
public class Shield extends Equippable {
    
	private int defense;
    public Shield(String name, String description, int price, boolean status, int diceNum, int facesNum, int defense) {
		super(name, description, price, status, diceNum, facesNum);
		this.defense=defense;
		// TODO Auto-generated constructor stub
}
package model;

/**
 *
 * @author usuario
 */
//Tambien abstracta?, no se crearian objetos tipo armadura pero si tipo armadura ligera, pesada, mediana, etc.
public abstract class Armor extends Equippable {
    protected int armorClass;
    public Armor(String name, String description, int price, boolean status, int diceNum, int facesNum, int armorClass) {
		super(name, description, price, status, diceNum, facesNum);
		this.armorClass=armorClass;
		// TODO Auto-generated constructor stub
	}

	
    
    /*
    public void Defensa(){
    
    }
    */
}

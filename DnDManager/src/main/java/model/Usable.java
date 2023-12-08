package model;

/**
 *
 * @author usuario
 */
public class Usable extends Item {
    
	private int usesLeft;
	private int healing;
	
    public Usable(String name, String description, int price, int usesLeft, int healing) {
    	
		super(name, description, price);
		this.usesLeft=usesLeft;
		this.healing=healing;
		// TODO Auto-generated constructor stub
	}

	public int getUsesLeft() {
		return usesLeft;
	}

	public void setUsesLeft(int usesLeft) {
		this.usesLeft = usesLeft;
	}
    
    

    
}
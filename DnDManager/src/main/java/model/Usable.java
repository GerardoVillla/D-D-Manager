package model;

/**
 *
 * @author usuario
 */
public class Usable extends Item {
    
	private int usesLeft;
	
    public Usable(String name, String description, int price, int usesLeft) {
    	
		super(name, description, price);
		this.usesLeft=usesLeft;
		// TODO Auto-generated constructor stub
	}

	public int getUsesLeft() {
		return usesLeft;
	}

	public void setUsesLeft(int usesLeft) {
		this.usesLeft = usesLeft;
	}
    
    

    
}
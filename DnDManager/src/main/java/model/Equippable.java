package model;

/**
 *
 * @author usuario
 */

//Murcia: Equipabble no deberia ser abstracta?, total no se hacen objetos equipables pero si onjetos de sus 
//clases hijas. De todas maneras ahi lo puse, quitenlo si lo necesitan.
public abstract class Equippable extends Item{
    
    protected boolean status;
    protected int diceNum;
    protected int facesNum;
    
    public Equippable(String name, String description, int price, boolean status,int diceNum, int facesNum) {
    	super(name,description,price);
    	this.status=status;
    	this.diceNum=diceNum;
    	this.facesNum=facesNum;
    }
    /*
    public void equipar(){
    
    }
    */
}

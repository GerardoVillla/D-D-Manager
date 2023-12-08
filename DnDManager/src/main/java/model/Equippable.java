package model;

/**
 *
 * @author usuario
 */

//Murcia: Equipabble no deberia ser abstracta?, total no se hacen objetos equipables pero si onjetos de sus 
//clases hijas. De todas maneras ahi lo puse, quitenlo si lo necesitan.
public class Equippable extends Item{
    
    protected boolean status;

    
    public Equippable(String name, String description, int price) {
    	super(name,description,price);
    	this.status=false;
    }
    /*
    public void equipar(){
    
    }
    */
}

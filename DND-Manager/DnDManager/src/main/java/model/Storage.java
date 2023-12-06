package model;
import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class Storage {

private ArrayList<Usable> usableitems;
private ArrayList<Equippable> equippableitems;



public void addUsableItem(Usable usableItem){
    this.usableitems.add(usableItem);
    
}

public void addEquippableItem(Equippable equippableItem){
    this.equippableitems.add(equippableItem);
    
}

public void removeUsableItem(Usable usableItem){
    this.usableitems.remove(usableItem);
    
}
public void removeEquippableItem(Equippable equippableItem){
    this.equippableitems.remove(equippableItem);
    
}

public Usable getUsableItem(int index){
    return this.usableitems.get(index);
}

public Equippable getEquippableItem(int index){
    return this.equippableitems.get(index);
}

/*
public void addObjeto(){

}
public void removeObjeto(){

}
*/
    
}

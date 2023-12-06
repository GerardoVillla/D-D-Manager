package model;

/**
 *
 * @author usuario
 */
public class Store {
    
    private Storage storage;
    private String name;
    

    public void setName(String name) {
        this.name = name;
    }
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void getStorage(Storage storage) {
        this.storage = storage;
    }
    public void getName(String name) {
        this.name = name;
    }
    
    public Store(String name) {
        this.name = name;
        this.storage = new Storage();
    }

    public Storage getStorage() {
        return this.storage;
    }

    public String getName() {
        return this.name;
    }

    public Usable sellUsableItem(int index) {
        return storage.getUsableItem(index);
    }

    public Equippable sellEquippableItem(int index) {
        return storage.getEquippableItem(index);

    //public Item getItem(int index) {
        //return storage.getItem(index);
    //}
    /*
    public void addObjeto(){
    
    }
    */
}
}

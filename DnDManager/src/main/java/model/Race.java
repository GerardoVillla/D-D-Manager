package model;

/**
 *
 * @author Jose
 */
/*
Lo mismo que con armadura, equipable, raza y clase. Le convendria ser abstractas hasta donde sé (dudo que se
haga una raza de tipo Raza o una armadura de tipo Armadura)pero no estan marcadas asi en el UML, de todos modos 
lo borran si no les gusta
*/
public class Race {
    protected String name="name";
    protected String description;

    protected int modifyCharisma=0;
    protected int modifyIntelligence=0;
    protected int modifyDexterity=0;
    protected int modifyWisdom=0;
    protected int modifyConstitution=0;
    protected int modifyStrength=0;
    
    public Race(String name) {
    	this.name=name;
    }
    public int getModifyCharisma() {
        return modifyCharisma;
    }
    public int getModifyIntelligence() {
        return modifyIntelligence;
    }
    public int getModifyDexterity() {
        return modifyDexterity;
    }
    public int getModifyWisdom() {
        return modifyWisdom;
    }
    public int getModifyConstitution() {
        return modifyConstitution;
    }
    public int getModifyStrength() {
        return modifyStrength;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    

    
    /*public boolean armorEquipRequest(){
        
    }*/
}

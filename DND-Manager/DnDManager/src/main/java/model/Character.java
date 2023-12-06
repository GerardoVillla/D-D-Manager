package model;

/**
 *
 * @author usuario
 */
public class Character {
    
    private String characterName;
    private int level;
    private Race race;
    private Myclass calss; 
    private int currentHP;
    private int maxHP;
    private int charisma;
    private int charismaMod;
    private int intelligence;
    private int intelligenceMod;
    private int wisdom;
    private int wisdomMod;
    private int constitution;
    private int constitutionMod;
    private int dexterity;
    private int dexterityMod;
    private int strength;
    private int strengthMod;
    private Storage storage;
    private Weapon weaponSlot;
    private Item shieldSlot;
    private Item armorSlot;
    private int money;
    private int CA;

    public void equipWeapon(Weapon weapon){
        if(this.weaponSlot != null){
            this.weaponSlot = weapon;
        }
        //Aqui podemos hacer un try y un catch para que no se pueda equipar un arma si ya tiene una equipada. Podemos hacer que mande excepcion y lo capture el controllador y en la vista podemos avisar si se ha equipado o no.
    }
    public void equipShield(Item shield){
        if(this.shieldSlot != null){
            this.shieldSlot = shield;
        }
    }
    public void equipArmor(Item armor){
        if(this.armorSlot != null){
            this.armorSlot = armor;
        }
    }
    public void unequipWeapon(){
        this.weaponSlot = null;
    }
    public void unequipShield(){
        this.shieldSlot = null;
    }
    public void unequipArmor(){
        this.armorSlot = null;
    }
   
    public void calculateCA(){
        int CA = 10;
        if(this.armorSlot != null){
            //CA += this.armorSlot.getArmor();
        }
        if(this.shieldSlot != null){
            //
            //CA += this.shieldSlot.getArmor();
        }
        if(this.dexterityMod > 0){
            CA += this.dexterityMod;
        }
        this.CA = CA;
    }

    public boolean tryAttack(int CA){
        int attack = (int) (Math.random() * 20) + 1;
        if(attack >= CA){
            return true;
        }else{
            return false;
        }
    }

    private int calculateDamage(){
        int damage = 0;
        if(this.weaponSlot != null){
            damage = (int) (Math.random() * this.weaponSlot.getDamage()) + 1;
        }else{
            damage = (int) (Math.random() * 4) + 1;
        }
        return damage;
    }

    public int attack(int CA){
        if(tryAttack(CA)){
            return calculateDamage();
        }else{
            return 0;
        }
    }
    
    public Character(Race race, Myclass myclass, String characterName, int strength, int dexterity, int wisdom, int charisma, int constitution, int intelligence, int maxHP, int level) {
        this.storage = new Storage();
        this.strength = strength + race.getModifyStrength();
        this.dexterity=dexterity + race.getModifyDexterity();
        this.wisdom=wisdom+race.getModifyWisdom();
        this.charisma=charisma + race.getModifyCharisma();
        this.intelligence=intelligence+race.getModifyIntelligence();
        this.characterName=characterName;
        this.maxHP=maxHP;
        this.level=level;

    }
	public void setRace(Race race) {
		this.race = race;
	}
	public void setCalss(Myclass calss) {
		this.calss = calss;
	}
    
   
    /* 
    public void comprarObjeto(){
        
    }
    public void venderObjeto(){

    }
    public void desequipar arma(){

    }
    public void atacar(){

    }
    public void realizarAccion(){

    }
    public int calculoCA(){

    }
    public int intentarAtaque(){

    }
    public int calcularDaño(){

    }
    */
}

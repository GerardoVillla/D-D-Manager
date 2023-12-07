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
    
    //Constructor de prueba
    public Character() {
    	this.storage= new Storage();
    }
    
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
    
    public Character(Race race, String characterName, int strength, int dexterity, int wisdom, int charisma, int constitution, int intelligence, int maxHP, int level) {
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Character [characterName=");
		builder.append(characterName);
		builder.append(", level=");
		builder.append(level);
		builder.append(", race=");
		builder.append(race);
		builder.append(", calss=");
		builder.append(calss);
		builder.append(", currentHP=");
		builder.append(currentHP);
		builder.append(", maxHP=");
		builder.append(maxHP);
		builder.append(", charisma=");
		builder.append(charisma);
		builder.append(", charismaMod=");
		builder.append(charismaMod);
		builder.append(", intelligence=");
		builder.append(intelligence);
		builder.append(", intelligenceMod=");
		builder.append(intelligenceMod);
		builder.append(", wisdom=");
		builder.append(wisdom);
		builder.append(", wisdomMod=");
		builder.append(wisdomMod);
		builder.append(", constitution=");
		builder.append(constitution);
		builder.append(", constitutionMod=");
		builder.append(constitutionMod);
		builder.append(", dexterity=");
		builder.append(dexterity);
		builder.append(", dexterityMod=");
		builder.append(dexterityMod);
		builder.append(", strength=");
		builder.append(strength);
		builder.append(", strengthMod=");
		builder.append(strengthMod);
		builder.append(", storage=");
		builder.append(storage);
		builder.append(", weaponSlot=");
		builder.append(weaponSlot);
		builder.append(", shieldSlot=");
		builder.append(shieldSlot);
		builder.append(", armorSlot=");
		builder.append(armorSlot);
		builder.append(", money=");
		builder.append(money);
		builder.append(", CA=");
		builder.append(CA);
		builder.append("]");
		return builder.toString();
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	public Myclass getCalss() {
		return calss;
	}
	public void setCalss(Myclass calss) {
		this.calss = calss;
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public int getCharismaMod() {
		return charismaMod;
	}
	public void setCharismaMod(int charismaMod) {
		this.charismaMod = charismaMod;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getIntelligenceMod() {
		return intelligenceMod;
	}
	public void setIntelligenceMod(int intelligenceMod) {
		this.intelligenceMod = intelligenceMod;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getWisdomMod() {
		return wisdomMod;
	}
	public void setWisdomMod(int wisdomMod) {
		this.wisdomMod = wisdomMod;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getConstitutionMod() {
		return constitutionMod;
	}
	public void setConstitutionMod(int constitutionMod) {
		this.constitutionMod = constitutionMod;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getDexterityMod() {
		return dexterityMod;
	}
	public void setDexterityMod(int dexterityMod) {
		this.dexterityMod = dexterityMod;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStrengthMod() {
		return strengthMod;
	}
	public void setStrengthMod(int strengthMod) {
		this.strengthMod = strengthMod;
	}
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	public Weapon getWeaponSlot() {
		return weaponSlot;
	}
	public void setWeaponSlot(Weapon weaponSlot) {
		this.weaponSlot = weaponSlot;
	}
	public Item getShieldSlot() {
		return shieldSlot;
	}
	public void setShieldSlot(Item shieldSlot) {
		this.shieldSlot = shieldSlot;
	}
	public Item getArmorSlot() {
		return armorSlot;
	}
	public void setArmorSlot(Item armorSlot) {
		this.armorSlot = armorSlot;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getCA() {
		return CA;
	}
	public void setCA(int cA) {
		CA = cA;
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

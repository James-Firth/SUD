package sud;

/**
 * Item
 * 
 * 
 * 
 * @author dark-james
 * @version 10/7/11
 */
abstract class Item 
{
   private boolean isConsumable;
   private boolean isEquipable;
   private boolean isStackable;
   private String name;
   private String type;
   

   
   
   //Constructors
   protected Item(String name, String type, boolean isConsumable, boolean isEquipable,boolean isStackable)
   {
       this.name = name;
       this.type = type;
       this.isConsumable = isConsumable;
       this.isEquipable = isEquipable;
       this.isStackable = isStackable;
       ///ADDING STUFF I JUST WANT TO SEE HOW THIS WORKS
   }       
   
   public String toString()
   {
       return name;
   }
   
   
}


abstract class Equipable extends Item
{
    private int slot;
    private int attBonus;
    private int defBonus;
    private int spdBonus;
    private int hpBonus;
    
    public Equipable(String itemName, String type, int attBonus
            ,int defBonus, int spdBonus, int hpBonus, int slot)
    {
        super(itemName,type,true,false,false);
        
        this.slot = slot;
        this.attBonus = attBonus;
        this.defBonus = defBonus;
        this.spdBonus = spdBonus;
        this.hpBonus = hpBonus;
    }
}

abstract class Consumable extends Item
{
	private int maxHealthMod;
	private int currentHealthMod;
	private int attackMod;
	private int defenseMod;
	private int speedMod;
	private int experienceMod;
	private int levelMod;
    
    public Consumable(String itemName,String type, int maxHealthMod, int currentHealthMod
            ,int attackMod,int defenseMod,int speedMod,int experienceMod,int levelMod)
    {
        super(itemName,type,true,false,true);
        this.maxHealthMod = maxHealthMod;
        this.currentHealthMod = currentHealthMod;
        this.attackMod = attackMod;
        this.defenseMod = defenseMod;
        this.speedMod = speedMod;
        this.experienceMod = experienceMod;
        this.levelMod = levelMod;
    }
    
    public void use(Creature to)
    {
        to.changeAttack(attackMod);
        to.changeCurrentHealth(currentHealthMod);
        to.changeDefense(defenseMod);
        to.changeExperience(experienceMod);
        to.changeLevel(levelMod);
        to.changeMaxHealth(maxHealthMod);
        to.changeSpeed(speedMod);
    }
}

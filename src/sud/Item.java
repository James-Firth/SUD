//package sud;

abstract class Item 
{
	private boolean isConsumable;
	private boolean isEquipable;
	private boolean isStackable;
	private String name;
	private String type;

	//Constructor
	protected Item(String name, String type, boolean isConsumable, boolean isEquipable,boolean isStackable)
	{
		this.name = name;
		this.type = type;
		this.isConsumable = isConsumable;
		this.isEquipable = isEquipable;
		this.isStackable = isStackable;
	}//end Item       
   
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
	
	//Getters
	public int getSlot()
	{
		return slot;
	}
	
	public int getAttBonus()
	{
		return attBonus;
	}
	
	public int getDefBonus()
	{
		return defBonus;
	}
	
	public int getSpdBonus()
	{
		return spdBonus;
	}
	
	public int getHpBonus()
	{
		return hpBonus;
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
	
	public int getMaxHealthMod(Creature to)
	{
		return maxHealthMod;
	}
	
	public int getCurrentHealthMod(Creature to)
	{
		return currentHealthMod;
	}
	
	public int getAttackMod(Creature to)
	{
		return attackMod;
	}
	
	public int getDefenseMod(Creature to)
	{
		return defenseMod;
	}
	
	public int getSpeedMod(Creature to)
	{
		return speedMod;
	}
	
	public int getExperienceMod(Creature to)
	{
		return experienceMod;
	}

	public int getLevelMod(Creature to)
	{
		return levelMod;
	}
}
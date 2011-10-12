package sud;
abstract class Creature
{

	//test comment to see if I can commit this to the files			
	protected String name;
	protected int maxHealth;
	protected int currentHealth;
	protected int attack;
	protected int defense;
	protected int speed;
	protected int experience;
	protected int level;

		protected Creature(String name, int mHP, int cHP, int att, int def, int spd, int exp, int lvl)
		{
			this.name = name;
			maxHealth = mHP;
			currentHealth = cHP;
			attack = att;
			defense = def;
			speed = spd;
			experience = exp;
			level = lvl;
		}
		
		
		//******************** GETTERS *****************
		public String getName()
		{
			return name;
		}
		
		public int getHealth()
		{
			return currentHealth;
		}
		
	public int getMaxHealth()
	{
		return maxHealth;
	}
		
		public int getAttack()
		{
			return attack;
		}
		
		public int getDefense()
		{
			return defense;
		}
		
		public int getSpeed()
		{
			return speed;
		}
		
		public int getExp()
		{
			return experience;
		}
		
		public int getLevel()
		{
			return level;
		}
		
	public String toString()
	{
		return "Health: "+ currentHealth + "\nAttack: "+  attack + "\nDefense: " + defense + "\nSpeed: " + speed +"\n";
	}
		
		
		//**************  SETTERS ******************
	protected void takeDamage(int taken)
	{
		currentHealth = currentHealth - taken;
	}
		
		protected void giveHealth(int given)
		{
			   currentHealth = currentHealth - given; 
		}
}
package sud;
abstract class Creature
{
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
	private void takeDamage(int taken)
	{
		currentHealth = currentHealth - taken;
	}
        
        protected void giveHealth(int given)
        {
               currentHealth = currentHealth - given; 
        }


    

    public void changeMaxHealth(int in)
    {
        maxHealth+=in;
    }
	public void changeCurrentHealth(int in)
    {
        currentHealth+=in;
    }
	public void changeAttack(int in)
    {
        attack+=in;
    }
	public void changeDefense(int in)
    {
        defense+=in;
    }
	public void changeSpeed(int in)
    {
        speed+=in;
    }
	public void changeExperience(int in)
    {
        experience+=in;
    }
	public void changeLevel(int in)
    {
        level+=in;
    }
}

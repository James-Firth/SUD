package sud;
abstract class Creature
{
	protected int maxHealth;
	protected int currentHealth;
	protected int attack;
	protected int defense;
	protected int speed;
	protected double experience;
	protected int level;

        
        
        //Getters
	public int getMaxHealth()
	{
		return maxHealth;
	}
        
        public int getCurrentHealth()
        {
                return currentHealth;
        }
        
        
	//Private as damage calculation should be performed inside Creature?
                //              ^^^^ see Issues about this comment.
	private void takeDamage(int taken)
	{
		currentHealth = currentHealth - taken;
	}
        
        protected void giveHealth(int given)
        {
               currentHealth = currentHealth - given; 
        }

	public String toString()
	{
		return "Health: "+ currentHealth + "\nAttack: "+  attack + "\nDefense: " + defense + "\nSpeed: " + speed +"\n";
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

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

	public int getMaxHealth()
	{
		return maxHealth;
	}

	//Private as damage calculation should be performed inside Creature?
	private void takeDamage(int taken)
	{
		currentHealth = currentHealth - taken;
	}

	public String toString()
	{
		return "Health: "+ currentHealth + "\nAttack: "+  attack + "\nDefense: " + defense + "\nSpeed: " + speed +"\n";
	}
}

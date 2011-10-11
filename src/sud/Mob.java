package sud;
/*
 * Creatures
 */
class Mob extends Creature
{
    /*
     * 
     * Mob Constructor
     * @param h Max Health
     * @param a Attack
     * @param d Defense
     * @param Speed
     */
	public Mob(int h, int a, int d, int s)
	{
		currentHealth = h;
		maxHealth = h;
		attack = a;
		defense = d;
		speed = s;
		level = 1;
	}//end constructor
        	
}
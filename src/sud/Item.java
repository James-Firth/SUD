package sud;

/**
 * Item
 * 
 * 
 * 
 * @author dark-james
 * @version 10/7/11
 */
class Item 
{
   private boolean isConsumable;
   private boolean isEquipable;
   private String name;
   private int attBonus;
   private int defBonus;
   private int spdBonus;
   private int hpBonus;
   
   //Constructor
   public Item(String itemName, boolean canConsume, boolean canEquip, int attack, int def, int spd, int hp)
   {
       name = itemName;
       ///ADDING STUFF I JUST WANT TO SEE HOW THIS WORKS
   }       
}

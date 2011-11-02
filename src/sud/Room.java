import java.awt.Point;

// The idea in here I like,    but it doesn't work... (see Map for more information)

class Room 
{
	protected boolean inRoom;
	protected boolean hasVisit;
	protected boolean hasTreasure;
	protected Point location;

	public Room(boolean inRoom, boolean hasVisit, Point location, boolean hasT)
	{
		this.inRoom = inRoom;
		this.hasVisit = hasVisit;
		this.location = location;
		this.hasTreasure = hasT;

	}//end constructor

	public String toString()
	{
		return "";
	}
}

import java.awt.Point;

// The idea in here I like,    but it doesn't work... (see Map for more information)

class Room extends Point
{
	protected boolean inRoom;
	protected boolean hasVisit;
	protected boolean hasTreasure;

	public Room(boolean inRoom, boolean hasVisit, int x, int y, boolean hasT,)
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

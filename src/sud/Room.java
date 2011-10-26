import java.awt.Point;


// The idea in here I like,    but it doesn't work... (see Map for more information)

class Room 
{
	protected boolean inRoom;
	protected boolean hasVisit;
	protected Point location;

	public Room(boolean inRoom, boolean hasVisit, Point location)
	{
		this.inRoom = inRoom;
		this.hasVisit = hasVisit;
		this.location = location;

	}//end constructor

	public String toString()
	{
		return "";
	}
}

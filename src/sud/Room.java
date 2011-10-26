import java.awt.Point;

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

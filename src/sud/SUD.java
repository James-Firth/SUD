//package sud;


//The Package System isn't working period... we'll need to look into how to fix it... ~~KT

//The problem is that we will need to add something to the CLASSPATH, because when you run something with a package, it goes "java sud.SUD" and java doesn't know where to find  the package SUD, mabe this won't be a problem when we case it in a jar file, but for now unless we only play on running it through our IDE's, we'll need to find a solution.
import java.util.Scanner;

public class SUD 
{

	public static void main(String[] args) 
	{
		menu();
		print("----------------------------\nEND OF PROGRAM\n----------------------------");
		//Mob monster = new Mob(1,2,3,4);
	}
	public static void menu()
	{
		String output = "What would you like to do?";
		String response = "";
		boolean keepGoing = true;

		while (keepGoing)
		{
			response = getValidString(output);
			if(response.equalsIgnoreCase("help"))
			{
				String help = "This is the help section";
				print(helpMethod());
			}
			else if (response.equalsIgnoreCase("map" ) || response.equalsIgnoreCase("draw"))
			{
				//draw map method or class here
				print("DRAW MAP HERE");
			}
			else if (response.equalsIgnoreCase("check"))
			{
				//check what?
				response = getValidString("Check What?");
				print("CHECK");
			}
			else if (response.equalsIgnoreCase("save"))
			{
				//SAVE STUFFS
				print("SAVE STUFFS");
			}
			else if (response.equalsIgnoreCase("exit"))
			{
				response = getValidString("Would you like to save? \nPlease enter \"yes\", \"y\",\"no\" or \"n\" if you still wish to exit, or type in anything else to return to the game.");
				if (response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"))
				{
					//SAVE STUFFS
					print("Exit save stuffs");
					keepGoing  = false;
				}
				else if(response.equalsIgnoreCase("no")||response.equalsIgnoreCase("n"))
				{
					print("Your possible loss... Oh well");
					keepGoing = false;
				}
				else
				{
					print("Your will now be returned to the game, have fun Adventurer.");
				}
			}
			else
			{
				print("Invalid Response, please try again");
			}

		}//end while

		print("Thank you for playing.");
	}
	public static String getValidString(String output)
	{
		//get input and trim the output
		String test = "";
		Scanner scan = new Scanner(System.in);
		print(output);
		test = scan.next();
		test = test.trim();

		return test;
	}//end getValidString
	public static String helpMethod()
	{
		//I think we should build the help method in here, that way we can just call it when needed. ~~KT

		return "This will be the help method";
	}
	public static void print(String output)
	{
		System.out.println(output);
	}//end print
}

//package sud;

import java.util.Scanner;

public class SUD 
{

	public static void main(String[] args) 
	{
		System.out.println("Test");

		menu();
		//Mob monster = new Mob(1,2,3,4);
	}
	public static void menu()
	{
		String output = "What would you like to do?";
		String response = "";
		boolean keepGoing = true;

		while (keepGoing)
		{
			print(output);
			response = getValidString(output);
			if(response.equalsIgnoreCase("help"))
			{
				String help = "This is the help section";
				print(output);
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

		}
	}
	public static String getValidString(String output)
	{
		//get input and trim the output
		String test = "";
		Scanner scan = new Scanner(System.in);
		System.out.println(output);
		test = scan.next();
		test = test.trim();

		return test;
	}//end getValidString
	public static void print(String output)
	{
		System.out.println(output);
	}//end print
}

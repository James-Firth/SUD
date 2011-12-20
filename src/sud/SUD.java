//package sud;
//The Package System isn't working period... we'll need to look into how to fix it... ~~KT

//The problem is that we will need to add something to the CLASSPATH, because when you run something with a package, it goes "java sud.SUD" and java doesn't know where to find  the package SUD, mabe this won't be a problem when we case it in a jar file, but for now unless we only play on running it through our IDE's, we'll need to find a solution.

import java.util.Scanner;

public class SUD 
{
	public static void main(String[] args) 
	{
		String bSq = "■";
		String wSq = "□"; 
		String currentLoc = "◉";
		String outOfBounds = "◆";
		//print (bSq +  "\n" +wSq);
		menu();
		print("----------------------------\nEND OF PROGRAM\n----------------------------");
		//print (bSq +  "\n" + wSq);
	}

	public static void roomGeneration()
	{
		Room[][] rooms;
	}
	public static void menu()
	{
		String output = "What would you like to do?";
		int value = -1;
		boolean keepGoing = true;
		String [] mainOptions = {"help", "map", "draw", "check", "save", "exit", "options"};
		while (keepGoing)
		{
			value = Menu.getOption(getValidString(output), mainOptions);

			switch (value)
			{
				case 0: print(helpMethod());break;
				case 1: print("DRAW MAP STUFFS HERE"); break;
				case 2: print("DRAW MAP STUFFS HERE"); break;
				case 3: print("Check What?"); break;
				case 4: print("save Stuffs"); break;
				case 5:
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
						print("Your will now be returned to the game, have fun Adventurer.");
					break;
				//end case
				case 6 : 
				{
					for (int i = 0 ; i < mainOptions.length ; i ++)
					{
						if (i != mainOptions.length -1)
							System.out.print(mainOptions[i] + ", ");
						else
							System.out.println(mainOptions[i]);
					}
					break;
				}//end case
				case -1: print("Invalid Response, try again"); break;
			}//end switch
		}//end while
		print("Thank you for playing.");
	}//end menu
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
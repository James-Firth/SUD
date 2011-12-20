import java.io.*;
import java.util.Scanner;

class Load
{
	public String Load(String loadDir)
	{
		String loadData = "";
		String temp = "";
		BufferedReader in;
		try
		{
			in = new BufferedReader(new FileReader(loadDir));
			temp = in.readLine();
			while(temp != null)
			{	
				loadData += temp;
				temp = in.readLine();
			}//end while
		}//end try
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}//end catch
		return loadData;
	}//end Load
}//end class
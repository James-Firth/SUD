import java.io.*;
class Save
{
	public void save(String data, String saveDir)
	{
		PrintWriter out;
		try
		{
			out = new PrintWriter(saveDir);
			out.println(data);
			out.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
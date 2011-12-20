class Menu
{
	public static int getOption(String answer, String [] options)
	{
		int result = -1;
		for (int i = 0 ;  i < options.length && result == -1 ; i ++)
			if (options[i].equals(answer))
				result = i;
		return result;
	}
}
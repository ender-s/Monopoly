import java.util.ArrayList;

public class HelperMethods {

	public static int countValue(int value, ArrayList<Integer> arr) 
	{	
		int counter = 0;
		for (Integer i: arr) 
		{
			if (value == (int) i) 
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static int countValue(double value, ArrayList<Double> arr) 
	{

		int counter = 0;
		for (Double d: arr) 
		{
			if (value == (double) d) 
			{
				counter++;
			}
		}
		return counter;
	}
	
	public static int[] getIndexesOfNumber(int value, ArrayList<Integer> arr) 
	{
		int count = countValue(value, arr);
		int [] indexes = new int[count];
		int counter = 0;

		for (int i = 0; i < arr.size(); i++)
		{
			if (value == (int)arr.get(i)) 
			{
				indexes[counter] = i;
				counter++;
			}
		}
		return indexes;
	}
	
	public static int[] getIndexesOfNumber(double value, ArrayList<Double> arr) 
	{

		int count = countValue(value, arr);
		int [] indexes = new int[count];
		
		int counter = 0;
		for (int i = 0; i < arr.size(); i++) 
		{
			if (value == (double)arr.get(i)) 
			{
				indexes[counter] = i;
				counter++;
			}	
		}
		return indexes;
	}

	public static double getMax(double[] arr) 
	{

		double max = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMax(ArrayList<Integer> arr) 
	{

		int max = arr.get(0);
		for (int i = 1; i < arr.size(); i++) 
		{
			if (arr.get(i) > max) 
			{
				max = arr.get(i);
			}
		}
		return max;
	}
	

	public static ArrayList<Player> pickPlayers (int[] indexes, ArrayList<Player> players) 
	{
		ArrayList<Player> pickedPlayers = new ArrayList<Player>();

		for (int i = 0; i < indexes.length; i++) 
		{
			pickedPlayers.add(players.get(indexes[i]));	
		}
		
		return pickedPlayers;
		
	}

	public static int mod (int n, int d) 
	{
		int result = n % d;

		if (result < 0)
			result = result + d;
		
		return result;

	}

}

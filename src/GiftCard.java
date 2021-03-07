import java.util.Random;

public class GiftCard extends TriggeredCard
{
	private double giftAmount = 0;
	private double [] amounts;
	
	private final int NUMBER_OF_AMOUNTS = 12; 
	private final double INITIAL_AMOUNT = 125.0; 
	private final double INCREASE_BY = INITIAL_AMOUNT; 
	
	public GiftCard() 
	{
		super("Gift from the Bank!");
		setType("gift"); 
		
		
		amounts = new double[NUMBER_OF_AMOUNTS]; 
		double initial = INITIAL_AMOUNT; 
		for (int i = 0; i < amounts.length; i++) 
		{
			amounts[i] = initial;
			initial += INCREASE_BY;	
		}
		
	}
	
	public void trigger() 
	{
		Random generator = new Random();
		int randInt = generator.nextInt(amounts.length);

		giftAmount = amounts[randInt];
		super.setDescription("You are the lucky one to win the $" + giftAmount + " gift given by the bank!");
		
	}
	
	public double getGiftAmount() 
	{
		return giftAmount;
	}

}

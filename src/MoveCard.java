import java.util.Random;

public class MoveCard extends TriggeredCard
{
	
	private int moveAmount = 0;
	private String direction;
	public MoveCard() 
	{
		super("Move!");	
		setType("move");
	}
	
	public void trigger() 
	{
		
		Random generator = new Random();
		do {
			moveAmount = generator.nextInt(25) - 12;
		} while(moveAmount == 0); 
		
		int absoluteVal = Math.abs(moveAmount);

		if (moveAmount > 0)
			direction = "forward";
		else
			direction = "backward";

		super.setDescription("Go " + absoluteVal + " steps " + direction);
	}
	
	
	public String getDirection() 
	{
		return direction;
	}
	
	public int getMoveAmount() 
	{
		return moveAmount;
	}
	
	public void setDirection(String direction) 
	{
		this.direction = direction;
	}
	
	public void setMoveAmount(int moveAmount) 
	{
		this.moveAmount = moveAmount;
	}
}

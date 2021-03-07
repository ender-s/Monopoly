
public class PayTax extends GameObject
{

	private double amount;
	
	public PayTax(int id, double amount) 
	{
		super("paytax", "Pay $" + (int)amount + " Tax", "Whoever comes here has to pay $" + (int)amount + " tax.\nPaid taxes are accumulated in Free Parking area.", id);
		this.amount = amount;		
	}
	
	public double getAmount() 
	{
		return amount;
	}
	
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	

}

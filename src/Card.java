import java.io.Serializable;

public class Card implements Serializable
{
	private String title;
	private String description;
	private String type;
	private static int idCounter = 1; 
	private int ID;
	
	public Card(String title, String description) 
	{	
		this.description = description;
		this.title = title;
		this.ID = idCounter;
		this.type = "standard";
		
		idCounter++;
	}
	
	public Card(String title, String description, String type) 
	{
		this(title, description);
		this.type = type;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public void setID(int ID) 
	{
		this.ID = ID;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public int getID() 
	{
		return ID;
	}
	
	public static void setIDCounter (int num) 
	{
		idCounter = num;
	}
	
	public boolean equals(Card card) 
	{
		return ID == card.getID();
	}
	
}

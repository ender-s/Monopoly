import java.io.Serializable;

public class GameObject implements Serializable {
	
	protected String title;
	protected String description;
	protected int id;
	protected String type;	
	public GameObject(String type, String title, String description, int id) 
	{
		this.type = type;
		this.title = title;
		this.description = description;
		this.id = id;
	}
	
	public String getTitle() 
	{
		return title;
	}	
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;	
	}
	
	public void setDescription(String description)
	{	
		this.description = description;
	}
	
	public int getID() 
	{
		return id;	
	}
	
	public void setID(int id) 
	{
		this.id = id;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getInformation() 
	{
	
		String info = "Title : " + title + "\n";
		info += "Description : " + description + "\n";
		
		return info;
	}
	
}

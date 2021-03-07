import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Monopoly {

    public static void main(String[] args) 
    {
    	firstInteraction();
    }
    
    public static void firstInteraction() 
    {
    	UserCountInput uci = new UserCountInput();
        uci.pack();
        uci.setVisible(true);
    }
    
    public static void startTheGame(int count)
    {
    	Player.setIDCounter(1);
    	Card.setIDCounter(1);
        
        ArrayList<Player> players = new ArrayList<Player>();

        for (int i = 0; i < count; i++) 
        {
        	String name;
        	boolean firstTry = true;
        	do {
        		
        		if (!firstTry) 
        		{
        			JOptionPane.showMessageDialog(null, "Please enter a valid name.", "Invalid name!", JOptionPane.ERROR_MESSAGE);
        		}
        		name = JOptionPane.showInputDialog(null, String.format("Name of Player%d", (i+1)), "Name", JOptionPane.QUESTION_MESSAGE);
        		firstTry = false;
        	} while (name == null || name.trim().equals(""));
        	
        	players.add(new Player(name));
        }
        
        boolean err = false;
        double initial = 0.0;
        
        do {
        	if (err)
        	{
        		err = false;
    			
        		JOptionPane.showMessageDialog(null, "Please enter a valid amount for initial money.", "Invalid amount!", JOptionPane.ERROR_MESSAGE);
        	}
        	String amount = JOptionPane.showInputDialog(null, String.format("Initial Money"), "Money", JOptionPane.QUESTION_MESSAGE);
        	
        	amount = amount.replace(",", ".");

        	try 
        	{
        		initial = Double.parseDouble(amount);
        	}
        	catch (NumberFormatException e) 
        	{
        		err = true;
        	}
        } while (err); 

        Game session = new Game(players, initial);
        session.start(); 
        
        
    }

}

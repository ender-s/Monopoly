import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.nio.file.Paths;

import javax.swing.ImageIcon;

public class BoardJPanel extends javax.swing.JPanel
{
	Game gameMotor;
	public BoardJPanel(Game gameMotor) 
	{
		this.gameMotor = gameMotor;
	}


	public void paint(Graphics g) 
	{
		g.setColor(Color.BLACK);
		Image img = new ImageIcon(Paths.get("resources", "monopoly.png").toFile().getPath()).getImage();
	    g.drawImage(img, 0, 0, null);
	    drawTokens(g);
	    
	}
	
	private void drawTokens(Graphics g) {

		for(Player p: gameMotor.getPlayers()) 
		{
			if (!p.getPawn().isHidden()) {
				Point pos = p.getPawn().getPosition();
				g.setColor(Color.BLACK); 
				g.drawOval(pos.x, pos.y, 10, 10); 
				g.setColor(p.getPawn().getColor());
				g.fillOval(pos.x, pos.y, 10, 10);
			}
		}

	}

}

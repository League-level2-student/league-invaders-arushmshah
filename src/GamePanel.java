import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	 Font titleFont = new Font("Arial", Font.PLAIN, 50);
	 Font subtitle1 = new Font("Arial", Font.PLAIN, 24);
	 Font subtitle2 = new Font("Arial", Font.PLAIN, 22);
	 
	
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	
	 void updateMenuState() {  }
	 void updateGameState() {  }
	 void updateEndState()  {  }
	
	 void drawMenuState(Graphics g) 
	 {g.setColor(Color.BLUE);
	 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	 g.setFont(titleFont);
	 g.setColor(Color.YELLOW);
	 g.drawString("LEAGUE INVADERS", 10, 160);
	 
	 g.setFont(subtitle1);
	 g.setColor(Color.YELLOW);
	 g.drawString("Press ENTER To Start", 125, 410);
	 
	 g.setFont(subtitle2);
	 g.setColor(Color.YELLOW);
	 g.drawString("Press SPACE For Instructions", 100, 470);
	 }
	 
	 void drawGameState(Graphics g) {g.setColor(Color.BLACK);
	 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);}
	 void drawEndState(Graphics g)  {g.setColor(Color.RED);
	 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);}
}

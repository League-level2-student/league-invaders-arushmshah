import javax.swing.JFrame;

public class LeagueInvaders {
JFrame frame;
GamePanel panel;
public static final int WIDTH = 500;
public static final int HEIGHT = 800;

public LeagueInvaders() {
	
}

void Setup() {
	panel = new GamePanel();
	frame = new JFrame();
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(WIDTH, HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

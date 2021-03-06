import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;

public class Tile {
	public JButton button;
	private boolean alive;
	private boolean aliveNext;
	public int x, y;
	
	public Tile(int x, int y) {
		this.x = x; this.y = y;
		
		button = new JButton();
		button.setBackground(Color.RED);
		setAlive(false);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				toggleAlive();
			}
		});
	}
	
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
		if(alive) {
			button.setBackground(Color.GREEN);
			
		}
		else {
			button.setBackground(Color.RED);
		}
		button.revalidate();
		button.repaint();
	}
	
	

	public void setAliveNext(boolean aliveNext) {
		this.aliveNext = aliveNext;
	}
	
	public boolean isAliveNext() {
		return aliveNext;
	}

	public void toggleAlive() {
		setAlive(!alive);
	}
}

import java.util.ArrayList;

import javax.swing.*;

public class Main {
	public static void main(String args[]){
       JFrame frame = new JFrame("Game Of Life");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1920,1080);
       frame.setResizable(false);
       World world = new World(frame, 20);
       frame.setVisible(true);
	}
}

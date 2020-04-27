package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whackamole {
	JFrame frame=new JFrame();
	JButton mole=new JButton();
public void	run(){
		JPanel panel=new JPanel();
		frame.add(panel);
		for (int i = 0; i < 68; i++) {
			panel.add(new JButton("x"));
		}
		frame.setVisible(true);
		frame.pack();
	}
	}

package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typing implements KeyListener {
	
	
	JFrame u=new JFrame("type, or . . . type!!!!!!!!!!!!!");
	char currentLetter=generateRandomLetter();
	JLabel i=new JLabel();
	JPanel y=new JPanel();
	
	

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	public void run() {
		u.setVisible(true);
		i.setText(currentLetter+"");
		
		i.setFont(i.getFont().deriveFont(28.0f));
		i.setHorizontalAlignment(JLabel.CENTER);
		
		u.addKeyListener(this);
		u.add(y);
		y.add(i);
		
	
	}
	public static void main(String[] args) {
		
	new	typing().run();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if(e.getKeyChar()==currentLetter) {
			System.out.println("CORRECT");
			Color o=new Color(0, 250, 0);
			y.setBackground(o);
		}
		else {
			Color p=new Color(250, 0, 0);
			y.setBackground(p);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter=generateRandomLetter();
		i.setText(currentLetter+"");
	}
}

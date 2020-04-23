package _09_latest_tweet;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class latest_tweet implements MouseListener, ActionListener {
	JFrame frame=new JFrame();
	JButton button=new JButton("Searching in Twitter");
public void run(){
	JPanel jpanel=new JPanel();
	JTextField textfield=new JTextField();
	textfield.setPreferredSize(new Dimension(400,90));
	frame.add(jpanel);
	jpanel.add(textfield);
	jpanel.add(button);
	frame.setVisible(true);
	button.addMouseListener(this);
	button.addActionListener(this);
	
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		System.out.println("Tweet, Tweet");
	}
}
}

package _08_calculator;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcultor {
	void run(){
JFrame jframe=new JFrame();
JPanel jpanel=new JPanel();
JButton mul=new JButton("mul");
JButton add=new JButton("add");
JButton sub=new JButton("sub");
JButton divide=new JButton("divide");
JTextField one=new JTextField();
JTextField two=new JTextField();
one.setPreferredSize(new Dimension(30, 30));
two.setPreferredSize(new Dimension(30, 30));
jframe.add(jpanel);
jpanel.add(mul);
jpanel.add(sub);
jpanel.add(divide);
jpanel.add(add);
jpanel.add(one);
jpanel.add(two);
jframe.pack();
jframe.setVisible(true);
}
public void add(){
	
}
public void multiply(){
	
}
public void subtract(){
	
}
public void divide(){
	
}
}

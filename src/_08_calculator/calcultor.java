package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcultor implements MouseListener, ActionListener {
	JButton mul=new JButton("mul");
	JButton add=new JButton("add");
	JButton sub=new JButton("sub");
	JTextField one=new JTextField();
	JTextField two=new JTextField();
	JButton divide=new JButton("divide");
	JLabel jlabel=new JLabel();
	JFrame jframe=new JFrame();
	void run(){
JPanel jpanel=new JPanel();
one.setPreferredSize(new Dimension(400, 60));
two.setPreferredSize(new Dimension(400, 60));
jframe.add(jpanel);
jpanel.add(mul);
jpanel.add(sub);
jpanel.add(divide);
jpanel.add(add);
jpanel.add(one);
jpanel.add(two);
jframe.pack();
jframe.setVisible(true);
jframe.addMouseListener(this);
mul.addActionListener(this);
add.addActionListener(this);
sub.addActionListener(this);
divide.addActionListener(this);
jpanel.add(jlabel);
}
public void add(){
	int num1=Integer.parseInt(one.getText());

	int num2=Integer.parseInt(two.getText());
	
	int ad=num1+num2;
	jlabel.setText(ad + "");
}
public void multiply(){
	int num1=Integer.parseInt(one.getText());

	int num2=Integer.parseInt(two.getText());
	
	int product=num1*num2;
	jlabel.setText(product + "");
}
public void subtract(){
	int num1=Integer.parseInt(one.getText());

	int num2=Integer.parseInt(two.getText());
	
	int result=num1-num2;
	jlabel.setText(result + "");
}
public void divide(){
	double num1=Double.parseDouble(one.getText());

	double num2=Double.parseDouble(two.getText());
	
	double quotient=num1/num2;
	jlabel.setText(quotient + "");
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
	if(e.getSource()==mul) {
		multiply();
	}
	if(e.getSource()==add) {
		add();
	}
	if(e.getSource()==sub) {
		subtract();
	}
	if(e.getSource()==divide) {
		divide();
	}
	jframe.pack();
}
}

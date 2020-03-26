package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
	JButton o=new JButton();
	JButton h=new JButton();
	public static void main(String[] args) {
		chuckleclicker bob=new chuckleclicker();
		bob.makeButton();
	}
	void makeButton(){
		
		JOptionPane.showMessageDialog(null, "Make Button");
		
	JFrame u=new JFrame();
	u.setVisible(true);
	JPanel i=new JPanel();
	u.add(i);
	i.add(o);
	i.add(h);
	o.setText("Joke");
	h.setText("Punchline");
	o.addActionListener(this);
	h.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Hi");
	if(e.getSource() == o) {
		JOptionPane.showMessageDialog(null, "bro");
	}
	else {
		JOptionPane.showMessageDialog(null, "woho");
	}

	}
}

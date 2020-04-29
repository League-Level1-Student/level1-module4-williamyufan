package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slot_machine implements ActionListener {
	JFrame frame=new JFrame();
	JButton spin=new JButton("spin");
	Random random=new Random();
	int reel1=random.nextInt(3);
	int reel2=random.nextInt(3);
	int reel3=random.nextInt(3);
public void run(){
	frame=new JFrame();
	JPanel panel=new JPanel();
	 reel1=random.nextInt(3);
	reel2=random.nextInt(3);
 reel3=random.nextInt(3);
	if(reel1==0) {
		JLabel x=createLabelImage("d.jpeg");
		panel.add(x);
	}
	else if(reel1==1) {
		JLabel u=createLabelImage("c.jpeg");
		panel.add(u);
	}
	else if(reel1==2) {
		JLabel r=createLabelImage("orange.jpg");
		panel.add(r);
	}
	if(reel2==0) {
		JLabel u=createLabelImage("c.jpeg");
		panel.add(u);
	}
	else if(reel2==1) {
		JLabel x=createLabelImage("d.jpeg");
		panel.add(x);
	}
	else if(reel2==2) {
		JLabel r=createLabelImage("orange.jpg");
		panel.add(r);
	}
	if(reel3==0) {
		JLabel r=createLabelImage("orange.jpg");
		panel.add(r);
	}
	else if(reel3==1) {
		JLabel x=createLabelImage("d.jpeg");
		panel.add(x);
	}
	else if(reel3==2) {
		JLabel u=createLabelImage("c.jpeg");
		panel.add(u);
	}
	panel.add(spin);
	frame.add(panel);
	spin.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	System.out.println(reel1);
	System.out.println(reel2);
	System.out.println(reel3);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}
private JLabel createLabelImage(String fileName) {
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if((reel1==reel2)&&(reel1==reel3)) {
		System.out.println("You Win!");
	}
	frame.dispose();
	run();
}
}

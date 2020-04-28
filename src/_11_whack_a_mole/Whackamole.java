package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	JFrame frame=new JFrame();
	JButton mole=new JButton("Mole!");
	Random random=new Random();
	int counter=0;
	int molecounter=0;
	Date start=new Date();
public void	run(){
		frame=new JFrame();
		JPanel panel=new JPanel();
		frame.add(panel);
		int mole1=random.nextInt(37);
		frame.setPreferredSize(new Dimension(400,400)); 
		for (int i = 0; i < 37; i++) {
			if(i==mole1) {
				panel.add(mole);
			}
			else {
			JButton notmole=new JButton();
			notmole.addActionListener(this);
			panel.add(notmole);
			}
		}
		mole.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(counter==18) {
		start=new Date();
	}
	counter+=1;
if(counter==3) {
	endGame(start, molecounter);
	int missed=counter-molecounter;
	System.out.println("you missed" + missed + "times!");
	System.exit(JFrame.EXIT_ON_CLOSE);
	
}

	if(e.getSource()==mole) {
		playSound("u.wav");
		
		molecounter +=1;
	}
	else {
			speak("you missed");
	}
	frame.dispose();
	run();
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
	}

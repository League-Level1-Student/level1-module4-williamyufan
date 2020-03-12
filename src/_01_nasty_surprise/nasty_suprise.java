package _01_nasty_surprise;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty_suprise implements ActionListener {
	
	JButton u=new JButton();
	JButton h=new JButton();
public static void main(String[] args) {
nasty_suprise o=new nasty_suprise();
o.setup();
}

public void setup(){
	JFrame i=new JFrame();
	JPanel p=new JPanel();
	i.add(p);
	i.setVisible(true);
	p.add(u);
	p.add(h);
	u.addActionListener(this);
	h.addActionListener(this);
	u.setText("Trick");
	h.setText("Treat");
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==h) {
		showPictureFromTheInternet("https://i.ytimg.com/vi/a6KGPBflhiM/hqdefault.jpg");}
	else {
			showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/rev-1-it2-26273r-high-res-jpeg-1567721576.jpg?crop=0.531xw:0.796xh;0.471xw,0.0383xh&resize=480:*");
		}
	}
}

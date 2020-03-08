package _01_nasty_surprise;

import java.awt.Button;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class nasty_suprise {
public static void main(String[] args) {
Button u=new Button();
Button h=new Button();
u.addActionListener(null);
h.addActionListener(l);
u.setName("Trick");
h.setName("Treat");

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
}}

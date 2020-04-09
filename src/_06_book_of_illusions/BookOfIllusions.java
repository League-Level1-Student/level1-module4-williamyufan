package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import _05_typing_tutor.typing;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame u=new JFrame();
		JLabel f;
	public void run() {
		u.setVisible(true);
		// 3. set the size of the frame
		// 4. find 2 images and save them to your project’s default package
		String o="p.jpg";
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		
		
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		// 7. use the "loadImage..." methods below to initialize your JLabel
		f=loadImageFromComputer(o);
		// 8. add your JLabel to the frame
		u.add(f);
		// 9. call the pack() method on the frame
		u.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		u.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		new	BookOfIllusions().run();
	}

	public void mousePressed(MouseEvent e) {
		
		// 11. Print "clicked!" to the console when the mouse is pressed
				System.out.println("Clicked!");
		// 12. remove everything from the frame that was added earlier
				u.remove(f);
		// 13. load a new image like before (this is more than one line of code)
				String h="r.jpg";
				// 14. pack the frame
				f=loadImageFromComputer(h);
				u.add(f);
		// 14. pack the frame
				u.pack();
				
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}



package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class translator implements ActionListener {
	PigLatinTranslator f=new PigLatinTranslator();
	JFrame frame=new JFrame("translator");
	JLabel latin=new JLabel();
	JTextField textfield1=new JTextField();
public void runner(){
	JPanel panel=new JPanel();
	JButton button=new JButton("translate");
	textfield1.setPreferredSize(new Dimension(300, 90));
	latin.setPreferredSize(new Dimension(300, 90));
	frame.add(panel);
	panel.add(textfield1);
	panel.add(button);
	panel.add(latin);
	frame.setVisible(true);
	frame.pack();
	button.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	latin.setText(f.translate(textfield1.getText()));
	frame.pack();
}

}


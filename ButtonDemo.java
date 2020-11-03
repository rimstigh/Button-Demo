import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonDemo implements ActionListener {
  JLabel label;
  ButtonDemo() {
    //make frame, create new layout using FlowLayout
	  JFrame frame = new JFrame("Button");
	  frame.setLayout(new FlowLayout());
	  frame.setSize(220,90);
	
    //make buttons that have listeners associated to them
    JButton up = new JButton("Up");
	  JButton down = new JButton("Down");
	
    up.addActionListener(this);
	  down.addActionListener(this);
	
    //add listeners to the frame
    frame.add(up);
	  frame.add(down);
	
  label = new JLabel("Press a button");
	frame.add(label);
	frame.setVisible(true);
  }

//this user-defined method dictates what will happen from clicking a button
public void actionPerformed(ActionEvent ae) {
   if(ae.getActionCommand().equals("Up")) {
	label.setText("You pressed up");
   }
   else {
	label.setText("You pressed down");
   }
 }
}

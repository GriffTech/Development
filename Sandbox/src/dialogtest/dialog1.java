package dialogtest;


import java.awt.FlowLayout;
//import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//import java.awt.*;
import javax.swing.*;

//public class dialog1 extends JApplet{
public class dialog1 extends JFrame{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JCheckBox boxField;
	private JList listBox;
	private JPasswordField passwordField;;
	private JButton button1;
	private JButton button2;
	
	private DefaultListModel model;
	
	//Image img;
	//ImageIcon ic;
	//JLabel label;
	
	
	public dialog1() {
		

		
		super("The title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField(20);
		add(item2);
		
		item3 = new JTextField(20);
		add(item3);
		
		passwordField = new JPasswordField(10);
		add(passwordField);	
		
		// CheckBox
		boxField = new JCheckBox("Yes?",true);
		add(boxField);	
		
		// List
		model = new DefaultListModel();
		listBox = new JList(model);
		model.add(0, "Item1");
		model.add(1, "Item2");
		model.add(2, "Item3");
		model.add(3, "Item3");
		add(listBox);

		// Buttons
		button1 = new JButton("OK");
		add(button1);
		button2 = new JButton("Cancel");
		add(button2);
		
		//img = getImage(getCodeBase(),"afraid.gif");
		//ic = new ImageIcon(img);
		//label = new JLabel(ic);
		
		
	}

}

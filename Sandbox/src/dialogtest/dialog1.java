package dialogtest;


import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JButton;


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
		
		boxField = new JCheckBox("Yes?",true);
		add(boxField);	
		
		
		
		
		
		model = new DefaultListModel();
		listBox = new JList(model);
		model.add(0, "Item1");
		model.add(1, "Item2");
		model.add(2, "Item3");
		model.add(3, "Item3");
		add(listBox);
		

		
		button1 = new JButton("OK");
		add(button1);
		button2 = new JButton("Cancel");
		add(button2);
		
		
		
	}

}

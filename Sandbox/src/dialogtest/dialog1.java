package dialogtest;


import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class dialog1 extends JFrame{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;;
	
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
		

		
		
		
		
		
	}

}

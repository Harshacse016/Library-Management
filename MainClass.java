package PROJECT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainClass extends JFrame implements ActionListener {
	JButton b1, b2, b3,b4,b5;
	JPanel p1, p2, p3;
	JLabel l;
	
	public void start() 
	{
		 setLayout(null);
		 setTitle("LIBRARY BOOKS");
		b1 = new JButton("LOGIN");
		b2 = new JButton("SIGN UP");
		b3 = new JButton("GUEST");
		b4 = new JButton("EXIT");

		l=new JLabel(new ImageIcon("F:\\Mockingbird_Final.jpg"));
		b1.setBounds(550, 110, 150, 30);
		b2.setBounds(550, 160, 150, 30);
		b3.setBounds(550, 210, 150, 30);
		b4.setBounds(250, 300, 150, 30);
		l.setBounds(0, 0,705,515);
	
		add(b1);
		add(b2);
		//add(b3);
		add(b4);
		add(l);
		
		b4.setBackground(Color.CYAN);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		setSize(705,515);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae1) 
	{
		Login l=new Login();
		Signup s = new Signup();
		
		
		if(ae1.getSource()==b4)
			System.exit(0);
		
		else if(ae1.getSource()==b1)
			l.login();
		
		else if(ae1.getSource()==b2)
			s.signup();
			
	}

	public static void main(String s[]) 
	{
		MainClass cals = new MainClass();
		cals.start();
	}

}


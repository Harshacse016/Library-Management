package PROJECT;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BookRenule extends JFrame implements ActionListener
{
	JTextField tf1,tf2;
	JButton b1,b2,b3;
	JLabel l,l1,l2,l3;
	
	Font f;
	
	int count=0;

	String ssid;
	String sname;
	
	public void Receive1(String s1,int coun,String sid) throws Exception
	{
		setTitle(s1);
		setLayout(null);
		
		ssid=sid;
		sname=s1;
		
		tf1=new JTextField();
		tf2=new JTextField();
		b1=new JButton("SEARCH");
		b3=new JButton("SEARCH");
		b2=new JButton("LOGOUT");
		l1=new JLabel(s1);
		l=new JLabel("ENTER THE BOOK NAME ");
		l2=new JLabel("ENTER THE BOOK AUTHOR ");
		l3=new JLabel("OR");
	    f=new Font("Garmond",Font.BOLD,18);
				
		l.setBounds(10,150,170,30);
		tf1.setBounds(200,150,170,30);
		b1.setBounds(380,150,100,30);
		
		l2.setBounds(10,250,170,30);
		tf2.setBounds(200,250,170,30);
		b3.setBounds(380,250,100,30);
		
		l3.setBounds(250,200,170,30);
		
		tf1.setFont(f);
		tf2.setFont(f);
		l3.setFont(f);
		
		l1.setBounds(410,50,170,30);
		b2.setBounds(500,50,100,30);
		
		
		b1.setBackground(Color.CYAN);
		l.setBackground(Color.BLACK);
		
		b3.setBackground(Color.CYAN);
		l2.setBackground(Color.BLACK);
		
		l3.setBackground(Color.BLACK);
		
		add(l);
		add(tf1);
		add(tf2);
		add(b1);
		add(l1);
		add(b2);
		add(l2);
		add(b3);
		add(l3);
		
		count=coun;
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setSize(905,615);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	
	public void actionPerformed(ActionEvent ae) 
	{
		
		Login l=new Login();
		JDBC1 j=new JDBC1();
		
		int p;
		
		
		if(ae.getSource()==b2)
			l.login();
		
		else if(ae.getSource()==b1)
		{
			try 
			{
				String s=tf1.getText();
				p=j.sample2(sname,s,count,ssid);
				
				if(p==1)
					tf1.setText("");
			}
		
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		else if(ae.getSource()==b3)
		{
			try 
			{
				String search=tf2.getText();
				p=j.sample2(sname,search,count,ssid);
				
				if(p==1)
					tf2.setText("");
			}
		
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
			
		
	}
	
	/*public static void main(String s[]) throws Exception
	{
		BookRenule ld=new BookRenule();
		ld.Receive1("harsha vardhan",0,"");
	}*/
	
	
}

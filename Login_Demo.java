package PROJECT;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
//import java.sql.Date;

import javax.swing.*;

public class Login_Demo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JLabel l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	Font f;
	
	Date d;
	
	JLabel l21=new JLabel();
	
	String password="Admin123Anits";
	JPasswordField tf=new JPasswordField();
	
	String ss,ssid;
		
	String check_date1,check_date2,check_date3;
	String check_date11,check_date22,check_date33;
	String check_date111,check_date222,check_date333;
	
	String fee1,fee2,fee3;
	
	int date_fee1=0,date_fee2=0,date_fee3=0;
	
	int count=0;
	int enable_button;
	
	Date1 date=new Date1();
	
	public void Receive(String s,String s1,String s2,String s3,String date1,String date2,String date3,int enable,String sid)
	{
		setTitle(s);
		setLayout(null);
		
		ss=s;
		ssid=sid;
		
		enable_button=enable;
		
		check_date1=date1;
		check_date2=date.callNewDate(date1);
		check_date3=date.callDate();

		check_date11=date2;
		check_date22=date.callNewDate(date1);
		check_date33=date.callDate();
		
		check_date111=date3;
		check_date222=date.callNewDate(date1);
		check_date333=date.callDate();
		
		l1=new JLabel("BOOK1");
		l2=new JLabel("BOOK2");
		l3=new JLabel("BOOK3");
		l6=new JLabel(s);
		
		l4=new JLabel("NUMBER OF BOOKS    :");
		l5=new JLabel("NAME OF THE BOOKS :");
		
		l7=new JLabel(s1);
		l8=new JLabel(s2);
		l9=new JLabel(s3);
		
		l10=new JLabel("RENULE                         :");
		l11=new JLabel("LATE FEE                      :");
		
		if(check_date3.compareTo(check_date2) >0)
		{
			date_fee1++;
		}
		fee1=String.valueOf(date_fee1);
		
		if(check_date33.compareTo(check_date22) >0)
		{
			date_fee2++;
		}
		fee2=String.valueOf(date_fee2);
		
		if(check_date333.compareTo(check_date222) >0)
		{
			date_fee3++;
		}
		fee3=String.valueOf(date_fee3);
		
		l12=new JLabel(fee1);
		l13=new JLabel(fee2);
		l14=new JLabel(fee3);
		
		l15=new JLabel("ADD THE BOOKS         :");

		l16=new JLabel("DATE                              :");
		l17=new JLabel(date1);
		l18=new JLabel(date2);
		l19=new JLabel(date3);
		
		l20=new JLabel("RETURN                        :");

		f=new Font("Garmond",Font.BOLD,18);
		 
		b1=new JButton("LOGOUT");
		b2=new JButton("RENULE");
		b3=new JButton("RENULE");
		b4=new JButton("RENULE");
		b5=new JButton("ADD");
		b6=new JButton("ADD");
		b7=new JButton("ADD");
		
		b8=new JButton("RETURN");
		b9=new JButton("RETURN");
		b10=new JButton("RETURN");
		
		l6.setBounds(340,50,170,30);
		b1.setBounds(500,50,100,30);
		
		l4.setBounds(10,150,230,30);
		l1.setBounds(250,150,170,30);
		l2.setBounds(450,150,170,30);
		l3.setBounds(650,150,170,30);
		
		l5.setBounds(10,190,230,30);
		l7.setBounds(250,190,170,30);
		l8.setBounds(400,190,170,30);
		l9.setBounds(600,190,170,30);
		
		l10.setBounds(10,230,230,30);
		b2.setBounds(235,230,100,30);
		b3.setBounds(435,230,100,30);
		b4.setBounds(635,230,100,30);
		
		l11.setBounds(10,280,230,30);
		l12.setBounds(275,280,100,30);
		l13.setBounds(475,280,100,30);
		l14.setBounds(675,280,100,30);
		
		l15.setBounds(10,330,230,30);
		b5.setBounds(235,330,100,30);
		b6.setBounds(435,330,100,30);
		b7.setBounds(635,330,100,30);
		
		l16.setBounds(10,380,230,30);
		l17.setBounds(230,380,100,30);
		l18.setBounds(430,380,100,30);
		l19.setBounds(630,380,100,30);
		
		l20.setBounds(10,430,230,30);
		b8.setBounds(235,430,100,30);
		b9.setBounds(435,430,100,30);
		b10.setBounds(635,430,100,30);
		
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		//l7.setFont(f);
		//l8.setFont(f);
		//l9.setFont(f);
		l10.setFont(f);
		l11.setFont(f);
		l12.setFont(f);
		l13.setFont(f);
		l14.setFont(f);
		l15.setFont(f);
		l16.setFont(f);
		l17.setFont(f);
		l18.setFont(f);
		l19.setFont(f);
		l20.setFont(f);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l14);
		add(l15);
		add(l16);
		add(l17);
		add(l18);
		add(l19);
		add(l20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		
		b5.setEnabled(true);
		b6.setEnabled(false);
		b7.setEnabled(false);
		
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		
		if(enable==0)
		{
			if(s1!=null)
			{
				b5.setEnabled(false);
				b6.setEnabled(true);
				b7.setEnabled(false);
				
				b8.setEnabled(true);
				b9.setEnabled(false);
				b10.setEnabled(false);
			}
			
			if(s2!=null)
			{
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(true);
				
				b8.setEnabled(true);
				b9.setEnabled(true);
				b10.setEnabled(false);
				
			}
			
			if(s3!=null)
			{
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				
				b8.setEnabled(true);
				b9.setEnabled(true);
				b10.setEnabled(true);
			}
		}

		setSize(905,615);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void Disable_Button(int enable_button)
	{
		if(enable_button==1)
		{
			b5.setEnabled(false);
			b6.setEnabled(true);
			b7.setEnabled(false);
			
			/*b8.setEnabled(true);
			b9.setEnabled(false);
			b10.setEnabled(false);*/
		}
		
		if(enable_button==2)
		{
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(true);
			
			/*b8.setEnabled(true);
			b9.setEnabled(true);
			b10.setEnabled(false);*/
		}
		 
		if(enable_button==3)
		{
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			
			/*b8.setEnabled(true);
			b9.setEnabled(true);
			b10.setEnabled(true);*/
		}
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		Login l=new Login();
		BookRenule br=new BookRenule();
		JDBC1 j=new JDBC1();
		
		if(ae.getSource()==b1)
			l.login();
		
		if(ae.getSource()==b2)
			l12.setText("5");
		
		if(ae.getSource()==b5)
		{
			try 
			{
				count=1;
				br.Receive1(ss,count,ssid);
				/*if(enable_button==1)
					b5.setEnabled(false);*/
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b6)
		{
			try 
			{
				count=2;
				br.Receive1(ss,count,ssid);
				/*if(enable_button==2)
					b6.setEnabled(false);*/
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b7)
		{
			try 
			{
				count=3;
				br.Receive1(ss,count,ssid);
				/*if(enable_button==3)
					b7.setEnabled(false);*/
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b2)
		{
			try
			{
				count=1;
				String Date=j.renule(count, ssid);
				l17.setText(Date);
			}
			
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b3)
		{
			try
			{
				count=2;
				String Date=j.renule(count, ssid);
				l18.setText(Date);
			}
			
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b4)
		{
			try
			{
				count=3;
				String Date=j.renule(count, ssid);
				l19.setText(Date);
			}
			
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b8)
		{
			try
			{
				//System.out.println("pressed");
				count=1;
				l12.setText("0");
				l7.setText("");
				l17.setText("");
				b5.setEnabled(true);
				j.Delete(count, ssid);
			}
			
			catch(Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		
		if(ae.getSource()==b9)
		{
			try
			{
				count=2;
				l13.setText("0");
				l8.setText("");
				l18.setText("");
				b6.setEnabled(true);
				j.Delete(count, ssid);
			}
			
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		if(ae.getSource()==b10)
		{
			try
			{
				count=3;
				l14.setText("0");
				l9.setText("");
				l19.setText("");
				b7.setEnabled(true);
				j.Delete(count, ssid);
			}
			
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	/*public static void main(String arg[])
	{
		Login_Demo br1=new Login_Demo();
		br1.Receive("harsha","","","","","","",1,"");
	}*/

}

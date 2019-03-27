package PROJECT;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Signup extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3,l4,l5,l6,l8,l9,l10,l14;
	JPasswordField tf2,tf3;
	JTextField tf1,tf4,tf5,tf6,tf7;
	JButton b,b1,b2,b3;
	Font f;
	JDialog d=new JDialog(this,"ANSWER",true);
	
	int verify=0;
	
	JLabel l12,l13;
	JTextField tf8,tf9;
	

    int a1[]=new int[6];
    int rr;
    
	JLabel l7=new JLabel(new ImageIcon("C:\\Users\\Harsha\\OneDrive\\Pictures\\AndroidPics\\tick.png"));
	JLabel l11=new JLabel(new ImageIcon("C:\\Users\\Harsha\\OneDrive\\Pictures\\AndroidPics\\wrong.png"));

	public void signup()
	{
		setLayout(null);
		setTitle("REGISTRATION FORM");
		tf1=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf8=new JTextField();
		tf9=new JTextField();
		tf2=new JPasswordField();
		tf3=new JPasswordField();
		l1=new JLabel("REGISTRATION FORM");
		
		l5=new JLabel("ENTER  USERNAME");
		
		l4=new JLabel("ENTER LOGIN ID");
		l9=new JLabel("EX- 316126510016");
		
		l10=new JLabel("ENTER YOUR GMAIL");
		
		l8=new JLabel("ENTER THE AGE");
		l2=new JLabel("ENTER  PASWORD");
		l3=new JLabel("RE-ENTER  PASWORD");
		b=new JButton("NEXT");
		b1=new JButton("BACK");
		b2=new JButton("VERIFY");
		f=new Font("Garmond",Font.BOLD,18);
		
		l12=new JLabel("ENTER THE BRANCH");
		l13=new JLabel("ENTER THE YEAR");
		
		l1.setBounds(200,50,150,30);
		l5.setBounds(100,100,150,30);
		tf1.setBounds(250,100,200,30);
		l4.setBounds(100,150,150,30);
		tf4.setBounds(250,150,200,30);
		
		l10.setBounds(100,200,150,30);
		tf6.setBounds(250,200,200,30);
		b2.setBounds(500,200,100,30);
		
		l7.setBounds(500,65,300,300);
		l11.setBounds(500,65,300,300);
		
		l8.setBounds(100,250,150,30);
		tf5.setBounds(250,250,200,30);
		
		l2.setBounds(100,300,150,30);
		tf2.setBounds(250,300,200,30);
		l3.setBounds(100,350,150,30);
		tf3.setBounds(250,350,200,30);
		
		l12.setBounds(100,400,150,30);
		tf8.setBounds(250,400,200,30);
		l13.setBounds(100,450,150,30);
		tf9.setBounds(250,450,200,30);
		
		
		
		b.setBounds(100,500,80,30);
		b1.setBounds(200,500,80,30);
	
		
		/*l7=new JLabel(new ImageIcon("C:\\Users\\Harsha\\OneDrive\\Pictures\\AndroidPics\\tick.png"));
		l7.setBounds(400,200,300,300);*/
		
		l7.setVisible(false);
		l11.setVisible(false);		

		
	//	tf2.setEchoChar('*');
	//	tf3.setEchoChar('*');
		tf1.setFont(f);
	    tf4.setFont(f);
	    tf2.setFont(f);
	    tf3.setFont(f);
	    tf5.setFont(f);
	    tf6.setFont(f);
	    tf8.setFont(f);
	    tf9.setFont(f);
	    
		add(l3);
		add(l1);
		add(l2);
		add(tf1);
		add(tf2);
		add(b);
		add(b1);
		add(l4);
		add(l5);
		add(tf3);
		add(tf4);
		add(l8);
		add(tf5);
		add(b2);
		add(l10);
		add(tf6);
		add(l11);
		add(l7);
		add(l12);
		add(tf8);
		add(l13);
		add(tf9);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b1.setForeground(Color.blue);
		b1.setForeground(Color.RED);
		b.setForeground(Color.blue);
		l1.setForeground(Color.blue);
		l3.setForeground(Color.BLACK);
		l2.setForeground(Color.black);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);
		l12.setForeground(Color.black);
		l13.setForeground(Color.black);
	//	b3.setForeground(Color.gray);
		setBackground(Color.MAGENTA);		
		setSize(705,615);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae1) 
	{
	
		int p;
		String a[]=new String[100];
		Login lg = new Login();
		JDBC1 jd=new JDBC1();
		Mail mail=new Mail();
		
		String user=tf1.getText();
		String lid=tf4.getText();
		String gmail=tf6.getText();
		String age=tf5.getText();
		String branch=tf6.getText();
		String year=tf5.getText();
		
		String password=Arrays.toString(tf2.getPassword());
		String password1=Arrays.toString(tf3.getPassword());
		
		
		if(ae1.getSource()==b1)
		{
			 lg.login();
		}
		 		
		else if(ae1.getSource()==b)
		{
			if(user.length()==0 || lid.length()==0 || gmail.length()==0 || age.length()==0 || password.length()==0 || password1.length()==0 || branch.length()==0 || year.length()==0)
			{
				if(verify==0)
				{
					JDialog d=new JDialog(this,"ANSWER",true);
			    	d.setLayout(null);
					l14=new JLabel("PLEASE ENTER THE DETAILS");
					/*tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText("");
					tf8.setText("");
					tf9.setText("");*/
					l14.setBounds(100,10,550,30);
					d.add(l14);
					d.setSize(600,300);
				    d.show();
				}
				
			}
			
			else  if(password.length()<17)
				{
					JDialog d=new JDialog(this,"ANSWER",true);
			    	d.setLayout(null);
					l14=new JLabel("THE PASSWORD MUST CONTAIN ATLEAST 6 CHARACTERS");
					tf6.setText("");
					l14.setBounds(100,10,550,30);
					d.add(l14);
					d.setSize(600,300);
				    d.show();					
				}
			 
			 	else
			 	{
			 		if(password.equals(password1))
					{
						/*String str=tf1.getText();
						String str1=tf4.getText();
						String str2=tf5.getText();*/
						
			 			if(verify==0)
						{
							JDialog d=new JDialog(this,"ANSWER",true);
					    	d.setLayout(null);
					    	l14=new JLabel("PLEASE VERIFY THE MAIL");
					    	l14.setBounds(100,10,550,30);
							d.add(l14);
							d.setSize(600,300);
						    d.show();
						}
			 			
			 			else
			 			{
			 				try 
							{
								p=jd.sample(user,lid,age,gmail,branch,year,password);
								if(p==1)
								{
									tf1.setText("");
									/*tf2.setText("");
									tf3.setText("");
									tf4.setText("");
									tf5.setText("");
									tf6.setText("");
									tf8.setText("");
									tf9.setText("");
									l7.setVisible(false);
									l11.setVisible(false);*/
								}
							} 
							catch (Exception e) 
							{
								e.printStackTrace();
							}		
			 			}
					}
					
					else
					{
						JDialog d=new JDialog(this,"ANSWER",true);
				    	d.setLayout(null);
				    	l14=new JLabel("WRONG PWD");
						tf2.setText("");
						tf3.setText("");
						l14.setBounds(100,10,150,30);
						d.add(l14);
						d.setSize(300,300);
					    d.show();
					}
			 	}	
		}
		
		else if(ae1.getSource()==b2)
		{
			
			String sm=tf6.getText();
			
			if(sm.length()==0)
			{
				/*JDialog d1=new JDialog(this,"ANSWER",true);
		    	d1.setLayout(null);
				l7=new JLabel("ENTER THE MAIL");				
				l7.setBounds(100,10,150,30);
				d1.add(l7);
				d1.setSize(300,300);
			    d1.show();*/
			    
				rr=1;
				l11.setVisible(true);
				l7.setVisible(false);
			}
			
			else
			{
				int x=0;
				
				try 
		    	{
					x=mail.MailVerification1(sm);
				} 
		    	
		    	catch (Exception e) 
		    	{
					//e.printStackTrace();
		    		l7.setVisible(false);
					l11.setVisible(true);
				}
				
				if(x==1)
				{
					l11.setVisible(false);
					l7.setVisible(true);
					verify=1;
				}
				
				else
				{
					l7.setVisible(false);
					l11.setVisible(true);
				}
			}
			
			/*else
			{
				int x=0;

				Random rand =new Random(); 
		    	
		    	for(int i=0;i<6;i++)
		    	{
		    		a1[i]=rand.nextInt(9);
		    	}
		    	
		    	try 
		    	{
					x=mail.MailVerification(sm,a1);
				} 
		    	
		    	catch (Exception e) 
		    	{
					e.printStackTrace();
				}

				if(x==1)
				{
			    	d.setLayout(null);
					l7=new JLabel("ENTER THE OTP");
					tf7=new JTextField();
					b3=new JButton("OK");
				    tf7.setFont(f);
					l7.setBounds(100,10,150,30);
					tf7.setBounds(100,30,150,30);
					
					b3.setBounds(100,70,100,30);
					b3.addActionListener(this);
					d.add(l7);
					d.add(tf7);
					d.add(b3);
					d.setSize(300,300);
				    d.show();
				}
				
				if(x==0)
				{
					JDialog d=new JDialog(this,"ANSWER",true);
			    	d.setLayout(null);
					l7=new JLabel("WRONG MAIL U ENTER");
					tf6.setText("");
					l7.setBounds(100,10,150,30);
					d.add(l7);
					d.setSize(300,300);
				    d.show();
				}
			}
			
	    }
		
		else if(ae1.getSource()==b3)
		{
			 	String s1;
			    s1=tf7.getText();
		    		    	
		    			    		    	
		    	if(s1.length()!=6)
		    	{
		    		JDialog d1=new JDialog(this,"ANSWER",true);
			    	d1.setLayout(null);
					l7=new JLabel("ENTER THE 6 DIGIT OTP");				
					l7.setBounds(100,10,150,30);
					d1.add(l7);
					d1.setSize(300,300);
				    d1.show();
		    	}
		    	
		    	else
		    	{

		    		int count=0;
		        	
		        	char c[]=new char[6];
		        	
		        	for(int i=0;i<6;i++)
		        	{
		            	c[i]=(char)(a1[i]+'0');   	
		        	}
		        	
		        	for(int i=0;i<6;i++)
		        	{
		        		if((s1.charAt(i))==c[i])
		        		{
		        			count++;
		        		}
		        	}
		        	
		        	if(count==6) 
		        	{
		        		JDialog d1=new JDialog(this,"ANSWER",true);
				    	d1.setLayout(null);
						l7=new JLabel(new ImageIcon("C:\\Users\\Harsha\\OneDrive\\Pictures\\AndroidPics\\tick.png"));
						l7.setBounds(400,200,80,80);
						d1.add(l7);
						d1.setSize(300,300);
					    d1.show();
					    
					    //add(l7);
		        		
					    d.dispose();
		        		if(rr==1)
		        			l7.setVisible(true);
					    
		        	}
		        	else
		        	{
		        		JDialog d1=new JDialog(this,"ANSWER",true);
				    	d1.setLayout(null);
						l7=new JLabel("VERFICATION IS NOT COMPLETED");				
						l7.setBounds(100,10,200,30);
						d1.add(l7);
						d1.setSize(300,300);
					    d1.show();
		        	}
		    }*/
		}
	}
/*	public static void main(String s[]) 
	{
		Signup lg = new Signup();
		lg.signup();
	}*/
}
	



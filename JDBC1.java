package PROJECT;
import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class JDBC1 extends Frame implements ActionListener
{
	
	JLabel l7=new JLabel();
	
	String password="Admin123Anits";
	JPasswordField tf=new JPasswordField();
	JLabel l1=new JLabel("DO YOU WANT TO ADD THE BOOK");
	JButton b=new JButton("ADD");
	
	JButton b1=new JButton("SUBMIT");
	
	Login_Demo ld=new Login_Demo();
	
	JDialog d=new JDialog(this,"ANSWER",true);
	JDialog d1=new JDialog(this,"ANSWER",true);

	String Book_Search,ssid;
	String sname;
	
	String Book1,Book2,Book3;
	
	String Date1,Date2,Date3;
	
	int count;
	
	public int sample(String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws Exception
	{
		Scanner o=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
		Statement st=con.createStatement();
		
		String s="select * from Regesteration";
		
		int c=0,p=0,clear=0;
		
		
		ResultSet rs=st.executeQuery(s);
	
		while(rs.next())
		{
			if(rs.getString(1).equals(s1) || rs.getString(2).equals(s2))
			{
			    c++;
			    if(rs.getString(1).equals(s1))
			    	p=1;
			    else if(rs.getString(2).equals(s2))
			    	p=0;
			}
		} 
			
			if(c>0)
			{
				JDialog d=new JDialog(this,"ANSWER",true);
		    	d.setLayout(null);
		    	
		    	if(p==1)		    	
		    		l7=new JLabel(" THE USER NAME IS INVALID PLEASE TRY ANOTHER USERNAME");
		    	else if(p==0)
		    		l7=new JLabel(" THE LOGIN ID IS INVALID PLEASE TRY ANOTHER LOGIN ID");
		    	
		    	clear=1;
				l7.setBounds(100,10,550,30);
				d.add(l7);
				d.setSize(600,300);
			    d.show();
			}
			
			else
				{
					int id,age,year;
					
					/*id=Integer.parseInt(s2);
					age=Integer.parseInt(s3); s1,id,age,s4,s5,year,s7    '%s','%d','%d','%s','%s','%d','%s'
					year=Integer.parseInt(s6);*/
					
					String in=String.format("insert into Regesteration values('%s','%s','%s','%s','%s','%s','%s')",s1,s2,s3,s4,s5,s6,s7);
					
					st.executeUpdate(in);
					
					ld.Receive(s1,"","","","","","",1,s2);
					
				}
			
		con.close();
		return clear;
	}
	
	public int sample1(String s1,String s2) throws Exception
	{
		Scanner o=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
		Statement st=con.createStatement();
		String s="select * from Regesteration";      
		
		int c=0,clear=0;
		String sid="";
		ResultSet rs=st.executeQuery(s);

		while(rs.next())
		{
			if(rs.getString(1).equals(s1) && rs.getString(7).equals(s2))
			{
			    c++;
				sid=rs.getString(2);
			}
		} 
		
		
		if(c>0)
		{
		
			clear=1;
			
			ssid=sid;
			//int sssid=10;
			String eeee="";
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
				Statement st1=con1.createStatement();
				
				String query="select * from Renule";      
				ResultSet rs1=st1.executeQuery(query);

				//sssid=Integer.parseInt(ssid);
				
				while(rs1.next())
				{
					 eeee=rs1.getString(1);
					 
					if(eeee.equals(ssid))
					{
						Book1=rs1.getString(2);
						Date1=rs1.getString(3);
						Book2=rs1.getString(4);
						Date2=rs1.getString(5);
						Book3=rs1.getString(6);
						Date3=rs1.getString(7);
					}
				}
				
			}
			
			catch(Exception e){}
			
			//System.out.println("haysybvd:"+Book1+" kkkkkk "+Book2+" kksjjsjs "+Book3+" kksjjsjs "+ssid+" kksjjsjs "+eeee);
			ld.Receive(s1,Book1,Book2,Book3,Date1,Date2,Date3,0,sid);

			
		}
		
		else  
		{
			JDialog d=new JDialog(this,"ANSWER",true);
	    	d.setLayout(null);
			l7=new JLabel("NAME AND PASSWORD IS WRONG");
			clear=1;
			l7.setBounds(10,10,250,30);
			d.add(l7);
			d.setSize(300,300);
		    d.show();
		}
		
		
	    
		con.close();
		return clear;
	}
	
	public int sample2(String ssname,String s1,int coun,String sid) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
		Statement st=con.createStatement();
		
		int c=0,clear=0;
		Book_Search=s1;
		count=coun;
		ssid=sid;
		
		sname=ssname;
		
		ResultSet rs=st.executeQuery("select * from Book");
		
		while(rs.next())
		{	
			if(rs.getString(2).equals(s1) || rs.getString(4).equalsIgnoreCase(s1))
			{
			    c++;
			}
		} 
		
		if(c>0)
		{
			//JDialog d=new JDialog(this,"ANSWER",true);
	    	d1.setLayout(null);
			l7=new JLabel("THE BOOK IS AVAILABLE");
			l7.setBounds(10,10,250,30);
			l1.setBounds(10,60,250,30);
			b.setBounds(80,100,80,30);
			d1.add(l7);
			d1.add(b);
			d1.add(l1);

			b.addActionListener(this);

			d1.setSize(300,300);
		    d1.show();
		    
		    clear=1;
		}
		
		else  
		{
			//JDialog d=new JDialog(this,"ANSWER",true);
	    	d1.setLayout(null);
			l7=new JLabel("THE BOOK IS NOT AVAILABLE");
			l7.setBounds(10,10,250,30);
			d1.add(l7);
			d1.setSize(300,300);
		    d1.show();
		    
		    clear=1;
		}
		
		return clear;
	}
	
	public String renule(int count,String sid) throws Exception
	{
		Date1 date=new Date1();
		
		String Renule_Date=date.callDate();
		
		if(count==1)
		{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
				String in=String.format("update Renule set B1DATE=? where sid=?");
				PreparedStatement pstmt = con.prepareStatement(in);
				pstmt.setString(1,Renule_Date);
				pstmt.setString(2,sid);		
		        pstmt.executeUpdate();			
		        
		        con.close();
		}
		
		if(count==2)
		{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
				String in=String.format("update Renule set B2DATE=? where sid=?");
				
				PreparedStatement pstmt = con.prepareStatement(in);

				pstmt.setString(1,Renule_Date);
				pstmt.setString(2,sid);
				
		        pstmt.executeUpdate();			
		        
		        con.close();
	        
		}
		
		if(count==3)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
			
			String in=String.format("update Renule set B3DATE=? where sid=?");
			
			PreparedStatement pstmt = con.prepareStatement(in);

			pstmt.setString(1,Renule_Date);
			pstmt.setString(2,sid);
			
	        pstmt.executeUpdate();			
	        
	        con.close();
	        
		}
		
		return Renule_Date;
	}
	
	public void Delete(int count,String sid) throws Exception
	{
		String a="";
		String b="";
		if(count==1)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
			
			/*Statement st1=con.createStatement();
			String query="select * from Renule where sid="+"'"+sid+"'";
			ResultSet rs1=st1.executeQuery(query);
			rs1.next();
			String ss=rs1.getString(1);
			{
				if(ss.equalsIgnoreCase(null))
				{
					String in=String.format("delete Renule where sid=?");
					
					PreparedStatement pstmt = con.prepareStatement(in);
					pstmt.setString(1,sid);
			        pstmt.executeUpdate();			
			        con.close();
				}
				
				else*/
				{
					String in=String.format("update Renule set B1NAME=? , B1DATE=? where sid=?");
					
					PreparedStatement pstmt = con.prepareStatement(in);

					pstmt.setString(1,a);
					pstmt.setString(2,b);
					pstmt.setString(3,sid);
					
			        pstmt.executeUpdate();			
			        
			        con.close();
				}
			//}
		}
		
		if(count==2)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
			
			String in=String.format("update Renule set B2NAME=? , B2DATE=? where sid=?");
			
			PreparedStatement pstmt = con.prepareStatement(in);

			pstmt.setString(1,a);
			pstmt.setString(2,b);
			pstmt.setString(3,sid);
			
	        pstmt.executeUpdate();			
	        
	        con.close();
		}
		
		if(count==3)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
			
			String in=String.format("update Renule set B3NAME=? , B3DATE=? where sid=?");
			
			PreparedStatement pstmt = con.prepareStatement(in);

			pstmt.setString(1,a);
			pstmt.setString(2,b);
			pstmt.setString(3,sid);
			
	        pstmt.executeUpdate();			
	        
	        con.close();
		}
	}

	public void actionPerformed(ActionEvent ae) 
	{
		
		if(ae.getSource()==b)
		{
/*			JDialog d=new JDialog(this,"ANSWER",true);
*/	    	d.setLayout(null);
			l7=new JLabel("ENTER THE PASSWORD");
			l7.setBounds(10,10,150,30);
			tf.setBounds(160,10,200,30);
			b1.setBounds(80,100,80,30);
			d.add(l7);
			d.add(b1);
			d.add(tf);

			b1.addActionListener(this);

			d.setSize(400,400);
		    d.show();
		}
		
		if(ae.getSource()==b1)
		{
			String a = tf.getText().toString();//Arrays.toString(tf.getPassword());
			
			Date1 date=new Date1();
			Login_Demo ld=new Login_Demo();
			
			if(a.equals(password))
			{
				if(count==1)
				{
					//ld.Receive("",Book1,"","",Date1,Date2,Date3,1,ssid);
					String Renule_date=date.callDate();
					
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
						//Statement st=con.createStatement();
			
						String in=String.format("insert into Renule(sid,B1NAME,B1DATE,FEE) values(?,?,?,?)");
						//ssid,Book_Search,Renule_date,100);
						
						//String in=String.format("insert into Renule(sid,B1NAME,B1DATE,FEE) values(ssid,'Book_Search','Renule_date',100)");

						PreparedStatement pstmt = con.prepareStatement(in);

						pstmt.setString(1,ssid);
						pstmt.setString(2,Book_Search);
						pstmt.setString(3,Renule_date);
						pstmt.setInt(4,0);
						
				        pstmt.executeUpdate();			
				        
				        ld.Disable_Button(1);
					}
					
					catch(Exception e)
					{}
					
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
						Statement st1=con1.createStatement();
						
						String query="select * from Renule";      
						ResultSet rs1=st1.executeQuery(query);

						//sssid=Integer.parseInt(ssid);
						
						String eeee;
						
						while(rs1.next())
						{
							 eeee=rs1.getString(1);
							 
							if(eeee.equals(ssid))
							{
								Book1=rs1.getString(2);
								Date1=rs1.getString(3);
								Book2=rs1.getString(4);
								Date2=rs1.getString(5);
								Book3=rs1.getString(6);
								Date3=rs1.getString(7);
							}
						}
						
					}
					
					catch(Exception e){}
					
					//System.out.println("haysybvd:"+Book1+" kkkkkk "+Book2+" kksjjsjs "+Book3+" kksjjsjs "+ssid+" kksjjsjs "+eeee);
					ld.Receive(sname,Book1,Book2,Book3,Date1,Date2,Date3,0,ssid);

					
					d.dispose();
					d1.dispose();
				}
				
				else if(count==2)
				{
					//ld.Receive("",Book1,Book_Search,"",Date1,Date2,Date3,2,ssid);
					String Renule_date=date.callDate();
										
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
						//Statement st=con.createStatement();
			
						//String in=String.format("insert into Renule(sid,B1NAME,B1DATE,FEE) values(?,?,?,?)");
						String in=String.format("update Renule set B2NAME=? , B2DATE=? where sid=?");

						//ssid,Book_Search,Renule_date,100);
						
						//String in=String.format("insert into Renule(sid,B1NAME,B1DATE,FEE) values(ssid,'Book_Search','Renule_date',100)");

						PreparedStatement pstmt = con.prepareStatement(in);

						pstmt.setString(1,Book_Search);
						pstmt.setString(2,Renule_date);
						pstmt.setString(3,ssid);
						
				        pstmt.executeUpdate();			
				        
				        con.close();
				        
				        ld.Disable_Button(2);
					}
					
					catch(Exception e)
					{}
					
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
						Statement st1=con1.createStatement();
						
						String query="select * from Renule";      
						ResultSet rs1=st1.executeQuery(query);

						//sssid=Integer.parseInt(ssid);
						
						String eeee;
						
						while(rs1.next())
						{
							 eeee=rs1.getString(1);
							 
							if(eeee.equals(ssid))
							{
								Book1=rs1.getString(2);
								Date1=rs1.getString(3);
								Book2=rs1.getString(4);
								Date2=rs1.getString(5);
								Book3=rs1.getString(6);
								Date3=rs1.getString(7);
							}
						}
						
					}
					
					catch(Exception e){}
					
					//System.out.println("haysybvd:"+Book1+" kkkkkk "+Book2+" kksjjsjs "+Book3+" kksjjsjs "+ssid+" kksjjsjs "+eeee);
					ld.Receive(sname,Book1,Book2,Book3,Date1,Date2,Date3,0,ssid);
					
					d.dispose();
					d1.dispose();
				}
					
				else if(count==3)
				{
					//ld.Receive("",Book1,Book_Search,"",Date1,Date2,Date3,2,ssid);
					String Renule_date=date.callDate();
										
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
						//Statement st=con.createStatement();
			
						//String in=String.format("insert into Renule(sid,B1NAME,B1DATE,FEE) values(?,?,?,?)");
						String in=String.format("update Renule set B3NAME=? , B3DATE=? where sid=?");

						//ssid,Book_Search,Renule_date,100);
						
						//String in=String.format("insert into Renule(sid,B1NAME,B1DATE,FEE) values(ssid,'Book_Search','Renule_date',100)");

						PreparedStatement pstmt = con.prepareStatement(in);

						pstmt.setString(1,Book_Search);
						pstmt.setString(2,Renule_date);
						pstmt.setString(3,ssid);
						
				        pstmt.executeUpdate();			
				        
				        con.close();
				        
				        ld.Disable_Button(3);
					}
					
					catch(Exception e)
					{}
					
					try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
						Statement st1=con1.createStatement();
						
						String query="select * from Renule";      
						ResultSet rs1=st1.executeQuery(query);

						//sssid=Integer.parseInt(ssid);
						
						String eeee;
						
						while(rs1.next())
						{
							 eeee=rs1.getString(1);
							 
							if(eeee.equals(ssid))
							{
								Book1=rs1.getString(2);
								Date1=rs1.getString(3);
								Book2=rs1.getString(4);
								Date2=rs1.getString(5);
								Book3=rs1.getString(6);
								Date3=rs1.getString(7);
							}
						}
						
					}
					
					catch(Exception e){}
					
					//System.out.println("haysybvd:"+Book1+" kkkkkk "+Book2+" kksjjsjs "+Book3+" kksjjsjs "+ssid+" kksjjsjs "+eeee);
					ld.Receive(sname,Book1,Book2,Book3,Date1,Date2,Date3,0,ssid);
					
					d.dispose();
					d1.dispose();
				}

			}
			
			else
			{
				d.setLayout(null);
				l7=new JLabel("WRONG PASSWORD");
				l7.setBounds(10,10,150,30);
				d.add(l7);
				d.setSize(400,400);
			    d.show();
			}
		}
		
	}
	
}
package PROJECT;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPasswordField;

//jpassword.setEchoChar('#');
import javax.swing.*;
public class Login extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField tf1;
	JButton b,b1,b2,b3,b4,ok;
	JPasswordField tf2;
	Font f;
	
	JDialog d1=new JDialog(this,"ANSWER",true);

	public void login()
	{
		setLayout(null);
		setTitle("LOGIN ID");
		tf1=new JTextField();
		tf2=new JPasswordField();
		l1=new JLabel("ENTER THE USERNAME");
		l2=new JLabel("ENTER THE PASWORD");
		l3=new JLabel("LOGIN ID");
		b=new JButton("SIGNUP");
		b1=new JButton("NEXT");
		b2=new JButton("EXIT");
		b3=new JButton("BACK");
		b4=new JButton("FORGET PASSWORD");
	    f=new Font("Garmond",Font.BOLD,18);
		l3.setBounds(250, 50, 150, 30);
		l1.setBounds(50, 100, 130, 30);
		l2.setBounds(50, 150, 130, 30);
		tf1.setBounds(250, 110, 130, 25);
		tf2.setBounds(250, 160, 130, 25);
		b.setBounds(550, 70, 100, 40);
		b1.setBounds(100, 230, 70, 40);
		b2.setBounds(200, 300, 70, 40);
		b3.setBounds(50, 20, 70, 40);
		b4.setBounds(250, 230, 170, 40);
		tf2.setEchoChar('*');
		tf1.setFont(f);
	    tf2.setFont(f);
		add(l3);
		add(l1);
		add(l2);
		add(tf1);
		add(tf2);
		add(b);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.addActionListener(this);
		b4.addActionListener(this);
		setBackground(Color.CYAN);
		b.setForeground(Color.blue);
		l3.setForeground(Color.red);
		l1.setForeground(Color.BLACK);
		l2.setForeground(Color.black);
		b1.setForeground(Color.gray);
		b2.setForeground(Color.red);
		b3.setForeground(Color.gray);
		b4.setForeground(Color.BLACK);
		setSize(905,615);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae1) 
	{
		int p;
		MainClass h=new MainClass();
		Signup s=new Signup();
		Mail mail=new Mail();
		JDBC1 jd=new JDBC1();
		
		String user=tf1.getText();
		String password=Arrays.toString(tf2.getPassword());
		
		
		if (ae1.getSource() == b2) 
			System.exit(0);
		else if (ae1.getSource() == b) 
			s.signup();
		else if (ae1.getSource() == b3) 
			h.start();
		else if(ae1.getSource() == b1)
		{
			try 
			{
				p=jd.sample1(user,password);
				if(p==1)
				{
					tf1.setText("");
					tf2.setText("");
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		else if(ae1.getSource()==b4)
		{
			if(user.length()==0)
			{
				d1.setLayout(null);
				l4=new JLabel("PLEASE ENTER USER NAME");				
				l4.setBounds(100,10,300,30);
				d1.add(l4);
				d1.setSize(400,300);
			    d1.show();
			}
			
			else
			{
				int x=0;
				String s1="";
				String s2="";
				
				try
				{
					//s1=jd.forgetpassword(user);
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Harshacse99");
					Statement st=con.createStatement();
					String select=("select  * from Regesteration where sname =" + "'" + user + "'");//"select gmail,password from Regesteration where sname= ? ";//+user;//"select * from Regesteration";      
										
					ResultSet rs=st.executeQuery(select);
							
					while(rs.next())
					{			
						if(rs.getString(1).equals(user) )
						{
						    s1=rs.getString(7);
						    s2=rs.getString(4);
						}
					}
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				try 
		    	{
					x=mail.forgetpassword(s2,s1);
				} 
		    	
		    	catch (Exception e) 
		    	{
					e.printStackTrace();
				}
				
				if(x==1)
				{
					ok=new JButton("OK");
					ok.setBounds(100, 50, 100, 50);
			    	d1.setLayout(null);
					l4=new JLabel("THE PASSWORD WAS SENT TO MAIL");				
					l4.setBounds(100,10,300,30);
					d1.add(l4);
					d1.add(ok);
					ok.addActionListener(this);
					d1.setSize(350,350);
				    d1.show();
				}
				
				if(x==0)
				{
					JDialog d=new JDialog(this,"ANSWER",true);
			    	d.setLayout(null);
					l4=new JLabel(" U ENTER WRONG USER NAME");
					l4.setBounds(100,10,150,30);
					d.add(l4);
					d.setSize(300,300);
				    d.show();
				}

			}  
		    
		}
		
		else if(ae1.getSource()==ok)
		{
			d1.dispose();
		}
	}
	
	/*public static void main(String s[]) 
	{
		Login lg = new Login();
		lg.login();
	}*/
}


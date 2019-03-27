/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * https://www.google.com/settings/security/lesssecureapps
 */

package PROJECT;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;

public class Mail 
{
	
	public static int MailVerification(String s,int verify[]) //throws Exception
	{
		int ss=0;
		
		try
		{
			String host ="smtp.gmail.com" ;
	        String user = "verfication.your.mail@gmail.com";  //verfication.your.mail
	        String pass = "VerifyMail";//VerifyMail
	        String to = s;
	        String from = "verfication.your.mail@gmail.com";
	        String subject = "Please insert this number to activate your account is :"+verify[0]+verify[1]+verify[2]+verify[3]+verify[4]+verify[5];
	        String messageText = "Verification Of An Email :";
	        boolean sessionDebug = false;
	
	        Properties props = System.getProperties();
	
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.required", "true");
	        
	        Session mailSession = Session.getDefaultInstance(props, null);
	        mailSession.setDebug(sessionDebug);
	        Message msg = new MimeMessage(mailSession);
	        
	        msg.setFrom(new InternetAddress(from));
	        InternetAddress[] address = {new InternetAddress(to)};
	        msg.setRecipients(Message.RecipientType.TO, address);
	        msg.setSubject(subject); msg.setSentDate(new Date());
	        msg.setText(messageText);
	
	       Transport transport=mailSession.getTransport("smtp");
	       transport.connect(host, user, pass);
	       transport.sendMessage(msg, msg.getAllRecipients());
	       transport.close();
	       //System.out.println("message send successfully");
	       ss=1;
	  }
		catch(Exception e)
		{
			ss=0;
		}
		
		
       
       return ss;
	}
	
	public static int MailVerification1(String s)
	{
		int ss=0;
		
		try
		{
			String host ="smtp.gmail.com" ;
	        String user = "verfication.your.mail@gmail.com";  //verfication.your.mail
	        String pass = "VerifyMail";//VerifyMail
	        String to = s;
	        String from = "verfication.your.mail@gmail.com";
	        String subject = "YOUR VERIFICATION IS COMPLETED :";
	        String messageText = "Verification Of An Email :";
	        boolean sessionDebug = false;
	
	        Properties props = System.getProperties();
	
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.required", "true");
	        
	        Session mailSession = Session.getDefaultInstance(props, null);
	        mailSession.setDebug(sessionDebug);
	        Message msg = new MimeMessage(mailSession);
	        
	        msg.setFrom(new InternetAddress(from));
	        InternetAddress[] address = {new InternetAddress(to)};
	        msg.setRecipients(Message.RecipientType.TO, address);
	        msg.setSubject(subject); msg.setSentDate(new Date());
	        msg.setText(messageText);
	
	       Transport transport=mailSession.getTransport("smtp");
	       transport.connect(host, user, pass);
	       transport.sendMessage(msg, msg.getAllRecipients());
	       transport.close();
	       //System.out.println("message send successfully");
	       ss=1;
	}
		
	catch(Exception e)
	{
		ss=0;
	}
		   
       return ss;
		 
	}
	
	
	public static int forgetpassword(String s,String s1)
	{
		int ss=0;
		
		try
		{
			String host ="smtp.gmail.com" ;
	        String user = "verfication.your.mail@gmail.com";  //verfication.your.mail
	        String pass = "VerifyMail";//VerifyMail
	        String to = s;
	        String from = "verfication.your.mail@gmail.com";
	        String subject = "PLEASE ENTER THIS PASSWORD TO LOGIN :"+s1;
	        String messageText = "Verification Of An Email :";
	        boolean sessionDebug = false;
	
	        Properties props = System.getProperties();
	
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.required", "true");
	        
	        Session mailSession = Session.getDefaultInstance(props, null);
	        mailSession.setDebug(sessionDebug);
	        Message msg = new MimeMessage(mailSession);
	        
	        msg.setFrom(new InternetAddress(from));
	        InternetAddress[] address = {new InternetAddress(to)};
	        msg.setRecipients(Message.RecipientType.TO, address);
	        msg.setSubject(subject);
	        msg.setSentDate(new Date());
	        msg.setText(messageText);
	
	       Transport transport=mailSession.getTransport("smtp");
	       transport.connect(host, user, pass);
	       transport.sendMessage(msg, msg.getAllRecipients());
	       transport.close();
	       //System.out.println("message send successfully");
	       ss=1;
	}
		
	catch(Exception e)
	{
		ss=0;
	}
		   
       return ss;
		 
	}
    /*public static void main(String args[]) throws Exception
    {           	
    	Mail m=new Mail();	
    }*/
}


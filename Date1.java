package PROJECT;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class Date1
{
	
	public static String callDate()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		//Getting current date
		Calendar cal = Calendar.getInstance();
		
		String oldDate = sdf.format(cal.getTime());
		
		//Displaying current date in the desired format
		//System.out.println("Current Date: "+oldDate);
		   
		//Number of Days to add
	        cal.add(Calendar.DAY_OF_MONTH, 15);
	       // cal.add(Calendar.DAY_OF_WEEK, 15);  

	        
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
		
		/*if(newDate.equals(oldDate))
			System.out.println("Date after Addition: is same");
		
		else
			//Displaying the new Date after addition of Days to current date
			System.out.println("Date after Addition: "+newDate);*/
		
		/*int c=0;
		if(oldDate.compareTo(newDate) <0)
		{
			c++;
		}		
		
		String cc=String.valueOf(c);
		System.out.println(cc);*/
		
		return oldDate;
	}
	
	public static String callNewDate(String oldDate)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		//Getting current date
		Calendar cal = Calendar.getInstance();
		
		 oldDate = sdf.format(cal.getTime());
		
		//Displaying current date in the desired format
		//System.out.println("Current Date: "+oldDate);
		   
		//Number of Days to add
	        cal.add(Calendar.DAY_OF_MONTH, 15);
	       // cal.add(Calendar.DAY_OF_WEEK, 15);  

	        
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
		
		/*if(newDate.equals(oldDate))
			System.out.println("Date after Addition: is same");
		
		else
			//Displaying the new Date after addition of Days to current date
			System.out.println("Date after Addition: "+newDate);*/
		
		return newDate;
	}
	
  /* public static void main(String args[])
   {
		 callDate();
   }*/
}
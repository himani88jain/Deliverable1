import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		System.out.println("What kind of trip would you like to go on, Musical,\r\n" + "Tropical, or Adventurous? ");
		Scanner scnr=new Scanner(System.in);
		String vacationType=scnr.next();
		String destination="";
        String result="";
        boolean b;
        b=true;
      
       while(b==true)
       {
    	   if(vacationType.equalsIgnoreCase("Musical"))
    	   {
    		   destination="New Orleans";
    		   b=false;
    	   	}
    	   else if(vacationType.equalsIgnoreCase("Tropical"))
    	   {
    		   destination="Beach vacation in Mexico";
    		   b=false;
        
    	   }
    	   else if(vacationType.equalsIgnoreCase("Adventurous"))
    	   {
    		   destination="Whitewater rafting the Grand Canyon";
    		   b=false;
    	   }
    	   else
    	   {
    		   System.out.println("Please enter the destination type from the available options only");
    		   b=true;
    		   scnr=new Scanner(System.in);
    		   vacationType=scnr.next();
    	   } 	
       }
     
        System.out.println("How many are in your group?");
        int groupSize =0;
        try {        
        groupSize=scnr.nextInt();
       }
       catch (Exception e) {
    	   System.out.println("The number enetered is not a valid Integer.");
       }
        String travelSugg="";
        boolean a;
        a=true;
        while(a==true)
        {
        	if(groupSize>=1 && groupSize<=2)
        	{
        		travelSugg="First Class";
        		a=false;
        	}
        	else if(groupSize>=3 && groupSize<=5)
        	{
        		travelSugg="Helicopter";
        		a=false;
        	}
        	else if(groupSize>=6)
        	{
        		travelSugg="Charter Flight";
        		a=false;
        	}
        	else
        	{
        		System.out.println("Please enter the group size again");
        		scnr=new Scanner(System.in);
        		try {        
        	        groupSize=scnr.nextInt();
        	       }
        	       catch (Exception e) {
        	    	   System.out.println("The number enetered is not a valid Integer.");
        	       }
        		a=true;
        	}
        }
        
        result="Since you�re a group of "+groupSize+" going on a "+vacationType+" vacation, you should take a "+travelSugg+" to "+destination;
       System.out.println(result);
       scnr.close();
	}
	
}

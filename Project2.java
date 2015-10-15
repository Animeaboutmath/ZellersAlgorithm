import java.util.*;
public class Project2 {

	public static void main(String[] args) 
	
	{
		
		Scanner input = new Scanner(System.in);
		
		//final int ;
		
		int month, day, yearInput, birthDay, century, year;
		double zellerDate = 0;
		
		System.out.print("Zeller's Algorithm\n\n");
		System.out.print("Enter month (enter 0 to exit): ");
		month = input.nextInt();
		
		while (month != 0)
			
		{
		System.out.print("Enter day): ");
		day = input.nextInt();
		
		System.out.print("Enter year: ");
		yearInput = input.nextInt();
		
		if (month < 3)
		{
			yearInput = yearInput - 1;
			
			month = (month + 10);
		}
		
		else 
		{
			month = (month - 2);
		}
		
		century = (yearInput / 100);
		year = (yearInput - (century * 100));
		
		zellerDate = (((2.6 * (month)) - 0.2) + day + year + (year / 4.0) + (century / 4.0) - (2.0 * century)) % 7.0;		
		

		
		System.out.println("TROUBLESHOOTING PRINTING " + 
		
((2.6 * (month)) - 0.2)
				
				);
		
		
		System.out.println("month is " + month);
		System.out.println(" day is " + day);
		System.out.println("year is" + year);
		System.out.println("Century is " + century);
		System.out.println(yearInput);
		
		System.out.println((int)zellerDate);
		
		//Sentinel Value here
		System.out.print("Enter month (enter 0 to exit): ");
		
		month = input.nextInt();
		
		
		}
		
	}

}

/**
 * created by: Bryan Moore
 * created on: 5/30/2012
 */

import java.util.*;

public class best_before {

	public static void main(String[] args) {
		
		String dateToProcess = new String();
		String var1 = new String();
		String var2 = new String();
		String var3 = new String();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the date:");
		dateToProcess = scan.nextLine();
		String[] results = dateToProcess.split("/");
		
		var1 = results[0];
		var2 = results[1];
		var3 = results[2];
		
		int num1 = Integer.parseInt(var1);
		int num2 = Integer.parseInt(var2);
		int num3 = Integer.parseInt(var3);
		
		//check all are between 2001 and 2999
		if(num1 >= 2000 && num1 <= 2999 && num2 >= 2000 && num2 <= 2999 && num3 >= 2000 && num3 <= 2999)
		{
			//check no 2 variables are over 31
			if(num1 > 31 && num2 > 31) 
				System.out.println(dateToProcess+"is Invalid");
			else if(num1 > 31 && num3 > 31) 
				System.out.println(dateToProcess+"is Invalid");
			else if(num2 > 31 && num3 > 31)
				System.out.println(dateToProcess+"is Invalid");
			else
				System.out.println("Pass first");
			
			//check all variables are not over 12
			if(num1 > 12 && num2 > 12 && num3 > 12)
				System.out.println(dateToProcess+"is Invalid");
			else
				System.out.println("Pass Second");
			
			//set numbers to date objects
			date date1 = new date(1,num1,"unset");
			date date2 = new date(2,num2,"unset");
			date date3 = new date(3,num3,"unset");
			
			date[] dateArray = new date[3]; 
			dateArray[0] = date1;
			dateArray[1] = date2;
			dateArray[2] = date3;
			
			//if more than 2 are less than 12, sort and assign type
			
			for(int i=0; i<3; i++)
			{
				if(dateArray[i].getDateValue() > 31 && dateArray[i].getDateType() == "unset")
					//if greater than 31
					dateArray[i].setDateType("year");
				else if(dateArray[i].getDateValue() < 31 && dateArray[i].getDateValue() > 12 && dateArray[i].getDateType() == "unset")
					//if less than 31 and greater than 12
					dateArray[i].setDateType("day");
				else if(dateArray[i].getDateValue() <= 12 && dateArray[i].getDateType() == "unset")
					//if less than or equal to 12
					dateArray[i].setDateType("month");
			}	
			
			System.out.println("-------");
			System.out.println(date1.getDateId()+" "+date1.getDateValue()+" "+date1.getDateType());
			System.out.println(date2.getDateId()+" "+date2.getDateValue()+" "+date2.getDateType());
			System.out.println(date3.getDateId()+" "+date3.getDateValue()+" "+date3.getDateType());
			
		}	
		
	}
}

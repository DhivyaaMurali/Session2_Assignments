
package session2_assignment;

import java.util.Scanner;

public class Monthdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a month :");
		String monthName = sc.next();
		switch (monthName) 
		{
		case "January":
		case "March":
		case  "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println("Number of days is 31");
			break;
		
		case "April":
		case "June":
		case "September":
		case "November":
		{
		System.out.println("Number of days is 30");
		break;
		}
		case "February":
		{
		System.out.println("Number of days is 28");
		break;
		}
		default: 
		System.out.println("Please enter a valid month");
		
		}
		

	}

}

package session2_assignment;

import java.util.Scanner;

public class TestVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	
	System.out.println("Age Entered:"+age);
	
		if(age>=18)
		{
			System.out.println("You are to Eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
	}
	

}

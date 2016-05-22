package session2_assignment;

public class Patterngenerate 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Total number of rows  will iterate
		for(int i=1;i<=5;i++)
		{
			// total number of columns will iterate
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.print("\n ");
		}
		// Total number of rows  will iterate
		for(int i=1;i<=4;i++)
		{
			// total number of columns will iterate
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");	
		}
	
       	}

}

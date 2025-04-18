package week3.day1;

import java.util.Arrays;

public class FindIntersection 
{

	public static void main(String[] args) 
	{

		
			int a[]={3,2,11,4,6,7}; 
			int b[]={1,2,8,4,9,7}; 
			//Sort the array 
			Arrays.sort(a);
			Arrays.sort(b);
		
			int lengthOfa = a.length;
			int lengthOfb = b.length;
			//Declare for loop iterator from 0 to array length 
		    //Declare a nested for another array from 0 to array length 
			for (int i=0; i<=lengthOfa-1;i++)
			{	 
				for (int j=0; j<=lengthOfb-1;j++)
				{
				//Compare both the arrays using a conditional statement. 
				  if (a[i]==b[j])
				   {
					//Print the value from first array when there is a match 	
				   System.out.println("Intersection Number is: " + a[i]);
				   
			       }	
			    }
		   }

	}
}


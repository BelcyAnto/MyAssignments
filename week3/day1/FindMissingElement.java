package week3.day1;

import java.util.Arrays;

public class FindMissingElement
{
	public static void main(String[] args)
	{
		int[] numarrray=  {1,4,3,2,8,6,7};
		//Sort the array 
		Arrays.sort(numarrray);
		//Loop through the array (start i from arr[0] till the length of the array) 
		int lengthOfNumarray = numarrray.length;
		for (int i=1; i<=lengthOfNumarray;i++)
		{	 
			//Check if the iterator variable is not equal to the array values respectively 
			if (i!=numarrray[i-1])
			{
			//Print the number 
			// Once printed break the iteration	
			System.out.println("The Missing Number in the Array: " + i);
			break;
		    }	
		}
	}

}

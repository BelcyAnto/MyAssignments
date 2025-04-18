package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

public static void main(String[] args)
{
	int[] num= {2,5,7,7,5,9,2,3};
	Arrays.sort(num);
	int lengthOfArray=num.length;
	
	for (int i=0; i<lengthOfArray-1;i++)
	{
		if(num[i]==num[i+1])
		{
			System.out.println("Duplicate value is :"+ num[i]);
	    }
	}
	

}
}

package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersectionList
{

	public static void main(String[] args) 
	{
		//Declare an array for {3, 2, 11, 4, 6, 7}
		List<Integer> numArray1 =new ArrayList<Integer>();
		numArray1.add(3);
		numArray1.add(2);
		numArray1.add(11);
		numArray1.add(4);
		numArray1.add(6);
		numArray1.add(7);
		System.out.println("The First Array is "+ numArray1);
		
		//Declare another array for {1, 2, 8, 4, 9, 7}
		List<Integer> numArray2 =new ArrayList<Integer>();
		numArray2.add(1);
		numArray2.add(2);
		numArray2.add(8);
		numArray2.add(4);
		numArray2.add(9);
		numArray2.add(7);
		System.out.println("The Second Array is "+ numArray2);
		
	
		//Sort the arrays 
		Collections.sort(numArray1);
		Collections.sort(numArray2);
		System.out.println("The First Array after sorting is "+ numArray1);
		System.out.println("The Second Array after sorting is "+ numArray2);
	
		int sizeofList1= numArray1.size();
		int sizeofList2= numArray2.size();
		
		for (int i=0; i<=sizeofList1-1;i++)
		{	 
			for (int j=0; j<=sizeofList2-1;j++)
			{
			//Compare both the arrays using a conditional statement. 
			  int FirstArray= numArray1.get(i);
			  int secondArray=numArray2.get(j);
			  if (FirstArray==secondArray)
			   {
				//Print the value from first array when there is a match 	
				 int intersect=numArray1.get(i);
			    System.out.println("Intersection Number is: " + intersect);
			   }
			  else  
			   {
				  continue;
			   }
			  }
		}

	}

}

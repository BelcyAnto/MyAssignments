package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args)
	{
		List<Integer> numArray =new ArrayList<Integer>();
		numArray.add(3);
		numArray.add(2);
		numArray.add(11);
		numArray.add(4);
		numArray.add(6);
		numArray.add(7);
		System.out.println("The Given Array is "+ numArray);
		// collection in ascending order
		Collections.sort(numArray);
		System.out.println("The List after sorting is " + numArray);
		// get  to get number of elements
		int sizeofList= numArray.size();
		System.out.println("The Array Size is " + sizeofList);
        //Retrieving second largest number
		 int dataAtIndex= numArray.get(sizeofList-2);
		 System.out.println("The Second Largest Number is "+ dataAtIndex);
		
	}

}

package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement 
{

	public static void main(String[] args)
	{
		List<Integer> numArray =new ArrayList<Integer>();
		numArray.add(1);
		numArray.add(2);
		numArray.add(3);
		numArray.add(4);
		numArray.add(10);
		numArray.add(6);
		numArray.add(8);
		System.out.println("The Given Array is "+ numArray);
		// collection in ascending order
		Collections.sort(numArray);
		System.out.println("The List after sorting is " + numArray);
		// get  to get number of elements
		int sizeofList= numArray.size();
		System.out.println("The Array Size is " + sizeofList);
	
        //Retrieving Mussing number
		for (int i=0;i<sizeofList-1;i++)
		{
			int currrentElement=numArray.get(i+1);
			int nextElement=numArray.get(i)+1;
			//System.out.println(currrentElement);
		    //System.out.println(nextElement);
			if(currrentElement!=nextElement)
			{
				int gap= numArray.get(i)+1;
				System.out.println("The Missing Number is " + gap);
			}
			else 
			{
				continue;
			}
			
		}

	}

}

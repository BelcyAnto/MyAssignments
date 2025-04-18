package week3.day1;

import java.util.Arrays;

public class LearnArrayTest {

	public static void main(String[] args)
	{
	//Array Declaration - Using Literal
	//index:-       0  1   2  3  4
	int[] marks= {56,72,89,96,76};
	//To find the length
	int lengthOfarray = marks.length;
	System.out.println("The length is: "+ lengthOfarray);
	//To retrive a particular data - use Index
	System.out.println(marks[1]);
	System.out.println(marks[2]); 
	for (int i=0; i<marks.length;i++)
	{	
		System.out.println(marks[i]); 
	}
	//To find lowest value
	Arrays.sort(marks);
	System.out.println("lowest value: " + marks[0]); 
	//To find Highest value
	System.out.println("Highest value: " + marks[marks.length-1]);
	
     //To store 3 data of scores
	 int[] scores= new int[3];
	 scores[0]=70;
	 scores[1]=75;
	 scores[2]=80;
	}

}

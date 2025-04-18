package week3.day1;

import java.util.Arrays;

public class AnagramProgram 
{
	public static void main(String[] args) 
	{
		String text1 = "stops"; 
		String text2 = "potss";
		int text1Length= text1.length();
		int text2Length= text2.length();
		if (text1Length==text2Length)
		{
			 char[] charArray1 = text1.toCharArray();
		     char[] charArray2 = text2.toCharArray();
		     Arrays.sort(charArray1);
		     Arrays.sort(charArray2);
		     if(Arrays.equals(charArray1, charArray2))
		     {
		      System.out.println("The given strings are Anagram:- " + text1 +" & "+ text2 );
		     }
		     else
		     {
		    	 System.out.println("The given strings are not an Anagram:- " + text1 +" & "+ text2 );
		     }
		}
		else
		{
		  System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		  
		}	
				
			
	}

}

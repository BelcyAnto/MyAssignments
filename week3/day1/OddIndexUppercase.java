package week3.day1;

public class OddIndexUppercase
{

	public static void main(String[] args) 
	{
		
		 String word = "changeme";
		//Convert the given String to a character array.
		 char[] charArray = word.toCharArray();
		 int lenghofCharArray=charArray.length;
		//Implement a loop to iterate through each character of the String (from end to start).
		//Find the odd index within the loop
		 for (int i=1; i<=lenghofCharArray-1; i=i+2)
		 {
		 charArray[i]=Character.toUpperCase(charArray[i]);
		 //System.out.println("OddIndexUppercase: " +  charArray[i]);
		 }
		 String word1 = new String(charArray);
		 System.out.println("Odd Index is changed into Uppercase - " + word1);

	}

}

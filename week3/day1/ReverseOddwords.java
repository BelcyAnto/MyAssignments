package week3.day1;

public class ReverseOddwords 
{

	public static void main(String[] args)
	{
		String text = "I am a software tester";
        //Split the words and have it in an array
		String[] text1 = text.split(" ");
		int Array=text1.length;
		//Traverse through each word using loop
	    //Find the odd index within the loop
		for ( int i = 0; i < Array; i++) 
		{    
			if(i%2!=0)
			{
			//Convert the String array into a character array
			 char[] charArray = text1[i].toCharArray();
			 int Array1=charArray.length;
			 for(int j=Array1-1;j>=0; j--)
				{   
				 System.out.print(charArray[j]);
				}
			}
			else
			{ 	//Print the even position words using another loop
				System.out.print(text1[i]+" " );
			}
		System.out.print(" ");			
	    }
	}
}
		



package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) 
	{
		String text1 = "We learn Java basics as part of java sessions in java week1";
		String text = text1.toLowerCase();
		int count = 0;
		String[] strArray = text.split(" ");
		int Array=strArray.length;;
		int i;
		for ( i = 0; i < Array; i++) 
		{ 
			for (int j = i + 1; j < Array; j++) 
			{ 				
				if (strArray[i].equals(strArray[j])) 
				{
				strArray[j] = "";
				count++;
				}
				 
			}
		}
			
		if(count > 0)   
		{
		 for ( i = 0; i < Array; i++)
		  {
			System.out.print(strArray[i]+" ");
	      }
		}
		else
		 {
		   System.out.print("There is no Duplicates in the sentence");
	     }
	}
			
}
	



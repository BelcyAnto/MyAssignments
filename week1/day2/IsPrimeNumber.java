package week1.day2;

public class IsPrimeNumber
{

	public static void main(String[] args)
	{    
		int num=31;
		char isPrimeNumber='Y';
		for (int i = 2; i<=num-1; i++)
		{

		  int x= num%i;
		  if (x == 0)
		  { 
			isPrimeNumber='N';
			break;     
		  }
		}
		if (isPrimeNumber=='Y')
		  System.out.println(num + " is a Primenumber");
	    else
	     System.out.println(num + " is a not a Primenumber");
		    	
	}
	
}


package week1.day2;

public class LearnIfCondition 
{

	public static void main(String[] args) 
	{
     int a=7;
     int b=8;
     
     if (a>b)
      {
    	 System.out.println("a is greater than b");
      }
     else
     {	 
    	 System.out.println("a is less than b");
     }
    	 
    	 int t=a;
    	 a=b;
    	 b=t;
    	 System.out.println(a);
    	 System.out.println(b);
      }

	

}

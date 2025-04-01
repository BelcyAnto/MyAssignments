package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
	 int a=0, b=1,c, num=8;
	 System.out.println("Fibonacci Series");
	 System.out.println("-----------------");
	 System.out.print(a+","+b);
	 
	 for(int i=2;i<num;i++)   
	 {    
	  c=a+b;    
	  System.out.print(","+c);    
	  a=b;    
	  b=c;     
	 }    
	 

	}

}

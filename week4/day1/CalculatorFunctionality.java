package week4.day1;
//Static polymorphism
public class CalculatorFunctionality
{

      public void addNumbers(int a,int b)
      {
    	  System.out.println(a+b);
      }
      public void addNumbers(int a,int b,int c)
      {
    	  System.out.println(a+b+c);
      }
      public void addNumbers(float a,int b)
      {
    	  System.out.println(a+b);
      }
      public void addNumbers(float a,float b)
      {
    	  System.out.println(a+b);
      }
	
	public static void main(String[] args)
	{
		CalculatorFunctionality CF=new CalculatorFunctionality();
		CF.addNumbers(1,2);
		CF.addNumbers(1,2,3);
		CF.addNumbers(3f,4f);
		CF.addNumbers(3f,4);
	}

}

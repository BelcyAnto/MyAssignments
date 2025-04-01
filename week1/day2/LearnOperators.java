package week1.day2;

public class LearnOperators {

	public static void main(String[] args) 
	{
	//Assignment Operator (=) - assign a value to a variable
		int a=10;
		System.out.println("Assignment Operator Result");
		String name="TestLeaf";
		System.out.println(a);
		System.out.println(name);
		System.out.println("-----------------");
				
	//Arithmetic Operator (+,-,*,/)
	    int	b=8;
		int c=6;
		System.out.println("Arithmetic Operator Result");
		System.out.println(b+c);
		System.out.println(b-c);
		System.out.println(b*c);
		System.out.println("---------------");
		
		//Quotient
		System.out.println("Quotient And Remainder");
		System.out.println(b/c);
		//Remainder
		System.out.println(b%c);
		System.out.println("---------------");
		
		
	//Comparison Operator
		int s=5;
		int t=6;
		System.out.println("Comparison Operator Result");
		System.out.println(s==t);
		System.out.println(s<t);
		System.out.println(s>t);
		System.out.println(s<=t);
		System.out.println(s>=t);
		System.out.println(s!=t);
		System.out.println("----------------");
		
	//Logical Operator (And, Or)
		int x=4;
		int y=5;
		System.out.println("Logical Operator Result");
		System.out.println(x==y&&x>y);
		System.out.println(x==y||x<y);
		System.out.println("----------------");
		
	//Increment/Decrement Operator
	//Increment Operator
		int p=7;
		System.out.println("Post Increment Result");
		System.out.println(p++);
		System.out.println(p);
		System.out.println("------------------");
		System.out.println("Pre Increment Result");
		System.out.println(++p);
		System.out.println(p);
		System.out.println("------------------");
		
	//Decrement Operator
		int d=6;
		System.out.println("Post Decrement Result");
		System.out.println(d--);
		System.out.println(d);
		System.out.println("------------------");
		System.out.println("Pre Decrement Result");
		System.out.println(--d);
		System.out.println(d);
		System.out.println("------------------");

	}

}

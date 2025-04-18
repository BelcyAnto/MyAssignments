package week3.day2;
//           Inherited Class      extends Base Class
//           Child/Sub class(Car) extends Parent/Super class(Vehicle)
public class Car extends Vehicle
{
	public void applyHorn()
	{
		System.out.println("Horn Applied"); 
	}
	
	public static void main(String[] args) 
	{
		Car carOptions=new Car();
		carOptions.applyHorn();
		carOptions.applyBreak();

	}

}

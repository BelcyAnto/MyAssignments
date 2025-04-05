package week2.day1;

public class Redmi
{
	public int noOfcamera()
	{
	int number=7; 
		//System.out.println(number);
		return number;
	}
	public String fileName()
	{
	return "mp4";
	}

	public static void main(String[] args) {
		Redmi redmiOptions =new Redmi();
		redmiOptions.noOfcamera();
		System.out.println(redmiOptions.noOfcamera()+500);
		int number1 =redmiOptions.noOfcamera();
		System.out.println(number1);
		String file =redmiOptions.fileName();
		System.out.println(file);
	}

}
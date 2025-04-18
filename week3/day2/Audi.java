package week3.day2;

public class Audi extends Car{
	public void advanceBraking()
	{
		System.out.println("Advanced Braking");
	}

	public static void main(String[] args) {
		Audi audiOptions= new Audi();
		audiOptions.applyHorn();
		audiOptions.applyBreak();
		audiOptions.advanceBraking();
	}

}

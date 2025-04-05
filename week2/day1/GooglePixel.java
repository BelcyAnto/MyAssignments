package week2.day1;

public class GooglePixel 
{
    //Class or Global Variable	in Blue color  
    int noOfPhoto=10;
	public void takePhoto(int noOfPhoto) 
	{
		//Local Variable
		//int noOfPhoto=7
		System.out.println(noOfPhoto);
	}
	
	public void takeVideo(int noOfVideo, String fileName ) 
	{
		System.out.println(noOfVideo+ " " +fileName);
	}
	
	public static void main(String[] args)
	{
		GooglePixel pixelOptions = new GooglePixel();
		pixelOptions.takePhoto(7);//Run time
		pixelOptions.takePhoto(10);
		pixelOptions.takeVideo(3,"Videos");
	}

}

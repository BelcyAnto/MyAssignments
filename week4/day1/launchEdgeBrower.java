package week4.day1;

public class launchEdgeBrower extends LaunchChromeBrowser
{
	public void launch()
    {  
	  System.out.println("Edge Browser is launched from Subclass");
	  super.launch();
    }


	public static void main(String[] args) 
	{
		launchEdgeBrower b=new launchEdgeBrower();
		b.launch();

	}

}

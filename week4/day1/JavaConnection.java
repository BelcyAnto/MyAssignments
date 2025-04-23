package week4.day1;

public class JavaConnection extends MySqlConnection implements DatabaseConnection 
{
	public void connect()
    {
		System.out.println("Database is connected");
		
	}
	public void disconnect()
	{
		System.out.println("Database is disconnected");
		
	}
	public void executeUpdate() 
	{
		System.out.println("Database is updated");
		
	}
	public void executeQuery()
	{
		System.out.println("Query is executed");
		super.executeQuery();
		
	}
public static void main(String[] args) 
	{
	JavaConnection JC=new JavaConnection();
	JC.connect();
	JC.disconnect();
	JC.executeUpdate();
	JC.executeQuery();
	}

}

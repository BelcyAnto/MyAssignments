package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		String str1="TestLeaf";
		String str3="TestLeaf";
		
		//Sting Instantiation
		String str2=new String ("TestLeaf");
		String str4=new String ("TestLeaf");
		//"==" -> compare the reference of 2 Strings
		
	
		System.out.println(str1==str3);// 2 literal
		System.out.println(str1==str2); //Literal with Instantialtion
		System.out.println(str2==str4); // 2 Instantiation
		System.out.println("--------------------");
		
		//".equal" -> Compare the exact value of 2 Strings
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str4));
		System.out.println("--------------------");
		
		//Length
		String batchName="March 2025";
		int lengthOfString=batchName.length();
		System.out.println("length Of String: " +lengthOfString);
		System.out.println("--------------------");
		
		//Contains - Partial Value
		System.out.println(batchName.contains("March"));
		System.out.println("--------------------");
		
		//toUppercase - Convert the Alphabets of String to Uppercase
		String uppercase=batchName.toUpperCase();
		System.out.println(uppercase);
		System.out.println("--------------------");
		
		//toLowercase - Convert the Alphabets of String to Lowercase
		String lowercase=batchName.toLowerCase();
		System.out.println(lowercase);
		System.out.println("--------------------");
			
		//charAt - to retrive a particular character a the particular Index
		String name="Selenium";
		char charatindex=name.charAt(3);
		System.out.println(charatindex);
		System.out.println("--------------------");
		
		//tocharArray - To convert the String into Character Array
		//int num[]= {1,2,3,4};
		//char letter[]= {'a','b','v','d'};
		//String name="Selenium";  -> Char Array= { 'S','e','l','e','n','i','u','m'}
		
		char[] charArray=name.toCharArray();
		System.out.println(charArray[0]);
		System.out.println(charArray[5]);
		System.out.println("--------------------");	
		
		//subString - Convert a String into another "shorter String"
		String batch="SelenuimJava";
		String substring=batch.substring(8);
		System.out.println(substring);
		System.out.println("--------------------");	
		String substring1=batch.substring(3,5);
		System.out.println(substring1);
		System.out.println("--------------------");	
		
		//split - Convert 1 string into multiple Stings
		String batchname="March Selenium 2025 Batch";
		String[] split=batchname.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		System.out.println("--------------------");	
		
		int rupee=100000;
		System.out.println(rupee+5000);
		String amount="1000000";
		System.out.println(amount+5000);
		System.out.println("----------------------");
	
		//ReplaceAll - make alphabets as null-> remove alphabets
		String balance="less Than 50000";
		String replaceAll=balance.replaceAll("[A-Za-z]", " ");
		System.out.println(replaceAll);
		System.out.println("----------------------");
		String replaceAll1=balance.replaceAll("[^0-9]", ""); //other than 0-9, remove other characters
		System.out.println(replaceAll1);
		System.out.println("----------------------");
	
	   //Sting into int
		int parseInt=Integer.parseInt(replaceAll1);
		System.out.println(parseInt+600);
		System.out.println("----------------------");
	}
	


	

}

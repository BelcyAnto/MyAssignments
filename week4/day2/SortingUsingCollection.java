package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection 
{

	public static void main(String[] args) 
	{
		List<String> company =new ArrayList<String>();
		company.add("HCL");
        company.add("Wipro");
        company.add("Aspire Systems");
        company.add("CTS");
        System.out.println("The Current list is: "+ company);
        //Sorting the Array
        Collections.sort(company);
   	    System.out.println("The List after sorting is" + company);
   	    //Size the Array
   	    int sizeofList= company.size();
   	    System.out.println("The List after sorting is " + sizeofList);
   	    //New Array
	    List<String> ReverseCompany =new ArrayList<String>();
	    System.out.println("The List after sorting is" + ReverseCompany);
	    
   	    for (int i=sizeofList-1;i>=0;i--)
		  {
 
   	    	ReverseCompany.add(company.get(i));
   	      
		  }
   	    
   	     System.out.println("Reverse Order is "+ ReverseCompany);
        
	}

}

package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) 
	{
	List<String> learners =new ArrayList<String>();
    System.out.println("The list is: "+ learners);
    
    learners.add("Rajesh");
    System.out.println("The list after 1 data is: "+ learners);
    
    learners.add("Bharat");
    System.out.println("The list after 2 data is: "+ learners);
    learners.add("Selvi");
    learners.add("Usha");
    System.out.println("The Current list is: "+ learners);
    //List is having Index [0,1,2,3]
    
    learners.add(1, "Balu");
    //List is having Index [0,1,2,3,4] - 1 as Balu
    System.out.println("The Current list is: "+ learners);
    
    //Duplicate values
    learners.add(1, "Balu");
    learners.add("Bharat");
    //List is having Index [0,1,2,3,4,5,6] - 1,2 as Balu  - 6 as Bharat
    System.out.println("The Current list is with duplicates: "+ learners);
    
    //Removing the data
    learners.remove("Bharat");
    System.out.println("The Current list after removing data: "+ learners);
    
   //Removing the data with first index
   learners.remove(0);
   System.out.println("The Current list after removing frst Index : "+ learners);
		
	//	Retrieving one data 
	 String dataAtIndex3= learners.get(3);
	 System.out.println(dataAtIndex3);
	 
	  // get  to get number of elements
	 int sizeofList= learners.size();
	 System.out.println("The Size is" + sizeofList);
	 
	  // Sort the list in Ascii Order
	Collections.sort(learners);
	 System.out.println("The List after sorting is" + learners);
	 
	//Add all the data in one list to another list
	 List<String> emp =new ArrayList<String>();
	    System.out.println("The list is in emp : "+ emp);	
	    
	    emp.addAll(learners);
	    System.out.println("The list is in emp after adding: "+ emp);
	    
	    //Clear all the data
	    learners.clear();
	    System.out.println("The list after clearing: "+ learners);
	    
	    
	    
	}
}

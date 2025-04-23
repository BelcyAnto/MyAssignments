package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) 
	{   //HashSet
		//Set<String>  mentors =new HashSet<String>();
		//System.out.println("The set is: "+ mentors);
		 
		//TreeSet
		//Set<String> mentors =new TreeSet<String>();
		
		//LinkedHashSet
		Set<String>  mentors =new LinkedHashSet<String>();
	
		
		//add
		mentors.add("abc");
		mentors.add("def");	
		mentors.add("mno");
		mentors.add("ghi");
		mentors.add("jkl");
		
		System.out.println("The set is: "+ mentors);
		//add Duplicates
		mentors.add("jkl");
		System.out.println("The set is: "+ mentors);
		
		//remove
		mentors.remove("abc");
		System.out.println("The set is after removing: "+ mentors);
		
		//Size
		int sizeoSet=mentors.size();
		System.out.println("The size set is: "+ sizeoSet);
		
		//addall -all the elements from 1 Set to another Set
		Set<String>  trainers =new HashSet<String>();	
		trainers.addAll(mentors);
		System.out.println("The trainer set is: "+ trainers);
		
		//To retrive an Element
		//Convert set into List (create Emplty list)
	    List<String>  allTrainers =new ArrayList<String>(trainers);
	    System.out.println("The trainer set is: "+ allTrainers);
	    
	    //To retrive an Element atIndex1
	    String  elementAtIndex1 =allTrainers.get(1);
	    System.out.println(elementAtIndex1);
	    
	    //To Declare a IntegerSet
	   Set<Integer>  numbers =new HashSet<Integer>();
	    
	   
	   //To Declare a  Char Set
	   Set<Character>  logo =new HashSet<Character>();
		
	}

}

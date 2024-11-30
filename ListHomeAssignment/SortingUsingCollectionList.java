package week3.day2.homeassignment.ListHomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //{HCL, Wipro, Aspire Systems, CTS}

	 	List<String>compName=new ArrayList<>();
	 	compName.add("HCL");
	 	compName.add("Wipro");
	 	compName.add("Aspire System");
	 	compName.add("CTS");
	 	System.out.println(compName);
	 	//Ascending Order
	 	Collections.sort(compName);
	    System.out.println("Sorting in Ascending ordr"+compName);
	    
	    //Print the required output as Wipro, HCL, CTS, Aspire Systems
	       for(int i=compName.size()-1;i>=0;i--) {
	    	System.out.print(" "+compName.get(i));
	    	
	    }
	    	
	}

}

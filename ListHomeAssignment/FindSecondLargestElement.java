package week3.day2.homeassignment.ListHomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr={3, 2, 11, 4, 6, 7};
		FindSecondLargestElement FSL=new FindSecondLargestElement();
		FSL.Findsecond(arr);


	}
	
	public void Findsecond(int []arr) {
		
		List<Integer>arr1=new ArrayList<>();
		for(int i:arr) 
		{
			arr1.add(i);
			
		}
		System.out.println(arr1);
		//Sorting the list
		Collections.sort(arr1);
		System.out.println("The Sorted list is:"+arr1);
		//To find the second largest, you should pick the second last element (arr1.get(arr1.size() - 2)).
		//System.out.println(arr1.get(arr1.size()-1));
		System.out.println("The Second Largest Element:"+arr1.get(arr1.size()-2));
	}

}

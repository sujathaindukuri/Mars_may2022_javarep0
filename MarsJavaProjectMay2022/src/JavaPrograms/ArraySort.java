package JavaPrograms;


import java.util.Arrays;

public class ArraySort {
	public static void main(String args[])
	{
		int arr[]= {2,7,3,1,9};
		 System.out.println("The original array is: "); 
	        for (int num : arr) { 
	            System.out.print(num + " "); 
	        } 
		Arrays.sort(arr);
		 System.out.println();
		 System.out.println("The sorted  array is: "); 
	        for (int num : arr) { 
	            System.out.print(num + " "); 
	        } 
		
		
	}

}

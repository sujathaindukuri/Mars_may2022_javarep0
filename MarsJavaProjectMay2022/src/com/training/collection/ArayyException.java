package com.training.collection;

public class ArayyException {
	public static void main(String args[])
	{
		int arr[]= {2,8,3,5,9};
		try
		{
			arr[2]=7;
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array index out of bound exception");
			
		}
		finally {
			System.out.println("finally block");
		}
	}

}

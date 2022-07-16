package com.training.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String args[])
	{
		List<Integer> l1=new ArrayList<>();
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		for(Integer item:l1)
		{
			System.out.println(item);
		}
	}

}

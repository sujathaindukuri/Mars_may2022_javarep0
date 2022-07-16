package com.training.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String args[])
	{
		Set<Integer> s1=new HashSet<>();
		s1.add(4);
		s1.add(5);
		s1.add(7);
		s1.add(4);
		for (Integer i:s1)
		{
			System.out.println(i);
		}
	}

}

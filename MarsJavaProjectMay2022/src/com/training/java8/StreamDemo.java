package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String args[])
	{
		List<Integer> numbers=Arrays.asList(6,4,2,9,5);
		List<Integer> newNumbers=numbers.stream().map(a->(a*a)).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		
		List<Integer> sortedNumbers=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		List<Integer> evenNumbers=numbers.stream().filter(x->(x%2==0)).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<Integer> sortedSquareNumbers=numbers.stream().map(a->(a*a)).sorted().collect(Collectors.toList());
		System.out.println(sortedSquareNumbers);
		
		numbers.stream().filter(x->(x%2==0)).forEach(y->System.out.println(y));
		
		numbers.stream().filter(x->(x%2==0)).forEach(System.out::println);
		int sumEven=numbers.stream().filter(x->(x%2==0)).reduce(0, (ans,y)->ans+y);
		System.out.println("sum of even numbers:"+sumEven);
		
		List<String> names=Arrays.asList("sujatha","sudha","pranavi","sharat","ramesh");
		List<String> newNames=names.stream().map(a->a.toLowerCase()).collect(Collectors.toList());
		System.out.println(newNames);
		
		
		List<String> sortedNames=names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		
		List<String> filNames=names.stream().filter(x->x.contains("p")).collect(Collectors.toList());
		System.out.println(filNames);
		
	}

}

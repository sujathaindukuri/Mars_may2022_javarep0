package com.training.java8;

import java.util.function.Function;

public class LamdaDemo {

	public static void main(String[] args) {
		MyFuncInterface method=(a,b)->System.out.println("lambda demo sum : "+(a+b));
		method.getValue(2,3);
		// TODO Auto-generated method stub
		MyFuncInterface1 demo = (a) -> {return(a*5);};
		int b=demo.mul(3);
		System.out.println("product is:"+b);
		
		Function f1=(a)->{int c=5+(int)a;  return c;};
		int result=(int)f1.apply(5);
		System.out.println(result);
		

	}

}

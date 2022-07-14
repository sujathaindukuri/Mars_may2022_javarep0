package JavaPrograms;

import java.util.Stack;

public class StackDemo {
	
	static void stack_push(Stack<Integer> stack)
	{
		for(int i=0;i<5;i++)
		{
		  System.out.print(" "+stack.push(i));
		}
		System.out.println();
	}
	
	static void stack_pop(Stack<Integer> stack)
	{
		System.out.println("popped element is "+stack.pop());
	}
	
	
	static void stack_peek(Stack<Integer> stack)
	{
		System.out.println("peeked element is "+stack.peek());
	}
	
	static void stack_search(Stack<Integer> stack, int ele)
	{
		if (stack.search(ele)==-1)
		{
			System.out.println("Element not found");
			
		}
		else
		{
			System.out.println("Element "+ele+" found at pos "+stack.search(ele));
		}
	}
	
	
	
	 public static void main (String[] args)
	    {
	        Stack<Integer> stack = new Stack<Integer>();
	  
	        stack_push(stack);
	        stack_pop(stack);
	        stack_peek(stack);
	        stack_search(stack, 2);
	        stack_search(stack, 6);
	    }

}

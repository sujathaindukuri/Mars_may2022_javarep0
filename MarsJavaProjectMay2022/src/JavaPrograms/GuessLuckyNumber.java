package JavaPrograms;

import java.util.Scanner;

public class GuessLuckyNumber {
	public static void main(String args[])
	{
		LuckyNumber ln=new LuckyNumber();
		int count=0;
		int Lno=5;
		System.out.println("Please Guess the lucky number");
		int LuckyNo = ln.getLuckyNumber();
		while(Lno!=LuckyNo)
		{ 
			count=count+1;
			System.out.println("Please Guess the lucky number again");
			LuckyNo = ln.getLuckyNumber();
		}
		count=count+1;
		System.out.println("you guessed in "+count+" attempts");
	}
	

}

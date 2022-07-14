package JavaPrograms;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String args[])
	{
    Scanner myInput = new Scanner( System.in );
	int EvenCount=0;
	int OddCount=0;
	int Number[]=new int[5];
	for (int i=0;i<5;i++)
	{
	System.out.println("Enter an Interger ");
		Number[i]= myInput.nextInt();
		if (Number[i]%2==0)
		{
           EvenCount=EvenCount+1;
		}
		else
		{
		OddCount=OddCount+1;
		}
    }
	System.out.println("The no of odd nos are "+OddCount);
	System.out.println("The no of Even nos are "+EvenCount);
}
}
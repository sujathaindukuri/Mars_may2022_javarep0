package JavaPrograms;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class MyClassDaysOfMonth {
public static void main(String args[])
{
	
	DaysOfMonth d = new DaysOfMonth();
	Scanner myInput = new Scanner( System.in );
	
	
	System.out.println("enter year ");
	
	int year= myInput.nextInt();
	
	System.out.println("enter month ");
	
	int month = myInput.nextInt();

    
	System.out.println(d.findDays(year, month));
	
}
}

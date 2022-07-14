package JavaPrograms;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class MyEmployeeClass {
	public static void main(String args[])
	{
		
		Employee e = new Employee();
		Scanner myInput = new Scanner( System.in );
		for(int i=0;i<=3;i++) 
		{
			System.out.println("Enter Employee Id ");
			int empID= myInput.nextInt();
			e.setEmpId(empID);
		    

			System.out.println("Enter Employee Name ");
			String empName= myInput.next();
			e.setEmpName(empName);
					    
		    System.out.println("Enter Employee Salary ");
		    int empSal = myInput.nextInt();
            e.setEmpSal(empSal);
            
			
			System.out.println("Enter Employee Department ");
		    String department= myInput.next();
		    e.setDepartment(department);
			
			
	    
		System.out.println(e.getEmpInfo());
		}
	}

}

package com.training.collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionDemo {
public static void main(String args[])
{
	Student s1=new Student("sujatha",1,"A");
	Student s2=new Student("sudha",2,"B");
	Student s3=new Student("siri",3,"C");
	Student s4=new Student("rajini",4,"D");
	Student s5=new Student("rajini",4,"D");
	
	
	Set<Student> studentList=new HashSet<>();
	studentList.add(s1);
	studentList.add(s2);
	studentList.add(s3);
	studentList.add(s4);
	studentList.add(s5);
	
	for(Student stud:studentList)
	{
		System.out.println(stud.getName());
		System.out.println(stud.getRollNo());
		System.out.println(stud.getGrade());
	}
	
}

}

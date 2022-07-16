package com.training.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String args[])
	{
		Map<String ,Student> mapList=new HashMap<>();
		Student s1=new Student("sujatha",1,"A");
		Student s2=new Student("sudha",2,"B");
		Student s3=new Student("siri",3,"C");
		Student s4=new Student("rajini",4,"D");
		mapList.put("stud1",s1);
		
		mapList.put("stud2",s2);
		mapList.put("stud3",s3);
		mapList.put("stud4",s4);
		
		for(Map.Entry<String,Student> entry:mapList.entrySet())
			
		{
			String key=entry.getKey();
			Student studobj=entry.getValue();
			System.out.println(studobj.getName());
		}
						
	}
 
}

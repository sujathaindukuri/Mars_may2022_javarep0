package com.training.collection;

public class Student {
	private String name;
	private int rollNo;
	private String grade;
	public Student(String name, int rollNo, String grade) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	@Override
	public int hashCode()
	{
		int hashcode=0;
		hashcode=rollNo*10;
		hashcode=hashcode+name.hashCode()+grade.hashCode();
		return(hashcode);
		
			
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student s=(Student) obj;
			return((s.name.equals(this.name))&&(s.grade.contentEquals(this.grade))&&(s.rollNo==this.rollNo));
		}
		else
		{
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	

}

package com.bharani;

public class School_Construct 
{
	String name;
	int rollno;
	//Parameterized constructor
	public School_Construct(String name, int rollno) 
	{
		System.out.println("How are you");
		this.name = name;
		this.rollno = rollno;
	}
	
	//Constructor overloading
	public School_Construct(String fName, String lName, int rollno) 
	{
		this.name=fName+lName;
		this.rollno=rollno;
	}
	
	//Zero argument constructor - No-args constructor
	public School_Construct() 
	{
		System.out.println("latest");
	}

	public static void main(String[] args) 
	{
		School_Construct stud1 = new School_Construct("Bharani", 100);
		School_Construct stud2 = new School_Construct("Santhiya", 101);
		School_Construct stud3 = new School_Construct("Harish", 102);
		School_Construct stud4 = new School_Construct("Kalai","arasan",104);
		School_Construct stud5 = new School_Construct();
		School_Construct stud6 = new School_Construct();
		School_Construct stud7 = new School_Construct();
		
//		System.out.println(stud1.name);
//		System.out.println(stud2.name);
//		System.out.println(stud3.name);
//		System.out.println(stud1.rollno);
//		System.out.println(stud2.rollno);
//		System.out.println(stud3.rollno);
//		System.out.println(stud4.name);
//		System.out.println(stud4.rollno);
		
		stud1.participate();
		stud2.write_exam();
		stud4.participate();
		
	}
	
	private void write_exam() 
	{
		System.out.println(name);		
	}
	
	private void participate() 
	{
		System.out.println(name);		
	}

}

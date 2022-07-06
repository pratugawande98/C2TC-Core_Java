package com.cg.Demo;

public class Student {
	int roll;
	String name;
	String college;
	public Student(int roll ,String name, String college) {
		super();
		this.roll=roll;
		this.name=name;
		this.college=college;
		}
	void display()
	{
		System.out.println(roll + "" + name+"" + college);
	}

	public static void main(String[] args)
	{
		Student s1=new Student(1, "Prit", "Gode college");
		Student s2=new Student(2, "Namita", "Meghe college");
		s1.display();
		s2.display();	
	}

}

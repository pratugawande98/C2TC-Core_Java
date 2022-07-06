package com.cg.Demo;

public class AbsatractDemo {

	public static void main(String[] args) {
		Scooty Activa=new Scooty();
		Activa.noOfWheels();
	}
}
abstract class Vehicle
{
	abstract void noOfWheels();
}
class Scooty extends Vehicle
{
	void noOfWheels()
	{
		System.out.println(2);
	}
}

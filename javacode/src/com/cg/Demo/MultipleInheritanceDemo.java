package com.cg.Demo;

public class MultipleInheritanceDemo implementsFirstInterface, SecondInterface{
	public static void main(String[] args)
	{
		char[] LaptopBrand;
		System.out.println(LaptopBrand);
		char[] LaptopColor;
		System.out.println(LaptopColor);
		
		MultipleInheritanceDemo obj=new MultipleInheritanceDemo();
		obj.documentation();
		obj.browsing();
		obj.paint();
		obj.programming();
	}
	private void documentation() {
		// TODO Auto-generated method stub
		System.out.println("I am doing Documentation");
	}
	private void browsing() {
		// TODO Auto-generated method stub
		System.out.println("I am doing Browsing");
	}
	private void paint() {
		// TODO Auto-generated method stub
		System.out.println("I am doing Painting");
	}
	private void programming() {
		// TODO Auto-generated method stub
		System.out.println("I am doing Programming");
	}

}

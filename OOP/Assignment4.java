/*Design a base class shape with two double type values and member functions to input the data and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display
calculated area. Implement dynamic binding for given case study.*/
//Vishakha Sarode SE IT 27069

import java.util.*;
abstract class Shape
{
	public static double value1,value2;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter the value 1"+"\n");
		value1=sc.nextDouble();
		System.out.println("Enter the value 2"+"\n");
		value2=sc.nextDouble();
	}
	abstract void compute_Area();
}
class Triangle extends Shape
{
	public void input()
	{
		super.input();
		System.out.println(value1+"\n");
	}
	public void compute_Area()
	{
		
		double A =value1 * value2;
		System.out.println("Area of triangle is "+A/2+"\n");
	}
	
}
class Rectangle extends Shape
{
	public void input()
	{
		super.input();
		System.out.println(value1);
	}
	public void compute_Area()
	{
		double B =value1 * value2;
		System.out.println("Area of rectangle is "+B);
	}
}
public class Assignment4
{
	public static void main(String args[])
	{
		Shape s1=new Triangle();
		Shape s2=new Rectangle();
		s1.input();
		s1.compute_Area();
		s2.input();
		s2.compute_Area();
	}
}


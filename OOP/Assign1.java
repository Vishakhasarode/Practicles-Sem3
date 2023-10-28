//OOPS ASSIGNMENT 1
//Vishakha sarode

import java.util.Scanner;
public class Assignment1
{
	double real,imag;
	complex()
	{
	real = 0;
	imag =0;
	}
	complex(double r, double i){
	this.real= r;
	this.imag= i;
}
	void input(complex c1, complex c2) 
	{
		System.out.println("********");
			System.out.println("Enter the real part of the first no: ");
		Scanner data = new Scanner(System.in);
		c1.real= data.nextDouble();
		System.out.println("Enter the imaginary part of the first no: ");
		c1.imag = data.nextDouble();
		System.out.println("********");
		System.out.println("Enter the real part of the Second no: ");
		c2.real = data.nextDouble();	
		System.out.println("Enter the imaginary part of the Second no: ");
		c2.imag = data.nextDouble();
		System.out.println("********");
		data.close();
	}
	void display(complex c1, complex c2) 
	{
		System.out.println("First no : "+c1.real+" + "+c1.imag+"i");
		System.out.println("********");
		System.out.println("Second no : "+c2.real+" + "+c2.imag+"i");
		System.out.println("********");
	}
	void addition(complex c1, complex c2) 
	{
		double a,b;
		a= c1.real + c2.real;
		b= c1.imag + c2.imag;
		System.out.println("Addition of two no is: "+a+" + "+b+"i");
		System.out.println("********");
	}
	void substraction(complex c1, complex c2)
	{
		double a,b;
		a= c1.real - c2.real;
		b= c1.imag - c2.imag;
		System.out.println("substraction of two no is: "+a+" + "+b+"i");
		System.out.println("********");
	}
	void multiplication(complex c1, complex c2)
	{
		double a,b;
		a= (c1.real * c2.real) - (c1.imag * c2.imag);
		b= (c1.real * c2.imag) + (c2.real * c1.imag);
		System.out.println("Multiplication of two no is: "+a+" + "+b+"i");
		System.out.println("********");
	}
	void Division(complex c1,complex c2) 	
	{
		double a,b;
		a= ((c1.real * c2.real)+ (c2.imag * c2.imag))/((c2.imag * c2.imag)+ (c2.real * c2.real));
		b= ((c2.real * c1.real)- (c1.real * c2.imag))/((c2.imag * c2.imag)+ (c2.real * c2.real));
	System.out.println("Division of two no is: "+a+" + "+b+"i");
	System.out.println("********");
	}

	public static void Main(String[] args) 
	{
		complex c1 = new complex();
		complex c2 = new complex();
		c1.input(c1,c2);
		c1.display(c1, c2);
		c1.addition(c1, c2);
		c1.substraction(c1, c2);
		c1.multiplication(c1, c2);
		c1.Division(c1, c2);
	}
}




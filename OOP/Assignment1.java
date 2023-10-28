//Vishakha Sarode SE IT 27069
import java.util.Scanner;

class Complex {
    double real, imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    void input(Complex c1, Complex c2) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the real part of the first no: ");
        c1.real = data.nextDouble();
        System.out.println("Enter the imaginary part of the first no: ");
        c1.imag = data.nextDouble();
        System.out.println("Enter the real part of the Second no: ");
        c2.real = data.nextDouble();
        System.out.println("Enter the imaginary part of the Second no: ");
        c2.imag = data.nextDouble();
        data.close();
    }

    void display(Complex c1, Complex c2) {
        System.out.println("First no : " + c1.real + " + " + c1.imag + "i");
        System.out.println("Second no : " + c2.real + " + " + c2.imag + "i");
    }

    void addition(Complex c1, Complex c2) {
        double a, b;
        a = c1.real + c2.real;
        b = c1.imag + c2.imag;
        System.out.println("Addition of two no is: " + a + " + " + b + "i");
    }

    void subtraction(Complex c1, Complex c2) {
        double a, b;
        a = c1.real - c2.real;
        b = c1.imag - c2.imag;
        System.out.println("Subtraction of two no is: " + a + " + " + b + "i");
    }

    void multiplication(Complex c1, Complex c2) {
        double a, b;
        a = (c1.real * c2.real) - (c1.imag * c2.imag);
        b = (c1.real * c2.imag) + (c2.real * c1.imag);
        System.out.println("Multiplication of two no is: " + a + " + " + b + "i");
    }

    void division(Complex c1, Complex c2) {
        double a, b;
        a = ((c1.real * c2.real) + (c1.imag * c2.imag)) / (c2.real * c2.real + c2.imag * c2.imag);
        b = ((c1.imag * c2.real) - (c1.real * c2.imag)) / (c2.real * c2.real + c2.imag * c2.imag);
        System.out.println("Division of two no is: " + a + " + " + b + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.input(c1, c2);
        c1.display(c1, c2);
        c1.addition(c1, c2);
        c1.subtraction(c1, c2);
        c1.multiplication(c1, c2);
        c1.division(c1, c2);
    }
}

package ru.aqa.first;

public class Example {

	public static void main(String[] args) {
		hello("world");
		hello("Mark");
		hello("Anna");

		double l = 5;
		System.out.println("Ploschad kvadrata so storonoi " + l + " = " + area(l));

		double a = 4;
		double b = 6;
		System.out.println("Ploschad pryamougolnika so storonami " + a + " i " + b + " = " + area(a,b));
		}


	public static void hello(String somebody) {

		System.out.println("Hello " + somebody + "!");
	}

	public static double area(double len) {
	    return len *  len;
	}

	public static double area(double a, double b) {
		return a * b;
}
}
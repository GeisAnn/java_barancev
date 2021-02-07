package ru.aqa.first;

public class Example {

	public static void main(String[] args) {
		hello("world");
		hello("Mark");
		hello("Anna");

		Square s = new Square(5);

		System.out.println("Ploschad kvadrata so storonoi " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4, 6);

		System.out.println("Ploschad pryamougolnika so storonami " + r.a + " i " + r.b + " = " + area(r));
		}


	public static void hello(String somebody) {

		System.out.println("Hello " + somebody + "!");
	}

	public static double area(Square s) {
	    return s.l *  s.l;
	}

	public static double area(Rectangle r) {
		return r.a * r.b;
}
}
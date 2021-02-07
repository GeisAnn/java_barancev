package ru.aqa.first;

public class Point {
  public double a;
  public double b;

  public Point ( double a,  double b) {
    this.a = a;
    this.b = b;
  }

  public  double distance(Point p2) {
    double l = (p2.a - this.a) * (p2.a - this.a) + (p2.b - this.b) * (p2.b - this.b);
    return Math.sqrt(l);
  }
}

package model;

public class Triangle extends Shape {
  private double a,b,c;

  /**
   * @param a
   * @param b
   * @param c
   * @param color
   */
  public Triangle(double a, double b, double c, String color) {
    super(color);
    this.a = a;
    this.b = b;
    this.c = c;
  }
  @Override 
  public void printColor() {
    System.out.println("Triangle: " + color);
  }

  @Override
  public double area(){
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  @Override
  public double perimeter() {
    return a + b + c;
  }
}
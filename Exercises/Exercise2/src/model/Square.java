package model;

public class Square extends Shape {
  private double a;
  public Square(double a, String color) {
      super(color);
      this.a = a;
  }

  @Override
  public double area() {
    return Math.pow(a, 2);
  }

  @Override
  public double perimeter() {
    return a * 4;
  }
  
  @Override
  public void printColor() {
      System.out.println("Square: " + getColor());
  }
}
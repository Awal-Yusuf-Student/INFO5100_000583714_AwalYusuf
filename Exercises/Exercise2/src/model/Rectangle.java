package model;

public class Rectangle extends Shape {
  private double w,l;
  public Rectangle(double w, double l, String color) {
      super(color);
      this.w = w;
      this.l = l;
      
  }

  @Override
  public double area() {
    return w * l;
  }

  @Override
  public double perimeter() {
    return 2 * (w + l);
  }

  @Override
  public void printColor() {
      System.out.println("Rectangle: " + color);
  }
}
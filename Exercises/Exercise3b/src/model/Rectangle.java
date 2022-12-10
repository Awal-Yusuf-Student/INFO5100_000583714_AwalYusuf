package model;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
  private double w,l;
  /**
   * @param w
   * @param l
   * @param color
   */
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

  @Override
  public  String toString()
  {
      return "The color of this Rectangle is: " + color + "." +
      "The dimension of this Rectangle is: " + w + "cm width and " + l + "cm length.";

  }
}

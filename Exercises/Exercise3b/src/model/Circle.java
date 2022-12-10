package model;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {
  private double radius;
  /**
   * @param radius
   * @param color
   */
  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
      
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }
  @Override
  public void printColor() {
      System.out.println("Circle: " + color);
  }

  @Override
  public  String toString()
  {
      return "The color of this Circle is: " + color + "." +
      "The radius of this Circle is: " + radius + "cm.";

  }
}

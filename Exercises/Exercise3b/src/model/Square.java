package model;

import java.io.Serializable;

public class Square extends Shape implements Serializable {
  private double a;
  /**
   * @param a
   * @param color
   */
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

  @Override
  public  String toString()
  {
      return "The color of this Square is: " + color + "." +
      "The length of this Square is: " + a + ".";

  }
  
}

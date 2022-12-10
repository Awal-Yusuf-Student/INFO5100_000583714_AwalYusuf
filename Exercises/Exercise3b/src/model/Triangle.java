package model;

import java.io.Serializable;

public class Triangle extends Shape implements Serializable {
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

  @Override
  public  String toString()
  {
      return "The color of this Triangle is: " + color + "." +
      "The dimension of this Rectangle is: " + a + "cm by " + b + "cm by " + c + "cm.";

  }
}

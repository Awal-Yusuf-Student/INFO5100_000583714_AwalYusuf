package model;

import java.io.Serializable;

public abstract class Shape implements Serializable {
  static String color;
  public abstract double area();
  public abstract double perimeter();
 
 /**
 * @param color
 */
public Shape(String color) {
   Shape.color = color;
 }

 //Do perimeter and area
 public static String getColor() {
   return color;
 }

 public static void setColor(String color) {
   Shape.color = color;
 } 

 public void printColor(){
   System.out.println(color);
 }

 @Override
    public  String toString()
    {
        return "The color of this shape is: " + color;
    }
}






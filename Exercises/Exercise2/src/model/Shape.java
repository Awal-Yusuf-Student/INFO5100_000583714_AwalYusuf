package model;


public abstract class Shape {
   static String color;
   public abstract double area();
   public abstract double perimeter();
  
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
}






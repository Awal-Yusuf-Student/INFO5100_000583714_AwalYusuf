package ui;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;
import model.Triangle;

public class ShapeMain {
  public static void main(String[] args){

    Shape Saturn = new Rectangle(10,5,"red");
    Shape Venus = new Rectangle(5,6,"blue");
    Shape Pluto = new Square(5,"pink");
    Shape Jupiter = new Triangle(3,4,5,"Orange");
    Shape Mars= new Circle(7,"white");

    //Perimter
    System.out.println("The Perimeter of Saturn is: " + Saturn.perimeter() + "cm.");
    System.out.println("The Perimeter of Venus is: " + Venus.perimeter() + "cm.");
    System.out.println("The Perimeter of Pluto is: " + Pluto.perimeter() + "cm.");
    System.out.println("The Perimeter of Jupiter is: " + Jupiter.perimeter() + "cm.");
    System.out.println("The Perimeter of Mars is: " + Mars.perimeter() + "cm.");

     //Area
     System.out.println("The Area of Saturn is: " + Saturn.area() + "cm.");
     System.out.println("The Area of Venus is: " + Venus.area() + "cm.");
     System.out.println("The Area of Pluto is: " + Pluto.area() + "cm.");
     System.out.println("The Area of Jupiter is: " + Jupiter.area() + "cm.");
     System.out.println("The Area of Mars is: " + Mars.area() + "cm.");
  }
}


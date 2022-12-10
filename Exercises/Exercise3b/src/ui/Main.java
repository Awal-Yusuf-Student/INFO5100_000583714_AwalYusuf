package ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import model.Shape;
import model.Rectangle;
import model.Square;
import model.Triangle;
import model.Circle;

public class Main implements Serializable{

  public static void main(String[] args) {
      ArrayList<Shape> shapes = new ArrayList<Shape>();
      String filename = "Exercise3b.txt";
      shapes.add(new Rectangle(10,5,"red"));
      shapes.add(new Rectangle(5,6,"blue"));
      shapes.add(new Square(5,"pink"));
      shapes.add(new Triangle(3,4,5,"Orange"));
      shapes.add(new Circle(7,"white"));
//Serializable
      try
      {
          FileOutputStream fos = new FileOutputStream(filename);
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(shapes);
          oos.close();
          fos.close();
      }
      catch (IOException e)
      {
          e.printStackTrace();
      }
//Desrializable
      ArrayList<Shape>shapeswitch = new ArrayList<Shape>();
      try
      {
          FileInputStream fis  = new FileInputStream(filename);
          ObjectInputStream ois = new ObjectInputStream(fis);
          shapeswitch = (ArrayList)ois.readObject();
          ois.close();
          fis.close();
      }
      catch (IOException e)
      {
          e.printStackTrace();
      }
      catch (ClassNotFoundException c)
      {
          System.out.println("Class not found");
          c.printStackTrace();
      }
      for (Shape s:shapeswitch
           ) {
          System.out.println(s);
      }
  }
}
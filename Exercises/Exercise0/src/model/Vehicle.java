package model;

import java.util.Date;



public class Vehicle {
  int id;
  String name;
  String manufacturer;
  String model;
  Date year;
  int noOfCylinders;
  String color;
  class Engine { 
    int id;
    String Enginename;
    String Enginemodel;

    public Engine(){
      this.id = (int) (Math.random() * 100);
      System.out.println("Engine name: " + this.Enginename + 
                          " Engine model: " + this.Enginemodel);
    }
  }
  class Sale {
    int saleid;
    int Price;
    int Deliverymonths;

    public Sale(){
      this.saleid = (int) (Math.random() * 100);
      System.out.println("Price: " + this.Price + 
                          " Delivery Period: " + this.Deliverymonths);
    }
  }

  Engine engine;
  Sale sale;

  public Vehicle () {
		this.id = (int) (Math.random() * 100);
		System.out.println("Registering new Velhicle with electronic id: " + this.id + 
    ".");
	}
  
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getManufacturer() {
    return this.manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  }

  


package model;

public class Classroom {
  int id;
  String name;
  String location;
  String department;
  int seats;
  boolean openweekends;
  String classes[];
  String cleaner;

  public Classroom() {
		this.id = (int) (Math.random() * 100);
		System.out.println("Registering new Classroom with id: " + this.id);
	}

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}

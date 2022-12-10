package model;

import java.util.Date;

public class Person {
  int id;
  String name;
  Date dob;
  String gender;
  String occupation;
  int salary;
  String nationality;
  class Familystatus{
    boolean Married;
    int NumberOfChildren;
  }
  class WellnessStatus{
    boolean JobSatisfaction;
    boolean TerminalIllness;
  }

  public Person() {
		this.id = (int) (Math.random() * 100);
		System.out.println("Registering new Person with id: " + this.id);
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

  public Date getDob() {
    return this.dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }



}
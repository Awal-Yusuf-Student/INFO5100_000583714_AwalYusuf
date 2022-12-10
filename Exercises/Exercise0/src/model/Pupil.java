package model;

import java.util.Date;

public class Pupil {
  int id;
  String name;
  int age;
  Date dob;
  String department;
  String classes[];
  class StudentStatus{
    boolean Registered;
    boolean Coop;

    public StudentStatus(){
      System.out.println("Is Student registered for the semester: " + this.Registered);
    }
  }
  class Grades{
  int id;
   int GPA;
   enum Standing {
      Good ,
      Probabtion
    }
    public Grades(){
      this.id = (int) (Math.random() * 100);
      System.out.println("Current GPA: " + this.GPA) ;
    }

  }
    StudentStatus studentstatus;
    Grades grades;
  

  public Pupil() {
		this.id = (int) (Math.random() * 100);
    this.grades = new Grades();
		System.out.println("Registering new Pupil with id: " + this.id);
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

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  
}

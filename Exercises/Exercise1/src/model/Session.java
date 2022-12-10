package model;

import java.util.Arrays;

public class Session  {
  Student students[] = new Student[20];
  PartTime partimestudents[] = new PartTime[20];
  FullTime fulltimestudents[] = new FullTime[20];


public Session(Student students[]) {
  this.students = students;
}

public double averageQuizScore() {
  double total = 0;
  for (Student student : students) {
    for (int i = 0; i < student.getQuizScores().length; i++) {
    total += student.getQuizScores()[i];
  }
}
  return total / students.length;

}

public void printQuizScores() {
  for (Student student : students) {
    int studentid = student.getStudentid();
    int quizscores[] = student.getQuizScores();

    Arrays.sort(quizscores);
    for(int i = 0; i < quizscores.length; i++) {
      System.out.print( studentid + ": " + quizscores[i] + " ");
    }
    System.out.println();
  }
}

  public void printName() {
    for (PartTime student : partimestudents) {
      String name = student.getName();
      for(int i = 0; i < partimestudents.length; i++) {
        System.out.print( "Name: " + name );
      }
      System.out.println();
    }
  }

  public void printExamScores() {
    for (FullTime student : fulltimestudents) {
      int studentid = student.getStudentid();
      int examscores[] = student.getExamScores();
  
      for(int i = 0; i < examscores.length; i++) {
        System.out.print( studentid + ": " + examscores[i] + " ");
      }
      System.out.println();
    }
  }

}

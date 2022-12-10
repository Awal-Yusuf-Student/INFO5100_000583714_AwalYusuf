package ui;

import model.FullTime;
import model.PartTime;
import model.Session;
import model.Student;

public class StudentMain {
  public static void main(String[] args) {
    Student students[] = new Student[20];
    PartTime partimestudents[] = new PartTime[20];
    FullTime fulltimestudents[] = new FullTime[20];
    int[] sid = new int[15];
    int[] qScores = new int[15];
    int[] eScores = new int[2];
    for (int i = 0; i < sid.length; i++) {
      sid[i] = (int)(Math.random() * 100);
    }
    for (int i = 0; i < qScores.length; i++) {
      qScores[i] = (int)(Math.random() * 100);
    }
    for (int i = 0; i < eScores.length; i++) {
      eScores[i] = (int)(Math.random() * 100);
    }
    // Create random data of some part time and some full time students
    for (int i = 0; i < students.length; i++) {
      if (Math.random() > 0.5) {
        students[i] = new FullTime("Fulltime: ", i, qScores, eScores);
      } else students[i] = new PartTime("PartTime: " + i, i, qScores);
    }
    Session session = new Session(students);
    System.out.println("Average quiz score: " + session.averageQuizScore());
    session.printQuizScores();
    session.printExamScores();

    }
}


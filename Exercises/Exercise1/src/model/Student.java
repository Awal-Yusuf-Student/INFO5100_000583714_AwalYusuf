package model;


public abstract class Student {
  String name;
  int studentid;
  int[] quizscores;

  public Student(String name, int studentid, int[] quizscores) {
    this.name = name;
    this.studentid = (int) (Math.random() * 100);
    this.quizscores = quizscores;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStudentid() {
    return studentid;
  }

  public int[] getQuizScores() {
    return quizscores;
  }

  public void setQuizScores(int[] quizscores) {
    this.quizscores = quizscores;
  }
}







package model;

public class FullTime extends Student {
 int[] examscores = new int[2];

 public FullTime (String name, int studentid, int[] quizscores, int[] examscores) {
    super(name, studentid, quizscores);
    this.examscores = examscores;
  }

  public int[] getExamScores() {
    return examscores;
  }

  public void setExamScores(int[] examscores) {
    this.examscores = examscores;
  }
}
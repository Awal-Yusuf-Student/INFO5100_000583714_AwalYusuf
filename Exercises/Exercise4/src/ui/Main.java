package ui;
import java.util.regex.*;
public class Main {
  public static void main(String[] args){
    //Expression 1
    System.out.println("Input string matches with Pattern: " + Pattern.matches(".xy","xyz"));
    System.out.println("Input string matches with Pattern: " + Pattern.matches(".xx","xxx"));
    //Expression 2
    System.out.println("Input string matches with Pattern: " + Pattern.matches("[^abc]+","dex"));
    System.out.println("Input string matches with Pattern: " + Pattern.matches("[^abc]+","bas"));
    //Expression 3
    System.out.println("Input string matches with Pattern: " + Pattern.matches("[abc]?","b"));
    System.out.println("Input string matches with Pattern: " + Pattern.matches("[abc]?","cable"));
    //Expression 4
    System.out.println("Input string matches with Pattern: " + Pattern.matches("[a-zA-Z0-9]{6}","awal92"));
    System.out.println("Input string matches with Pattern: " + Pattern.matches("[a-zA-Z0-9]{6}","awaly"));
    System.out.println("Input string matches with Pattern: " + Pattern.matches("[a-zA-Z0-9]{6}","awal1992"));
    //Expression 5
    System.out.println("Input string matched with Pattern: " + Pattern.matches("e$", "e"));
    System.out.println("Input string matched with Pattern: " + Pattern.matches("e$", "base"));
  }
}

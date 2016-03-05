import java.util.Scanner;

public class CheckAnswer {
  static int total = 0;

  public static void checkAnswer(String correctRoman) {
    Scanner inputScanner = new Scanner(System.in);
    String userInput = inputScanner.next();

    if (userInput.equals(correctRoman)) {
      System.out.println("Correct!");
      total++;

    } else {
      System.out.println("Incorrect!");

    }
    System.out.println();
  }
}

import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class Generate extends CheckAnswer {

  public static void generateOptions() {
    String vowels[][] = {{"ㅏ", "ㅓ", "ㅗ", "ㅜ", "ㅡ", "ㅣ", "ㅑ","ㅕ", "ㅛ", "ㅠ"},
                                {"a","eo","o","u","eu","i","ya","yeo","yo","yu"}};
    String consonants[][] = {{"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ","ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"},
                                  {"g","n","d","r/l","m","b","s","silent/..ng","j","ch","k","t", "p", "h"}};

    int randomNum;
    String correctRoman;
    String chosenHangul;
    Random rand = new Random();
    String[] multipleChoiceRoman, multipleChoiceHangul;
    multipleChoiceRoman = new String[4];
    multipleChoiceHangul = new String[4];

    for(int i = 0; i < 4; i++) { // fills arrays with random values from vowels array; parallel
      randomNum = rand.nextInt((9 - 0) + 1);
      multipleChoiceRoman[i] = vowels[1][randomNum];
      multipleChoiceHangul[i] = vowels[0][randomNum];

    }

    randomNum = rand.nextInt((3 - 0) + 1); // resets range of randomNum to 0-4
    correctRoman = String.valueOf(randomNum + 1); // sets the valid option number
    chosenHangul = multipleChoiceHangul[randomNum]; // sets the chosen hangul parallel with above
    System.out.println(chosenHangul);

    for(int i = 0; i < 4; i++) { // outputs options to screen
        System.out.println((i + 1)+ "- " + multipleChoiceRoman[i]);
    }
    checkAnswer(correctRoman);
  }
}

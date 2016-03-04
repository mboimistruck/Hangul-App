import java.io.*;
import java.util.Random;

public class Main {

  static String vowels[][] = {{"ㅏ", "ㅓ", "ㅗ", "ㅜ", "ㅡ", "ㅣ", "ㅑ","ㅕ", "ㅛ", "ㅠ"},
                                      {"a","eo","o","u","eu","i","ya","yeo","yo","yu"}};

  static String consonants[][] = {{"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ","ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"},
                                        {"g","n","d","r/l","m","b","s","silent/..ng","j","ch","k","t", "p", "h"}};

  static Random rand = new Random();

  public static void output() {
    int randomNum = rand.nextInt((8 - 0) + 1) + 1;
    System.out.println("Hangul: " +vowels[0][randomNum]);
    System.out.println("Roman:  " +vowels[1][randomNum]);
    System.out.println();

  }

  public static void main(String[] args) {
    int i = 10;

    while (i > 0){
      output();
      i--;

    }
  }
}

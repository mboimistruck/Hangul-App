import java.io.*;
import java.util.Random;

public class Main {

  static String vowels[][] = {{"\u65E5", "\u65E5", "\u65E5", "\u65E5", "ㅇㄹ", "?", "?", "?", "?", "?"},
                                      {"a","eo","o","u","eu","i","ya","yeo","yo","yu"}};

  static String consonants[][] = {{"???", "???", "????", "???", "???", "???", "???","???", "???", "???", "???", "???", "???", "???"},
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

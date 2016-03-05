public class OutputResult extends Generate {

  private static int outputTotal() {
    int i = 10;

    while (i > 0){

      System.out.println("Attempts Remaining: "+ i +" | Correct Answers: "+ total);
      generateOptions();
      i--;
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println("Total correct: " +outputTotal());
  }
}

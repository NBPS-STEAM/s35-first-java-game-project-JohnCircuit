import java.util.Scanner;

public class App {
    public static void main(String[] args) {

      intro();

      public static void intro()
      {
        Scanner scanner = new Scanner(System.in);
      System.out.println("It looks like you want to be dealt in, is that true?");
      String start = scanner.nextLine();
      String answer1 = "yes";
      String answer2 = "Yes";
      while (start != answer1 || start != answer2)
      {
        if (start != answer1 || start != answer2)
        {
          System.out.println("Sorry I didn't quite get that.");
          start = scanner.nextLine();
          return start;
        }

        }
        System.out.println("Alright");
      










    }
}

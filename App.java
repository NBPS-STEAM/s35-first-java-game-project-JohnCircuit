import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      System.out.println("It looks like you want to be dealt in, is that true?");
      intro();
    }
      public static void intro()
      {
        Scanner scanner = new Scanner(System.in);
      
      String start = scanner.nextLine();
      String answer1 = "yes";
      String answer2 = "Yes";
      while (!start.equals(answer1) || !start.equals(answer2))
      {
        if (!start.equals(answer1) || !start.equals(answer2))
        {
          start = scanner.nextLine();
          System.out.println("Sorry I didn't quite get that.");
          //start = scanner.nextLine();
          
        }

        }
        System.out.println("Alright");
      
      }
}









    


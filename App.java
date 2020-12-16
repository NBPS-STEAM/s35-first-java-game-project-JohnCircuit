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
      
      while (!start.equals("yes") || !start.equals("Yes"))
      {
        if (!start.equals("yes") || !start.equals("Yes"))
        {
          start = scanner.nextLine();
          System.out.println("Sorry I didn't quite get that.");
          //start = scanner.nextLine();
          
        }
        if (start.equals("yes") || start.equals("Yes"))
        {
          System.out.println("Alright lets start!");
          break;
        }
        }
        
      
      }
}









    


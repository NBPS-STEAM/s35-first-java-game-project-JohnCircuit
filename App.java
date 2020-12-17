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
    public static void addScore()
    {
      //Get randomNumber
      //randomNumber += userScore
      //return userScore

    }
    public static void drawOrHold()
    {
      //if draw, ask how many to draw
      //if hold, stop game

    }
    public static void checkScore()
    {
      //if userScore > 21 "you lost"
      //if userScore <= 21, use drawOrHold()

    }

}









    


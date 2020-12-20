import java.util.Scanner;
import java.util.Random;
public class App {

  static int hand;
  static int sum;
    public static void main(String[] args) {
      //Scanner scanner = new Scanner(System.in);
      System.out.println("It looks like you want to be dealt in, is that true?");
      intro();
      drawOrHold();
    }


      public static void intro()
      {
        Scanner scanner = new Scanner(System.in);
      
      String start = scanner.nextLine();
      System.out.println("");
      System.out.println("");
      while (start.equalsIgnoreCase("yes"))
      {
        if (!start.equalsIgnoreCase("yes"))
        {
          //start = scanner.nextLine();
          System.out.println("Sorry I didn't quite get that.");
          System.out.println("");
          start = scanner.nextLine();
          
        }
        if (start.equals("yes") || start.equals("Yes"))
        {
          System.out.println("Alright lets start!");
          System.out.println("");
          break;
        }
      } 
        
      
    }
    public static int addScore()
    { 
      //Get randomNumber
      //randomNumber += userScore
      //return userScore
      Random card = new Random();
      App hand = new App();
      
      int score;
      score = 1+card.nextInt(11);
      System.out.println(score);
      App.hand = score;
      return App.hand;
      
      
    }



    public static int drawOrHold()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many times would you like to draw?");
      int draw = scanner.nextInt();
      System.out.println("");
      System.out.println("");

      
      if (draw >= 1)
      {
        for(int i = 1; i <= draw; i++)
    	{
        addScore();
        int sum = sum + App.hand;
		    //System.out.println(App.hand);
    	}
      //System.out.println(App.hand);
      return App.hand();
      System.out.println(sum);
      }
      //if draw, ask how many to draw
      //if hold, stop game

    }
    public static void checkScore()
    {
      //if userScore > 21 "you lost"
      //if userScore <= 21, use drawOrHold()

    }

}









    


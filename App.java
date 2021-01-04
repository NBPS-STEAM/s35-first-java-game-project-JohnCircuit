import java.util.Scanner;
import java.util.Random;
public class App {

  static int hand;
  static int sum;
    public static void main(String[] args) {
      //Scanner scanner = new Scanner(System.in);
      
      System.out.println("It looks like you want to be dealt in, is that true?");

        Scanner scanner = new Scanner(System.in);
      
      String start = scanner.nextLine();
      System.out.println("");
      System.out.println("");
      while (start.equalsIgnoreCase("yes"))
      {
        if (!start.equalsIgnoreCase("yes"))
        {
          
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

      drawOrHold();
      
      System.out.println("Now that you know what the game is like, how many times would you like to play again?"); 

      int rerun = scanner.nextInt();
      int i = 0;
      while (i < rerun)
      {
          i++;
          drawOrHold();
          
      }

    }


    public static void drawOrHold()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("How many times would you like to draw?");
      int draw = scanner.nextInt();
      System.out.println("");
      System.out.println("");
      int hand = 0;
      
      if (draw >= 1)
      {
        for(int i = 1; i <= draw; i++)
    	{
        Random card = new Random();
		    int score;
        score = 1+card.nextInt(11);
        System.out.println(score);
        
        hand = hand + score;
        
    	}
        System.out.println(hand);
        if (hand < 20)
        {
          System.out.println("It looks like the house had a hand of 20 or more. You lose."); 
          System.out.println("");
          System.out.println("");
        }
        else if (hand > 21)
        {
          System.out.println("WOW it looks like your hand is to large, you busted! You lose."); 
          System.out.println("");
          System.out.println("");
        }
        else 
        {
          System.out.println("Congratulations you beat the dealer! You win."); 
          System.out.println("");
          System.out.println("");
        }

      }
      
      
      
    }
    


}









    


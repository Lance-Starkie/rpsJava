import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RockPaperScissors
{
  public static int getIndexOf(String[] strings, String item)
  {
    for (int i = 0; i < strings.length; i++)
    {
        if (item.equals(strings[i])) return i;
    }

    return -1;

  }
  public static int input(String[] strings)
  {
    Scanner input = new Scanner(System.in);
    String choice = "null";
    while (! Arrays.asList(strings).contains(choice))
    {
      if (choice != "null") System.out.println("Invalid input");
      choice = input.next();
    }

    return getIndexOf(strings,choice);

  }
  public static void main(String args[])
  {
    String[] options = {"Rock" , "Paper" , "Scissors"};
    String[] boolReply = {"No" , "Yes"};
    String[] endStates = {"Tied" , "Lose" , "Win"};

    Random rand = new Random();
    Boolean repeat = true;
    while (repeat)
    {
      int atkMove = rand.nextInt(3);
      System.out.println("Rock, Paper, Scissors, Shoot! (Type Rock, Paper, or Scissors)");
      int defMove = input(options);

      System.out.printf("Your opponent chose %s!%n", options[atkMove]);
      System.out.printf("You %s!%n",endStates[(9+atkMove-defMove)%3]);
      System.out.println("Would you like to go again?(Yes/No)");

      repeat = (input(boolReply) != 0);
    }
    System.out.println("Well thanks for playing!");
  }
}

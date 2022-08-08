//Author Abner Acosta
//Date July 30 2022
// CS 21
import java.util.*;
public class Guess 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int totalGames = 1; 
        int totalGuesses = 0;
        int max = 0;
        while(true) 
        {
            int number = 1 + (int)(Math.random() * ((99) + 1));
            System.out.println("This is a guessing game!!!!");
            System.out.println("Choose the correct number to win the game");
            int count = 0;
            while(true) 
            {
                System.out.print("Your guess? ");
                int guess = input.nextInt();
                count++;
                if(guess < number)
                System.out.println("higher");
                else if(guess > number)
                System.out.println("lower");
                else 
                {
                    System.out.println("You got it right in " + count + " guesses");
                    break;
                }

            }
            totalGuesses += count;
            if(count > max)
            max = count;
            input.nextLine();
            System.out.print("Do you want to play again? ");
            String choice = input.nextLine();
            if(!choice.equals("y") && !choice.equals("Y") && !choice.equals("yes") && !choice.equals("YES"))
            break;
            totalGames++;
            System.out.println("I'm thinking of a number...");
        }
        System.out.println("Overall results:");
        System.out.println("====================");
        System.out.println("Total games: " + totalGames);
        System.out.println("Total guesses: " + totalGuesses);
        System.out.println("Guesses/game: " + totalGuesses / totalGames);
        System.out.println("Max guesses: " + max);
    }
}


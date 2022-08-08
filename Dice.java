//Author: Abner Acosta
//Date: July 14, 2022
//Cs 21 Intro to Java
import java.util.Random;
public class Dice
{
    public static void main(String[] args)
    {
        int sum = 0;
        int attempt = 0;
        while(sum !=7)
        {
        //Dice1
        Random dice1 = new Random();
        int result1 = dice1.nextInt(6);
        result1++;
        
        //Dice2
        Random dice2 = new Random();
        int result2 = dice2.nextInt(6);
        result2++;
        
        //Adding the two dices
        sum = result1 + result2;
        attempt++;

        System.out.println("Dice 1: " + result1 + ". Dice 2: " + result2 + ". The sum is: " + sum);
        }
        System.out.println("It took " + attempt + " tries to get to the sum of 7.");
        

        
        
    }
}
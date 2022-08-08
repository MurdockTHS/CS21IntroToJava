//Author: Abner Acosta
//Date: July 5, 2022
//CS 21 Intro to Java
import java.util.*;
public class Equality
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Do you have a job? Please respond with yes or no.");
        String response = console.next();
        if(response.equalsIgnoreCase("yes") )
        {
            System.out.println("You are the breadwinner!");
        }
        else if (response.equalsIgnoreCase("no"))
        {
            System.out.println("Keep searching, you will find one!");
        }
        else
        {
            System.out.println("I feel bad for you son. I got 99 problems and the way you responded is one of them!!!!!");
        }
    }
}
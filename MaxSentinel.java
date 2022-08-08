//Author: Abner Acosta
//Date: July 14, 2022
//CS21 Intro to Java
import java.util.*;
public class MaxSentinel
{
    public static void main(String[] args)
    {
        int cap = 0;
        int num = 0;
        
        Scanner console =  new Scanner(System.in);
        System.out.println("Enter a number. When done enter -1.");
    
        do
        {
            System.out.println("Enter a number: ");
            num = console.nextInt();
            if(num == -1)
            {
                break;
            }

            if(cap < num)
            {
                cap = num;
            }
        }
        while(num != -1);
        System.out.println("The max is numbers that you entered was: " + cap);
    }
}



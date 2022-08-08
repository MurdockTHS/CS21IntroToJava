//Author Abner Acosta
//Date: july 15, 2022
//Cs 21 Intro to Java
import java.util.*;

class MaxSentinel2
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int num = 0;
        int cap = -1;
        System.out.print("Enter positive integers. Press -1 to exit: ");
        num = console.nextInt();
        if(num < 0)
        {
            System.out.println("Invalid entry!!!!");
            System.out.print("Please enter a positive integers. Press -1 to exit: ");
            num = console.nextInt();
        }
        while(num != -1)
        {
            if(num > cap)
            cap = num;
            System.out.print("Enter positive integers. Press -1 to exit: ");
            num = console.nextInt();
        }
        System.out.println("Largest number: " + cap);
    }
}
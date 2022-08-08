//Author Abner Acosta
// July 28, 2022
// CS21
import java.lang.Math.*;
public class Flip
{
    public static void main(String args[]) 
    {
        int randomArr[] = new int[25];
        int i;
        for(i = 0;i < 25;i++) 
        {
            randomArr[i]=(int) ((Math.random() * (49)) + 1);
        }
        System.out.println();
        System.out.println("Array (Between 1 - 50)");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        for(i = 0;i < 25;i++)
        {
            System.out.print(randomArr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed Array");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        for(i = 24;i >= 0;i--) 
        {
            System.out.print(randomArr[i]+" ");
        }
    }
}
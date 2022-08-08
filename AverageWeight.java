//Author: Abner Acosta
//Date: July 27 2022
//Cs 21
import java.util.*;

public class AverageWeight
{
    public static void main(String[] args)
    {
        
        String [] names = new String[3];
        float [] weight = new float[3];
        for(int i = 0;i < 3; i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a name:");
            names[i] = input.nextLine();
            System.out.print("Please enter the weights: ");
            weight[i] = input.nextFloat();
            System.out.println();
            
        }
        float sum = 0;
        for(int i = 0;i < 3; i++)
        {
            System.out.print(names[i] + ":");
            System.out.print(weight[i] + "lbs ");
            sum = sum + weight[i];
            
        }
        System.out.println();
        System.out.printf("Average Weight = %.2f lbs",sum / 3);
    }
}

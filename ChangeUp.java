//Author: Abner Acosta
//Date July 29, 2022
// CS21
import java.util.*;
import java.util.Random;

public class ChangeUp
{
    public static void main(String [] args)
    {
        int[] empty = new int[6];
        populateArray(empty);
        printArray(empty);
        System.out.println();
    }
    public static void printArray(int[] array)
    {
        System.out.println("New array: ");
        for(int a = 0;a < array.length; a++)
        { 
            System.out.print(array[a]);
            System.out.println();
        }
    }
    public static void populateArray(int[] array)
    {
        Random randomarray = new Random();
        Scanner input = new Scanner(System.in);
        int i = randomarray.nextInt(5) + 1;
        System.out.println("Choose a number for index " + i + ":");
        array[i] = input.nextInt();
    }
}


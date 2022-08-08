//Author: Abner Acosta
//Date: July 14, 2022
//CS 21 Intro to Java

import java.util.*;
public class Spoiled
{
   public static void main(String args[])
   {
       Scanner console = new Scanner(System.in);
       System.out.println("How many siblings do you have?");
       boolean ST; // ST for spoil test
       int siblings = console.nextInt();
       ST = spoilTest(siblings);
       
   }
   public static boolean spoilTest(int input)
   {
       boolean response = false;
       if(input == 0)
       {
           response = false;
           System.out.println("You are spoiled!");
       }
       else if(input > 0)
       {
           response = true;
           System.out.println("You're not spoiled!");
       }
       return response;
   }
}

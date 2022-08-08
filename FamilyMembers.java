//Author: Abner Acosta
//Date: July 5, 2022
//CS 21 Intro to Java
import java.util.*;
public class FamilyMembers
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("How many family members do you have?");
        int familyCount = console.nextInt();
        if(familyCount < 2)
        {
            System.out.println("You are single huh!?");
        }
        else if(familyCount >= 2 && familyCount <=4 )
        {
            System.out.println("That's pretty normal!");
        }
        else if(familyCount >= 5 && familyCount <=7)
        {
            System.out.println("You have a big family!");
        }
        else if(familyCount == 8 || familyCount == 9)
        {
            System.out.println("I assume you have no wifi!");
        }
        else if(familyCount >= 10)
        {
            System.out.println("WOW, can I join your family?");
        }
    }
}
//Author: Abner Acosta
//Date: July 1, 2022
//Cs 21 Java
import java.util.*;
public class StringIndex
{
    public static void main (String[] args)
    {
        String name = "Abner Acosta";
        printIndex(name);
    }
    public static void printIndex(String name)
    {
  
        for(int index = 0; index < name.length();index++)
        {
            System.out.println(index + ": " + name.charAt(index));
        }
    }
}
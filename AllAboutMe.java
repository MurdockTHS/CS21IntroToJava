//Author Abner Acosta
//Date: July 21 2022
//CS21
import java.util.*;
import java.io.*;

public class AllAboutMe
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner read = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = read.nextLine();
        
        System.out.println("What is your favorite color?");
        String color = read.nextLine();
        
        System.out.println("Name three of your hobbies");
        System.out.println("Hobby 1: ");
        String hob1 = read.nextLine();
        
        System.out.println("Hobby 2: ");
        String hob2 = read.nextLine();
        
        System.out.println("Hobby 3: ");
        String hob3 = read.nextLine();
        
        //All about me text file
        File file = new File("AllAboutMe.txt");
        
        PrintStream printStream = new PrintStream(file);
        printStream.println("Your name is: " + name);
        printStream.println("Your favorites color is: " + color);
        printStream.println("Your hobbies are: " + hob1 + ", " + hob2 + ",and " + hob3);
        
        
    }
}

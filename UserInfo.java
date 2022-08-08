// Name: Abner Acosta
// Date: June 30, 2022
// Course: CS21
import java.util.*;
public class UserInfo
{
    public static void main(String[] args)
    {
        RepeatThree();
    }
    public static void RepeatThree()
    {
        for(int i = 0; i < 3; i++)
        {
            Scanner console = new Scanner(System.in);
            //Name input
            System.out.println("Enter your full name: ");
            String fullName = console.nextLine();
            
            //Middle input
            System.out.println("Enter your middle intial: ");
            String middleIntial = console.next();
            console.nextLine();
        
            //Age Input
            System.out.println("Enter your age: ");
            int age = console.nextInt();
            console.nextLine();
        
            //Major input
            System.out.println("Enter your major: ");
            String major = console.nextLine();            
            
            //Gpa input
            System.out.println("Enter your GPA: ");
            double GPA = console.nextDouble();
        
            //Outputs
            System.out.println("Full name: " + fullName);
            System.out.println("Middle Intial: " + middleIntial);
            System.out.println("Age: " + age);
            System.out.println("Major: " + major);
            System.out.println("GPA: " + GPA);
            System.out.println();
            
        }
    }
}
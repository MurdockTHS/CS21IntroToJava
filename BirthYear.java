// Author: Abner Acosta
// Date: June 28, 2022
// Course: CS 21 Java
public class BirthYear
{
    public static void main(String[] args)
    {
        CalculateAge();
    }
    public static void CalculateAge()
    {   
        int currentYear = 2022;
        int birthYear = 1997;
        int age = currentYear - birthYear;
        DisplayAge(age);
    }
    public static void DisplayAge(int age)
    {
        System.out.println("You are (or will be): " + age); 
    }
}

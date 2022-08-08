// Name: Abner Acosta
// Date: June 21, 2022
// Course: CS21
public class CountDown
{
public static void main(String[] args)
{
    System.out.println("\"This is a countdown!\"");
    int i;
    for (i = 25; i >= 0; i--)
    {
        System.out.println(i);
        if(i == 0)
        {
            System.out.println("\"Blast Off!\"");
        }
    }
}
}
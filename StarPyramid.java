// Name: Abner Acosta
// Date: June 21, 2022
// Course: CS21
public class StarPyramid
{
  public static void main(String[] args) 
  { 

    for (int i = 1; i <= 5; ++i)
    {
        for (int b = 1; b <= 5 - i; ++b) 
        {
            System.out.print(" ");
        }
        for(int k = 1; k <= 2 * i - 1; ++k)
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }
}


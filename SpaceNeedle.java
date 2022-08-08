// Name: Abner Acosta
// Date: June 30, 2022
// Course: CS21
public class SpaceNeedle
{
  final static int scale = 4;//Scale the whole space need.The scale varible is withing the mutiple methods that create the size of the needle.
  
  //A thin line that will go on top of the needle and above the Girth method
  public static void Pole()
  {
      for(int i = 1;i <= scale; i++)
      {
          for(int j = 1;j <= scale * 3;j++)
          {
              System.out.print(" ");
          }
          System.out.println("||");
      }
  }
  //First part of the top of the needle and also the base
  public static void TopHalf()
  {
      for (int i = 1; i <= scale; i++) 
      {
            for (int j = 1; j <= scale - i;j++) 
            {
                System.out.print("   ");
            }
            System.out.print("  /");
            for (int k = 1; k <= i-1;k++) 
            {
                System.out.print(":::");
            }
            System.out.print("||");
            for (int m = 1; m <= i - 1;m++) 
            {
                System.out.print(":::");
            }
            System.out.println("\\  ");
        }
  }
  // Just one line of text that divides the TopHalf method and BottomHalf method also the very bottom line of output
  public static void MidStrip()
  {
       System.out.print("|");
      for (int i = 1; i <= scale; i++) 
      {
         System.out.print("\"\"\"\"\"\"");
      }
      System.out.println("|");
  }
  //Below the MidStrip method that outputs the \/\/\/\/\/\
  public static void BottomHalf()
  {
      for (int i = 1; i <= scale; i++) 
      {
         for (int j = 1; j <= (i * 2)- 2; j++) 
         {
            System.out.print(" ");
         }
         System.out.print("\\ ");
         for (int k = 1; k <= (((scale * 3) +1 ) - (i * 2)); k++) 
         {
            System.out.print("/\\");
         }
         System.out.println(" /");
      }
  }
  //This outputs the girthy part of the spaceneedle 
  public static void Girth() 
  {
        for (int i = 1; i <= scale * scale; i++) 
        {
            for (int j = 1; j <= (scale * 3) - 3; j++) 
            {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }
  
  public static void main(String[] args) 
  {
      Pole();
      TopHalf();
      MidStrip();
      BottomHalf();
      Pole();
      Girth();
      TopHalf();
      MidStrip();
  }
}

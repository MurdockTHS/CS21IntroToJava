//Author Abner Acosta
//Date july 22, 2022
//cs 21
import java.util.*;
import java.io.*;
public class Hamlet2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("hamlet.txt");
        Scanner fileRead = new Scanner(file);
        int andCount = 0;
        String word = "";
        while(fileRead.hasNextLine())
        {
            Scanner lookthrough = new Scanner(fileRead.nextLine());
            while (lookthrough.hasNext())
            {
                String andScan = lookthrough.next();
                if(andScan.equals("and") || andScan.equals("And"))
                {
                    andCount++;
                }
            }
        }
        System.out.println("And count: " + andCount);
    }
}
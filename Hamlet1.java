//Author Abner Acosta
//Date july 22, 2022
//cs 21
import java.io.*;
import java.util.*;

public class Hamlet1 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner fileread = new Scanner(new File("hamlet.txt"));
        int tokens = 0;
        while (fileread.hasNext())
        {
            fileread.next();
            tokens++;
        }
        fileread.close();
        System.out.println(tokens);
    }
}
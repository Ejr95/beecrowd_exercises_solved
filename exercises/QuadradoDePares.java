import java.util.Scanner;
import java.lang.Math;

public class QuadradoDePares
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

       for (int i = 1;i<=n;i++ )
       {
           if (i % 2 == 0)
           {
               System.out.println(i+"^"+"2"+"="+(int) Math.pow(i, 2));
           }

       }

    }





}


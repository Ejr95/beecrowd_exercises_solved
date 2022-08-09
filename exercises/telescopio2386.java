import java.io.IOException;
import java.util.Scanner;

public class telescopio2386 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();

        int cal=0;
        for(int i =0; i<n; i++)
        {
            int f[]=new int[n];
            f[i] = scan.nextInt();
            if(a*f[i] >=40000000 )
            {
                cal++;
            }
        }
        scan.close();
        System.out.println(cal);

    }

}
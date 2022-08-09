import java.util.Scanner;
import java.lang.Math;


public class formulabaskhara {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        scan.close();
        double x,y,delta,sqrt;
        delta = Math.pow(b,2) - (4*a*c);
        if(a==0||delta<0)
        {
            System.out.println("Impossivel calcular");

        }
        else
        {
            sqrt = Math.sqrt(delta);
            x= ((1*-b) + sqrt)/(2*a);
            y= ((-1*b) - sqrt)/(2*a);

            System.out.print("R1 = ");
            System.out.format("%.5f",x);
            System.out.println();
            System.out.print("R2 = ");
            System.out.format("%.5f",y);
            System.out.println();

        }




    }

}

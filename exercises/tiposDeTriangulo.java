import java.util.Scanner;
import java.lang.Math;

public class tiposDeTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double aa = Math.max(a,Math.max(b,c));
        double bb = 0;
        double cc = 0;

        if(aa == a)
        {
            bb = Math.max(b,c);
            cc = Math.min(b,c);
        }

        if(aa == b)
        {
            bb = Math.max(a,c);
            cc = Math.min(a,c);
        }

        if(aa == c)
        {
            bb = Math.max(b,a);
            cc = Math.min(b,a);
        }


        if(aa>=bb+cc)
        {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            double v = Math.pow(bb, 2) + Math.pow(cc, 2);
            double sqrt = Math.sqrt(v);
            if (aa  ==sqrt )
            {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(aa,2)> v)
            {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(aa,2)< v)
            {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(aa==bb&bb==cc)
            {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((aa==bb)&&(aa!=cc)||(aa==cc)&&(aa!=bb)||(bb==cc)&&(bb!=aa))
            {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }


    }

}

import java.util.Scanner;
import java.util.Locale;

public class coornedasDeumPonto {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        scan.close();
        if(x==0&y==0)
        {
            System.out.println("Origem");
        }
        else if(x!=0&y==0)
        {
            System.out.println("Eixo X");
        }
        else if(y!=0&x==0)
        {
            System.out.println("Eixo Y");
        }
        else if (x>0&y>0)
        {
            System.out.println("Q1");
        }
        else if (x<0&y>0)
        {
            System.out.println("Q2");
        }
        else if (x<0&y<0)
        {
            System.out.println("Q3");
        }
        else if (x>0&y<0)
        {
            System.out.println("Q4");
        }

    }

}

import java.util.Scanner;
import  java.util.Locale;

public class lanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();
        scan.close();

        double total = 0 ;

        if(codigo == 1)
        {
            total = quantidade*4;
            System.out.print("Total: R$ ");
            System.out.format("%.2f",total);
            System.out.println();

        }
        else if(codigo ==2)
        {
            total = quantidade*4.5;
            System.out.print("Total: R$ ");
            System.out.format("%.2f",total);
            System.out.println();
        }
        else if (codigo == 3)
        {
            total = quantidade*5;
            System.out.print("Total: R$ ");
            System.out.format("%.2f",total);
            System.out.println();
        }
        else if (codigo == 4)
        {
            total = quantidade*2;
            System.out.print("Total: R$ ");
            System.out.format("%.2f",total);
            System.out.println();
        }
        else if (codigo == 5)
        {
            total = quantidade*1.5;
            System.out.print("Total: R$ ");
            System.out.format("%.2f",total);
            System.out.println();
        }


    }
}

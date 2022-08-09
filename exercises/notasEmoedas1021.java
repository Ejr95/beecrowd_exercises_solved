import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class notasEmoedas1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        scan.close();
        int cem,ciquenta,vinte,dez,cinco,dois;
        int um,ciquentaCen,vinteEcinco,dezCen,cincoCen,umCen;
        
        cem = (int) valor/100;
        valor = valor%100;

        ciquenta = (int)valor/50;
        valor = valor%50;

        vinte =(int) valor/20;
        valor = valor%20;

        dez = (int)valor/10;
        valor = valor%10;

        cinco = (int) valor/5;
        valor = valor%5;

        dois = (int)valor/2;
        valor = valor%2;


        valor = valor*100;

        um = (int) valor /100;
        valor = valor%100;

        ciquentaCen = (int)valor /50;
        valor = valor%50;

        vinteEcinco = (int)valor /25;
        valor = valor%25;

        dezCen = (int) valor /10;
        valor = valor%10;

        cincoCen= (int) valor/5;
        valor = valor%5;

        umCen = (int)valor;


        System.out.println("NOTAS:");
        System.out.println(cem+" nota(s) de R$ 100.00");
        System.out.println(ciquenta+" nota(s) de R$ 50.00");
        System.out.println(vinte+" nota(s) de R$ 20.00");
        System.out.println(dez+" nota(s) de R$ 10.00");
        System.out.println(cinco+" nota(s) de R$ 5.00");
        System.out.println(dois+" nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(um+" moeda(s) de R$ 1.00");
        System.out.println(ciquentaCen+" moeda(s) de R$ 0.50");
        System.out.println(vinteEcinco+" moeda(s) de R$ 0.25");
        System.out.println(dezCen+" moeda(s) de R$ 0.10");
        System.out.println(cincoCen+" moeda(s) de R$ 0.05");
        System.out.println(umCen+" moeda(s) de R$ 0.01");

    }
}

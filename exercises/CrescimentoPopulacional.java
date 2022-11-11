import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        int pa = 0, pb = 0, pfa = 0, pfb = 0, anos = 0;
        double g1 = 0f, g2 = 0f;
        for (int i = 0; i < casos; i++) {
            pa = scan.nextInt();
            pfa = pa;

            pb = scan.nextInt();
            pfb = pb;

            g1 = scan.nextFloat();
            g1 = g1 / 100;


            g2 = scan.nextFloat();
            g2 = g2 / 100;

            do {
                pfa += pfa * g1;

                pfb += pfb * g2;
                anos++;
                if (anos > 100) {
                    System.out.println("Mais de 1 seculo.");
                    anos = 0;
                    break;
                }
                if (pfa > pfb) {
                    System.out.println(anos + " anos.");
                    anos = 0;
                    break;
                }
            } while (true);


        }


    }
}

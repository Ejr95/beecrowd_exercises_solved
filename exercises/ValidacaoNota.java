import java.util.*;

public class ValidacaoNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(new Locale("en","US"));
        double nota1 = 0;
        double nota2 = 0;
        double media = 0, aux1 = 0, aux2 = 0;
        do {
            nota1 = scan.nextDouble();
            if (nota1 >= 0 & nota1 <= 10) {
                aux1 = nota1;
            } else {
                System.out.println("nota invalida");
                nota1 = scan.nextDouble();
                aux1 = nota1;
            }
            nota2 = scan.nextDouble();
            if (nota2 >= 0 & nota2 <= 10) {
                aux2 = nota2;
            } else {
                System.out.println("nota invalida");
                nota2 = scan.nextDouble();
                aux2 = nota2;
            }
            if (aux1 > 0 & aux1 <= 10 & aux2 <= 10 & aux2 > 0) {
                media = (aux1 + aux2) / 2;
                System.out.print("media = ");
                System.out.printf("%.2f ", media);
                System.out.println();

                break;
            }
        } while (true);

    }
}

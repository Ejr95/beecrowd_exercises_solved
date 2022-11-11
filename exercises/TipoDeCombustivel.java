import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0, opcao = 0;
        while ((opcao != 4)) {
            opcao = scan.nextInt();
            if (opcao == 1) {
                cont1++;
            } else if (opcao == 2) {
                cont2++;
            } else if (opcao == 3) {
                cont3++;
            }

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + cont1);
        System.out.println("Gasolina: " + cont2);
        System.out.println("Diesel: " + cont3);
    }
}

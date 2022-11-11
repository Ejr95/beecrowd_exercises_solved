import java.util.Scanner;

public class SequenciaFibonnaci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros = scan.nextInt();
        int soma = 0, anterior = 0, atual = 1;
        for (int i = 1; i <= numeros; i++) {

            if (i != numeros) {
                System.out.print(soma + " ");
                soma = anterior + atual;
                atual = anterior;
                anterior = soma;


            } else {
                System.out.println(soma);
            }
        }
    }
}

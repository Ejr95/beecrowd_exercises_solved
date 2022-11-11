import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int aux = 0, soma = 1;
        int cont =1;
        while (cont<n) {
            aux = n-cont;
            soma *=aux;
            cont++;
        }
        System.out.println(soma*n);
    }
}

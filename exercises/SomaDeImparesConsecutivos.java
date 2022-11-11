import java.util.Scanner;

public class SomaDeImparesConsecutivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int x = 0, y = 0, cont = 0, soma = 0;
        for (int i = 1; i <= numero; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            while (cont !=y) {
                if (x % 2 != 0) {
                    soma += x;
                    cont++;
                }
                    x++;
            }
        }
        System.out.println(soma);
    }
}

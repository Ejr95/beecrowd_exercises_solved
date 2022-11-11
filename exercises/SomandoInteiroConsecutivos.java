import java.util.Scanner;

public class SomandoInteiroConsecutivos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 0, b = 0, soma = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        if (b <= 0) {
            while (b <= 0) {
                b = scan.nextInt();
            }
        }

        for (int i = 0; i <= b - 1; i++) {
            soma += a + i;
        }

        System.out.println(soma);
        scan.close();
    }
}

import java.util.*;

public class SequenciaDeNumerosSoma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int soma = 0;
        do {
            x = scan.nextInt();
            y = scan.nextInt();

            if (x < y) {
                if (x <= 0 || y <= 0) {
                    break;
                } else {
                    for (int i = x; i <= y; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                    System.out.println("Sum=" + soma);
                    soma = 0;
                }
            } else {

                if (x <= 0 || y <= 0) {
                    break;
                } else {
                    for (int i = y; i <= x; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                    System.out.println("Sum=" + soma);
                    soma = 0;
                }
            }


        } while (true);
    }
}

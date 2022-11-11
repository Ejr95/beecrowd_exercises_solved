import java.util.Scanner;

public class RespostaCerta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhas = scan.nextInt();
        int[] respostas = new int[linhas+1];
        for (int i = 1; i <= linhas; i++) {
            respostas[i] = scan.nextInt();
        }
        for (int k = 1; k <= linhas; k++) {
            System.out.println("resposta " + k + ": " + respostas[k]);
        }

    }
}

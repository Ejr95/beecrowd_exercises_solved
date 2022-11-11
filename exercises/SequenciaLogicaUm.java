import java.util.Scanner;

public class SequenciaLogicaUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();


        for(int i=1; i<=linhas ; i++)
        {
            System.out.printf("%d %d %d\n%d %d %d\n", i, (i*i),(i*i*i), i, (i*i)+1, (i*i*i)+1);

        }
    }
}

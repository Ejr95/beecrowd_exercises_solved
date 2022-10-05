import java.util.*;

public class CrescenteDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do {
            x = scan.nextInt();
            y = scan.nextInt();
            if (x == y) break;
            if (x > y) {
                System.out.println("Decrescente");

            } else {
                System.out.println("Crescente");
            }
        } while (true);

    }

}

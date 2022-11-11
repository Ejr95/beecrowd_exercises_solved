import java.util.*;

public class Pum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cont = 1;
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println("PUM");
            cont++;
        }
    }
}

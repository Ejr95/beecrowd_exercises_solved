import java.util.Scanner;

public class identificandoCha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();


        int cont = 0;
        if (t == a) {
            cont++;
        }
        if (t == b) {
            cont++;
        }
        if (t == c) {
            cont++;
        }
        if (t == d) {
            cont++;
        }
        if (t == e) {
            cont++;
        }
        System.out.println(cont);
    }
}

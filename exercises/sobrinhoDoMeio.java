import java.util.Scanner;

public class sobrinhoDoMeio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = 0, z = 0, l = 0;
        while (scan.hasNext()) {
            h = scan.nextInt();
            z = scan.nextInt();
            l = scan.nextInt();
            if ((h > z & h < l) | (h > l & h < z)) {
                System.out.println("huguinho");
            }
            if ((z > h & z < l) | (z > l & z < h)) {
                System.out.println("zezinho");
            }
            if ((l > z & l < h) | (l > h & l < z)) {
                System.out.println("luisinho");
            }
        }
    }
}

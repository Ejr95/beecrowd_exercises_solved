import java.util.Scanner;

public class Palavrao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = "";
        while (scan.hasNext()) {
            palavra = scan.next();
            if (palavra.length() >= 10) System.out.println("palavrao");
            else System.out.println("palavrinha");
        }


    }
}

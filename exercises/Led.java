import java.util.Scanner;

public class Led {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String led = "";
        char caracter;
        int cont = 0;
        int [] soma = new int [n];
        for (int i = 0; i < n; i++) {

            led = scan.next();

            for (int j = 0; j < led.length(); j++) {
                caracter = led.charAt(j);
                if (caracter == '1') {
                    cont += 2;
                }
                if (caracter == '2') {
                    cont += 5;
                }
                if (caracter == '3') {
                    cont += 5;
                }
                if (caracter == '4') {
                    cont += 4;
                }
                if (caracter == '5') {
                    cont += 5;
                }
                if (caracter == '6') {
                    cont += 6;
                }
                if (caracter == '7') {
                    cont += 3;
                }
                if (caracter == '8') {
                    cont += 7;
                }
                if (caracter == '9') {
                    cont += 6;
                }
                if (caracter == '0') {
                    cont += 6;
                }

            }
            soma [i] = cont ;
            cont = 0;

        }

        for(int k=0; k<n; k++)
        {
            System.out.println(soma[k] + " leds");
        }
    }
}

import java.util.Scanner;

public class SomaDeParesConsecutivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0, cont = 0, soma = 0, aux = 0;
        do {
            numero = scan.nextInt();
            if(numero == 0) break;
            while (cont != 5) {
                if (numero % 2 == 0) {
                    aux += numero;
                    cont++;
                }
                numero++;
                if(cont ==5){
                    soma = aux;
                    aux = 0;
                }
            }
            cont = 0;
            System.out.println(soma);

        } while (true);
    }
}

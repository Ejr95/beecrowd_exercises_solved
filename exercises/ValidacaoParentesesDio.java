import java.util.*;

public class ValidacaoParentesesDio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }


    public static boolean ehValido(String s) {
        char letra;
        boolean erroA = false, erroB = false;
        int contA = 0, contB = 0;
        for (int i = 0; i < s.length(); i++) {
            letra = s.charAt(i);


            if (letra == '(') {
                contA++;
            }
            if (letra == '[') {
                contB++;
            }
            if (contA == 0) {
                if (letra == ')') {
                    erroA = true;
                }
            }
            if (contB == 0) {
                if (letra == ']') {
                    erroB = true;
                }
            }
            if (contA == 1) {
                if (letra == ')') {
                    contA--;
                }
            }
            if (contB == 1) {
                if (letra == ']') {
                    contB--;
                }
            }
        }
        if (erroA || erroB) return false;
        return true;
    }
}


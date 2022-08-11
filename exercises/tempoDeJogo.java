import java.util.Scanner;

public class tempoDeJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hrInicial = scan.nextInt();

        int hrFinal = scan.nextInt();

        int minInicialTotal = (hrInicial*60) ;
        int minFinalTotal = (hrFinal*60);

        int horas = (minFinalTotal - minInicialTotal)/60;

        if(horas<=0)
        {
            horas+=24;
        }

        if (horas==0)
        {
            horas = 24;
        }

        if (hrInicial == hrFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");

        }
    }
}

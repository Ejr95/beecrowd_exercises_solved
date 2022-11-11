import java.util.*;

public class Grenais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int golsInter = 0, golsGremio = 0, opcao = 1, empate = 0, vitoriaGremio = 0, vitoriaInter = 0, numeroJogos = 0;

        while (opcao == 1) {
            numeroJogos++;
            golsInter = scan.nextInt();
            golsGremio = scan.nextInt();
            if (golsInter == golsGremio) {
                empate++;
            }
            if (golsInter > golsGremio) {
                vitoriaInter++;
            }
            if (golsGremio > golsInter) {
                vitoriaGremio++;
            }

            do {
                System.out.println("Novo grenal (1-sim 2-nao)");
                opcao = scan.nextInt();
                if (opcao == 1) {
                    numeroJogos++;
                    golsInter = scan.nextInt();
                    golsGremio = scan.nextInt();

                    if (golsInter == golsGremio) {
                        empate++;
                    }
                    if (golsInter > golsGremio) {
                        vitoriaInter++;
                    }
                    if (golsGremio > golsInter) {
                        vitoriaGremio++;
                    }

                } else {
                    break;
                }
            } while (true);
        }
        System.out.println(numeroJogos + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);
        if (vitoriaInter > vitoriaGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriaGremio > vitoriaInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}

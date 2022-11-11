

public class SequenciaS {
    public static void main(String[] args) {
        float soma = 0;
        for (int i = 2; i <= 100; i++) {
            soma += (float) 1 / (float) i;
        }
        soma += 1;
        System.out.printf("%.2f", soma);
        System.out.println();
    }
}

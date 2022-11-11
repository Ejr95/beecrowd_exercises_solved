public class SequenciaSii {
    public static void main(String[] args) {
        float soma = 0, aux = 2;
        for (int i = 3; i <= 39; i += 2) {
            soma += i / aux;
            aux = aux * 2;
        }
        soma += 1;
        System.out.printf("%.2f", soma);
        System.out.println();
    }
}

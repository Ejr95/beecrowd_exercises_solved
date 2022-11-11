import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int cont =0,conTotal=0;
        for(int i=0;i<numero; i++ )
        {

            cont++;
            conTotal = cont;

            for(int j=0;j<3;j++)
            {
                if(j==2)
                {
                    int cubo = (int) Math.pow(cont,3);
                    System.out.print(cubo+" ");
                    break;

                }
                System.out.print(conTotal+" ");

                conTotal *=conTotal;

            }

            System.out.println();
        }

    }
}

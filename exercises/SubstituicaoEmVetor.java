import java.util.Scanner;

public class SubstituicaoEmVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] x = new int[10];
        for(int i=0; i<10; i++)
        {
            x [i] = scan.nextInt();

        }
        for(int k=0; k<10;k++){
            if( x[k]<=0 )
            {
                x[k] = 1;
                System.out.println("X"+"["+k+"]"+" = "+x[k] );
            }
            else
            {
                System.out.println("X"+"["+k+"]"+" = "+x[k]);
            }
        }

    }
}

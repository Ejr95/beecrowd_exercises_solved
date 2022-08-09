import java.util.Scanner;

public class intervalo {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        double A = scan.nextDouble();
        scan.close();
        if(A>=0&&A<=25)
        {
            System.out.println("Intervalo [0,25]") ;
        }
        else if(A>25&&A<=50)
        {
            System.out.println("Intervalo (25,50]") ;
        }
        else if(A>50&&A<=75)
        {
            System.out.println("Intervalo (50,75]") ;
        }
        else if(A>75&&A<=100)
        {
            System.out.println("Intervalo (75,100]") ;
        }
        else
        {
            System.out.println("Fora de intervalo");
        }



    }
}

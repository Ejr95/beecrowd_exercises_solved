import java.util.Scanner;

public class numeroPerfeito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int aux=0,caso=0;
        for (int i=0; i<num;i++){
            caso = scan.nextInt();
            for(int k=1;k<caso; k++){
                if(caso%k==0){
                    aux +=k;
                }
            }
            if(caso == aux){
                System.out.println( caso+" eh perfeito");
                aux=0;
            }
            else{
                System.out.println(caso +" nao eh perfeito");
                aux=0;
            }
        }
    }
}

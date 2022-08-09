import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

public class animal1049 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String palavra1 = scan.nextLine();

        String palavra2 = scan.nextLine();

        String palavra3 = scan.nextLine();

        if(
                Objects.equals(palavra1, "vertebrado") & Objects.equals(palavra2, "ave") & Objects.equals(palavra3, "carnivoro"))
        {
            System.out.println("aguia");
        }
        else if( Objects.equals(palavra1, "vertebrado") & Objects.equals(palavra2, "ave") & Objects.equals(palavra3, "onivoro"))
        {
            System.out.println("pomba");
        }
        else if (Objects.equals(palavra1, "vertebrado") & Objects.equals(palavra2, "mamifero") & Objects.equals(palavra3, "onivoro"))
        {
            System.out.println("homem");
        }
        else if ( Objects.equals(palavra1, "vertebrado") & Objects.equals(palavra2, "mamifero") & Objects.equals(palavra3, "herbivoro"))
        {
            System.out.println("vaca");
        }
        else if ( Objects.equals(palavra1, "invertebrado") & Objects.equals(palavra2, "inseto") & Objects.equals(palavra3, "hematofago"))
        {
            System.out.println("pulga");
        }
        else if  ( Objects.equals(palavra1, "invertebrado") & Objects.equals(palavra2, "inseto") & Objects.equals(palavra3, "herbivoro"))
        {
            System.out.println("lagarta");
        }
        else if  ( Objects.equals(palavra1, "invertebrado") & Objects.equals(palavra2, "anelideo") & Objects.equals(palavra3, "hematofago"))
        {
            System.out.println("sanguessuga");
        }
        else if  ( Objects.equals(palavra1, "invertebrado") & Objects.equals(palavra2, "anelideo") & Objects.equals(palavra3, "onivoro"))
        {
            System.out.println("minhoca");
        }
    }
}

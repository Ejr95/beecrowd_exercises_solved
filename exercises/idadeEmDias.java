
import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int days = scan.nextInt();
        scan.close();
        int year,month,day;
        year=days/365;
        days=days%365;
        month=days/30;
        days=days%30;
        day=days;


        System.out.println(year+" ano (s)");
        System.out.println(month+" mes (es)");
        System.out.println(day+" dia (s)");
    }
}

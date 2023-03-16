import java.util.Scanner;
public class zadanie17 {
    public static void main (String[] args){
        Scanner dane = new Scanner(System.in);

        double posilek, zpodatkiem;


        System.out.println("Podaj cen posilku: ");
        posilek=dane.nextInt();
        dane.nextLine();

        zpodatkiem=posilek+(posilek*0.0675)+(posilek*0.2);

        System.out.println("Cena posilku wynosi:" + posilek);
        System.out.println("Podatek wynosi:" + posilek*0.0675);
        System.out.println("Cena napiwku wynosi:" + posilek*0.2);
        System.out.println("Cena z podatkiem i napiwkiem wynosi:" + zpodatkiem);
    }
}

import java.util.Scanner;
public class zadanie16 {
    public static void main (String[] args){
        Scanner dane = new Scanner(System.in);

        String miasto,duze,male;
        System.out.println("Podaj nazwe swojego ulubionego miasta: ");
        miasto = dane.next();

        int dlugosc;
        dlugosc = miasto.length();

        char inicjal = miasto.charAt(0);
        male=miasto.toLowerCase();
        duze=miasto.toUpperCase();

        System.out.println("Liczba znakow nazwy miasta: " + dlugosc);
        System.out.println("Miasto małymi znakami: " + male);
        System.out.println("Miasto duzymi znakami" + duze);
        System.out.println("Pierwszy znak miasta: " + inicjal);


    }
}

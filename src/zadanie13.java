import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args) {
        int zjedzoneciastka, kolriecastko, kalorie;

        kolriecastko = 300/4;

        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj ilosc zjedzonych ciasteczek: ");
        zjedzoneciastka = dane.nextInt();
        dane.nextLine();

        kalorie = zjedzoneciastka*kolriecastko;

        System.out.println("Ilosc zjedzonych ciastek: " + zjedzoneciastka + " Ilosc kalori: " + kalorie);
    }
}
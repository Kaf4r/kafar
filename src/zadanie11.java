import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        int wartoscproduktu;

        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj wartosc produktow: ");
        wartoscproduktu = dane.nextInt();
        dane.nextLine();

        double podatek1 = wartoscproduktu*0.02;
        double podatek2 = wartoscproduktu*0.04;

        double wartoscall = wartoscproduktu + podatek2 + podatek1;

        System.out.println("Suma wartosci: " + wartoscall + " podatek stanowy: " + podatek2 + " podatek lokalny: " + podatek1);
    }
}
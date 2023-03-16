import java.util.Scanner;
public class zadanie9 {
    public static void main(String[] args) {
        String name;
        int age;
        double anualPay;

        Scanner dane = new Scanner(System.in);

        System.out.println("Jak sie nazywasz: ");
        name = dane.nextLine();

        System.out.println("Podaj swoj wiek: ");
        age = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj oczekiwany roczny dochod: ");
        anualPay = dane.nextInt();
        dane.nextLine();

        System.out.println("Nazywam się " + name + ". Mam " + age + " lat i chcę zarabiac " + anualPay);

    }
}

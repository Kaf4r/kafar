import java.util.Scanner;

public class zadanie20 {
    public static void main(String[] args) {
        double cukier=1.5/48;
        double maslo=1.0/48;
        double maka=2.75/48;
        int ciastka;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj ilosc ciastek : ");
        ciastka= dane.nextInt();
        System.out.println("Ilosc cukru  potrzebnego na wykonanie tej ilosci ciastek to : " + ciastka*cukier + " szklanki");
        System.out.println("Ilosc masla potrzebnego na wykonanie tej ilosci ciastek to : " + ciastka*maslo+ " szklanki");
        System.out.println("Ilosc maki  potrzebnej na wykonanie tej ilosci ciastek to : " + ciastka*maka+ " szklanki");
    }
}
import java.util.Scanner;
public class zadanie14 {
    public static void main(String[] args) {
        Scanner dane = new Scanner(System.in);

        int test1, test2, test3;

        System.out.println("Podaj wynik z pierwszego testu: ");
        test1 = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj wynik z drugiego testu: ");
        test2 = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj wynik z trzeciego testu: ");
        test3 = dane.nextInt();
        dane.nextLine();

        System.out.println("Wynik pierwszego testu wynosi: " + test1 + "\n Wynik drugiego testu wynosi: " + test2 +"\nWynik trzeciego testu wynosi: " +test3);
        System.out.println("Średnia z testów wynosi: " + (test1+test2+test3)/3);
    }
}

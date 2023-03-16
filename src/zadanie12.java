import java.util.Scanner;
public class zadanie12 {
    public static void main (String[] args){

        Scanner dane = new Scanner(System.in);

        double kilometrynalitrze, przejechane_kilometry, litry_paliwa;
        System.out.println("Podaj ilosc przejechanym km: ");
        przejechane_kilometry = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj ilosc spalonego paliwa: ");
        litry_paliwa = dane.nextInt();
        dane.nextLine();

        kilometrynalitrze = przejechane_kilometry / litry_paliwa;

        System.out.println("Spalanie wynosi: " + kilometrynalitrze + " l/km");
    }
}

import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
        String firstName, middleName, lastName;
        char firstInitial, middleInitial,lastInitial;

        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj pierwsze imie: ");
        firstName = dane.nextLine();

        System.out.println("Podaj drugie imie: ");
        middleName = dane.nextLine();

        System.out.println("Podaj nazwisko: ");
        lastName = dane.nextLine();

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println("Twoje imie: " + firstName + ". durige imie: " + middleName + ". nazwisko: " + lastName);
        System.out.println("Twoje inicjal: " + firstInitial + middleInitial + lastInitial);
    }
}

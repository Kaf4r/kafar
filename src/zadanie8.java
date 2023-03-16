import java.util.Scanner;
public class zadanie8 {
    public static void main(String[] args) {
        int dlugoscpom1, szerpom1, dlugoscpom2, szerpom2;
        Scanner cos = new Scanner(System.in);

        System.out.println("Podaj dlugosc pokoju nr1: ");
        dlugoscpom1 = cos.nextInt();
        cos.nextLine();

        System.out.println("Podaj szerokosc pokoju nr1: ");
        szerpom1 = cos.nextInt();
        cos.nextLine();

        System.out.println("Podaj dlugosc pokoju nr2: ");
        dlugoscpom2 = cos.nextInt();
        cos.nextLine();

        System.out.println("Podaj szerokosc pokoju nr2: ");
        szerpom2 = cos.nextInt();
        cos.nextLine();

        int calapowieszchnia = dlugoscpom2 * szerpom2 + dlugoscpom1 * szerpom1;

        System.out.println("Powieszchnia pokoju 1 wynosi: " +  dlugoscpom1 * szerpom1 + "m2");
        System.out.println("Powieszchnia pokoju 2 wynosi: " +  dlugoscpom2 * szerpom2 + "m2");
        System.out.println("Powieszchnia mieszkania wynosi: " +  calapowieszchnia + "m2");
    }
}

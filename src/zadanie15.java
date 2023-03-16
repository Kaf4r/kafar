import java.util.Scanner;
public class zadanie15 {
    public static void main (String[] args){
        Scanner dane = new Scanner(System.in);

    double cenadetaliczna, zysk;

    System.out.println("Podaj cene detaliczna płytki: ");
    cenadetaliczna=dane.nextInt();
    dane.nextLine();

    zysk=cenadetaliczna*0.4;

    System.out.println("Zysk wynosi: " +zysk);

    }
}

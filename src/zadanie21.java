import java.util.Scanner;

public class zadanie21 {
    public static void main(String[] args) {
        float P ;
        Scanner dane = new Scanner(System.in);
        System.out.println("Pierwotna kwota wplacana na konto : " );
        P = dane.nextInt();
        float r;
        System.out.println("Podaj roczna stope oprocentowania : " );
        r = dane.nextInt();
        double e=r*0.01;
        int n;
        System.out.println("Ile razy odsteki sa doliczane do kapitalu  : " );
        n = dane.nextInt();
        int t;
        System.out.println("Podaj liczbe lat : " );
        t = dane.nextInt();
        double A = (1+e/n);
        double C = n*t;
        double B = Math.pow(A,C);
        double G = B*P;

        System.out.println("Kwota po okreslonej liczbie lat : " + G);
    }
}
public class zadanie18 {
    public static void main (String[] args){

        double cenaakcji = 21.77;
        System.out.println("Kwota za akcje (bez prowizji): " + 600*cenaakcji);
        System.out.println("Wysokość prowizji): " + (600*cenaakcji)*0.02);
        System.out.println("Kwota za akcje (z prowizją): " + (600*cenaakcji + (600*cenaakcji)*0.02));

    }
}

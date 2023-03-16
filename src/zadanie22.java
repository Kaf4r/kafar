public class zadanie22 {
    public static void main(String[] args) {
        double kwotakacji = 1000*32.87;
        System.out.println("Kwota zaplacona za akcje " + kwotakacji);
        double prowizja1=kwotakacji*0.02;
        System.out.println("Prowizja zapłacona brokerowi przy zakupie " +prowizja1);
        double kwotasprzedaz= 1000*33.92;
        System.out.println("Otrzymana kwota przy zakupie : " + kwotasprzedaz);
        double prowizja2= kwotasprzedaz*0.02;
        System.out.println("Prowizja zaplacona brokerowi przy sprzedazy : " + prowizja2);
        double zysk= prowizja2-prowizja1;
        System.out.println("Zysk : " + zysk);
    }
}
public class MainSparbuch {
    public static void main(String[] args) {
        Sparbuch sb = new Sparbuch(1104711, 1000, 3);
        sb.zahleEin(60000);
        System.out.printf("Kapital: %.2f € \n", sb.getKapital());

        System.out.printf("Ertrag nach 6 Jahr: %.2f € \n", sb.getErtrag(6));
        sb.verzinse();
        System.out.printf("Kapital: %.2f € \n", sb.getKapital());
    }
}

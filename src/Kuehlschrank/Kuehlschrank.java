package Kuehlschrank;

public class Kuehlschrank {
    protected Lebensmittel[] kuehlschrank;
    protected int fuellstand;
    public Kuehlschrank(int size) {
        kuehlschrank = new Lebensmittel[size];
        fuellstand = 0;
    }
    public void einkaufen() {
        kuehlschrank[fuellstand++] = (new Mate("Club Mate"));
        kuehlschrank[fuellstand++] = (new Brot(1, 750));
        kuehlschrank[fuellstand++] = (new Wasser("Sprudel", 330));
        kuehlschrank[fuellstand++] = (new Mate("Flora Power"));
        kuehlschrank[fuellstand++] = (new Brot(3, 1000));
        kuehlschrank[fuellstand++] = (new Wurst("Soja Spezial", 100));
        kuehlschrank[fuellstand++] = (new Wasser("Still", 2000));
    }
    public void auflisten() {
        for (int i = 0; i < fuellstand; i++) {
            System.out.println(kuehlschrank[i].status());
        }
    }
    public void verbrauchen() {
        for (int i = 0; i < fuellstand; i++) {
            if (kuehlschrank[i].essen()) {
                System.out.println("Essen: " +
                        kuehlschrank[i].status());
            }
            if (kuehlschrank[i].trinken()) {
                System.out.println("Trinken: " +
                        kuehlschrank[i].status());
            }
        }
    }
    public static void main(String argv[]) {
        Kuehlschrank kschrank = new Kuehlschrank(10);
        kschrank.einkaufen();
        kschrank.auflisten();
        kschrank.verbrauchen();
    }
}


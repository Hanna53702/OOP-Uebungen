package ktaris;

public class KtarisMain {
    public static void main(String[] args) {
        // Erzeugen der Objekte
        Gegenstand g1 = new Gegenstand("Quantenkanone", 17);
        Gegenstand g2 = new Gegenstand("Graviton-Blaster", 15);
        Gegenstand g3 = new Gegenstand("Quantenkanone", 17);
        Gegenstand g4 = new Gegenstand("Dunkel-Emitter", 45);
        Gegenstand g5 = new Gegenstand();

        // Setzen der Attribute
        g5.setFaktor(15);
        g5.setTyp("Schatten-Flamme");

        // Bildschirmausgabe
        System.out.println("Typ: " + g1.getTyp());
        System.out.println("Faktor: " + g1.getFaktor());
        System.out.println(g1.toString()); // Die toString() Methode wird aufgerufen
        System.out.println();
        System.out.println("Typ: " + g2.getTyp());
        System.out.println("Faktor: " + g2.getFaktor());
        System.out.println(g2); // Die toString() Methode wird selbstständig aufgerufen
        System.out.println();

        System.out.println("Typ: " + g3.getTyp());
        System.out.println("Faktor: " + g3.getFaktor());
        System.out.println(g3);
        System.out.println();

        System.out.println("Typ: " + g4.getTyp());
        System.out.println("Faktor: " + g4.getFaktor());
        System.out.println(g4);
        System.out.println();

        System.out.println("Typ: " + g5.getTyp());
        System.out.println("Faktor: " + g5.getFaktor());
        System.out.println(g5);
        System.out.println();

    }
}

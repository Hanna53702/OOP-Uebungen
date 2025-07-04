package Kiste;

public class MainKiste {
    public static void main(String[] args) {

//        Etikett etikett = new Etikett();

        Kiste Schatz = new Kiste(10, 5, 5, "lila", etikett);
        System.out.println("Volumen: " + Schatz.getVolumen() + " m³");
        System.out.println("Farbe: " + Schatz.getFarbe());
        System.out.println("Beschreibung: " + etikett.getBeschreibung());
        System.out.println("Eigentümer: " + etikett.getEigentuemer());
    }
}
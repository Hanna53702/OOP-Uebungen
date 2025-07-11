package Kiste;

public class MainKiste {
    public static void main(String[] args) {

//        Etikett etikett = new Etikett();

        Kiste Schatz = new Kiste(10, 5, 5, "lila", "Captain Jack Sparrow", "Dreck");
        System.out.println("Volumen: " + Schatz.getVolumen() + " m³");
        System.out.println("Farbe: " + Schatz.getFarbe());
        System.out.println("Beschreibung: " + Schatz.getEtikett().getBeschreibung());
        System.out.println("Eigentümer: " + Schatz.getEtikett().getEigentuemer());

        Kiste Umzug = new Kiste(20, 20,20, "braun", "Oma Hildegart", "Porzellan");
        System.out.println("\nVolumen: " + Umzug.getVolumen() + " m³");
        System.out.println("Farbe: " + Umzug.getFarbe());
        System.out.println("Beschreibung: " + Umzug.getEtikett().getBeschreibung());
        System.out.println("Eigentümer: " + Umzug.getEtikett().getEigentuemer());

        Kiste Sarg = new Kiste(2,1,1, "schwarz", "Du", "Du");
        System.out.println("\nVolumen: " + Sarg.getVolumen() + " m³");
        System.out.println("Farbe: " + Sarg.getFarbe());
        System.out.println("Beschreibung: " + Sarg.getEtikett().getBeschreibung());
        System.out.println("Eigentümer: " + Sarg.getEtikett().getEigentuemer());

        System.out.println("\nLager: ");
        Lager Kistenstellplatz = new Lager(1000);
        Kistenstellplatz.addKiste(Sarg);
        Kistenstellplatz.addKiste(Umzug);
        Kistenstellplatz.addKiste(Schatz);
        Kistenstellplatz.druckeAlleKisten();

    }
}
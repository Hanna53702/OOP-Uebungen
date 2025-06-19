public class MainKiste {
    public static void main(String[] args) {
        Kiste Schatz = new Kiste(10, 5, 5, "lila");
        System.out.println("Volumen: " + Schatz.getVolumen() + " m³");
        System.out.println("Farbe: " + Schatz.getFarbe());
    }
}
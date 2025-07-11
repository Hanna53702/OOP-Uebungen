package Kiste;

public class Kiste {
    private int hoehe;
    private int breite;
    private int tiefe;
    private String farbe;
    private Etikett etikett;


    public Kiste(int hoehe, int breite, int tiefe, String farbe, String Eigentuemer, String Beschreibung) {
        this.hoehe = hoehe;
        this.breite = breite;
        this.tiefe = tiefe;
        this.farbe = farbe;
        this.etikett = new Etikett(Eigentuemer, Beschreibung);
    }
    public int getVolumen(){
        return hoehe*breite*tiefe;
    }
    public String getFarbe(){
        return this.farbe;
    }

    public Etikett getEtikett(){
        return this.etikett;
    }
}

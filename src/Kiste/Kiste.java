package Kiste;

public class Kiste {
    private int hoehe;
    private int breite;
    private int tiefe;
    private String farbe;
    public Etikett etikett;

    public Kiste(Etikett etikett){

    }

    public Kiste(int hoehe, int breite, int tiefe, String farbe, Etikett etikett) {
        this.hoehe = hoehe;
        this.breite = breite;
        this.tiefe = tiefe;
        this.farbe = farbe;
        this.etikett = etikett;
    }
    public int getVolumen(){
        return hoehe*breite*tiefe;
    }
    public String getFarbe(){
        return this.farbe;
    }
}

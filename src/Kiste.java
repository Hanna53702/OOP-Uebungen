public class Kiste {
    public int hoehe;
    public int breite;
    public int tiefe;
    public String farbe;

    public Kiste(int hoehe, int breite, int tiefe, String farbe) {
        this.hoehe = hoehe;
        this.breite = breite;
        this.tiefe = tiefe;
        this.farbe = farbe;
    }
    public int getVolumen(){
        return hoehe*breite*tiefe;
    }
    public String getFarbe(){
        return this.farbe;
    }
}

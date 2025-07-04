package ktaris;

public class Gegenstand {
    private String typ;
    private int faktor;

    public Gegenstand() {
    }

    public Gegenstand(String typ, int faktor) {
        this.typ = typ;
        this.faktor = faktor;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getFaktor() {
        return faktor;
    }

    public void setFaktor(int faktor) {
        this.faktor = faktor;
    }
}
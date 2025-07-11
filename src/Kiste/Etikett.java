package Kiste;

public class Etikett {
    private String Eigentuemer;
    private String Beschreibung;

    public Etikett(String Eigentuemer, String Beschreibung){
        this.Eigentuemer = Eigentuemer;
        this.Beschreibung = Beschreibung;
    }

    public String getEigentuemer() {
        return Eigentuemer;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }
}

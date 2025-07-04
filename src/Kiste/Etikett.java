package Kiste;

public class Etikett {
    private String Eigentuemer;
    private String Beschreibung;

    public String getEigentuemer() {
        return Eigentuemer;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }

    public void setEigentuemer(String eigentuemer) {
        Eigentuemer = eigentuemer;
    }
}

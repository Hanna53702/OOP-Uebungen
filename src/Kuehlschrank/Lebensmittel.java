package Kuehlschrank;

public abstract class Lebensmittel {
    protected String name;
    protected int menge;
    public Lebensmittel(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }
    public abstract boolean essen();
    public abstract boolean trinken();
    public String status() {
        return "Klasse: " + getClass().getSimpleName() + ", Instanz: " + this.name + ", Menge: " + this.menge + ((this instanceof Getraenk) ? " ml" : " g");
    }
}

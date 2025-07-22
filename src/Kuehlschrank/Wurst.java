package Kuehlschrank;

public class Wurst extends Speise{
    public Wurst(String name, int menge) {
        super(name, menge);
    }
    public boolean trinken() {
        return false;
    }

    public boolean essen() {
        return essen(10);
    }
}

package Kuehlschrank;

public class Wasser extends Getraenk {
    public Wasser(String name, int menge) {
        super(name, menge);
    }

    @Override
    public boolean trinken() {
        return trinken(200);
    }

    public boolean essen() {
        return false;
    }
}

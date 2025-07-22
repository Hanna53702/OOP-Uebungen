package Kuehlschrank;

public class Mate extends Getraenk{
    public Mate(String name) {
        super(name, 500);
    }

    public boolean trinken() {
        return trinken(100);
    }

    public boolean essen() {
        return false;
    }
}

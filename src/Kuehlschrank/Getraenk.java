package Kuehlschrank;

public abstract class Getraenk extends Lebensmittel {
    public Getraenk(String name, int menge) {
        super(name, menge);
//        this.menge = 500;
    }

    public boolean trinken(int menge) {
        if (this.menge >= menge){
            this.menge -= menge;
            return true;
        }
        else {
            this.menge = 0;
            return false;
        }

    }

}

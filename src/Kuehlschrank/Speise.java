package Kuehlschrank;

public abstract class Speise extends Lebensmittel{
    public Speise(String name, int menge){
        super(name, menge);

    }

    public boolean essen(int menge){
        if (this.menge >= menge){
            this.menge -= menge;
            return true;
        }
        else {
            this.menge = 0;
            return false;
        }

    }

    public boolean trinken() {
        return false;
    }
}

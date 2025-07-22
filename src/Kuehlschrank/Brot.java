package Kuehlschrank;

public class Brot extends Speise{
    public Brot(int nummer, int menge) {
        super(String.valueOf(nummer), menge);
        if (nummer == 0){
            this.name = "Weißbrot";
        }
        else if (nummer == 1){
            this.name = "Schwarzbrot";
        }
        else if (nummer == 2){
            this.name = "Mischbrot";
        }
        else {
            this.name = "Spezialbrot";
        }
    }
    public boolean trinken() {
        return false;
    }

    public boolean essen() {
        return essen(50);
    }
}

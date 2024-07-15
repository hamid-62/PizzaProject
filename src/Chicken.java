public class Chicken extends Fleisch{
    private int gewicht;

    public Chicken(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    protected int kostenErhalten() {
        return this.gewicht+2;
    }
}

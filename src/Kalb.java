public class Kalb extends Fleisch{
    private int gewicht;

    public Kalb(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    protected int kostenErhalten() {
        return this.gewicht+2;
    }
}

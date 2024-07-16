public class Käse extends PizzaInhalt{

    private int gewicht;

    public Käse(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    protected int kostenErhalten() {
       return this.gewicht*2;

    }
}

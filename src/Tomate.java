public class Tomate extends Gemüse{

    private int gewicht;

    public Tomate(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    protected int kostenErhalten() {
        return this.gewicht+1;
    }
}

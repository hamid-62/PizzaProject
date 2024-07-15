public class Pilz extends Gemüse{

    private int gewicht;
    private boolean dosen;

    public Pilz(int gewicht, boolean dosen) {
        this.gewicht = gewicht;
        this.dosen = dosen;
    }

    @Override
    protected int kostenErhalten() {
        int kosten = this.gewicht*2;
        if (!dosen) {
            kosten +=1;
        }
        return kosten;
    }
}

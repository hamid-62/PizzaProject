public class Trinken extends  Bestellungsartikel{

    private String name;
    private int liter;
    private boolean kohlensäurehaltig;

    public Trinken(String name, int liter, boolean kohlensäurehaltig) {
        this.name = name;
        this.liter = liter;
        this.kohlensäurehaltig = kohlensäurehaltig;
    }

    @Override
    protected int Kostenerhalten() {
        int kosten =this.liter*1;
        if(this.kohlensäurehaltig){
            kosten +=1;
        }
        return kosten;
    }
}

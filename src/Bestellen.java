import java.util.ArrayList;
import java.util.List;

public class Bestellen {

    LieferungsArt lieferungsArt;
    List<Bestellungsartikel> bestellungsartikelList= new ArrayList<>();


    public Bestellen(LieferungsArt lieferungsArt) {
        this.lieferungsArt = lieferungsArt;
    }


    public void artikelHinzufügen(Bestellungsartikel bestellungsartikel){
        bestellungsartikelList.add(bestellungsartikel);
    }


    public int calcBestellung() {
        int summe = lieferungsArt.value;
        for (Bestellungsartikel b : bestellungsartikelList) {
            summe+=b.Kostenerhalten();
            if(summe>30){
                summe-=0.1*summe;
            }
        }
        return summe;

    }

}

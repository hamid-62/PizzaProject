public class Main {
    public static void main(String[] args) {

        Bestellen bestellen1=new Bestellen(LieferungsArt.Fahrrad);
        bestellen1.artikelHinzufügen(new Trinken("cola",50,true));

        Pizza pizza1=new Pizza("mix",PizzaGröße.Groß);
        pizza1.addInhaltPizza(new Chicken(200));
        pizza1.addInhaltPizza(new Tomate(50));
        pizza1.addInhaltPizza(new Pilz(100,false));
        bestellen1.artikelHinzufügen(pizza1);

        Pizza pizza2=new Pizza("Fleisch",PizzaGröße.Normal);
        bestellen1.artikelHinzufügen(pizza2);

        System.out.println(bestellen1.calcBestellung());



    }

}
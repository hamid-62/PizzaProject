import java.util.ArrayList;
import java.util.List;

public class Pizza extends Bestellungsartikel{
    private String name;
    private PizzaGröße pizzaGröße;
    private int grundPreis=5;
    private List<PizzaInhalt> inhalt;

    public Pizza(String name, PizzaGröße pizzaGröße) {
        this.name = name;
        this.pizzaGröße = pizzaGröße;
        inhalt = new ArrayList<>();
    }
    public  void addInhaltPizza(PizzaInhalt pizzaInhalt){
        inhalt.add(pizzaInhalt);
    }

    @Override
    protected int Kostenerhalten() {
        int sum = 0;
        sum=+grundPreis;
        for (PizzaInhalt pizzaInhalt : inhalt) {
            pizzaInhalt.kostenErhalten();
        }
        return pizzaGröße.value*sum;
    }
}

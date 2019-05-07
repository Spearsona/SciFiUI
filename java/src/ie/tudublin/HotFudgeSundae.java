package ie.tudublin;

public class HotFudgeSundae extends Consumable implements Dessert{


    HotFudgeSundae(){
        super("Hot Fudge Sundae", 250, "Scoops of ice cream with a chocolate fudge sauce.");
    }

    @Override
    public boolean isServedHot() {
        return true;
    }

    @Override
    public boolean comesWithIceCream() {
        return true;
    }

    @Override
    public String describeFoodPrep() {
        return "Scoop into a bowl, top with hot fudge sauce, garnish.";
    }

}
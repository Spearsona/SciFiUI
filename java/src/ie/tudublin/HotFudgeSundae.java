package ie.tudublin;

public class HotFudgeSundae extends Consumable implements Dessert{

    String[] descStrings = 
        {
            "Scoop ice cream into bowl",
            "Top with hot fudge sauce",
            "Garnish with fruit and nuts"
        };


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
    public String[] describeFoodPrep() {
    
        return descStrings;
    }

}
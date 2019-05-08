package ie.tudublin;

public class Tea extends Consumable implements Beverage{
    String[] descStrings = 
        {   
            "Add teabag to pot",
            "Add boiling water to pot",
            "Pour from pot to cup"
        };

    Tea(){
        super("Tea", 10, "Soothing and decaffineated");
    }

    @Override
    public int numberOfIceCubes() {
        return 0;
    }

    @Override
    public boolean isCarbonated() {
        return false;
    }

    @Override
    public String glassType() {
        return "Mug";
    }

    @Override
    public String[] describeFoodPrep() {
        return descStrings;
    }

}
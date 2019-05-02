package ie.tudublin;

public class CherryCola extends Consumable implements Beverage{

    CherryCola(){
        super("Cherry Cola", 80, "Bubbly Corn-Syrup based drink with added flavor!");
    }

    @Override
    public int numberOfIceCubes() {
        return 4;
    }

    @Override
    public boolean isCarbonated() {
        return true;
    }

    @Override
    public String glassType() {
        return "regular";
    }

    @Override
    public String describeFoodPrep() {
        return "pour into glass, add straw";
    }

}
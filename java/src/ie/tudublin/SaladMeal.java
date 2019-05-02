package ie.tudublin;

public class SaladMeal extends Consumable implements MainCourse {


    SaladMeal(){
        super("Caeser Salad", 44, "A Caesar salad is a green salad with dressing" );
    }

    @Override
    public String describeFoodPrep() {
        return "Thrown leaves into a salad bowl and mix with dressing";
    }

    @Override
    public String getMeatType() {
        return "Chicken";
    }

    @Override
    public String getSauce() {
        return "Caser Salad Dressing";
    }

    @Override
    public String[] getSides() {
        String[] sides = {"Croutons","Lettuce","Tomatoes", "Egg"};
        return sides;
    }



}
package ie.tudublin;

public class SaladMeal extends Consumable implements MainCourse {

    String[] descStrings =     
            {  
                "Thrown leaves into a salad bowl",
                "add dressing",
                "add sides",
                "mix"
            };

    SaladMeal(){
        super("Caeser Salad", 44, "A Caesar salad is a green salad with dressing" );
    }

    @Override
    public String[] describeFoodPrep() {
            return descStrings;
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
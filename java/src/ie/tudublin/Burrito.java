package ie.tudublin;

public class Burrito extends Consumable implements MainCourse {

    String[] descStrings =     
            {  
                "Add Rice to Wrap",
                "Add Beans",
                "Add Meat",
                "Fold wrap",
                
            };

    Burrito(){
        super("Burrito", 1000, "A mexican-style wrap with meat and Veg" );
    }

    @Override
    public String[] describeFoodPrep() {
            return descStrings;
        }

    @Override
    public String getMeatType() {
        return "Pulled Pork";
    }

    @Override
    public String getSauce() {
        return "Salsa Verde";
    }

    @Override
    public String[] getSides() {
        String[] sides = {"Nachos","Guacamole"};
        return sides;
    }



}
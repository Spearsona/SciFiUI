package ie.tudublin;

public abstract class Consumable
{
    private String name;
    private int calories;
    private String description; 

    public Consumable(String name, int calories, String description){

        this.name = name;
        this.calories = calories;
        this.description = description;

    }

    public abstract String describeFoodPrep();

      /**
     * @return the calories
     */
    public int getCalories(){
        return this.calories;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
  
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /* Add image functionality
    
    
    public getPicture(){
        
    }
    */


    

}
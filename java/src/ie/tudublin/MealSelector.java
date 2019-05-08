package ie.tudublin;

import java.util.ArrayList;

public class MealSelector{

    public ArrayList<Consumable> mealList = new ArrayList<Consumable>();
    
    Dessert dessert;
    MainCourse mainCourse;
    Beverage beverage;

    public MealSelector()
    {
      // makeTestMeal();
    }

    public void setDessert(Dessert type) 
    {
        this.dessert = type;
        System.out.println(type.getName());
    }
    
    public void setMainCourse(MainCourse type) 
    {
        this.mainCourse = type;
        System.out.println(type.getName());
    }

    public void setBeverage(Beverage type) 
    {
        this.beverage = type;
        System.out.println(type.getName());
    }
    
    //System.out.println(testDrink.toString());
    //public ArrayList<Beverage> beveList = new  ArrayList<Beverage>();
    //public Beverage[] beverages = new Beverage[3];

     //testing function - to be replaced with a MealPreparer Class
     public void makeTestMeal(){
        
        mealList.add((Consumable)this.dessert);
        mealList.add((Consumable) this.mainCourse);
        mealList.add((Consumable)this.beverage);

        
        System.out.println("\nPrinting Meal");
        
        for(int i = 0; i < mealList.size(); i++){
            Consumable testprinter = mealList.get(i);
            System.out.println(testprinter.getName());
            
            String[] foodprepSteps = testprinter.describeFoodPrep();
            for(int j = 0; j < foodprepSteps.length; j++)
            {
                System.out.println(foodprepSteps[j]);
            } 
            
        }
     }
}

    
    

    

    
    
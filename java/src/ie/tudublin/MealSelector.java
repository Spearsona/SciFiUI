package ie.tudublin;

import java.util.ArrayList;



public class MealSelector{
    public ArrayList<Consumable> mealList = new ArrayList<Consumable>();
    

    public MealSelector()
    {
        makeMeal();
    }

    public void makeMeal(){

        CherryCola testDrink = new CherryCola();
        SaladMeal testMainCourse = new SaladMeal();
        HotFudgeSundae testDessert = new HotFudgeSundae();

        System.out.println(testDrink.describeFoodPrep());
        System.out.println(testMainCourse.describeFoodPrep());
        System.out.println(testDessert.describeFoodPrep());

        mealList.add(testDrink);
        mealList.add(testMainCourse);
        mealList.add(testDessert);

        System.out.println("\nPrinting Meal");
        for(int i = 0; i < mealList.size(); i++){
            Consumable testprinter = mealList.get(i);
            System.out.println(testprinter.describeFoodPrep());
        }
        
        
    }
         
    


    //System.out.println(testDrink.toString());

    //public ArrayList<Beverage> beveList = new  ArrayList<Beverage>();

    //public Beverage[] beverages = new Beverage[3];
}

    
    

    

    
    
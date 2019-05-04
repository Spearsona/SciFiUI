package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class MealSelector extends PApplet{
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

        Consumable testprinter = mealList.get(0);
        System.out.println(testprinter.describeFoodPrep());
    }
         
    


    //System.out.println(testDrink.toString());

    //public ArrayList<Beverage> beveList = new  ArrayList<Beverage>();

    //public Beverage[] beverages = new Beverage[3];
}

    
    

    

    
    
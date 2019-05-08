package ie.tudublin;

import java.util.ArrayList;



public class MealSelector{
    public ArrayList<Consumable> mealList = new ArrayList<Consumable>();
    
    Dessert dessert;
    MainCourse mainCourse;

    public MealSelector()
    {
        
       //makeMeal();
    }

    //testing function
    public void makeMeal(){

        CherryCola testDrink = new CherryCola();
        SaladMeal testMainCourse = new SaladMeal();
        HotFudgeSundae testDessert = new HotFudgeSundae();

        //System.out.println(testDrink.describeFoodPrep());
        //System.out.println(testMainCourse.describeFoodPrep());
        //System.out.println(testDessert.describeFoodPrep());

        mealList.add(testDrink);
        mealList.add(testMainCourse);
        mealList.add(testDessert);

        //System.out.println("\nPrinting Meal");
        for(int i = 0; i < mealList.size(); i++){
            Consumable testprinter = mealList.get(i);
            System.out.println(testprinter.describeFoodPrep());
        }
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
    
    //System.out.println(testDrink.toString());
    //public ArrayList<Beverage> beveList = new  ArrayList<Beverage>();
    //public Beverage[] beverages = new Beverage[3];
}

    
    

    

    
    
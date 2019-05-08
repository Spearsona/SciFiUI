package ie.tudublin;
public class DessertSettingButton extends Button{

    private Dessert type;
    private MealSelector mealselect;

    DessertSettingButton(UI ui, float x, float y, float width, float height, Dessert type, MealSelector mealselect) {
        super(ui, x, y, width, height, type.getName());
        this.type = type;
        this.mealselect = mealselect;
    }

    //check if button has been clicked
    //If clicked 
    @Override
    public void doClick(){
        if(checkBounds())
        {
            mealselect.setDessert(this.type);
        }
    }
            
        //if true, set s
        //mealSelector.setDessert(this.type);
        
        
    

} 
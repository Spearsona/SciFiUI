package ie.tudublin;
public class BeverageSetButton extends Button{

    private Beverage type;
    private MealSelector mealselect;

    public BeverageSetButton(UI ui, float x, float y, float width, float height, Beverage type, MealSelector mealselect){
      super(ui, x, y, width, height, type.getName());
      this.type = type;
      this.mealselect= mealselect;
    }

    @Override
    public void doClick(){
        if(checkBounds())
        {
            mealselect.setBeverage(this.type);
        }
    }


}
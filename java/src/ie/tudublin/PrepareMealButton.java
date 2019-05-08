package ie.tudublin;
public class PrepareMealButton extends Button{
    private MealSelector mealselect;
   
    PrepareMealButton(UI ui, float x, float y, float width, float height, MealSelector mealselect){
    super(ui, x, y, width, height, "Prepare Meal");
    this.mealselect= mealselect;
    
   } 

   @Override
   public void doClick(){

        //need to add check to make sure all meal buttons are set
        
       if(checkBounds())
       {
           mealselect.makeTestMeal();
       }
   }




}

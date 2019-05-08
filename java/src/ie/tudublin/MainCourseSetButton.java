package ie.tudublin;
public class MainCourseSetButton extends Button{

    private MainCourse type;
    private MealSelector mealselect;

    public MainCourseSetButton(UI ui, float x, float y, float width, float height, MainCourse type, MealSelector mealselect){
      super(ui, x, y, width, height, type.getName());
      this.type = type;
      this.mealselect= mealselect;
    }

    @Override
    public void doClick(){
        System.out.println("clicked");
        if(checkBounds())
        {
            mealselect.setMainCourse(this.type);
        }
    }


}
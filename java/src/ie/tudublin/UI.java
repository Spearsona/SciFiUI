package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<Button> foodbuttons;
    Button b;
    
    Button mainCourse;
    Button dessert;
    Button beverage;
    Button prepare;

    MovingCircle mc;
    MealSelector meal;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(1); 
    }

    public void setup()
    {
        foodbuttons = new ArrayList<Button>();

        float radarPosX = map(95, 0, 100, 0, width);
        float radarPosY = map(10, 0, 100, 0, height);
        float radarSize = map(2.5f,0, 100, 0, height);

        float menuButtonX =  map(30, 0, 100, 0, width);
        float menuButtonY =  map(30, 0, 100, 0, height);
        float buttonWidth =  map(8, 0, 100, 0, width);
        float buttonHeight =  map(2.5f, 0, 100, 0, height);
        
        float gap = map(1f, 0, 100, 0, width);

        //b = new Button(this, menuButtonX, menuButtonY, buttonWidth, buttonHeight, "Dispense");
        meal = new MealSelector();

       
        //mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 0, radarPosX, radarPosY , radarSize);

        beverage = new BeverageSetButton(this, menuButtonX, menuButtonY, buttonWidth, buttonHeight, new CherryCola(), meal);
        mainCourse = new MainCourseSetButton(this, menuButtonX + buttonWidth + gap, menuButtonY, buttonWidth, buttonHeight, new SaladMeal(), meal);
        dessert = new DessertSettingButton(this, menuButtonX + 2 * (buttonWidth + gap), menuButtonY, buttonWidth, buttonHeight, new HotFudgeSundae(), meal);
        prepare = new PrepareMealButton(this, menuButtonX + buttonWidth + gap, menuButtonY + buttonHeight + gap, buttonWidth, buttonHeight, meal);

        foodbuttons.add(dessert);
        foodbuttons.add(mainCourse);
        foodbuttons.add(beverage);
        foodbuttons.add(prepare);

    }

    Radar radar;

    public void draw()
    {
        stroke(255);
        background(0);
        //b.render();
        beverage.render();
        dessert.render();
        mainCourse.render();
        prepare.render();
       
        //mainMeal.render();
        //b.checkBounds();
        //mc.update();
        //mc.render();
        
        printMeal();

        radar.update();
        radar.render();
        
        /*Sample KeyPress Function
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
        */
    }

    //Test function for printing Prep steps to UI - requires tweaking to display correctly
    public void printMeal(){
        textAlign(LEFT);
        float menuPosX = map(75, 0, 100, 0, width);
        float menuPosY = map(25, 0, 100, 0, height);

        float textGap = map(5, 0, 100, 0, height);

         
        for(int i=0; i < meal.mealList.size(); i++)
        {   
            float itemPosY =  menuPosY + (textGap * 5 * i);
            Consumable mealitem = meal.mealList.get(i);
            fill(255,0,0);
            text(mealitem.getName(), menuPosX, itemPosY);

            fill(255);
            String[] foodprepSteps = mealitem.describeFoodPrep();
            for(int j = 0; j < foodprepSteps.length; j++)
            {
                text(foodprepSteps[j], menuPosX, itemPosY + textGap + (textGap * j));
            } 
        }
    }
    

    public void mousePressed(){
        
        for(Button button:foodbuttons)
        {
            if(button.checkBounds()){
                button.doClick();
            }
            else{
                //System.out.println("False");
            }
            //System.out.println("Looping");


        }
        
    }
}


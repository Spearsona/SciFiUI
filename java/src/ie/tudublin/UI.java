package ie.tudublin;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class UI extends PApplet
{
    List<Button> foodbuttons;
    Button b;
    Button bev;
    Button mainMeal;
    Button dessert;


    
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

        float buttonPosX =  map(30, 0, 100, 0, width);
        float buttonPosY =  map(30, 0, 100, 0, height);
        float buttonWidth =  map(8, 0, 100, 0, width);
        float buttonHeight =  map(2.5f, 0, 100, 0, height);
        
        float gap = map(0.5f, 0, 100, 0, width);

        //b = new Button(this, buttonPosX, buttonPosY, buttonWidth, buttonHeight, "Dispense");
        meal = new MealSelector();
       
        //mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, radarPosX, radarPosY , radarSize);

        //bev = new Button(this, buttonPosX, buttonPosY, buttonWidth, buttonHeight, new CherryCola());
        dessert = new DessertSettingButton(this, buttonPosX + (2.3f * buttonWidth) + gap, buttonPosY, buttonWidth, buttonHeight, new HotFudgeSundae(), meal);
        foodbuttons.add(dessert);
        //mainMeal = new Button(this, buttonPosX + (1.1f * buttonWidth) + gap, buttonPosY, buttonWidth, buttonHeight, new SaladMeal());
        
    }

    Radar radar;

    public void draw()
    {
        stroke(255);
        background(0);
        //b.render();
        //bev.render();
        dessert.render();
        //mainMeal.render();

        
        //b.checkBounds();
        
        
        //mc.update();
        //mc.render();
        
        printMeal();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }

    public void printMeal(){
        textAlign(LEFT);
        float menuPosX = map(75, 0, 100, 0, width);
        float menuPosY = map(25, 0, 100, 0, height);

        float gap = map(5, 0, 100, 0, height);


        for(int i=0; i < meal.mealList.size(); i++)
        {   
            Consumable mealitem = meal.mealList.get(i);
            text(mealitem.describeFoodPrep(), menuPosX, menuPosY + (gap * i));
        }
    }

    public void mousePressed(){
        
        for(Button button:foodbuttons)
        {

            if(button.checkBounds()){
                button.doClick();

            }
            else{
                System.out.println("False");
            }
            
            System.out.println("Looping");


        }
        
    }
}


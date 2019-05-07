package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
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

        float radarPosX = map(95, 0, 100, 0, width);
        float radarPosY = map(10, 0, 100, 0, height);
        float radarSize = map(2.5f,0, 100, 0, height);

        b = new Button(this, 50, 50, 100, 50, "Dispense");
        meal = new MealSelector();
       
        //mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, radarPosX, radarPosY , radarSize);
        
    }

    Radar radar;

    public void draw()
    {
        background(0);
        b.render();

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
        float menuPosX = map(75, 0, 100, 0, width);
        float menuPosY = map(25, 0, 100, 0, height);

        float gap = map(5, 0, 100, 0, height);


        for(int i=0; i < meal.mealList.size(); i++)
        {   
            
            Consumable mealitem = meal.mealList.get(i);
            text(mealitem.describeFoodPrep(), menuPosX, menuPosY + (gap * i));
        }
    }
}


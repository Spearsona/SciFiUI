package ie.tudublin;

import processing.core.PApplet;

public class Button extends PApplet
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    
    

    public Button(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
         
        this.text = text;
    }

    public void render()
    {
        ui.fill(0);
        ui.stroke(255);
        checkBounds();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
    }

    public boolean checkBounds(){
        if((ui.mouseX > x) && (ui.mouseX < x + width) && (ui.mouseY > y) && (ui.mouseY > y + height)){
            ui.fill(204, 102, 0);
            
            /*System.out.println("\nMouse X is: " + ui.mouseX);
            System.out.println("\nMouse Y is: " + ui.mouseY);
            System.out.println("x is: " + x);
            System.out.println("Y is: " + x);
            */

            return false;
        }
        else{
            ui.fill(255);
            return true;
        }

        
       

    }
    public void doClick(){};


}
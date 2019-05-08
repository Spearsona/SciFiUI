package ie.tudublin;

import processing.core.PApplet;

public class Button extends PApplet
{
    UI ui;
    private float x;
    private float y;
    private float w;
    private float h;
    private String text;
    
    

    public Button(UI ui, float x, float y, float w, float h, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.text = text; 
    }

    public void render()
    {
        ui.fill(255);
        ui.stroke(255);
        checkBounds();
        ui.rect(x, y, w, h);
        ui.fill(255);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x + w * 0.5f, y + h * 0.5f);
    }

    public boolean checkBounds(){
        if((ui.mouseX > x) && (ui.mouseX < x + w) && (ui.mouseY > y) && (ui.mouseY < y + h)){
            ui.fill(25, 127, 27);
            return true;
            
        }
        else{
            ui.fill(0);
            return false;
        }
    }

    public void doClick(){};


}
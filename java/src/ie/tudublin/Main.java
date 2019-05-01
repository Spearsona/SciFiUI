package ie.tudublin;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();
		
		//MealSelector, setUp JCombo Boxes so instaniate variables store consumables in list of Consumables
		//Check calorie does not exceed 800
		//Loop over food prep descriptions with 2 second wait between each 
		//Plop out food

		
	}
}
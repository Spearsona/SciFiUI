# SciFi UI Project

Name: Stephen Pearson	

Student Number: C17753589

# Description of the assignment

Creating a UI for a futuristic food dispenser in a Paranoia/Fallout-style dystopia. It will allow the user to put together a meal based on a set menu,
but only allow the user to consume a certain number of calories. 

# Instructions
The program allows the user to select a meal from three sections - A main course, beverage and desert. It then prepares the meal, displaying all the required steps, outputting these to the user along with an updating count of calories the user will be consuming.

# How it works
Each meal button within the system inherits from a parent button class, but implements an interface which defines its role - the MainCourse interface demands that functions be added to the class to add side dishes for instance, while the Beverage interface requires the implementing class to have a getter for its type of glass. 

When the user selects buttons to add an item to the overall meal, it creates and sets an object within a MealSelector class, which holds this data until the meal is to be prepared. When the "prepare" button is selected this calls a function to create an arraylist of the created objects, to be iterated over by the UI for displaying the food preparation steps. 



#


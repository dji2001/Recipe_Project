# Recipe_Project
This is the group project 1 of CSCI-UA-480: Remote Software Development, 2021 Fall.
Group members:
Duoji Jiang;
Yash Bharti;
Brian Hsieh;
Emily Herschmann;

## Instructions

Upon running, the program will welcome the user! Then, it will prompt the user to press "Enter" to continue.
Next, the program will ask the user for four options: 
 1. View All Recipes
 2. Search By Name
 3. Create Recipe
 4. To Exit: Type: Exit

----------------------------------------------------------------

### View All Recipes

When the user chooses option 1 (View All Recipes), the program will print out all the recipes, one per line. 
Then, the user can decide to look at more detailed information about a recipe, by inputting the recipe name. This will print out the recipe ingredients and steps.

### Search By Name

When the user chooses option 2 (Search By Name), the program will prompt the user for a recipe name, without spaces. If the recipe name matches one in the system, the program will inform the user that the recipe has been found and it will ask the user if they would like to see all the details (ingredients and steps) all at once or if the user would like to step through the ingredients and steps line-by-line. If the user picks the former,  the recipe information will be printed onto the screen. If the user picks the latter option, the program will print out one line at a time of the recipe information, continuing when the user inputs any character or string. Then the program will ask the user if they would like to search for another recipe or exit to the main menu.

### Create Recipe

When the user chooses option 3 (Create Recipe), the program will prompt the user to enter "1" to indicate the start of a new recipe. Once entered, the program will ask the user for the recipe name followed by description. Next, it will ask the user to input the ingredients of the recipe, one at a time. Once the user has input all their ingredients, type "DONE" to continue to input the instructions. Similar to the ingredients, the program will ask the user to input the instructions one by one and type "DONE" once complete. After this is done, the program will direct the user back to the main menu. 

### Exit

When the user chooses option 4 (Exit), the program will terminate and end. However, all recipes created will remain in the system for future use. 

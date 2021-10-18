import java.util.*;
public class pageDisplay{
    public static void indexPage(){
        System.out.println("Select from the Following Options: Press Number");
        System.out.println("1. View All Recipes");
        System.out.println("2. Search By Name");
        System.out.println("3. Create Recipe");
        System.out.println("4. To Exit: Type: Exit");
    }
    public static void recipeSelect(){
        System.out.println("Select from the Following Options: Press Number");
        System.out.println("1. Read Entire Recipe");
        System.out.println("2. Search through Instructions");
        System.out.println("3. To Go Back to Main Page: Type : Main");
        
    }
    public static void createRecipe(){
        System.out.println("To create new recipe : Press 1");
        System.out.println("To Go Back to Main Page: Type : Main");
    }
    public static void showAll(){
        System.out.println("Showing All Recipes: ");
    }
    public static void selectRecipe() {
    	System.out.println("Please input the recipe name you want to open exacly as the name appears: ");
    }
    public static void searchSelect() {
    	System.out.println("Please input the recipe you are tring to look for, with no spaces and in lowercase: ");
    }
    public static void main(String args[]){

    }
}
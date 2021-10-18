import java.util.*;
import java.io.*;

public class main{
    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String args[]) throws IOException{

        // Start the Program
        // First Initial Message
        System.out.println("Welcome to the Recipe Book! Have Fun!!");
        System.out.println("Press Enter to Continue.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Clear Console
        clearConsole();
        pageDisplay.indexPage();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userSelect = reader.readLine();
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        while(!userSelect.equals("Exit")){
           // If select is View All Recipes
           // If select is Search By name
           // If select is create recipe
           if (userSelect.equals("3")){
               clearConsole();
               pageDisplay.createRecipe();
               userSelect = reader.readLine();
               if(userSelect.equals("Main")){
                   clearConsole();
                   pageDisplay.indexPage();
               }
               else{
                   creation.main(null);
                   System.out.println("Going Back to the Main Menu!");
                   pageDisplay.indexPage();

                    // Save recipe object in an array, we will use this later to step through
               }
           }
           else if (userSelect.equals("2")){
               clearConsole();

               while (!userSelect.equals("Main")) {
                   pageDisplay.searchSelect();
            	   userSelect = reader.readLine();
                   search.searchRecipe(userSelect);
                    
                    // Method of ShowAndSelect
                   System.out.println("To Go Back to Main Page: Type : Main");
                   System.out.println("To Continue Searching: Type Anything Else");
                   userSelect = reader.readLine();
                   if(userSelect.equals("Main")){
                       clearConsole();
                       pageDisplay.indexPage();
                   }
            	   

               }
               
           }
           
           else if (userSelect.equals("1")) {
    		   clearConsole();
        	   pageDisplay.showAll();
               printAll.viewNames();
               
        	   while (!userSelect.equals("Main")) {
                   pageDisplay.selectRecipe();
                   userSelect=reader.readLine();
                   printAll.printRecipe(userSelect);
            	   
                   
                   System.out.println("To Go Back to Main Page: Type : Main");
                   System.out.ptintln("If you need to look at the list of recipes again: Type: List")
                   System.out.println("To Continue to other recipes without checking the list again: Type Anything Else");
                   userSelect = reader.readLine();
                   if(userSelect.equals("Main")){
                       clearConsole();
                       pageDisplay.indexPage();
                   }
                   if(userSelect.equals("List")) {
                	   printAll.viewNames();
                   }
        		   
        	   }
        	  
        	   
           }
            userSelect = reader.readLine();
        }         
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
           

    }


}
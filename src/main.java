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
                //    creation.main();
                // Save recipe object in an array, we will use this later to step through
                
               }
           }
           else if (userSelect.equals("2")){
               clearConsole();
               pageDisplay.showAll();
            
                // Method of ShowAndSelect


               System.out.println("To Go Back to Main Page: Type : Main");
               
               if(userSelect.equals("Main")){
                   clearConsole();
                   pageDisplay.indexPage();
               }
           }
            userSelect = reader.readLine();
        }         
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
           

    }


}
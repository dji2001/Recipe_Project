import java.io.*;
import java.util.*;

class creation {
    
    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String [] args){
        

        recipe newRecipe = new recipe();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userSelect = reader.readLine();
        System.out.println("Enter the Name: ");
        userSelect = reader.readLine();
        newRecipe.setName(userSelect);
        System.out.println("Enter the Description: ");
        userSelect = reader.readLine();
        newRecipe.setDescription(userSelect);
        clearConsole();
        System.out.println("Now, we will start adding the ingredients: ");
        System.out.println("Add the ingredient when prompted, if done with the current ingredient, type Done");
        System.out.println("If you want to exit the program: type Exit");
        userSelect = reader.readLine();
        int count = 1;
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        while(!userSelect.equals("Exit") || !userSelect.equals("Done")){
            System.out.println("Ingredient # " + Integer.toString(count));
            count++;
            
            newRecipe.getIngredientlist().put(count, userSelect);
            userSelect = reader.readLine();
        }
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        System.out.println("Now, we will start adding the instructions: ");
        System.out.println("Add the instruction when prompted, if done with the current instruction, type Done");
        System.out.println("If you want to exit the program: type Exit");
        userSelect = reader.readLine();
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        count = 1;
        while(!userSelect.equals("Exit") || !userSelect.equals("Done")){
            System.out.println("Ingredient # " + Integer.toString(count));
            count++;
      
            newRecipe.getInstructionlist().put(count, userSelect);
            userSelect = reader.readLine();
        }
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        
        // Save and create a text file
        final String outputFilePath = "F:/Recipe_Project/src/recipes" + newRecipe.getName();
        File file = new File(outputFilePath + ".txt");
        BufferedWriter bf =  null;
        bf = new BufferedWriter(new FileWriter(file));
        bf.write("Recipe Name : " + newRecipe.getName());
        bf.newLine();
        bf.write("Description: ");
        bf.newLine();
        bf.write(newRecipe.getDescription());

        
        // Now we add the ingredients:
        for (Map.Entry<Integer, String> entry: newRecipe.getIngredientlist().entrySet()){
            bf.write(entry.getKey() + ": " + entry.getValue());
            bf.newLine();
        }

        // Finally the instruction: 
        for (Map.Entry<Integer, String> entry: newRecipe.getInstructionlist().entrySet()){
            bf.write(entry.getKey() + ": " + entry.getValue());
            bf.newLine();
        }

        // Close the writer and reader

        bf.close();
        reader.close();
        System.out.println("And we are Done! Recipe, successfully added!");
        
    }

}
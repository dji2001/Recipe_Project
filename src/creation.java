import java.io.*;
import java.util.*;

class creation {
    
    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String [] args) throws IOException{
        

        recipe newRecipe = new recipe();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userSelect;
        System.out.println("Enter the Name: ");
        userSelect = reader.readLine();
        newRecipe.setName(userSelect);
        System.out.println("Enter the Description: ");
        userSelect = reader.readLine();
        newRecipe.setDescription(userSelect);
        clearConsole();
        System.out.println("Now, we will start adding the ingredients: To Start : Type: Start");
        System.out.println("Add the ingredient when prompted, if done with the current ingredient, type DONE");
        System.out.println("If you want to exit the program: type Exit");
        userSelect = reader.readLine();
        int count = 0;
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        if (userSelect.equals("Start")){
            System.out.println("Please enter the ingredients below:");
        }
        
        while((!userSelect.equals("Exit") && !userSelect.equals("DONE"))){

           
            System.out.println("Ingredient # " + Integer.toString(count+1));
            count++;
            
            userSelect = reader.readLine();
            newRecipe.getIngredientlist().put(count, userSelect);
            
           
        }
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        clearConsole();
        System.out.println("Now, we will start adding the instructions: To Start : Type: Start");
        System.out.println("Add the instruction when prompted, if done with the current instruction, type DONE");
        System.out.println("If you want to exit the program: type Exit");
        userSelect = reader.readLine();
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        count = 0;
        while((!userSelect.equals("Exit") && !userSelect.equals("DONE"))){
            
            System.out.println("Instruction # " + Integer.toString(count+1));
            count++;
      
            
            userSelect = reader.readLine();
            newRecipe.getInstructionlist().put(count, userSelect);
            
            
        }
        if (userSelect.equals("Exit")){
            System.exit(0);
        }
        
        // Save and create a text file
        char ch = '_';
        String modifiedName = newRecipe.getName().replace(' ', ch); 
        final String outputFilePath = "recipes/"+ modifiedName;
        try{
            File file = new File(outputFilePath + ".txt");
            BufferedWriter bf =  null;
            bf = new BufferedWriter(new FileWriter(file));
            bf.write("Recipe Name : " + newRecipe.getName());
            bf.newLine();
            bf.write("Description: ");
            bf.write(newRecipe.getDescription());
            bf.newLine();
            
            // Now we add the ingredients:
            bf.write("Ingredients: ");
            bf.newLine();
            for (Map.Entry<Integer, String> entry: newRecipe.getIngredientlist().entrySet()){
                bf.write(entry.getKey() + ": " + entry.getValue());
                bf.newLine();
            }

            // Finally the instruction: 
            bf.write("Instructions: ");
            bf.newLine();
            for (Map.Entry<Integer, String> entry: newRecipe.getInstructionlist().entrySet()){
                bf.write(entry.getKey() + ": " + entry.getValue());
                bf.newLine();
            }

            // Close the writer and reader

            bf.close();
            reader.close();
            System.out.println("And we are Done! Recipe, successfully added!");
        }
        catch (Exception e){
            e.getStackTrace();
        }
        
    }

}
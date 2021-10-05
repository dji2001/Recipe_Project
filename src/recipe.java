import java.util.*;

class recipe{
    private String recipeName;
    private String description;

    // Ingredient List and Step by Step Instruction

    private HashMap<Integer, String> ingredientList = new HashMap<Integer, String>();
    private HashMap<Integer, String> instructionList = new HashMap<Integer, String>();


    // Getter Methods
    public String getName(){
        return this.recipeName;
    }
    public String getDescription(){
        return this.description;
    }
    public HashMap<Integer, String> getIngredientlist(){
        return this.ingredientList;
    }
    public HashMap<Integer, String> getInstructionlist(){
        return this.instructionList;
    }

    // Setter Methods
    public void setName(String newName){
        this.recipeName = newName;
    }
    public void setDescription(String description){
        this.description = description;
    }     

    public void ingredientList(String description){
        this.description = description;
    }  

    public static void main(String args[]){}

}
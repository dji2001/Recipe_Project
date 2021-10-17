import java.util.*;
import java.io.*;

class printAll{
    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
	
	public static void viewNames(){
		List<String> names= new ArrayList<String>();

		File[] files = new File("./recipes").listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        names.add(file.getName());
		    }
		}   
		for (String recipeName: names) {
			System.out.println(recipeName.substring(0, recipeName.indexOf(".")));
		}
	}
    public static void printRecipe(String name) throws IOException {

		File[] files = new File("./recipes").listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 
		boolean fileFound = false;
		for (File tempFile : files) {
		    if (tempFile.isFile()) {
		    	String temp = tempFile.getName();
		       
				if (temp.substring(0, temp.indexOf(".")).equals(name)) {
						System.out.println("Opening the recipe for you:");
						System.out.println(temp.substring(0, temp.indexOf(".")));
						fileFound = true;
						String fileName = "./recipes/" + temp.substring(0, temp.indexOf(".")) + ".txt";
						File file = new File(fileName);
						BufferedReader br = new BufferedReader(new FileReader(file));
						String read;
						while ((read = br.readLine()) != null) {
				            System.out.println(read);
						}
						
				}
				
		    }

		    
		}  
		if (!fileFound) {
			System.out.println("Sorry, that is not a recipe in database");
		}
		
    }

	
		
	
	
	
}

import java.util.*;
import java.io.*;
import java.io.*;

public class search {
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
	
    public static void searchRecipe(String name) throws IOException {

		File[] files = new File("./recipes").listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 
		boolean fileFound = false;
		for (File tempFile : files) {
		    if (tempFile.isFile()) {
		    	String temp = tempFile.getName();
		       
				if (temp.substring(0, temp.indexOf(".")).equals(name)) {
						System.out.println("Your recipe was found! Below are the details:");
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
			System.out.println("Sorry, your recipe was not found.");
		}
		
    }

	
	
	
	
}
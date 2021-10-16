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
	
	public static void main() {
		viewNames();
	}
		
	
	
	
}

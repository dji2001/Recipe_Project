import java.util.*;
import java.io.*;

public class search {
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
	
    public static void searchRecipe(String name) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println();
		File[] files = new File("./recipes").listFiles();
		System.out.println(files);
		if (files == null) {
			System.out.println("test");
		}

		boolean fileFound = false;
		for (File tempFile : files) {
		    if (tempFile.isFile()) {
		    	String temp = tempFile.getName().toLowerCase();
		    	String temp2 = temp.replace("_", "");
				if (temp2.substring(0, temp2.indexOf(".")).equals(name)) {
						System.out.println("Your recipe was found!");
						System.out.println("If you would you like to read the entire recipe, enter '1'");
						System.out.println("However, if you would like to read one instruction at a time, enter '2'");
						String answer = scanner.nextLine();
						while (!(answer.equals("1")) && !(answer.equals("2"))) {
							System.out.println("Sorry, please enter '1' or '2'.");
							answer = scanner.nextLine();
						}
						fileFound = true;
						String fileName = "./recipes/" + temp.substring(0, temp.indexOf(".")) + ".txt";
						File file = new File(fileName);
						BufferedReader br = new BufferedReader(new FileReader(file));
						String read;
						if (answer.equals("1")) {
							while ((read = br.readLine()) != null) {
					            System.out.println(read);
							}
						}
						else {
							while ((read = br.readLine()) != null) {
								System.out.println("Type any character to read the next step or ingredient.");
								String next = scanner.nextLine();
					            System.out.println(read);
							}
						}
						
						
						
				}
				
		    }

		    
		}  
		if (!fileFound) {
			System.out.println("Sorry, your recipe was not found.");
		}
		
    }

	
	
	
	
}
package co.gc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CountriesTextFile {

	public static void main(String[] args) {
		readFromFile();
	}

	public static void readFromFile() {
		String Countries = "countries.txt";
		Path path = Paths.get(Countries);
		
		File file = path.toFile();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = br.readLine();

			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Something happened with the file");
		} catch (IOException e) {
			System.out.println("Something happened when attempting to read from the file...");
		}
	}
	
	public static void writeToFile() {
		String Countries = "countries.txt";
		Path path = Paths.get(Countries);
		File file = path.toFile();
		PrintWriter output = null;
		Country india = new Country("India", "1,339,000,000");
		Country usa = new Country("The United States", "32,570,000");
		Country china = new Country("China", "1,386,000,000");
		Country rwanda = new Country("Rwanda", "12,210,000");

		try {
			output = new PrintWriter(new FileOutputStream(file, false));
			output.println(india);
			output.println(usa);
			output.println(china);
			output.println(rwanda);

		} catch (FileNotFoundException e) {
			System.out.println("Contact customer service");
		} finally {
			output.close();
		}
	}
	public static void createOurFile() {
		String Countries = "countries.txt";

		Path path = Paths.get(Countries);

		if (Files.notExists(path)) {
			try {
				Files.createFile(path);
				System.out.println("The file was created successfully");
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println("Something went teribly wrong!");
			}
		} else {
			System.out.println("The file already exist!");
		}

}
}

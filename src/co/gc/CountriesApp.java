package co.gc;


import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println("1- See the list of countries\n2- Add a country\n3- Exit\n");
		int userChoice = Validator.getInt(scan, "Enter menu number: ", 1, 3);
		
		
		
	}
}

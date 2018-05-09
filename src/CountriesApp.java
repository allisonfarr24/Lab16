import java.util.Scanner;

//Alli Farr 5/9/2018 Lab16

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		System.out.println("Welcome to the Countries Maintenance Application!");

		do {
			System.out.println("1: See the list of countries");
			System.out.println("2: Add a country");
			System.out.println("3: Exit");
			num = Validator.getInt(scan, "Enter menu number: ", 1, 3);
			if (num == 1) {
				// display list
				CountriesTextFile.readFromFile();
			} else if (num == 2) {
				// prompt user to enter a country and then write the country to the file

				String country = Validator.getString(scan, "Enter Country: ");

				//CountriesTextFile c = new CountriesTextFile();

				CountriesTextFile.writeToFile(country, "countries.txt");

				System.out.println("This country has been saved!");

			} else {
				System.out.println("Goodbye!");
			}
		} while (num == 1 || num == 2);

	}

}

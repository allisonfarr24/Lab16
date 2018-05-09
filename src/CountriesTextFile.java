import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {
	
	

	// method that allows user to read a list of countries from a file
	public static void readFromFile() {
		Path readFile = Paths.get("countries.txt");
		File file = readFile.toFile(); // convert to a file object

		try {
			FileReader fr = new FileReader(file);

			BufferedReader reader = new BufferedReader(fr);

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			System.out.println("Something went wrong!");
		}
	}

	// method that allows users to write a list of countries to a file

	public static void writeToFile(String c, String fileName) {

		Path writeFile = Paths.get(fileName);
		File file = writeFile.toFile();

		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));// FileOutputStream can take 2
																					// parameters
			outW.println(c);
			outW.close(); // flushes data closes the stream

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found here...");
		}

	}

}

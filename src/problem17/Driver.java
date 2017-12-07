package problem17;

import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Driver {
	static String delimiters = ", ";

	public static int[][] Scores(Scanner s) {
		int n = 0;

		String header = s.nextLine();
		return null;
	}

	public static void main(String[] args) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("Ratings.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);
		}
		int numLines = 0;
		// int numProducts=0;
		while (fileIn.hasNextLine())
			numLines++;
	}

}

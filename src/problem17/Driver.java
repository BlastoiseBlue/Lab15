package problem17;

//import EnhancedStringTokenizer;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Driver {
	static String delimiters = ", ";
	static String header = null;

	public static int[][] Scores(Scanner s) {
		int numLines = 0;

		while (s.hasNextLine())
			numLines++;
		int[][] arr = new int[numLines][];
		for (int i = 0; i < numLines; i++) {
			String thisLine = s.nextLine();
			String[] a = thisLine.split(",");
			for (int j = 0; j < a.length; j++) {
				arr[i][j] = Integer.parseInt(a[j]);
			}
		}

		return arr;
	}

	public static void printScores(int[][] arr) {
		System.out.println(header);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if (j < arr[i].length - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
	}

	public static void printScores(Scanner s) {
		printScores(Scores(s));
	}

	public static void main(String[] args) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("Ratings.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);
		}
		String header = fileIn.nextLine();
		int[][] ratings=Scores(fileIn);
		printScores(ratings);
	}

}

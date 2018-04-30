import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_RandomMessageRepeater {

	public static void main(String[] args) {
		whileRepeater("Why would a Pop-Tart want to live inside a toaster?");

	}

	public static void whileRepeater(String phrase) {
		int guard = 0;
		Scanner console = new Scanner(System.in);
		do {

			System.out.println(phrase);
			System.out.println("Do you want to hear it again (-1 for no)?");
			guard = console.nextInt();

		} while (guard >= 0);

	}

}

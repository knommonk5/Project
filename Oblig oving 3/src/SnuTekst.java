import java.util.Scanner;

public class SnuTekst {

	private static Scanner in = new Scanner(System.in);

	private static int antall = 0;

	public static void main(String[] args) {
		System.out
				.println("Skriv inn det du vil snu");
		String tekst = in.nextLine();

		baklengs(tekst);
	}

	public static void baklengs(String tekst) {
		baklengs(tekst, tekst.length() - 1);
	}
	
	public static void baklengs(String tekst, int index) {
		if (index >= 0) {
			System.out.print(tekst.charAt(index));
			antall++;
			baklengs(tekst, index - 1);
		} else {
			System.out.println("\nDet er totalt " + antall + " ord.");
			antall = 0;
		}
	}
}
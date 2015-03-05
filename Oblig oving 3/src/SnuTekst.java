import java.util.Scanner;

public class SnuTekst1 {

	private static Scanner in = new Scanner(System.in);

	private static int antall = 0;

	public static void main(String[] args) {
		System.out
				.println("Skriv inn det du vil snu");
		String tekst = in.nextLine();

		baklengs(tekst);
	}

	public static void baklengs(String tekst) {
		if (tekst.length() > 0) {
			System.out.print(tekst.charAt(tekst.length() - 1));
			antall++;
			baklengs(tekst.substring(0, tekst.length() - 1));
		} else {
			System.out.println("Det er totalt" + antall + " ord.");
			antall = 0;
		}
	}
}
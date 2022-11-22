import java.util.ArrayList;
import java.util.Scanner;

public class ExVectorList {
	public static void main(String[] args) {

		System.out.println("Citeste si afiseaza numerele unui vector");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Numar de elemente: ");
		int numar = scanner.nextInt();

		ArrayList<String> v = new ArrayList<>();

		for (int i = 0; i < numar; i++) {
			System.out.print("V[" + i + "]=");
			v.add(scanner.next());
		}

		for (int i = 0; i < numar; i++) {
			System.out.println("V[" + i + "]=" + v.get(i));
		}

	}
}
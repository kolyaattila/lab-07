import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxNumberVector {

	public static void main(String[] args) {
		System.out.println("Citeste si afiseaza max unui vector");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Numar de elemente: ");
		int numar = scanner.nextInt();

		ArrayList<Integer> v = new ArrayList<>();

		for (int i = 0; i < numar; i++) {
			System.out.print("V[" + i + "]=");
			v.add(scanner.nextInt());
		}

		int max = v.get(0);
		for (int i = 1; i < numar; i++) {
			if (max < v.get(i)) {
				max = v.get(i);
			}
		}

		System.out.println("Valoarea maxima este: " + max);
	}

}

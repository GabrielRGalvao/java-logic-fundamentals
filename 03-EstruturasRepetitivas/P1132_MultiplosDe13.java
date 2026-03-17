import java.util.Scanner;

public class P1132_MultiplosDe13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int min;
		int max;

		if (x < y) {
			min = x;
			max = y;

		} else {
			min = y;
			max = x;
		}

		int soma = 0;

		for (int i = min; i <= max; i++) {

			if (i % 13 != 0) {
				soma += i;

			}

		}
		System.out.println(soma);

		sc.close();
	}

}

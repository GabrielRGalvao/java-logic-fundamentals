import java.util.Locale;
import java.util.Scanner;

public class P1045_TiposDeTriângulos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double aux;

		if (B > A) {
			aux = A;
			A = B;
			B = aux;
		}
		if (C > A) {
			aux = A;
			A = C;
			C = aux;
		}
		if (C > B) {
			aux = B;
			B = C;
			C = aux;
		}

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");

		} else {

			if (A * A == (B * B + C * C)) {
				System.out.println("TRIANGULO RETANGULO");

			} else if (A * A > (B * B + C * C)) {
				System.out.println("TRIANGULO OBTUSANGULO");

			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}

		}
		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");

		} else if (A == B || B == C || C == A) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		sc.close();

	}

}

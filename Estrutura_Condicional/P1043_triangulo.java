import java.util.Locale;
import java.util.Scanner;

public class P1043_triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double aux;
		double perimetro;
		double area;

		if (b > a) {
			aux = a;
			a = b;
			b = aux;

		}
		if (c > a) {
			aux = a;
			a = c;
			c = aux;

		}
		if (c > b) {
			aux = b;
			b = c;
			c = b;
		}

		if (a < (b + c)) {
			perimetro = (a + b) + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);

		} else {
			area = (a + b) * c / 2;
			System.out.printf("Area = %.1f%n", area);
		}

		sc.close();

	}

}

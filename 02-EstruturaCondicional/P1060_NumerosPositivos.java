import java.util.Locale;
import java.util.Scanner;

public class P1060_NumerosPositivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int positivos = 0;
		
		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();
			
			if (valor > 0) {
				positivos++;
			}
		}
		System.out.println(positivos + " valores positivos");
		
		sc.close();
	}

}

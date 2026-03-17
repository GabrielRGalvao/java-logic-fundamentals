import java.util.Scanner;

public class P1042_SortSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int aux;

		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;

		}
		if (num1 > num3) {
			aux = num1;
			num1 = num3;
			num3 = aux;

		}
		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
			
			System.out.printf("%d%n %d%n %d%n", num1, num2, num3);
		}
			
		
		

		sc.close();
	}

}

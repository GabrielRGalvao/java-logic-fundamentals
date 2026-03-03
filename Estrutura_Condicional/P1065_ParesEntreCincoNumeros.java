import java.util.Scanner;

public class P1065_ParesEntreCincoNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par = 0;
		
		for (int i = 0; i < 5; i++) {
			int valor = sc.nextInt();
			
			if(valor % 2 == 0) {
				par ++;
				
			}
		}
		System.out.println(par + " valores pares");
		
		sc.close();
	}

}

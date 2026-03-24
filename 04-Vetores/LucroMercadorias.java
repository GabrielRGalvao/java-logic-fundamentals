import java.util.Locale;
import java.util.Scanner;

public class LucroMercadorias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] mercadoria = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];
		
		for(int i = 0; i < n; i++) {
			mercadoria[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}

		int contAbaixoDe10 = 0;
		int contEntre10e20 = 0;
		int contAcimaDe20 = 0;
		double totalCompra = 0.00;
		double totalVenda = 0.00;

		for (int i = 0; i < n; i++) {
			double valorLucro = venda[i] - compra[i];
			double porcentagemLucro = valorLucro * 100 / compra[i];

			if (porcentagemLucro < 10) {
				contAbaixoDe10++;

			} else if (porcentagemLucro < 20) {
				contEntre10e20++;

			} else {
				contAcimaDe20++;
			}
			
			totalCompra += compra[i];
			totalVenda += venda[i];
			
		}
		
		double lucroTotal = totalVenda - totalCompra;
		
		System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
		System.out.println("Lucro entre 10% e 20%: " + contEntre10e20);
		System.out.println("Lucro acima de 20%: " + contAcimaDe20);
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("valor total de venda: %.2f%n", totalVenda);
		
		System.out.printf("Valor total lucro: %.2f%n", lucroTotal);
		
		sc.close();
	}

}

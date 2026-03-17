import java.util.Scanner;

public class P1049_Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String p1 = sc.next();
		String p2 = sc.next();
		String p3 = sc.next();

		if (p1.equals("vertebrado")) {
			if (p2.equals("ave")) {
				if (p3.equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (p2.equals("mamifero")) {
					if (p3.equals("onivoro")) {
						System.out.println("homem");
					} else {
						System.out.println("vaca");
					}
				}
			}
		} else {
			if (p1.equals("invertebrado")) {
				if (p2.equals("inseto")) {
					if (p3.equals("hematofago")) {
						System.out.println("pulga");
					}
				} else {
					if (p2.equals("anelideo")) {
						if (p3.equals("onivoro")) {
							System.out.println("minhoca");
						}else {
							System.out.println("sanguessuga");
						}
					}
				}
			}
		}

		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, c, d;
		System.out.print("Digite quatro números inteiros separados por espaços (A B C D): ");

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		int diferenca = (a * b - c * d);

		System.out.printf("A diferença do produto de A e B pelo produto de C e D é: %d", diferenca);

		scan.close();

	}

}

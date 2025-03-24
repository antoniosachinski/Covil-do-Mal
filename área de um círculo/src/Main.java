import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor do raio de um circulo: ");
		double raio = scan.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);
		System.out.printf(" A área do circulo é: %.4f", area);
		scan.close();

	}
	
}

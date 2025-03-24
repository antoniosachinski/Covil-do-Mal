import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int a;
	    System.out.print("Digite um número inteiro para verificar se é positivo ou negativo: ");
	    a = scan.nextInt();
	    if (a > 0){
	      System.out.println("Positivo!");
	    }
	    else{
	      System.out.println("Negativo!");
	    }
	    scan.close();

	}

}

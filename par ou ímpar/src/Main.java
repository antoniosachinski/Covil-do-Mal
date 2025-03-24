// fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a;
	    System.out.print("Digite um número inteiro: ");
	    a = scan.nextInt();
	    if (a % 2 == 1){
	      System.out.println("Impar!");
	    }
	    else{
	      System.out.println("Par!");
	    }
	    scan.close();

	}

}

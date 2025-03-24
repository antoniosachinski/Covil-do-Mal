// leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    
	    int a, b;
	    System.out.print("Digite um número inteiro: ");
	    a = scan.nextInt();
	    System.out.print("Digite outro número inteiro: ");
	    b = scan.nextInt();
	   
	    if (a % b == 0){
	        System.out.println("Sao Multiplos");
	    }
	    else if (b % a == 0){
	      System.out.println("Sao Multiplos");
	    }
	    else {
	      System.out.println("Nao sao Multiplos");
	    }
	    
	    scan.close();

	}

}

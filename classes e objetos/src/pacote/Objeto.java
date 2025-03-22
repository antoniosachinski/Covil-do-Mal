package pacote;

public class Objeto {
	String nome;
	String cor;
	int altura;
	double valor;
	void status() {
		
		System.out.printf("Nome: %s%n", this.nome);
		System.out.printf("Cor: %s%n", this.cor);
		System.out.printf("Altura: %d cm%n", this.altura);
		System.out.printf("Valor: %.2f",  this.valor);
	}
}

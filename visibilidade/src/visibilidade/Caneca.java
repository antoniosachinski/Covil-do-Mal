package visibilidade;

public class Caneca {
	
	public String cor;
	private int altura; // não  vai poder ser chamada em outra classe
	protected double valor;
	public void status() {
		
		System.out.printf("Cor: %s%n", this.cor);
		System.out.printf("Altura: %d cm%n", this.altura);
		System.out.printf("Valor: %.2f",  this.valor);
		
	}
	
}

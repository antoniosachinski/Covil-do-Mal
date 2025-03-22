package pacote;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Objeto objeto01 = new Objeto();
		objeto01.nome = "caneca";
		objeto01.cor = "bege";
		objeto01.altura = 11;
		objeto01.valor = 13.453;
		objeto01.status();

	}

}

package visibilidade;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Caneca objeto01 = new Caneca();
		objeto01.cor = "bege";
		objeto01.valor = 13.453;
		objeto01.status();

	}

}

package david.augusto.luan.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteracaoExemplo1 {

	public static void main(String[] args) {

		// criacao de strings
		List<String> valores = Arrays.asList("1", "2", "3");
		// encapsulando a interacao
		Iterator<String> it = valores.iterator();
		int soma = 0;
		// verifica se existem mais elementos para serem iterados
		while (it.hasNext()) {
			// soma entre as strings
			soma += Integer.parseInt(it.next());
		}

		System.out.println("Soma: " + soma);
	}
}

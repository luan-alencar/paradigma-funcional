package david.augusto.luan.loop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteracaoExemplo1 {

	public static void main(String[] args) {

		// criacao de strings
		List<String> valores = Arrays.asList("5", "10", "15");
		// encapsulando a interacao
		Iterator<String> iteracao = valores.iterator();
		int soma = 0;
		// verifica se existem mais elementos para serem iterados
		while (iteracao.hasNext()) {
			// soma entre as strings
			soma += Integer.parseInt(iteracao.next());
		}
		System.out.println("Soma: " + soma);
	}
}

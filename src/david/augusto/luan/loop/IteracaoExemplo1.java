package david.augusto.luan.loop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteracaoExemplo1 {

	public static void main(String[] args) {

		// criacao de string
		List<String> valores = Arrays.asList("10", "20", "30");
		// encapsulando a interacao
		Iterator<String> iteracao = valores.iterator();
		int soma = 0;
		// verificacao se existem mais elementor a serem interados
		while (iteracao.hasNext()) {
			soma += Integer.parseInt(iteracao.next());
		}

		System.out.println("Soma: " + soma);

	}
}

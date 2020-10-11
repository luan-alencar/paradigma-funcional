package david.augusto.luan.loop;

import java.util.Arrays;
import java.util.List;

public class IteracaoExemplo3 {

	public static int exemplo3() {
		// criacao da lista de string com seus respectivos elementos
		List<String> valores = Arrays.asList("5", "10", "20"); // 35
		// utilizando da Java API stream() - surgiu a partir da edicao 8
		final int soma = valores.stream()
				// convertendo um valor String para inteiro com o metodo map()
				.map(item -> Integer.parseInt(item))
				// somando os elementos com o metodo reduce()
				.reduce(0, (a, b) -> a + b);
		// retornando o resultado do encapsulamento da API Java stream()
		return soma;
	}
}

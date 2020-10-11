package david.augusto.luan.loop;

import java.util.Arrays;
import java.util.List;

public class IteracaoExemplo2 {

	public static int somaValores() {
		// criacao do array cm seus valores
		List<String> valores = Arrays.asList("1", "2", "3");
		int soma = 0; // variavel para retorna o resultado ao final
		// forEach para somar cada elemento
		for (String total : valores) {
			// convertendo string para inteiro
			soma += Integer.parseInt(total);
		}
		return soma;
	}
}

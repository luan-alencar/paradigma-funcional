package david.augusto.luan.loop;

import java.util.Arrays;
import java.util.List;

public class IteracaoExemplo2 {

	public static int somaValores() {

		List<String> valores = Arrays.asList("1", "2", "3");
		int soma = 0;
		for (String total : valores) {
			soma += Integer.parseInt(total);
		}
		return soma;
	}
}

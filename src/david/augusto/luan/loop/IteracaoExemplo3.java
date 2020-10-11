package david.augusto.luan.loop;

import java.util.Arrays;
import java.util.List;

public class IteracaoExemplo3 {

	public static int exemplo3() {
		List<String> valores = Arrays.asList("5", "10", "20"); // 35
		final int soma = valores.stream()
				.map(item -> Integer.parseInt(item))
				.reduce(0, (a, b) -> a + b);
		return soma;
	}
}

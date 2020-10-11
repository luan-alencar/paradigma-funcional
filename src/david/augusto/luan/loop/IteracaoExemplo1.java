package david.augusto.luan.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteracaoExemplo1 {

	public static void main(String[] args) {

		List<String> valores = Arrays.asList("1", "2", "3");
		Iterator<String> it = valores.iterator();
		int soma = 0;
		while (it.hasNext()) {
			soma += Integer.parseInt(it.next());
		}

		System.out.println("Soma: " + soma);
	}
}

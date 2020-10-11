package david.augusto.luan.testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import david.augusto.luan.loop.IteracaoExemplo2;

public class TestExemplo2 {

	@Test
	void testExemplo2() {
		assertEquals(6, IteracaoExemplo2.somaValores());
	}
}

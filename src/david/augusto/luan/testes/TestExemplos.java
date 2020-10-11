package david.augusto.luan.testes;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import david.augusto.luan.loop.IteracaoExemplo2;
import david.augusto.luan.loop.IteracaoExemplo3;

public class TestExemplos {

	@Test
	void testExemplo2() {
		assertEquals(6, IteracaoExemplo2.somaValores());
	}

	@Test
	void testExemplo3() {
		assertEquals(35, IteracaoExemplo3.exemplo3());
	}

}

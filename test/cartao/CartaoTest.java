package cartao;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName ("Classe para teste do cartão")
public class CartaoTest {
	Cartao cartaoClass;

	@Test
	public void testToString() {
	    String stringEsperada = "[CARTAO DE CREDITO]\nAPELIDO: João Silva\n"
	    		+ "NUMERO DO CARTAO: 1234567890123456\nCVC: 123\nVALIDADE: 12/2023\nIDENTIFICACAO: João Silva";
	    assertEquals(stringEsperada, cartaoClass.toString());
	}
}



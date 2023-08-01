package cartao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import interfaceUsuario.verificadores.dados.VerificadorEntrada;

public class CartaoPremiumTest {
	CartaoPremium cartaoPremiumClass;


//	@Test
//	public void testCartaoPremiumConstructor() {
//	assertEquals("John Doe", cartaoPremiumClass.getNomeTitular());
//	assertEquals("1234-5678-9012-3456", cartaoPremiumClass.getNumeroCartao());
//	assertEquals("12/23", cartaoPremiumClass.getDataValidade());
//	assertEquals("123", cartaoPremiumClass.getCodigoSeguranca());
//	assertEquals(VerificadorEntrada.PREMIUM, cartaoPremiumClass.getTipoCartao());
//	assertEquals(30000.0, cartaoPremiumClass.getLimiteMaximo());
//	}


	@Test
	public void testGetLimiteMaximo() {
	assertEquals(30000.0, cartaoPremiumClass.getLimiteMaximo());
	}

//	@Test
//	(expected = IllegalArgumentException.class)
//	public void testGetLimiteMaximoWithNegativeLimit() {
//	CartaoPremium cartaoPremium = new CartaoPremium("John Doe", null);
//	cartaoPremium.setLimiteMaximo(-1.0);
//	}
	

}

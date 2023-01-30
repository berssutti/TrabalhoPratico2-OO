package testesJUnit;
/**
 * Implementa testes unitarios de valida��o
 * @author Bernardo Pissutti
 * @version 1.0 [out 2021] 
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import control.*;

class TesteValida��o {
	ControlDados dados = new ControlDados();
	String[] novoDado = new String[13];
	
	/**
	 * Verifica se o parametro 3, representando a posi��o do cliente da array, 
	 * funciona para o m�todo em quest�o 
	 * @return void
	 */
	@Test
	void testDeletarCliente() {
		assertTrue(dados.deletarCliente(3));
	}
		/**
		 * Verifica se o parametro novoDado, representando novos dados para um objeto microondas
		 * funciona para o m�todo em quest�o 
		 * @return void
		 */
	@Test
	void testCadastrarEditarMicroondas() {
		novoDado[0] = "0";
		novoDado[1] =  "Microondas";
		novoDado[2] =  "15";
		novoDado[3] =  "4 anos";
		novoDado[4] =  "Bonito";
		novoDado[5] =  "Brastemp";
		novoDado[6] =  "560";
		novoDado[7] =  "29310983";
		novoDado[8] =  "5";
		novoDado[9] =  "13";
		novoDado[10] =  "60";
		novoDado[11] =  "120";
		novoDado[12] =  "30";
		assertTrue(dados.cadastrarEditarMicroondas(novoDado));
	}
	/**
	 * Verifica se o m�todo em quest�o est� funcionando corretamente, dado os parametros
	 * @return void
	 */
	@Test
	void testEncontraCpfCliente() {
		assertEquals(0,dados.encontraCpfCliente("CPF0") );
	}

}

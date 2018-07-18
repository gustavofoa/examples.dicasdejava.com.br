package br.com.dicasdejava.mockito.verificarSeMetodoFoiChamado;

import org.junit.Test;
import org.mockito.Mockito;

public class ClasseSendoTestadaTest {

	@Test
	public void testeMetodoFoiChamado(){

		//Cria Mock da dependência
		DependenciaDaClasseSendoTestada dependencia = Mockito.mock(DependenciaDaClasseSendoTestada.class);

		//Instancia a classe sendo testada passando a dependência Mockada
		ClasseSendoTestada classeSendoTestada = new ClasseSendoTestada(dependencia);

		//chama o método sendo testado
		classeSendoTestada.metodoSendoTestado("parâmetro-teste");

		//Verifica se o método da dependência foi chamado
		Mockito.verify(dependencia, Mockito.times(1)).metodoQueSeraChamado("parâmetro-teste");

	}

}

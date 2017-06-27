package br.com.dicasdejava.mockito.verificarSeMetodoFoiChamado;

public class ClasseSendoTestada {

	DependenciaDaClasseSendoTestada dependencia;

	public ClasseSendoTestada(DependenciaDaClasseSendoTestada dependencia){
		this.dependencia = dependencia;
	}

	void metodoSendoTestado(String parametro){
		dependencia.metodoQueSeraChamado(parametro);
	}

}



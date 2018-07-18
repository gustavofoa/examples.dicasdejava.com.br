package br.com.dicasdejava.fundamentos;

/**
 * Esta classe é um exemplo de classe que tem comentários do tipo Javadoc
 */
public class ClasseComJavadoc {

	/**
	 * Este é um comentário de Javadoc
	 * @param parametro - este é um parâmetro do método
	 * @return Este metodo retorna falso (sempre)
	 * @throws Exception - Esta exeption nunca é lançada neste método,
	 * mas tá aqui pra exemplificar o comentário Javadoc para Exceptions
	 */
	public boolean outroMetodo(String parametro) throws Exception {
		return false;
		//Comentários de Javadoc iniciam com /**
		//O comentário deste método é um comentário de Javadoc
		//Mas estes comentários aqui de dentro do método não são do tipo Javadoc
	}

}

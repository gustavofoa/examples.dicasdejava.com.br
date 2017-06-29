package br.com.dicasdejava.fundamentos;

public class ComentariosEmjava {

	public static void main(String[] args) {

		String texto = "Este é um código sem comentário.";
		System.out.println(texto);

		//Este é um comentário de linha.
		//Este comentário pode aparecer em qualquer parte do arquivo .java
		//Tudo que estiver depois dos caracteres // é um comentário
		texto = "Outro comando";//Mesmo que seja uma linha que já tenha um comando.
		//Porém após abrir o comentário com // ele não pode ser fechado na linha.
		System.out.println(texto);

		/*Comentário interno da linha*/
		/*Este tipo de comentário deve ser fechado com */
		/*Ele pode inclusive ocupar
		mais de uma linha, mas deve ser fechado! */

		//Após fechar o comenário interno de linha pode ter um comando java
		/*Comentário de exemplo*/texto = "mais um comando";
		System.out.println(texto);

		texto /*este comentário pode estar no meio da linha*/ = "Outro comando";
		System.out.println(texto);

		texto = "Dentro de uma String não pode ter comentário " +
		"/*isso continua sendo um texto, não é comentário*/.";
		System.out.println(texto);

		//Comentários dentro de linha só não pode estar no meio de uma palavra do comando
		//Como este exemplo:
		//Str/*comentario*/ing texto2 = "teste";
		//Ou neste outro exemplo:
		//String tex/*comentario*/to = "teste;

		/*
		 * Bloco de comentário:
		 * Este bloco de comentário não é diferente do comentário interno de linha
		 * Mas é muito utilizado para organização do código com esses * no inicio.
		 * Geralmente vemos este tipo de comentário
		 * para descrever o funcionamento de um método ou uma classe.
		 * Como na descrição do método abaixo
		 */

	}

	/*
	 * Este método não faz nada!
	 * Este comentário descreve o método abaixo
	 */
	public void metodo(){

	}

}
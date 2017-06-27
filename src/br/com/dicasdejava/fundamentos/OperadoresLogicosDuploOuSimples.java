package br.com.dicasdejava.fundamentos;

public class OperadoresLogicosDuploOuSimples {

	public static void main(String[] args) {

		System.out.println("false && true = " +
				(primeiraCondicao(false) && segundaCondicao(true)) +
				" - sem teste da segunda condição.");

		System.out.println();

		System.out.println("false & true = " +
				(primeiraCondicao(false) & segundaCondicao(true)) +
				" - com teste da segunda condição.");

		System.out.println();

		System.out.println("true || false = " +
			(primeiraCondicao(true) || segundaCondicao(false)) +
			" - sem teste da segunda condição.");

		System.out.println();

		System.out.println("true | false = " +
				(primeiraCondicao(true) | segundaCondicao(false)) +
				" - com teste da segunda condição.");

	}

	private static boolean primeiraCondicao(boolean retorno){
		System.out.println("Executou o teste da primeira condição");
		return retorno;
	}

	private static boolean segundaCondicao(boolean retorno){
		System.out.println("Executou o teste da segunda condição");
		return retorno;
	}

}
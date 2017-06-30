package br.com.dicasdejava.fundamentos;

public class ParametroDeLinhaDeComando {

	public static void main(String[] args) {

		System.out.println(args.length);
		for(String arg : args)
			System.out.println(arg);

	}

}

package br.com.dicasdejava.fundamentos;

public class ConverterStringParaInt {

	public static void main(String[] args) {

		try {

			String numero = "dez";
			int numeroConvertido = Integer.parseInt(numero);

			int numeroVezes2 = numeroConvertido * 2;

			System.out.println("Resultado: " + numeroVezes2);

		} catch (NumberFormatException e){
			System.out.println("Número inválido!");
		}

	}

}
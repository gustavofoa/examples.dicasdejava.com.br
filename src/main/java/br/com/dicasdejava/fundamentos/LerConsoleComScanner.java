package br.com.dicasdejava.fundamentos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

class LerTextoConsoleComScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual o seu nome: ");
		String nome = scanner.next();
		System.out.println("Seja bem vindo " + nome + "!");
	}

}

class LerNumeroConsoleComScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		try {
			int numero = scanner.nextInt();
			System.out.print("O valor informado foi " + numero);
		} catch (InputMismatchException e) {
			System.out.print("O valor informado não é um número!");
		}
	}

}

class LerArquivoComScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File arquivo = new File("C:\\temp\\arquivo.txt");
		Scanner sc = new Scanner(arquivo);
		while (sc.hasNext()) {
			System.out.print(sc.nextLine());
		}
		sc.close();
	}
}

class FiltrarDadosComScannerRegex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("a1,b2,c3,d4,e5,f6");
		scanner.useDelimiter("\\d,?");
		while (scanner.hasNext())
			System.out.println(scanner.next());
		scanner.close();
	}
}
package br.com.dicasdejava.util;

import java.util.Random;

public class GerarNumeroAleatorio {

	public static void main(String[] args) {

		Random random = new Random();

		int numeroInteiroAleatorio_0_a_100 = random.nextInt(100);
		System.out.println("Número inteiro aleatório de 0 até 100: " + numeroInteiroAleatorio_0_a_100);

		double numeroRealAleatorio_0_a_1 = random.nextDouble();
		System.out.println("Número real aleatório de 0 até 1: " + numeroRealAleatorio_0_a_1);

		double numeroRealAleatorio_0_a_100 = random.nextDouble() * 100;
		System.out.println("Número real aleatório de 0 até 100: " + numeroRealAleatorio_0_a_100);

	}

}

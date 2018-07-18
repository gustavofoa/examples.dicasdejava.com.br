package br.com.dicasdejava.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

	//Primeiro teste na ordem da classe
	//Segundo teste na ordem alfabética
	@Test
	public void teste02Soma5E4() {
		Calculadora calculadora = new Calculadora();
		System.out.println("Teste Soma de 5 e 4");
		assertEquals(9, calculadora.soma(5, 4));
	}

	//Segundo teste na ordem da classe
	//Primeiro teste na ordem alfabética
	@Test
	public void teste01Soma8E3() {
		Calculadora calculadora = new Calculadora();
		System.out.println("Teste Soma de 8 e 3");
		assertEquals(11, calculadora.soma(8, 3));
	}

}
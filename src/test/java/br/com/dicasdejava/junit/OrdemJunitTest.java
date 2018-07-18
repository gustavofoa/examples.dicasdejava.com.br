package br.com.dicasdejava.junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdemJunitTest {

	@Test
	public void test2() {
		System.out.println("Segundo teste");
	}

	@Test
	public void test1() {
		System.out.println("Primeiro teste");
	}

}
package br.com.dicasdejava.fundamentos;

public class Varargs {

	public static void main(String[] args) {

		//Sem o 3º parâmetro (Vararg...)
		metodoComVarargs("a1", true);

		//Com o 3º parâmetro do tipo int
		metodoComVarargs("a2", false, 1);

		//Com o 3º parâmetro do tipo int[] (array de int)
		metodoComVarargs("a3", true, new int[]{1, 2, 3});

		//Com vários parâmetros int a partir do 3º parâmetro (Vararg...)
		metodoComVarargs("a4", true, 1, 2, 3, 4, 5);

	}

	static void metodoComVarargs(String a, boolean b, int... c) {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c.length);
		for (int d : c)
			System.out.println(d);
		System.out.println();

	}

}

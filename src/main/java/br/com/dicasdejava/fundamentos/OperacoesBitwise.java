package br.com.dicasdejava.fundamentos;

public class OperacoesBitwise {

	public static void main(String[] args) {

		int a = 10;
		int b = 12;

		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));

		a = 9;
		b = 7;

		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " ^ " + b + " = " + (a ^  b));

	}

}
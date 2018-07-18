package br.com.dicasdejava.fundamentos;

interface InterfaceComDefaultMethod {

	default String metodo() {
		return "a";
	}

	String metodo2();

}

class Classe implements InterfaceComDefaultMethod {

	public String metodo2() {
		return "b";
	}

}

class Main {

	public static void main(String... args) {
		InterfaceComDefaultMethod a = new Classe();
		System.out.println(a.metodo());
		System.out.println(a.metodo2());
	}

}

package br.com.dicasdejava.fundamentos;

public class VariavelEstaticaOuDeInstancia {

	static int variavelEstatica = 0;
	int variavelDeInstancia = 0;

	public static void main(String[] args){

		VariavelEstaticaOuDeInstancia v1 = new VariavelEstaticaOuDeInstancia();

		v1.imprimeVariavelEstatica();
		v1.imprimeVAriavelDeInstancia();
		v1.variavelEstatica++;
		v1.variavelDeInstancia++;
		v1.imprimeVAriavelDeInstancia();

		VariavelEstaticaOuDeInstancia v2 = new VariavelEstaticaOuDeInstancia();
		v2.imprimeVAriavelDeInstancia();
		v2.imprimeVariavelEstatica();
		v1.variavelEstatica++;

		v2.variavelEstatica++;
		v2.variavelDeInstancia++;

		v1.imprimeVAriavelDeInstancia();
		v1.imprimeVariavelEstatica();
		v2.imprimeVAriavelDeInstancia();
		v2.imprimeVariavelEstatica();

		VariavelEstaticaOuDeInstancia.variavelEstatica++;

		v1.imprimeVAriavelDeInstancia();
		v1.imprimeVariavelEstatica();
		v2.imprimeVAriavelDeInstancia();
		v2.imprimeVariavelEstatica();

	}

	void imprimeVariavelEstatica(){
		System.out.println(variavelEstatica);
	}

	void imprimeVAriavelDeInstancia(){
		System.out.println(variavelDeInstancia);
	}

}

package br.com.dicasdejava.fundamentos;

class Avo {
	String nome = "Avo";

	String getNome() {
		return nome;
	}
}


class Pai extends Avo {
	String nome = "Pai";

	String getNome() {
		return nome;
	}
}


class Filho extends Pai {
	String nome = "Filho";

	String getNome() {
		return nome;
	}
}

class TesteOverride {
	public static void main(String[] args) {
		Filho filho = new Filho();
		System.out.println(filho.nome);
		System.out.println(filho.getNome());
		System.out.println(((Pai) filho).nome);
		System.out.println(((Pai) filho).getNome());
		System.out.println(((Avo) filho).nome);
		System.out.println(((Avo) filho).getNome());
	}
}

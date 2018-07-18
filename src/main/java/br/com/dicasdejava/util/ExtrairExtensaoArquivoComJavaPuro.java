package br.com.dicasdejava.util;

public class ExtrairExtensaoArquivoComJavaPuro {

	public static void main(String[] args) {

		//Exemplo de arquivo do Windows
		String nomeCompletoDoArquivo = "C:\\temp\\arquivo de teste.docx";
		String extensaoDoArquivo = getFileExtension(nomeCompletoDoArquivo);
		System.out.println(extensaoDoArquivo);

		//Exemplo de arquivo sem extensão
		nomeCompletoDoArquivo = "C:\\temp\\arquivo sem extensao";
		extensaoDoArquivo = getFileExtension(nomeCompletoDoArquivo);
		System.out.println(extensaoDoArquivo);

		//Exemplo de arquivo do Linux/Unix/OSX
		nomeCompletoDoArquivo = "/home/gustavo/arquivo de imagem.jpg";
		extensaoDoArquivo = getFileExtension(nomeCompletoDoArquivo);
		System.out.println(extensaoDoArquivo);

	}

	static String getFileExtension(String filename) {
		if (filename.contains("."))
			return filename.substring(filename.lastIndexOf(".") + 1);
		else
			return "";
	}

}

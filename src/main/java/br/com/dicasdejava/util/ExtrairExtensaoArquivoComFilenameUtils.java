package br.com.dicasdejava.util;

import org.apache.commons.io.FilenameUtils;

public class ExtrairExtensaoArquivoComFilenameUtils {

	public static void main(String[] args) {

		//Exemplo de arquivo do Windows
		String nomeCompletoDoArquivo = "C:\\temp\\arquivo de teste.txt";
		String extensaoDoArquivo = FilenameUtils.getExtension(nomeCompletoDoArquivo);
		System.out.println(extensaoDoArquivo);

		//Exemplo de arquivo sem extensão
		nomeCompletoDoArquivo = "C:\\temp\\arquivo sem extensao";
		extensaoDoArquivo = FilenameUtils.getExtension(nomeCompletoDoArquivo);
		System.out.println(extensaoDoArquivo);

		//Exemplo de arquivo do Linux/Unix/OSX
		nomeCompletoDoArquivo = "/home/gustavo/arquivo de imagem.png";
		extensaoDoArquivo = FilenameUtils.getExtension(nomeCompletoDoArquivo);
		System.out.println(extensaoDoArquivo);

	}

}

package br.com.dicasdejava.util;

import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamParaString {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = new ByteArrayInputStream("Gustavo Furtado de Oliveira Alves".getBytes());

		String textoConvertido = IOUtils.toString(inputStream);

		System.out.println(textoConvertido);

	}

}

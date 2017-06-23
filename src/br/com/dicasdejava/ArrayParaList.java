package br.com.dicasdejava;

import java.util.Arrays;
import java.util.List;

public class ArrayParaList {

    public static void main(String[] args) {
    	String[] nomes = new String[]{"Gustavo", "Maria", "José", "João", "Ana"};

    	List listaDeNomes = Arrays.asList(nomes);

    	System.out.println(listaDeNomes);
    }
}

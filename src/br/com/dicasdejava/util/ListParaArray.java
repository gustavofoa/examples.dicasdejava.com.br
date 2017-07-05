package br.com.dicasdejava.util;

import java.util.ArrayList;
import java.util.List;

public class ListParaArray {

    public static void main(String[] args) {
    	List<String> listaDeNomes = new ArrayList<String>();
    	listaDeNomes.add("Gustavo");
    	listaDeNomes.add("Maria");
    	listaDeNomes.add("José");
    	listaDeNomes.add("João");
    	listaDeNomes.add("Ana");

    	String[] arrayDeNomes = listaDeNomes.toArray(new String[0]);

    	System.out.println(listaDeNomes);
    }
}

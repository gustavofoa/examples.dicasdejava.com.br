package br.com.dicasdejava.util;

import org.apache.commons.collections.IteratorUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorParaList {

    public static void main(String[] args) {

    	List<String> listaDeNomes = new ArrayList<String>();
    	listaDeNomes.add("Gustavo");
    	listaDeNomes.add("Maria");
    	listaDeNomes.add("José");
    	listaDeNomes.add("João");
    	listaDeNomes.add("Ana");

    	Iterator<String> iteratorDeNomes = listaDeNomes.iterator();

		List<String> listaConvertidaDoIterator = IteratorUtils.toList(iteratorDeNomes);

		listaConvertidaDoIterator.forEach(System.out::println);

    }
}

package br.com.dicasdejava.fundamentos;

import java.util.Arrays;
import java.util.List;

public class MetodoContains {
    public static void main(String[] args) {

        Integer[] a = new Integer[]{1, 2, 3, 4, 5};

        List<Integer> lista = Arrays.asList(a);

        System.out.println("3 in a = " + (lista.contains(3)));
        System.out.println("5 in a = " + (lista.contains(5)));
        System.out.println("6 in a = " + (lista.contains(6)));

    }
}

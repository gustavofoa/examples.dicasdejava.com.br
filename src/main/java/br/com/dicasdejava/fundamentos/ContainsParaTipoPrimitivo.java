package br.com.dicasdejava.fundamentos;

import java.util.stream.IntStream;

public class ContainsParaTipoPrimitivo {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};

        System.out.println("3 in a = " + (IntStream.of(a).anyMatch(x -> x == 3)));
        System.out.println("5 in a = " + (IntStream.of(a).anyMatch(x -> x == 5)));
        System.out.println("6 in a = " + (IntStream.of(a).anyMatch(x -> x == 6)));

    }
}

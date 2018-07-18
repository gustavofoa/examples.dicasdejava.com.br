package br.com.dicasdejava.util;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class JuntarArrays {

    public static void main(String[] args) {

    	String[] array1 = new String[]{ "a", "b", "c", "d"};
		String[] array2 = new String[]{ "e", "f", "g", "h"};

		String[] arraysJuntados = ArrayUtils.addAll(array1, array2);

		System.out.println(Arrays.toString(arraysJuntados));

    }
}

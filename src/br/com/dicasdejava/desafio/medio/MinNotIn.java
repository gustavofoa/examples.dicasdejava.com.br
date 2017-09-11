/* 
 * @(#)MinNotFound.java 1.0 09/2017
 */
package br.com.dicasdejava.desafio.medio;

import java.util.HashMap;
import java.util.Map;

public class MinNotIn {
    public int solution(int[] A) {

        Map<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer count = mapa.get(A[i]);
            if (count == null)
                count = 0;
            mapa.put(A[i], count + 1);
        }
        for (int i = 1; i <= A.length; i++) {
            Integer count = mapa.get(i);
            if (count == null)
                return i;
        }

        return A.length + 1;

    }
}

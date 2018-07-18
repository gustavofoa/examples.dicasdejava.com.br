package br.com.dicasdejava.desafio.medio;

import java.util.HashMap;
import java.util.Map;

public class NumeroSemPar {

    public int descobrir(int[] A) {

        Map<Integer, Integer> mapa = new HashMap<>();
        Integer count = 0;
        for (int i : A) {
            count = mapa.get(i);
            if (count == null)
                count = 0;
            mapa.put(i, count + 1);
        }

        for (int k : mapa.keySet())
            if (mapa.get(k) % 2 == 1)
                return k;

        return 0;

    }

}

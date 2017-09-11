package br.com.dicasdejava.desafio.medio;

public class GapBinario {

    public int solution(int N) {

        while ((N & 1) == 0)
            N = N >> 1;

        int max = 0;

        while (N > 1) {
            int count = -1;
            do {
                N = N >> 1;
                count++;
            } while ((N & 1) == 0);
            if (max < count)
                max = count;
        }

        return max;

    }

}

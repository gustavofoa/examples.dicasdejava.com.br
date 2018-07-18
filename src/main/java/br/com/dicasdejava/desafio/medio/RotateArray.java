/* 
 * @(#)RotateArray.java 1.0 09/2017
 */
package br.com.dicasdejava.desafio.medio;

public class RotateArray {
    public int[] rotate(int[] A, int K) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newPosition = i + K;
            while (newPosition >= A.length)
                newPosition -= A.length;
            B[newPosition] = A[i];
        }
        return B;
    }
}

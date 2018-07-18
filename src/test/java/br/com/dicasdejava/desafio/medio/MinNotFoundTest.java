/* 
 * @(#)MinNotFoundTest.java 1.0 09/2017
 */
package br.com.dicasdejava.desafio.medio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinNotFoundTest {

    MinNotIn minNotFound = new MinNotIn();

    @Test
    public void test1() {
        assertEquals(5, minNotFound.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(4, minNotFound.solution(new int[]{1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(1, minNotFound.solution(new int[]{-1, -3}));
    }

}
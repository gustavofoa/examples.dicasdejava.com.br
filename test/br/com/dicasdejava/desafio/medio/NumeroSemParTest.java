/* 
 * @(#)NumeroSemParTest.java 1.0 09/2017
 */
package br.com.dicasdejava.desafio.medio;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumeroSemParTest {

    NumeroSemPar numeroSemPar;

    @Before
    public void setup() {
        numeroSemPar = new NumeroSemPar();
    }

    @Test
    public void testeArray1() throws Exception {
        assertEquals(7, numeroSemPar.descobrir(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    @Test
    public void testeArray2() throws Exception {
        assertEquals(2, numeroSemPar.descobrir(new int[]{2, 4, 7, 1, 2, 6, 4, 2, 3, 1, 7, 6}));
    }

}
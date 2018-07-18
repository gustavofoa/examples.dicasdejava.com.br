/* 
 * @(#)GapBinarioTest.java 1.0 09/2017
 */
package br.com.dicasdejava.comunidade;

import br.com.dicasdejava.desafio.medio.GapBinario;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GapBinarioTest {

    private GapBinario gapBinario;

    @Before
    public void setup() {
        gapBinario = new GapBinario();
    }

    @Test
    public void _10DeveResultar1() throws Exception {
        assertEquals(1, gapBinario.solution(10));
    }

    @Test
    public void _4DeveResultar0() throws Exception {
        assertEquals(0, gapBinario.solution(4));
    }

    @Test
    public void _9DeveResultar2() throws Exception {
        assertEquals(2, gapBinario.solution(9));
    }

    @Test
    public void _529DeveResultar4() throws Exception {
        assertEquals(4, gapBinario.solution(529));
    }

}
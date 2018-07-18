/* 
 * @(#)RotateArrayTest.java 1.0 09/2017
 */
package br.com.dicasdejava.desafio.medio;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    public void rotateTest1() throws Exception {
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, rotateArray.rotate(new int[]{3, 8, 9, 7, 6}, 3));
    }

    @Test
    public void rotateTest2() throws Exception {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, rotateArray.rotate(new int[]{3, 8, 9, 7, 6}, 1));
    }

    @Test
    public void rotateTest3() throws Exception {
        assertArrayEquals(new int[]{6}, rotateArray.rotate(new int[]{6}, 1));
    }

    @Test
    public void rotateTest4() throws Exception {
        assertArrayEquals(new int[]{6}, rotateArray.rotate(new int[]{6}, 50));
    }

}
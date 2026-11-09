package com.example.rezan.piramitoyunu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BulmacaTest {
    @Test
    public void readsDigitsIntoTriangularRows() {
        Bulmaca board = new Bulmaca("123456");
        int[][] expected = {{1}, {2, 3}, {4, 5, 6}};
        assertEquals(expected.length, board.getBuyukluk());
        for (int row = 0; row < expected.length; row++) {
            assertEquals(-1, board.oynananDeger(row));
            for (int column = 0; column < expected[row].length; column++) {
                assertEquals(expected[row][column], board.sayi(row, column));
            }
        }
    }

    @Test
    public void selectingAgainChangesOnlyThatRow() {
        Bulmaca board = new Bulmaca("123456");
        board.oyna(1, 1);
        board.oyna(2, 0);
        board.oyna(2, 2);
        assertEquals(-1, board.oynananDeger(0));
        assertEquals(1, board.oynananDeger(1));
        assertEquals(2, board.oynananDeger(2));
    }
}

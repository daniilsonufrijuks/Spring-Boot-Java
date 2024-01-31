package lv.rvt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


import rvt.Sort;

public class SortTest {
    @Test
    public void testSmallMethod() {
        int[] numbers = {6, 5, 8, 7, 11};
        assertEquals(5, Sort.smallest(numbers));
    }

    @Test
    public void testAddMethod() {
        int[] numbers = {6, 5, 8, 7, 11};
        assertEquals(1, Sort.indexOfSmallest(numbers));
    }

    @Test
    public void testAddMethodFrom() {
        int[] numbers = {-1, 6, 9, 8, 12};
        assertEquals(1, Sort.indexOfSmallestFrom(numbers, 0));
    }

    @Test
    public void testswapMethod() {
        int[] numbers = {3, 2, 5, 4, 8};
        int[] numbers_rez = {2, 3, 5, 4, 8};
        Sort.swap(numbers, 1, 0);
        assertArrayEquals(numbers_rez, numbers);
    }

    @Test
    public void testSortMethod() {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        int[] numbers_rez = {1, 2, 3, 4, 7, 8, 9};
        Sort.sort(numbers);
        assertArrayEquals(numbers_rez, numbers);
    }
}

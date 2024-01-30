package lv.rvt;

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
        assertEquals(1, Sort.indexOfSmallestFrom(numbers));
    }
}

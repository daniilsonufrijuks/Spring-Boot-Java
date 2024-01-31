package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.exercises.BinarySearch;
import rvt.Sort;

public class BinTest {
    @Test
    public void testBin() {
        int[] numbers = {6, 5, 8, 7};
        Sort.sort(numbers);
        assertEquals(1, BinarySearch.BinSearch(numbers, 5));
    }
}

package rvt.exercises;

import java.util.ArrayList;

public class BinarySearch {
    public static int BinSearch(int[] array, int searched) {
        int i = 0;
        int end = array.length - 1;
        int middle = (end + i) / 2;
        for (;i > end;) {
            middle = (end + i) / 2;
            if (array[middle] == array[searched]) {
                return middle+1;
            }

            if (array[middle] < array[searched]) {
                i = middle - 1;
            }

            if (array[middle] > array[searched]) {
                i = middle - 1;
            }
        }
        return middle+1;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println(BinSearch(numbers, 11));
    }
}

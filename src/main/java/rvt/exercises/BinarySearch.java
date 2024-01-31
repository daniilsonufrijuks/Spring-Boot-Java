package rvt.exercises;

import java.util.ArrayList;

public class BinarySearch {
    public static void sort(int[] array) {
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j  + 1] = temp;
                } 
            }
        }
    }
    public static int BinSearch(int[] array, int searched) {
        int i = 0;
        int end = array.length - 1;
        int middle = 0;
        for (;i < end;) {
            middle = (end + i) / 2;
            if (array[middle] == searched) {
                return middle+1;
            }

            if (array[middle] < searched) {
                i = middle + 1;
            }

            if (array[middle] > searched) {
                end = middle - 1;
            }
        }
        return middle;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7};
        sort(numbers);
        System.out.println(BinSearch(numbers, 5));
    }
}

package rvt;

public class Sort {
    public static int smallest(int[] array){
        // write your code here
        int min = array[0]; // smallets number here
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array){
        int min = array[0]; // smallets number here
        int index_smallest_num = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index_smallest_num = i;
            }
        }
        return index_smallest_num;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int min = table[startIndex]; // smallets number here
        //System.out.println("-" + min);
        int index_smallest_num = 0;
        for (int i = startIndex; i < table.length; i++) {
            if (min == table[i]) {
                index_smallest_num = i;
            }
            if (min > table[i]) {
                min = table[i];
                //System.out.println(">" + min);
                index_smallest_num = i;
            }
        }
        return index_smallest_num;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

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

    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + smallest(numbers));

        int[] numbers2 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + indexOfSmallest(numbers2));

        // indices:       0  1  2  3   4
        int[] numbers3 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfSmallestFrom(numbers3, 0));
        System.out.println(indexOfSmallestFrom(numbers3, 1));
        System.out.println(indexOfSmallestFrom(numbers3, 2));
        //System.out.println(indexOfSmallestFrom(numbers3, 3));

        int[] numbers4 = {3, 2, 5, 4, 8};

        //System.out.println(numbers4);

        swap(numbers4, 1, 0);
        for (int i = 0; i < numbers4.length; i++) {
            System.out.print(numbers4[i]);
        }


        System.out.println();

        swap(numbers4, 0, 3);
        for (int i = 0; i < numbers4.length; i++) {
            System.out.print(numbers4[i]);
        }

        System.out.println();
        int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers5);
        for (int i = 0; i < numbers5.length; i++) {
            System.out.print(numbers5[i]);
        }
    }
}

package Sorting;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] array = {5,6,4,7,1,3};
        sort.mergeSort(array);

        BubbleSort sort2 = new BubbleSort();
        sort2.sort(array);
    }
}

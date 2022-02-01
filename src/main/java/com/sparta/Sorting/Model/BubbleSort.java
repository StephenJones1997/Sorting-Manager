package com.sparta.Sorting.Model;

public class BubbleSort implements SortInterface {
    @Override
    public SortInterface getInstance() {
        return new BubbleSort();
    }

    public void sort(int[] array) {
        boolean swapping = true;
        while(swapping)
        {
            swapping = false;
            for (var i = 0; i < array.length-1; i++)
            {
                if(array[i] > array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapping = true;
                }
            }
        }
        System.out.println();
    }
}

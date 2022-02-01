package com.sparta.Sorting;

public class SortFactory {

    public SortInterface returnSort(int incoming)
    {
        SortInterface SI = null;
        if(incoming == 0)
        {
            SI = new BubbleSort();
        }
        if(incoming == 1)
        {
            SI = new MergeSort();
        }

        return SI.getInstance();
    }
}

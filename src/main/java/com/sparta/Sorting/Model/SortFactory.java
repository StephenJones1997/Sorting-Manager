package com.sparta.Sorting.Model;

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

        if(SI == null)
        {
            SI = new BubbleSort();
        }
        return SI.getInstance();
    }
}

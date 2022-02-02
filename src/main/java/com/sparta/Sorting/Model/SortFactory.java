package com.sparta.Sorting.Model;

import java.util.HashMap;

public class SortFactory {

    enum sortType {Bubble, Merge}
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

    public HashMap<Integer, String> returnAvailableTypes()
    {
        HashMap<Integer, String> myValues = new HashMap<>();
        int i = 0;
        for(sortType s: sortType.values())
        {
            myValues.put(i, s.name());
            i++;
        }

        return myValues;
    }
}

package com.sparta.Sorting;

import com.sparta.Sorting.Model.BubbleSort;
import com.sparta.Sorting.Model.MergeSort;
import com.sparta.Sorting.Model.SortFactory;
import com.sparta.Sorting.Model.SortInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FactoryTesting {

    @Test
    @DisplayName("Check can Select Bubble")
    void bubbleSelect()
    {
        SortFactory sf = new SortFactory();
        SortInterface SI = sf.returnSort(0);
        BubbleSort bs = new BubbleSort();
        boolean equals = SI.getClass().equals(bs.getClass());

        Assertions.assertTrue(equals);
    }
    @Test
    @DisplayName("Check can Select Bubble")
    void MergeSelect()
    {
        SortFactory sf = new SortFactory();
        SortInterface SI = sf.returnSort(1);
        MergeSort ms = new MergeSort();
        boolean equals = SI.getClass().equals(ms.getClass());

        Assertions.assertTrue(equals);
    }

    @Test
    @DisplayName("Check that all the sorting methods are returned")
    void returnEnumTypes()
    {
        SortFactory sf = new SortFactory();
        HashMap<Integer, String> info = sf.returnAvailableTypes();
    }


    @Test
    @DisplayName("Check when nothing is selected, Bubble is returned. Should not be possible though")
    void NullSelect()
    {
        SortFactory sf = new SortFactory();
        SortInterface SI = sf.returnSort(10);
        BubbleSort ms = new BubbleSort();
        boolean equals = SI.getClass().equals(ms.getClass());

        Assertions.assertTrue(equals);
    }
}

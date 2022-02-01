package com.sparta.Sorting;

import com.sparta.Sorting.Model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class MergeTesting {

    @Test
    @DisplayName("Test to make sure that it sorts correctly when given correct input")
    void CorrectSorting()
    {
        int[] integers = {9,10,12,16,15,1,10,18,16,7};
        int[] correctInts = {1,7,9,10,10,12,15,16,16,18};

        MergeSort s = new MergeSort();
        s.sort(integers);
        Assertions.assertArrayEquals(integers, correctInts);
    }
    @Test
    @DisplayName("Test to make sure that it sorts correctly when given negative numbers")
    void NegativeSorting()
    {
        int[] integers =    {9,10,12,-16,15,1,-10,18,16,7};
        int[] correctInts = {-16,-10,1,7,9,10,12,15,16,18};

        MergeSort s = new MergeSort();
        s.sort(integers);
        Assertions.assertArrayEquals(integers, correctInts);
    }

    @Test
    @DisplayName("Test to make sure that it sorts correctly when null inputs")
    void nullSorting()
    {
        int[] integers = new int [6];
        int[] correctInts = {0,0,0,0,0,0,};

        MergeSort s = new MergeSort();

        s.sort(integers);
        Assertions.assertArrayEquals(integers, correctInts);
    }
}

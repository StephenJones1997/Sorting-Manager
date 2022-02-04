package com.sparta.Sorting;

import com.sparta.Sorting.Model.BinaryTreeSearch;
import com.sparta.Sorting.Model.SortingManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class BinaryTreeTesting {

    @Test
    @DisplayName("Make sure that the Tree sorts the array properly")
    void sortingTest()
    {
        BinaryTreeSearch bts = new BinaryTreeSearch();
        int[] incoming = {5,5,1,7};
        bts.sort(incoming);
        SortingManager sm = new SortingManager();
        String incomingString = sm.convertArray(incoming);
        System.out.println("");

        Assertions.assertTrue(incomingString.equals("1 5 5 7 "));
    }
}

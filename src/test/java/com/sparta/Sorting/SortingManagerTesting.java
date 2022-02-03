package com.sparta.Sorting;

import com.sparta.Sorting.Model.SortFactory;
import com.sparta.Sorting.Model.SortingManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static com.sparta.Sorting.Model.SortingManager.displaySearchMethods;

public class SortingManagerTesting {

    @Test
    @DisplayName("Confirm the convertor is showing the right information to the end user")
    void checkConverter()
    {
        int[] toConvert = {1,2,3};
        String convertedString = "1 2 3 ";
        Assertions.assertTrue(SortingManager.convertArray(toConvert).equals(convertedString));
    }

    @Test
    @DisplayName("Confirm the correct amount of availble search types are returned")
    void checkSortsAvailable(){
        SortFactory SI = new SortFactory();
        int stackSize = displaySearchMethods(SI.returnAvailableTypes());
        Assertions.assertTrue(stackSize == 2);
    }

}

package com.sparta.Sorting.View;

import com.sparta.Sorting.Controller.UserInputs;
import com.sparta.Sorting.Model.BinaryTreeSearch;
import com.sparta.Sorting.Model.SortFactory;
import com.sparta.Sorting.Model.SortInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static com.sparta.Sorting.Model.SortingManager.displaySearchMethods;
import static com.sparta.Sorting.Model.SortingManager.runSort;

public class DisplayManager {
    public static Logger logger = LogManager.getLogger("Sort Manager Logger");

    public static void main(String[] args) {

        BinaryTreeSearch bs = new BinaryTreeSearch();
        int[] newInt = {5,3,7,7,1,4};
        bs.sort(newInt);
    }


    public void main()
    {
        SortFactory SI = new SortFactory();
        UserInputs ui = new UserInputs();
        //Display the Available Search Methods
        int stackSize = displaySearchMethods(SI.returnAvailableTypes());
        //Pass the information to User Input and return the types they want
        int[] SearchTypes = ui.returnInputtedType(stackSize);
        //Get an array of the numbers to sort
        int[] array = ui.ArrayInformation();
        runSort(SearchTypes, array);
    }

}

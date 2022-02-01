package com.sparta.Sorting.View;

import com.sparta.Sorting.Controller.UserInputs;
import com.sparta.Sorting.Model.SortFactory;
import com.sparta.Sorting.Model.SortInterface;

public class Main {

    public static void main(String[] args) {
        SortFactory SI = new SortFactory();
        UserInputs ui = new UserInputs();
        int Input = ui.returnInputtedType();
        System.out.println(Input);
        SortInterface sortMethod = SI.returnSort(Input);
        int[] array = {5,6,4,7,1,3};
        sortMethod.sort(array);

    }
}

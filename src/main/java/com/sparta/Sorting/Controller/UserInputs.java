package com.sparta.Sorting.Controller;

import com.sparta.Sorting.Model.SortInterface;

import java.util.*;


public class UserInputs {

    public int[] returnInputtedType(int amountOfSorts)
    {
        System.out.println("Enter the number for the sorting type you would like, please make sure its more than 0");

        Scanner scan = new Scanner(System.in);
        int sizeToUse = scan.nextInt();
        while(sizeToUse == 0) {
            System.out.println("You have selected 0, please use at lease one");
            sizeToUse = scan.nextInt();
        }
        int[] array = new int[sizeToUse];

        System.out.println("Enter each sort method you would like to use");
        for (int i = 0; i < sizeToUse; i++) {
            int sortToUse = scan.nextInt();

            array[i] = sortToUse;
        }
        return array;
    }

    public int[] ArrayInformation()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int arraySize = scan.nextInt();
        System.out.println("Enter each number you want to search");

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
        {
            array[i] = scan.nextInt();
        }

        return array;
    }
}

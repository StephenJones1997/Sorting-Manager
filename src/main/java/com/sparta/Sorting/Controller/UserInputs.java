package com.sparta.Sorting.Controller;

import com.sparta.Sorting.Model.SortInterface;
import org.reflections.Reflections;

import java.util.Scanner;
import java.util.Set;


public class UserInputs {

    public int returnInputtedType()
    {
        Reflections reflections = new Reflections("com.sparta.Sorting");
        Set<Class<? extends SortInterface>> classes = reflections.getSubTypesOf(SortInterface.class);
        int j=0;
        for(Class<? extends SortInterface> i: classes)
        {
            System.out.println(j + ": " + i.getSimpleName());
            j++;
        }

        int incoming = returnInt();
        if(classes.toArray().length >= incoming)
        {
            return incoming;
        }
        else
        {
            System.out.println("Input is too high, using 0");
            return 0;
        }
    }

    private int returnInt()
    {
        System.out.println("Input number for the sort type you want to use");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}

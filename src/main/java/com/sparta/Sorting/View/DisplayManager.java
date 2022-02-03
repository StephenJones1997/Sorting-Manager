package com.sparta.Sorting.View;

import com.sparta.Sorting.Controller.UserInputs;
import com.sparta.Sorting.Model.SortFactory;
import com.sparta.Sorting.Model.SortInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class DisplayManager {
    public static Logger logger = LogManager.getLogger("Sort Manager Logger");

    public static void main(String[] args) {


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
    static void runSort(int[] searchs, int[] arraytoSort)
    {
        List l = new ArrayList();
        SortFactory SI = new SortFactory();
        for(int i: searchs)
        {
            int[] arrayToSortDupe = arraytoSort.clone();
            SortInterface sortMethod = SI.returnSort(i);
            if(l.contains(i))
            {
                System.out.println(sortMethod +" has already been run, skipping this");
                continue;
            }
            else
            {
                Long currentTime = System.nanoTime();
                sortMethod.sort(arrayToSortDupe);
                Long newtime = System.nanoTime();
                Long CompleteTime = newtime - currentTime;
                System.out.println(sortMethod);
                System.out.println(convertArray(arraytoSort) + ":" + convertArray(arrayToSortDupe));
                System.out.println("It took " + CompleteTime + " Nanoseconds");
                logger.info("User Ran " + sortMethod + ", it took " + CompleteTime + " milliseconds, for an array with " + convertArray(arraytoSort));
                l.add(i);
            }
        }
    }


    //return the length of the hashMap
    private static int displaySearchMethods(HashMap<Integer, String> incoming)
    {
        int j = 0;
        Iterator it = incoming.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + ": " + pair.getValue());
            j++;
        }

        return j;
    }

    private static String convertArray(int[] incoming)
    {
        StringBuilder SB = new StringBuilder();

        for(int i: incoming)
        {
            SB.append(i + " ");
        }
        return SB.toString();
    }
}

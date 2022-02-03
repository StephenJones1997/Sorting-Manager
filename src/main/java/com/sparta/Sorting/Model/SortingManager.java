package com.sparta.Sorting.Model;

import java.util.*;

import static com.sparta.Sorting.View.DisplayManager.logger;

public class SortingManager {

    public static String runSort(int[] searchs, int[] arraytoSort)
    {
        List l = new ArrayList();
        SortFactory SI = new SortFactory();
        StringBuilder sb = new StringBuilder();
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
                sb.append(sortMethod);
                System.out.println(convertArray(arraytoSort) + ":" + convertArray(arrayToSortDupe));
                System.out.println("It took " + CompleteTime + " Nanoseconds");
                logger.info("User Ran " + sortMethod + ", it took " + CompleteTime + " milliseconds, for an array with " + convertArray(arraytoSort));
                l.add(i);
            }
        }

        return  sb.toString();
    }


    //return the length of the hashMap
    public static int displaySearchMethods(HashMap<Integer, String> incoming)
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

    public static String convertArray(int[] incoming)
    {
        StringBuilder SB = new StringBuilder();
        for(int i: incoming) {SB.append(i + " ");}
        return SB.toString();
    }
}

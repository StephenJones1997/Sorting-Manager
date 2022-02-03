package com.sparta.Sorting;

import com.sparta.Sorting.Model.BubbleSort;
import com.sparta.Sorting.Model.MergeSort;
import org.junit.jupiter.api.DisplayName;

import java.util.Random;

import static com.sparta.Sorting.View.DisplayManager.logger;

public class MergeTiming {
    static MergeSort bs;
    public static void main(String[] args) {
        bs = new MergeSort();
        testShortList();
        testMediumList();
        testLongList();
    }

    @DisplayName("Given a array of 10, checks how fast it is")
    static void testShortList()
    {
        Random r = new Random();
        int[] arrayToSort = new int[10];
        for(int i: arrayToSort)
        {
            arrayToSort[i] = r.nextInt(1,1000);

        }
        Long currentTime = System.nanoTime();
        bs.sort(arrayToSort);
        Long newtime = System.nanoTime();
        Long CompleteTime = newtime - currentTime;
        System.out.println("Merge Sort ran in " + CompleteTime);
        logger.warn("Merge Sort timing test ran in " + CompleteTime + " for an array size of +" + arrayToSort.length);
    }


    @DisplayName("Given a array of 100, checks how fast it is")
    static void testMediumList()
    {
        Random r = new Random();
        int[] arrayToSort = new int[100];
        for(int i: arrayToSort)
        {
            arrayToSort[i] = r.nextInt(1,1000);

        }
        Long currentTime = System.nanoTime();
        bs.sort(arrayToSort);
        Long newtime = System.nanoTime();
        Long CompleteTime = newtime - currentTime;
        System.out.println("Merge Sort ran in " + CompleteTime);
        logger.warn("Merge Sort timing test ran in " + CompleteTime + " for an array size of +" + arrayToSort.length);
    }


    @DisplayName("Given a array of 1000, checks how fast it is")
    static void testLongList()
    {
        Random r = new Random();
        int[] arrayToSort = new int[1000];
        for(int i: arrayToSort)
        {
            arrayToSort[i] = r.nextInt(1,1000);

        }
        Long currentTime = System.nanoTime();
        bs.sort(arrayToSort);
        Long newtime = System.nanoTime();
        Long CompleteTime = newtime - currentTime;
        System.out.println("Merge Sort ran in " + CompleteTime);
        logger.warn("Merge Sort timing test ran in " + CompleteTime + " for an array size of +" + arrayToSort.length);
    }
}

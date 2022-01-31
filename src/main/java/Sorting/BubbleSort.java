package Sorting;

public class BubbleSort {


    int[] sort(int[] array) {
        boolean swapping = true;
        while(swapping)
        {
            swapping = false;
            for (var i = 0; i < array.length-1; i++)
            {
                if(array[i] > array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapping = true;
                }
            }
        }

        return array;

//        StringBuilder sb = new StringBuilder();
//        for (int s:array)
//        {
//            sb.append(s);
//        }
//        System.out.println(sb.toString());
    }
}

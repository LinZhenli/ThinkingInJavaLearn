package algorithm.test;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low >= high)
            return;
        i = low;
        j = high;
        temp = arr[low];

        while (i < j) {


            while (arr[j] >= temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }


            if(i<j) {

                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
              //  System.out.println(Arrays.toString(arr));
            }
        }
        //最后将基准位与i和j相等位置的数字交换
//        System.out.println(arr[i]+" "+temp);

        arr[low] = arr[i];//arr[low]=arr[j];是一样的。
        arr[i] = temp;

        quickSort(arr, i + 1, high);
        quickSort(arr, low, j - 1);

    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

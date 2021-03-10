package algorithm.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>=high){//基线条件，当全部完成为止。
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //必须先看右边，依次往左递减，找到大于基准的数循环递减。因为最后要交换的基准是取的low，所以最后一个重合的数必须是小于等于基准
            while (temp<=arr[j]&&i<j) {//找到小的才退出。
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {//找到大的才退出，这个等号必须取啊
                i++;
            }
            //把右边大于基准的和左边小于基准的做交换。
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //此处i和j相等。
        //最后将基准为与i和j相等位置的数字交换，如果不看右边，会出问题。

        arr[low] = arr[i];//arr[low]=arr[j];是一样的。
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    public static void main(String[] args){
        int[] arr = {19,18,16,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}

package algorithm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {

        System.out.println( slelectionSort(Arrays.asList(new Integer[]{5,2,3,4,5,9,1,2,0})));

    }
    static List<Integer> slelectionSort(List<Integer> data){
        List<Integer> rowData=new ArrayList<>(data);
        List<Integer> sortData=new ArrayList<>();
        while (rowData.size()>0) {
            sortData.add(rowData.remove(findSmallest(rowData)));
        }
        return sortData;
    }

    static int findSmallest(List<Integer> data){
        int smallest=data.get(0);
        int smallestIndex=0;
        for (int i = 0; i <data.size() ; i++)  {

            if(smallest>data.get(i)) {
                smallest = data.get(i);
                smallestIndex=i;
            }
        }
        return smallestIndex;
    }
}

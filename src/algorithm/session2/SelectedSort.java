package algorithm.session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SelectedSort {

    public static void main(String[] args) {

        Integer[] a = {3, 4, 2, 5, 7,10,5,3,8,4};
        System.out.println(selectedSort(Arrays.asList(a)));
    }

    static List<Integer> selectedSort(List<Integer> data) {
        List<Integer> buffer=new ArrayList(data);
        System.out.println(buffer);
        List<Integer> sortedData = new LinkedList();
        int smallest;
        int length=data.size();//数组为底的不能remove。
        for (int i = 0; i < length; i++) {
            smallest=findSmallest(buffer);
            sortedData.add(buffer.remove(smallest));

        }
        return  sortedData;
    }



   static int findSmallest(List<Integer> data) {
        int smallest = data.get(0);
        int smallest_index = 0;
        for (int i = 1; i < data.size(); i++) {

            if (data.get(i) < smallest) {
                smallest = data.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }
}

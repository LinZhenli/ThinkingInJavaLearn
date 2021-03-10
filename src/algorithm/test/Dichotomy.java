package algorithm.test;

import java.util.Arrays;
import java.util.List;

public class Dichotomy {
    public static void main(String[] args) {
        System.out.println( dichotomy(Arrays.asList(new Integer[]{1,2,3,4,5}),6));

    }
  static   int dichotomy(List<Integer> data,int aims){
        int low=0;
        int high=data.size()-1;

        while (low<=high) {
            int mid=(low+high)/2;
            if(data.get(mid)==aims)
                return mid;
            if (data.get(mid) > aims) {
                high = mid-1;
            } else if (data.get(mid) < aims) {
                low = mid+1;
            }
        }

        return -1;
    }

}

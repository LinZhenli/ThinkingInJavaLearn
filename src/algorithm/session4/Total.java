package algorithm.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Total {
    public static void main(String[] args) {
        List<Integer> data=new ArrayList();
        data.addAll(Arrays.asList((new Integer[]{1,2,3,3,2})));
        System.out.println( tatal(data));
    }
   static int tatal(List<Integer> arr){
        int index=arr.size()-1;
        if(index==0)
            return 1;
        else{
            arr.remove(index--);
            return 1+tatal(arr);
        }
   }
}

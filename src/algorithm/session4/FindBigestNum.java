package algorithm.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBigestNum {//nice
    public static void main(String[] args) {
        List<Integer> data=new ArrayList();
        data.addAll(Arrays.asList((new Integer[]{1,2,3,8,2})));
        System.out.println( findBigestNum(data));
    }
    static int biggest=0;
   static int findBigestNum(List<Integer> arr){
        int index=arr.size()-1;
        biggest=compare(biggest,arr.remove(index));
        if(index==0)
            return biggest;
        else{
            return findBigestNum(arr);
        }
   }
  static int compare(int a,int b){

        return  a>b?a:b;
   }
}

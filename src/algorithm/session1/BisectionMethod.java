package algorithm.session1;

import java.util.*;

public class BisectionMethod {
    public static void main(String[] args) {
        System.out.println( bisectionMethod(Arrays.asList(new Integer[]{1,2,3,4,5}),7));
    }

   static Integer  bisectionMethod(List<Integer> data,int aims){

       System.out.println(data);
        int low=0;
        int high=data.size()-1;

        while(low<=high){
            int mid=(high+low)/2;
            if (aims==data.get(mid))
                return mid;
//            if(high==low)
//                throw new RuntimeException("û�и���");
            if(data.get(mid)>aims)
            {
                high=mid-1;//��Ϊmid����
            }
            else{
                low=mid+1;
            }

        }
       return null;
   }
}

package algorithm.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QickSort2 {
    public static void main(String[] args) {//����������list
        List list = new ArrayList(Arrays.asList(4, 23, 55, 1, 35, 56));
        System.out.println(quicksort(list));
    }

    public static List<Integer> quicksort(List<Integer> data) {
        if (data.size() < 2) {
            return data;//�ݹ���ֹ��������ֻ��һ��ʱ
        } else {
            int pivot = data.remove(0);//��Ϊ��׼�档
            List<Integer> less = new ArrayList<>();
            List<Integer> high = new ArrayList<>();
            for (Integer datum : data) {
                if (datum <= pivot)
                    less.add(datum);
                else
                    high.add(datum);
            }
            List arrl = quicksort(less);
            List arrh = quicksort(high);
            arrl.add(pivot);//�ź����ؽ�arrl
            arrl.addAll(arrh);
            return arrl;
        }
    }
}

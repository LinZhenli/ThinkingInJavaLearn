package algorithm.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>=high){//������������ȫ�����Ϊֹ��
            return;
        }
        i=low;
        j=high;
        //temp���ǻ�׼λ
        temp = arr[low];

        while (i<j) {
            //�����ȿ��ұߣ���������ݼ����ҵ����ڻ�׼����ѭ���ݼ�����Ϊ���Ҫ�����Ļ�׼��ȡ��low���������һ���غϵ���������С�ڵ��ڻ�׼
            while (temp<=arr[j]&&i<j) {//�ҵ�С�Ĳ��˳���
                j--;
            }
            //�ٿ���ߣ��������ҵ���
            while (temp>=arr[i]&&i<j) {//�ҵ���Ĳ��˳�������Ⱥű���ȡ��
                i++;
            }
            //���ұߴ��ڻ�׼�ĺ����С�ڻ�׼����������
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //�˴�i��j��ȡ�
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ�������������ұߣ�������⡣

        arr[low] = arr[i];//arr[low]=arr[j];��һ���ġ�
        arr[i] = temp;
        //�ݹ�����������
        quickSort(arr, low, j-1);
        //�ݹ�����Ұ�����
        quickSort(arr, j+1, high);
    }


    public static void main(String[] args){
        int[] arr = {19,18,16,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}

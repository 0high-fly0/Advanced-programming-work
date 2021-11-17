package lab05;

import java.util.Random;

import static lab05.sort.*;

public class test01 {
    public static void copy(int[] a,int[] b){
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
    }
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        long executionTime =0;

        int n=300000;
        System.out.println("数据规模："+n);
        Random random = new Random();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=random.nextInt(n*10);
        }
        int[] b=new int[a.length];

        //选择
        copy(a,b);
        startTime = System.currentTimeMillis();
        changeSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("选择排序所花费的时间为："+executionTime);

        //冒泡
        copy(a,b);
        startTime = System.currentTimeMillis();
        bubbleSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("冒泡排序所花费的时间为："+executionTime);

        //归并
        copy(a,b);
        startTime = System.currentTimeMillis();
        mergeSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("归并排序所花费的时间为："+executionTime);

        //快速
        copy(a,b);
        startTime = System.currentTimeMillis();
        quickSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("快速排序所花费的时间为："+executionTime);

        //堆排序
        copy(a,b);
        startTime = System.currentTimeMillis();
        heapSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("堆排序所花费的时间为："+executionTime);

        //基数
        copy(a,b);
        startTime = System.currentTimeMillis();
        radixSort(a, getMaxWeishu(a));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("基数排序所花费的时间为："+executionTime);
    }
}

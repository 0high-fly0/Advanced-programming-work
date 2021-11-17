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
        System.out.println("���ݹ�ģ��"+n);
        Random random = new Random();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=random.nextInt(n*10);
        }
        int[] b=new int[a.length];

        //ѡ��
        copy(a,b);
        startTime = System.currentTimeMillis();
        changeSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("ѡ�����������ѵ�ʱ��Ϊ��"+executionTime);

        //ð��
        copy(a,b);
        startTime = System.currentTimeMillis();
        bubbleSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("ð�����������ѵ�ʱ��Ϊ��"+executionTime);

        //�鲢
        copy(a,b);
        startTime = System.currentTimeMillis();
        mergeSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("�鲢���������ѵ�ʱ��Ϊ��"+executionTime);

        //����
        copy(a,b);
        startTime = System.currentTimeMillis();
        quickSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("�������������ѵ�ʱ��Ϊ��"+executionTime);

        //������
        copy(a,b);
        startTime = System.currentTimeMillis();
        heapSort(b);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("�����������ѵ�ʱ��Ϊ��"+executionTime);

        //����
        copy(a,b);
        startTime = System.currentTimeMillis();
        radixSort(a, getMaxWeishu(a));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("�������������ѵ�ʱ��Ϊ��"+executionTime);
    }
}

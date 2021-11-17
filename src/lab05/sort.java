package lab05;

public class sort {
    public static void changeSort(int[] list){//选择排序
        for (int i=0;i<list.length;i++){
            int minindex=i;
            int min=list[i];
            for (int j=i+1;j<list.length;j++){
                if (list[j]<list[i]){
                    min=list[j];
                    minindex=j;
                }
            }
            if (minindex!=i){
                int c=list[i];
                list[i]=list[minindex];
                list[minindex]=c;
            }
        }
    }

    public static void bubbleSort(int[] list) {//冒泡排序
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
    //归并排序
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    /** Merge two sorted lists */
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }

    //快速排序
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] */
    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low] <= pivot)
                low++;

            // Search backward from right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

    //堆排序
    public static void heapSort(int[] list) {
        // Create a Heap of integers
        Heap<Integer> heap = new Heap<Integer>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }

    //基数排序
    public static int getNumInPos(int num, int pos) {
        int tmp = 1;
        for (int i = 0; i < pos - 1; i++) {
            tmp *= 10;
        }
        return (num / tmp) % 10;
    }

    //求得最大位数d
    public static int getMaxWeishu(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int tmp = 1, d = 1;
        while (true) {
            tmp *= 10;
            if (max / tmp != 0) {
                d++;
            } else
                break;
        }
        return d;
    }

    public static void radixSort(int[] a, int d) {//radixSort(a, getMaxWeishu(a));
        int[][] array = new int[10][a.length + 1];
        for (int i = 0; i < 10; i++) {
            array[i][0] = 0;// array[i][0]记录第i行数据的个数
        }
        for (int pos = 1; pos <= d; pos++) {
            for (int i = 0; i < a.length; i++) {// 分配过程
                int row = getNumInPos(a[i], pos);
                int col = ++array[row][0];
                array[row][col] = a[i];
            }
            for (int row = 0, i = 0; row < 10; row++) {// 收集过程
                for (int col = 1; col <= array[row][0]; col++) {
                    a[i++] = array[row][col];
                }
                array[row][0] = 0;// 复位，下一个pos时还需使用
            }
        }
    }

}

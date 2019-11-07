package Practise;

public class P01 {
    public static void main(String[] args) {
        int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 0, 5};
        int num = 0;
        int count = 0;
        for (int i = 0; i < 15; i++) {
            if (oldArr[i] != 0) {
                num++;
            }
        }
        int[] newArr = new int[num];
        for (int i = 0; i < 15; i++) {
            if (oldArr[i] != 0) {
                newArr[count] = oldArr[i];
                count++;
            }
        }
        quicksort(newArr, num, 0, num - 1);
        for (int i = 0; i < num; i++) {
            System.out.println(newArr[i]);
        }
        System.out.println("最小值：" + newArr[0]);
        System.out.println("最大值：" + newArr[num-1]);
    }

    public static void quicksort(int[] arr, int num, int begin, int end) {
        int i;
        int j;
        if (begin < end) {
            i = begin + 1;
            j = end;
            while (i < j) {
                if (arr[i] > arr[begin]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                } else {
                    i++;
                }
            }
            if (arr[begin] <= arr[i]) {
                i--;
            }
            int temp = arr[i];
            arr[i] = arr[begin];
            arr[begin] = temp;
            quicksort(arr, num, begin, i);
            quicksort(arr, num, j, end);
        }
    }

}

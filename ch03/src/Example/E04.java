package Example;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner type = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            arr[i] = type.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            int temp = arr[i];
            arr[i] = arr[7 - i];
            arr[7 - i] = temp;
        }
        for (int i = 0; i < 8; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        int temp = arr[1];
        arr[1] = arr[7];
        arr[7] = temp;
        for (int i = 0; i < 8; i++) {
            System.out.println(arr[i]);
        }
    }
}

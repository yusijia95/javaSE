package practise.p01;

import java.util.Scanner;

public class RandomStatic {
    public static void main(String[] args) {
        String str;
        int charCount = 0;
        int numCount = 0;
        Scanner sca = new Scanner(System.in);
        str = sca.next();
        char[] arr = new char[10];
        arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                numCount++;
            }
            if ((arr[i] >= 65 && arr[i] <= 91) || (arr[i] >= 97 && arr[i] <= 123)) {
                charCount++;
            }
        }
        System.out.println("数字数量：" + numCount + "字符数量：" + charCount);
    }
}

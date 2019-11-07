package practise.p04;

import java.util.Locale;
import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        char[] arr = new char[str.length()];
        arr=str.toCharArray();
        int upcount = 0;
        int downcount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 91) {
                upcount++;
            } else if (arr[i] >= 97 && arr[i] <= 123) {
                downcount++;
            } else {
                count++;
            }
        }
        System.out.println("大写字母" + upcount + " 小写字母" + downcount + " 其他字母" + count);
    }
}

package practise.p09;

public class MyStringUtil {
    public static char[] toCharArray(String str) {
        str.toCharArray();
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =str.charAt(i);
        }
        return arr;
    }

    public static String getSingleString(String str) {
        char[] arr = new char[str.length()];
        String str2=str;
        arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = str.length() - str.replace(str.substring(i, i + 1), "").length();
            if (count == 1) {
                str2=str.substring(i,i+1);
            }
        }
        return str2;
    }

    public static boolean isBalancedString(String str) {
        char[] arr = new char[str.length()];
        boolean flag = false;
        if (str == null && str.length() == 1) {
            flag = true;
            return flag;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return flag;
            }
            if (i == arr.length / 2 - 1 && arr[i] == arr[arr.length - 1 - i]) {
                flag = true;
                return flag;
            }
        }
        return flag;

    }
}

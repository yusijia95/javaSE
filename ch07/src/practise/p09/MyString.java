package practise.p09;

public class MyString {
    public static void main(String[] args) {
        String str="abcdcba";
        char[] arr=MyStringUtil.toCharArray(str);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        String str2=MyStringUtil.getSingleString(str);
        System.out.println(str2);
        System.out.println(MyStringUtil.isBalancedString(str));

    }
}

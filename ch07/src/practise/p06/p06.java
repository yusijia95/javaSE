package practise.p06;

public class p06 {
    public static void main(String[] args) {
        String str = "this is a test of java";
        //统计s出现次数
        String str2 = str.replace("s", "");
        System.out.println(str.length() - str2.length());
        //取出test
        char[] arr = new char[str.length()];
        str.getChars(10, 14, arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        //复制到数组
        char[] arr2 = str.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        //每个单词第一个字母大写，推荐使用用数组接收每个字符串，再将首字符+32转换成大写
        String[] str3 = str.split(" ");
        for (int i = 0; i < str3.length; i++) {
            String str4 = str3[i].substring(0, 1).toUpperCase() + str3[i].substring(1);
            System.out.println(str4);
        }
        //逆序
//        StringBuffer sf = new StringBuffer();
//        System.out.println(sf.reverse());

        for (int i = 0; i < arr2.length/2; i++) {
            char temp = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = arr2[i];
            arr2[i] = temp;
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
        //分离每个单词，存在数组中
        String[] str4 = str.split(" ");
        for (int i = 0; i <str4.length ; i++) {
            System.out.println(str4[i]);
        }
    }
}

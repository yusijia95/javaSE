package practise.p05;

public class p05 {
    public static void main(String[] args) {
        String st1="aa,bb,cc";
        String st2="a.b.c";
        String st3="aaa bbb ccc";
        String st4="D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";
        String[] st5=st1.split(",");
        for (int i = 0; i <st5.length ; i++) {
            System.out.println(st5[i]);

        }
        String[] st6=st2.split("\\.");
        for (int i = 0; i <st6.length ; i++) {
            System.out.println(st6[i]);

        }
        String[] st7=st3.split(" ");
        for (int i = 0; i <st7.length ; i++) {
            System.out.println(st7[i]);

        }
        String[] st8=st4.split("\\\\");
        for (int i = 0; i <st8.length ; i++) {
            System.out.println(st8[i]);

        }
    }
}

package Practise;

public class P04 {
    public static void main(String[] args) {
//        System.out.println("请输入菱形大小：");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(j>=2-i && j<=2+i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i >=0; i--) {
            for (int j = 0; j < 5; j++) {
                if(j>=2-i && j<=2+i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

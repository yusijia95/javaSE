package Practise;
import java.util.Scanner;
public class P03 {
    public static void main(String[] args) {
        String account = "yusijia";
        int password = 123456;
        int count = 0;
        Scanner typeIn = new Scanner(System.in);
        String inAccount = typeIn.nextLine();
        while (!account.equals(inAccount)) {
            System.out.println("名字不一样请重新输入");
            inAccount = typeIn.nextLine();
        }
        int inPassword = typeIn.nextInt();
        while (password != inPassword) {
            System.out.println("您输入的密码不一致，请重新输入");
            inPassword = typeIn.nextInt();
            count++;
            if (count == 3) {
                break;
            }
        }
    }
}

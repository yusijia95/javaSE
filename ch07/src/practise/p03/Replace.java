package practise.p03;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        String str=sca.next();
        String str2=str.replace("恐怖","**").replace("爆炸","**").replace("性","*").replace("枪","*");
        String str3=str2.replace("军火","**").replace("色情","**");
        System.out.println(str3);
    }
}

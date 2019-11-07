package practise.p05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P05 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        Set<String> set = new HashSet();
        int count=10;
        for (int i = 0; i <count ; i++) {
            set.add(sca.next());
        }
        System.out.println(set);
        for(String str:set){
            System.out.print(str+"   ");
        }
    }
}

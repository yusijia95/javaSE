package practise.p04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class P04 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        Random random = new Random();
        int count = 10;
        while (set.size() < count) {
            set.add(random.nextInt(10) + 1);
        }
//        System.out.println(set);
        for (Integer integer : set) {
            System.out.print(integer + "   ");
        }
        System.out.println();
    }
}

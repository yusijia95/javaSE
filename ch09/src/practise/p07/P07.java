package practise.p07;

import java.util.*;

public class P07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Integer num = random.nextInt(100)+1;
            if (!list.contains(num)) {
                list.add(num);
            } else {
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println(list);

    }
}

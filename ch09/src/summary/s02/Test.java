package summary.s02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        List<Worker> list = new ArrayList<>();
        list.add(new Worker("zhang3", 18, 3000));
        list.add(new Worker("li4", 25, 3500));
        list.add(new Worker("wang5", 22, 3200));
        list.add(1, new Worker("zhao6", 24, 3300));
        list.remove(3);
        for (Worker worker : list) {
            System.out.println(worker);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (count < list.size()) {
                list.get(count).work();
                count++;
            }
            iterator.next();
        }
        Worker worker=new Worker("zhang3",18,3000);
        System.out.println(list.get(0).equals(worker));

    }
}

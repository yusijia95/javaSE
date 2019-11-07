package practise.p10;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("俞思笳1","大一",100));
        list.add(new Student("俞思笳2","大二",100));
        list.add(new Student("俞思笳3","大三",100));
        System.out.println(list);
    }
}

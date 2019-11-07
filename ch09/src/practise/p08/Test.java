package practise.p08;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("漂流记1", 20, "中国人民日报", "俞思笳"));
        list.add(new Book("漂流记2", 15, "中国人民日报", "俞思笳"));
        list.add(new Book("漂流记3", 17, "中国人民日报", "俞思笳"));
        list.add(new Book("漂流记4", 22, "中国人民日报", "俞思笳"));
        list.add(new Book("漂流记5", 20, "中国人民日报", "俞思笳"));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i).getPrice()<list.get(j).getPrice()){
                    Book temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);
    }
}

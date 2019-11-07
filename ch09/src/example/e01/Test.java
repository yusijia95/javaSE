package example.e01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author edz
 */
public class Test {
    public static void main(String[] args) {
        Person[] per = new Person[100];
        Scanner sca = new Scanner(System.in);
        per[0] = new Person("1111", 20, "fish0", "苏州静安区", "nan");
        per[1] = new Person("1112", 20, "fish1", "常州静安区", "nan");
        per[2] = new Person("1113", 20, "fish2", "上海静安区", "nan");
        per[3] = new Person("1114", 20, "fish3", "南京静安区", "nan");
        per[4] = new Person("1115", 20, "fish4", "镇江静安区", "nan");
        Collection cool = new ArrayList();
        Collection cool2 = new ArrayList();
        cool.add(per[0]);
        cool.add(per[1]);
        cool.add(per[2]);
        cool.add(per[3]);
        cool.add(per[4]);
        cool2 = per[0].inquire(cool, "苏州");
        System.out.println(cool2);
        cool = per[0].delete(cool, "苏州静安区");
        System.out.println(cool);
        System.out.println(per[0].change(cool, "上海"));
    }
}

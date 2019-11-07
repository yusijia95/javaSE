package example.e03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ThreeKingdom {
    public static void main(String[] args) {
        Map m = new HashMap();
//        Object ob=new String();
//        String ma=(String)(ob);
//        String ma= new String();
//        Object ob=(Object)ma;
        Map map = new HashMap();
        Map map1 = new HashMap();
        map1.put("关羽", "guanyu");
        map1.put("张飞", "zhagnfei");
        map1.put("赵子龙", "zhaozilong");
        map1.put("黄忠", "haungzhong");
        map1.put("马超", "machao");
        Map map2 = new HashMap();
        map2.put("典韦", "dianwei");
        map2.put("郭嘉", "guojia");
        map2.put("张辽", "zhangliao");
        map2.put("许褚", "xuchu");
        map2.put("荀彧", "xunyu");
        Map map3 = new HashMap();
        map3.put("周瑜", "zhouyu");
        map3.put("黄盖", "huanggai");
        map3.put("鲁肃", "lvsu");
        map3.put("陆逊", "luxun");
        map3.put("吕蒙", "lvmeng");
        map.put(map1, "刘备");
        map.put(map2, "曹操");
        map.put(map3, "孙权");
        m.put(map, "三国志");
        Set set = m.keySet();
        for (Object obj : set) {
            System.out.println(m.get(obj));
            HashMap ni = (HashMap) obj;
            Set set1 = ni.keySet();
            for (Object obj1 : set1) {
                System.out.println("      " + ni.get(obj1));
                Map ni1 = (Map) obj1;
                Set set2 = ni1.keySet();
                for (Object obj2 : set2) {
                    System.out.println("          " + obj2 + "==" + ni1.get(obj2));
                }
            }
        }

    }
}

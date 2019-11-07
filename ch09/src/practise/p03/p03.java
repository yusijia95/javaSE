package practise.p03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class p03 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");
        map.put("Allen","JDBC");
//        map.put("Lucy","CoreJava");
        Set<String> set=map.keySet();
        for (String str:set) {
            System.out.println(str+"="+map.get(str));
        }
        System.out.println();
        for(String str:set){
            if("JSP".equals(map.get(str))){
                System.out.println(str+"="+map.get(str));
            }
        }
    }
}
